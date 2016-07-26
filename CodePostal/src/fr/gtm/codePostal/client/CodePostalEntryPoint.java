package fr.gtm.codePostal.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

import fr.gtm.codePostal.shared.CodePostal;

public class CodePostalEntryPoint implements EntryPoint {
	

	@Override
	public void onModuleLoad() {
		
		RootPanel.get("container").add(new CodePostal());
	}

}
