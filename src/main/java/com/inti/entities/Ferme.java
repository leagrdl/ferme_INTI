package com.inti.entities;

import java.util.Date;

public class Ferme {
	private Long idFerme;
	private String nom;
	private Date date;
	
	public Ferme() {
	}
	public Ferme(String nom, Date date) {
		this.nom = nom;
		this.date = date;
	}
	public Long getIdFerme() {
		return idFerme;
	}
	public void setIdFerme(Long idFerme) {
		this.idFerme = idFerme;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
