package fr.gtm.codePostal.client;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;

import fr.gtm.codePostal.server.jdbc.Ville;

public interface CodePostalServiceAsync {

	void getVillesByCodePostal(String cp, AsyncCallback<List<Ville>> callback);
}
