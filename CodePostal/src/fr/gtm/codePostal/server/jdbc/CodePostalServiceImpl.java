package fr.gtm.codePostal.server.jdbc;

import java.util.List;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import fr.gtm.codePostal.client.CodePostalService;

public class CodePostalServiceImpl extends RemoteServiceServlet implements CodePostalService {

	@Override
	public List<Ville> getVillesByCodePostal(String cp) {
		//toto
		return null;
	}

}
