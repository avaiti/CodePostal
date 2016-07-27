package fr.gtm.codePostal.server.jdbc;

import java.io.Serializable;

public class Ville implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private long id;
	private String nom;
	private String departement;
	private String region;
	private String codePostal;
	private double latitude;
	private double longitude;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	@Override
	public String toString() {
		return "Ville [id=" + id + ", nom=" + nom + ", departement="
				+ departement + ", region=" + region + ", codePostal="
				+ codePostal + ", latitude=" + latitude + ", longitude="
				+ longitude + "]";
	}
	
}
