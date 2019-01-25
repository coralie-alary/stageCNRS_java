package com.eccad.eccad.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
// nom de la table
public class Person {

	// Chaque propriété du modèle correspond à une colonne de la table

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_person")
	private int idPerson;

	// toutes les colonnes de la table
	@Column(name = "admin")
	private boolean admin;

	@Column(name = "advisory_board")
	private boolean advisoryBoard;

	@Column(name = "confirmed")
	private boolean confirmed;

	@Column(name = "date_register_person")
	private Date dateRegisterPerson;

	@Column(name = "email_person")
	private String emailPerson;

	@Column(name = "fax_person")
	private String faxPerson;

	@Column(name = "first_name_person")
	private String firstNamePerson;

	@Column(name = "last_name_person")
	private String lastNamePerson;

	@Column(name = "password_person")
	private String passwordPerson;

	@Column(name = "phone_person")
	private String phonePerson;

	@Column(name = "provider")
	private boolean provider;

	@Column(name = "id_organization")
	private int idOrganization;

	public Person() {
	}

	public Person(int idPerson, boolean admin, boolean advisoryBoard, boolean confirmed, Date dateRegisterPerson,
			String emailPerson, String faxPerson, String firstNamePerson, String lastNamePerson, String passwordPerson,
			String phonePerson, boolean provider, int idOrganization) {

		this.idPerson = idPerson;
		this.admin = admin;
		this.advisoryBoard = advisoryBoard;
		this.confirmed = confirmed;
		this.dateRegisterPerson = dateRegisterPerson;
		this.emailPerson = emailPerson;
		this.faxPerson = faxPerson;
		this.firstNamePerson = firstNamePerson;
		this.lastNamePerson = lastNamePerson;
		this.passwordPerson = passwordPerson;
		this.phonePerson = phonePerson;
		this.provider = provider;
		this.idOrganization = idOrganization;
	}

	public int getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(int idPerson) {
		this.idPerson = idPerson;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public boolean isAdvisoryBoard() {
		return advisoryBoard;
	}

	public void setAdvisoryBoard(boolean advisoryBoard) {
		this.advisoryBoard = advisoryBoard;
	}

	public boolean isConfirmed() {
		return confirmed;
	}

	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}

	public Date getDateRegisterPerson() {
		return dateRegisterPerson;
	}

	public void setDateRegisterPerson(Date dateRegisterPerson) {
		this.dateRegisterPerson = dateRegisterPerson;
	}

	public String getEmailPerson() {
		return emailPerson;
	}

	public void setEmailPerson(String emailPerson) {
		this.emailPerson = emailPerson;
	}

	public String getFaxPerson() {
		return faxPerson;
	}

	public void setFaxPerson(String faxPerson) {
		this.faxPerson = faxPerson;
	}

	public String getFirstNamePerson() {
		return firstNamePerson;
	}

	public void setFirstNamePerson(String firstNamePerson) {
		this.firstNamePerson = firstNamePerson;
	}

	public String getLastNamePerson() {
		return lastNamePerson;
	}

	public void setLastNamePerson(String lastNamePerson) {
		this.lastNamePerson = lastNamePerson;
	}

	public String getPasswordPerson() {
		return passwordPerson;
	}

	public void setPasswordPerson(String passwordPerson) {
		this.passwordPerson = passwordPerson;
	}

	public String getPhonePerson() {
		return phonePerson;
	}

	public void setPhonePerson(String phonePerson) {
		this.phonePerson = phonePerson;
	}

	public boolean isProvider() {
		return provider;
	}

	public void setProvider(boolean provider) {
		this.provider = provider;
	}

	public int getIdOrganization() {
		return idOrganization;
	}

	public void setIdOrganization(int idOrganization) {
		this.idOrganization = idOrganization;
	}

	@Override
	public String toString() {
		return "Person{" + "id_person = " + idPerson + "" + "id_organization " + idOrganization;
	}

}
