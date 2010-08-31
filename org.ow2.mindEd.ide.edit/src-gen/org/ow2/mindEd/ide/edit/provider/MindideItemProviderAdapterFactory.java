/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ow2.mindEd.ide.edit.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.ow2.mindEd.ide.util.MindideAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MindideItemProviderAdapterFactory extends MindideAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MindideItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.ow2.mindEd.ide.model.MindRepo} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MindRepoItemProvider mindRepoItemProvider;

	/**
	 * This creates an adapter for a {@link org.ow2.mindEd.ide.model.MindRepo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMindRepoAdapter() {
		if (mindRepoItemProvider == null) {
			mindRepoItemProvider = new MindRepoItemProvider(this);
		}

		return mindRepoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.ow2.mindEd.ide.model.MindRootSrc} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MindRootSrcItemProvider mindRootSrcItemProvider;

	/**
	 * This creates an adapter for a {@link org.ow2.mindEd.ide.model.MindRootSrc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMindRootSrcAdapter() {
		if (mindRootSrcItemProvider == null) {
			mindRootSrcItemProvider = new MindRootSrcItemProvider(this);
		}

		return mindRootSrcItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.ow2.mindEd.ide.model.MindPackage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MindPackageItemProvider mindPackageItemProvider;

	/**
	 * This creates an adapter for a {@link org.ow2.mindEd.ide.model.MindPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMindPackageAdapter() {
		if (mindPackageItemProvider == null) {
			mindPackageItemProvider = new MindPackageItemProvider(this);
		}

		return mindPackageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.ow2.mindEd.ide.model.MindAdl} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MindAdlItemProvider mindAdlItemProvider;

	/**
	 * This creates an adapter for a {@link org.ow2.mindEd.ide.model.MindAdl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMindAdlAdapter() {
		if (mindAdlItemProvider == null) {
			mindAdlItemProvider = new MindAdlItemProvider(this);
		}

		return mindAdlItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.ow2.mindEd.ide.model.MindC} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MindCItemProvider mindCItemProvider;

	/**
	 * This creates an adapter for a {@link org.ow2.mindEd.ide.model.MindC}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMindCAdapter() {
		if (mindCItemProvider == null) {
			mindCItemProvider = new MindCItemProvider(this);
		}

		return mindCItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.ow2.mindEd.ide.model.MindItf} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MindItfItemProvider mindItfItemProvider;

	/**
	 * This creates an adapter for a {@link org.ow2.mindEd.ide.model.MindItf}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMindItfAdapter() {
		if (mindItfItemProvider == null) {
			mindItfItemProvider = new MindItfItemProvider(this);
		}

		return mindItfItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.ow2.mindEd.ide.model.MindH} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MindHItemProvider mindHItemProvider;

	/**
	 * This creates an adapter for a {@link org.ow2.mindEd.ide.model.MindH}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMindHAdapter() {
		if (mindHItemProvider == null) {
			mindHItemProvider = new MindHItemProvider(this);
		}

		return mindHItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.ow2.mindEd.ide.model.MindIdf} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MindIdfItemProvider mindIdfItemProvider;

	/**
	 * This creates an adapter for a {@link org.ow2.mindEd.ide.model.MindIdf}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMindIdfAdapter() {
		if (mindIdfItemProvider == null) {
			mindIdfItemProvider = new MindIdfItemProvider(this);
		}

		return mindIdfItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.ow2.mindEd.ide.model.MindFile} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MindFileItemProvider mindFileItemProvider;

	/**
	 * This creates an adapter for a {@link org.ow2.mindEd.ide.model.MindFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMindFileAdapter() {
		if (mindFileItemProvider == null) {
			mindFileItemProvider = new MindFileItemProvider(this);
		}

		return mindFileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.ow2.mindEd.ide.model.MindAllRepo} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MindAllRepoItemProvider mindAllRepoItemProvider;

	/**
	 * This creates an adapter for a {@link org.ow2.mindEd.ide.model.MindAllRepo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMindAllRepoAdapter() {
		if (mindAllRepoItemProvider == null) {
			mindAllRepoItemProvider = new MindAllRepoItemProvider(this);
		}

		return mindAllRepoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.ow2.mindEd.ide.model.MindObject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MindObjectItemProvider mindObjectItemProvider;

	/**
	 * This creates an adapter for a {@link org.ow2.mindEd.ide.model.MindObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMindObjectAdapter() {
		if (mindObjectItemProvider == null) {
			mindObjectItemProvider = new MindObjectItemProvider(this);
		}

		return mindObjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.ow2.mindEd.ide.model.MindProject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MindProjectItemProvider mindProjectItemProvider;

	/**
	 * This creates an adapter for a {@link org.ow2.mindEd.ide.model.MindProject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMindProjectAdapter() {
		if (mindProjectItemProvider == null) {
			mindProjectItemProvider = new MindProjectItemProvider(this);
		}

		return mindProjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.ow2.mindEd.ide.model.MindPathEntry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MindPathEntryItemProvider mindPathEntryItemProvider;

	/**
	 * This creates an adapter for a {@link org.ow2.mindEd.ide.model.MindPathEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMindPathEntryAdapter() {
		if (mindPathEntryItemProvider == null) {
			mindPathEntryItemProvider = new MindPathEntryItemProvider(this);
		}

		return mindPathEntryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.ow2.mindEd.ide.model.MindLibrary} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MindLibraryItemProvider mindLibraryItemProvider;

	/**
	 * This creates an adapter for a {@link org.ow2.mindEd.ide.model.MindLibrary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMindLibraryAdapter() {
		if (mindLibraryItemProvider == null) {
			mindLibraryItemProvider = new MindLibraryItemProvider(this);
		}

		return mindLibraryItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (mindRepoItemProvider != null) mindRepoItemProvider.dispose();
		if (mindRootSrcItemProvider != null) mindRootSrcItemProvider.dispose();
		if (mindPackageItemProvider != null) mindPackageItemProvider.dispose();
		if (mindAdlItemProvider != null) mindAdlItemProvider.dispose();
		if (mindCItemProvider != null) mindCItemProvider.dispose();
		if (mindItfItemProvider != null) mindItfItemProvider.dispose();
		if (mindHItemProvider != null) mindHItemProvider.dispose();
		if (mindIdfItemProvider != null) mindIdfItemProvider.dispose();
		if (mindFileItemProvider != null) mindFileItemProvider.dispose();
		if (mindAllRepoItemProvider != null) mindAllRepoItemProvider.dispose();
		if (mindObjectItemProvider != null) mindObjectItemProvider.dispose();
		if (mindProjectItemProvider != null) mindProjectItemProvider.dispose();
		if (mindPathEntryItemProvider != null) mindPathEntryItemProvider.dispose();
		if (mindLibraryItemProvider != null) mindLibraryItemProvider.dispose();
	}

}
