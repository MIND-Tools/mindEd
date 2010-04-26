/**
 * <copyright>
 *
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id$
 */


package org.ow2.fractal.mind.xtext.validation;

import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.model.IConstraintStatus;
import org.eclipse.emf.validation.service.IBatchValidator;
import org.eclipse.emf.validation.service.ModelValidationService;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;


/**
 * An adapter that plugs the EMF Model Validation Service API into the
 * {@link org.eclipse.emf.ecore.EValidator} API.
 */
public class EValidatorAdapter extends AbstractDeclarativeValidator implements EValidator {

	/**
	 * Model Validation Service interface for batch validation of EMF elements.
	 */
	private final IBatchValidator batchValidator;
	
	/**
	 * Initializes me.
	 */
	public EValidatorAdapter() {
		super();
		
		batchValidator = ModelValidationService.getInstance().newValidator(
				EvaluationMode.BATCH);
		batchValidator.setIncludeLiveConstraints(true);
		batchValidator.setReportSuccesses(false);
	}

	@Check(CheckType.NORMAL)
	public void delegateToValidationService(EObject eObject) {

		IStatus status = Status.OK_STATUS;
		
		// if EMF Mode Validation Service already covered the sub-tree,
		//    which it does for efficient computation and error reporting,
		//    then don't repeat (the Diagnostician does the recursion
		//    externally).  If there is no context map, then we can't
		//    help it
		
		if (!hasProcessed(eObject, getContext())) {
			
			status = batchValidator.validate(eObject,new NullProgressMonitor());
			processed(eObject, getContext(), status);
			appendDiagnostics(status);
		}
		
	}

	
	/**
	 * If we have a context map, record this object's <code>status</code> in it
	 * so that we will know later that we have processed it and its sub-tree.
	 * 
	 * @param eObject an element that we have validated
	 * @param context the context (may be <code>null</code>)
	 * @param status the element's validation status
	 */
	private void processed(EObject eObject, Map<Object, Object> context, IStatus status) {
		if (context != null) {
			context.put(eObject, status);
		}
	}
	
	/**
	 * Determines whether we have processed this <code>eObject</code> before,
	 * by automatic recursion of the EMF Model Validation Service.  This is
	 * only possible if we do, indeed, have a context.
	 * 
	 * @param eObject an element to be validated (we hope not)
	 * @param context the context (may be <code>null</code>)
	 * @return <code>true</code> if the context is not <code>null</code> and
	 *     the <code>eObject</code> or one of its containers has already been
	 *     validated;  <code>false</code>, otherwise
	 */
	private boolean hasProcessed(EObject eObject, Map<Object, Object> context) {
		boolean result = false;
		
		if (context != null) {
			// this is O(NlogN) but there's no helping it
			while (eObject != null) {
				if (context.containsKey(eObject)) {
					result = true;
					eObject = null;
				} else {
					eObject = eObject.eContainer();
				}
			}
		}
		
		return result;
	}
	
	/**
	 * Converts a status result from the EMF validation service to diagnostics.
	 * 
	 * @param status the EMF validation service's status result
	 */
	private void appendDiagnostics(IStatus status) {
		
		if (status.isMultiStatus()) {
			IStatus[] children = status.getChildren();
			
			for (IStatus element : children) {
				appendDiagnostics(element);
			}
			
			return;
		} 
		
		if (status instanceof IConstraintStatus) {
			IConstraintStatus constraintStatus = (IConstraintStatus) status;
			switch (status.getSeverity()) {
			
			case IStatus.ERROR :
				error(status.getMessage(), constraintStatus.getTarget(), 0, Integer.toString(status.getCode()));
				break;
				
			default:
				warning(status.getMessage(), constraintStatus.getTarget(), 0, Integer.toString(status.getCode()));
				break;
			
			}
		}
	}

}
