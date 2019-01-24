// class qui représente un produit = Bean ou JavaBean, elle est sérialisable et contient :
// un constructeur public sans arguments
// des getteurs et setteurs pour toutes les propriétés de la classe

package com.eccad.eccad.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "organization")
// nom de la table
public class Organization {

	// Chaque propriété du modèle correspond à une colonne de la table

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_organization")
	private int id;

	// toutes les colonnes de la table
	@Column(name = "full_name_organization")
	private String name;

	@Column(name = "adress_organization")
	private String adress;

	public Organization() {
	}

	public Organization(int id, String name, String adress) {
		this.id = id;
		this.name = name;
		this.adress = adress;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Organization{" + "id = " + id + ", name = " + name
				+ ", adress = " + adress + '}';
	}

}
