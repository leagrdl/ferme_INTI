package com.inti.entities;

public class Gerant {
	private Long idGerant; 
	private String nom; 
	private String prenom; 
	
	private Ferme ferme;

	public Gerant() {
		super();
	}

	public Gerant(String nom, String prenom, Ferme ferme) {
		this.nom = nom;
		this.prenom = prenom;
		this.ferme = ferme;
	}

	public Long getIdGerant() {
		return idGerant;
	}

	public void setIdGerant(Long idGerant) {
		this.idGerant = idGerant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Ferme getFerme() {
		return ferme;
	}

	public void setFerme(Ferme ferme) {
		this.ferme = ferme;
	}

	@Override
	public String toString() {
		return "Gerant [idGerant=" + idGerant + ", nom=" + nom + ", prenom=" + prenom + ", getIdGerant()="
				+ getIdGerant() + ", getNom()=" + getNom() + ", getPrenom()=" + getPrenom() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	} 
	
	
}
