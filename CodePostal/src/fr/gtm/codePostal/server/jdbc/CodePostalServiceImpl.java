package fr.gtm.codePostal.server.jdbc;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import fr.gtm.codePostal.client.CodePostalService;

public class CodePostalServiceImpl extends RemoteServiceServlet implements CodePostalService {
	private static List<Ville> villes = new ArrayList<Ville>();
	
	@Override
	public List<Ville> getVillesByCodePostal(String cp) {
		return villes;
	}

}
