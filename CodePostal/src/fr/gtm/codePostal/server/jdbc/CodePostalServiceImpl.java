package fr.gtm.codePostal.server.jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import fr.gtm.codePostal.client.CodePostalService;

public class CodePostalServiceImpl extends RemoteServiceServlet implements CodePostalService {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	DataSource ds;
	
	@Override
	public List<Ville> getVillesByCodePostal(String cp) {
		List<Ville> villes = new ArrayList<Ville>();
		try {
			if(ds == null){
				Context ctx = new InitialContext();
				ds = (DataSource) ctx.lookup("jdbc/france");
				
				VilleDAO villeDAO = new VilleDAO(ds);
				
				villes = villeDAO.getVillesByCodePostal(cp);
				
			}
		} catch (NamingException e) {
			e.printStackTrace();
		}
		return villes;
		
	}

}
