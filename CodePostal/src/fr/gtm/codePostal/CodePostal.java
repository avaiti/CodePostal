package fr.gtm.codePostal;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class CodePostal extends Composite {

	private static CodePostalUiBinder uiBinder = GWT.create(CodePostalUiBinder.class);

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
		
	}

}
