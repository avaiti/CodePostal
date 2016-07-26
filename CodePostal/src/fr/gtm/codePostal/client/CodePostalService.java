package fr.gtm.codePostal.client;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import fr.gtm.codePostal.server.jdbc.Ville;

@RemoteServiceRelativePath("CodePostalService")
public interface CodePostalService extends RemoteService {
	//toto
	List<Ville> getVillesByCodePostal(String cp);
}
