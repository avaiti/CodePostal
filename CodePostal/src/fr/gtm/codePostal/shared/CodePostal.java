package fr.gtm.codePostal.shared;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

import fr.gtm.codePostal.client.CodePostalService;
import fr.gtm.codePostal.client.CodePostalServiceAsync;
import fr.gtm.codePostal.server.jdbc.CodePostalServiceImpl;
import fr.gtm.codePostal.server.jdbc.Ville;

public class CodePostal extends Composite {

	private static CodePostalUiBinder uiBinder = GWT.create(CodePostalUiBinder.class);
	private static CodePostalServiceAsync service = GWT.create(CodePostalService.class);
	interface CodePostalUiBinder extends UiBinder<Widget, CodePostal> {
	}

	public CodePostal() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiField
	Button button;
	
	@UiField
	TextBox cp;
	
	@UiField
	TextArea resultat;

	public CodePostal(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
		button.setText(firstName);
	}

	@UiHandler("button")
	void onClick(ClickEvent e) {
		String code = cp.getText();
		service.getVillesByCodePostal(code, new AsyncCallback<List<Ville>>() {
			
			@Override
			public void onSuccess(List<Ville> result) {
				String str = new String();
				for(Ville ville:result){
					 str += ville.getNom();
				}				
				resultat.setText(str);
				Window.alert(str);
			}
			
			@Override
			public void onFailure(Throwable caught) {
					GWT.log("error");				
			}
		});
		
		
			
		}
		


}
