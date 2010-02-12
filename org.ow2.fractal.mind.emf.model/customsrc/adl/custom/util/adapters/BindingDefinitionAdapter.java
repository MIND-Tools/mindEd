package adl.custom.util.adapters;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;


public class BindingDefinitionAdapter extends EContentAdapter{
	
	@Override
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);
	}

	private static class SingletonHolder {
		private static BindingDefinitionAdapter instance = new BindingDefinitionAdapter();
	}

	public static BindingDefinitionAdapter getInstance() {
		return SingletonHolder.instance;
	}
}
