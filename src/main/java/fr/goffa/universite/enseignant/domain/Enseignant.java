package fr.goffa.universite.enseignant.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import fr.goffa.universite.matiere.domain.Matiere;

@Entity
@Table(name = "t_enseignant")
public class Enseignant {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "NUMERO_ENSEIGNANT")
	private Integer numeroEnseignant;

	@Column(name = "NOM")
	private String nom;

	@Column(name = "PRENOM")
	private String prenom;

	@Column(name = "DATE_NAISSANCE")
	private String dateNaissance;

	@Column(name = "SEXE")
	private String sexe;

	@Column(name = "GRADE")
	private String grade;

	@Column(name = " DATE_EMBAUCHE")
	private String dateEmbauche;

	@OneToMany
	private List<Matiere> matiers;

	public List<Matiere> getMatiers() {
		return matiers;
	}

	public void setMatiers(List<Matiere> matiers) {
		this.matiers = matiers;
	}

	public Enseignant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Enseignant(Integer id, Integer numeroEnseignant, String nom, String prenom, String dateNaissance,
			String sexe, String grade, String dateEmbauche) {
		super();
		this.id = id;
		this.numeroEnseignant = numeroEnseignant;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.sexe = sexe;
		this.grade = grade;
		this.dateEmbauche = dateEmbauche;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumeroEnseignant() {
		return numeroEnseignant;
	}

	public void setNumeroEnseignant(Integer numeroEnseignant) {
		this.numeroEnseignant = numeroEnseignant;
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

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getDateEmbauche() {
		return dateEmbauche;
	}

	public void setDateEmbauche(String dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}

}
