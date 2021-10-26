package com.esprit.evenements;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Evenement implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private int id;
	private String titre,description;
	private String DateDebut;
	private String DateFin;
	private String image;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

	public String getDateDebut() {
		return DateDebut;
	}
	public void setDateDebut(String dateDebut) {
		DateDebut = dateDebut;
	}
	public String getDateFin() {
		return DateFin;
	}
	public void setDateFin(String dateFin) {
		DateFin = dateFin;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Evenement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Evenement(String titre, String description, String dateDebut, String dateFin, String image) {
		super();
		this.titre = titre;
		this.description = description;
		DateDebut = dateDebut;
		DateFin = dateFin;
		this.image = image;
	}


	
	

}
