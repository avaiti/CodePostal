package fr.gtm.codePostal.server.jdbc;

import java.util.List;

public interface VilleDAO {

	List<Ville> getVillesByCodePostal(String cp);

}