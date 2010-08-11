package org.ow2.mindEd.ide.ui.navigator;

import java.net.MalformedURLException;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider.IStyledLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.StyledString.Styler;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.ow2.mindEd.ide.core.MindIdeCore;
import org.ow2.mindEd.ide.model.MindFile;
import org.ow2.mindEd.ide.model.MindObject;
import org.ow2.mindEd.ide.ui.Activator;

public class MindLabelProvider extends AdapterFactoryLabelProvider implements
		ILabelProvider, org.eclipse.ui.navigator.ICommonLabelProvider, IStyledLabelProvider {

	public MindLabelProvider() {
		super(MindUICore.mindViewAdapterFactory());
	}

	public void init(ICommonContentExtensionSite aConfig) {
		
	}

	public void restoreState(IMemento aMemento) {
	}

	public void saveState(IMemento aMemento) {
	}

	public String getDescription(Object anElement) {
		return getText(anElement);
	}

	public StyledString getStyledText(Object element) {
		String name = null;
		if (element instanceof IResource) {
			IResource r = (IResource) element;
			name = r.getName();
			element = MindIdeCore.get(r);
		}
		if (element instanceof MindObject) {
			name = getText(element);
		}
		if (name == null)
			name = getText(element);
		StyledString ss = new StyledString(name);
		//ss.setStyle(0, name.length(), );
		return ss;
	}
	
	@Override
	public Image getImage(Object object) {
		if (object instanceof MindFile) {
			MindFile mf = (MindFile) object;
			if (mf.getIcon() != null) {
				ImageDescriptor image;
				try {
					image = Activator.getImageDescriptorURI(mf.getIcon());
					if (image == null)
						return image.createImage();
				} catch (MalformedURLException e) {
				}
			}
		}
		return super.getImage(object);
	}

}
