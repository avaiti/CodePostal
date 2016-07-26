package fr.gtm.codePostal.server.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class VilleDAO {
	private DataSource dataSource;
	
	public VilleDAO(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public List<Ville> getVillesByCodePostal(String cp){
		List<Ville> villes = new ArrayList<>();
		String sql = "SELECT * FROM villes WHERE code_postal LIKE ?";
		try(Connection connection = dataSource.getConnection()){
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, cp+"%");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Ville v = buildVille(rs);
				villes.add(v);				
			}		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return villes;
	}

	private Ville buildVille(ResultSet rs) throws SQLException {
		Ville v = new Ville();
		v.setCodePostal(rs.getString("code_postal"));
		v.setDepartement(rs.getString("departement"));
		v.setId(rs.getInt("kp_ville"));
		v.setLatitude(rs.getDouble("lat"));
		v.setLongitude(rs.getDouble("lng"));
		v.setNom(rs.getString("ville"));
		v.setRegion(rs.getString("region"));
		return v;
	}
}
