package fr.goffa.universite.matiere.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import fr.goffa.universite.enseignant.domain.Enseignant;

@Entity
@Table(name = "T_MATIERE")
public class Matiere {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = " NUMERO_MATIERE")
	private Integer numeroMatiere;

	@Column(name = " NOM")
	private String nom;

	@Column(name = "COEF")
	private String coef;

	@Column(name = "DATE_DEBUT")
	private String dateDebut;

	@Column(name = "DATE_FIN")
	private String dateFin;

	@ManyToOne
	@JoinColumn(name = "id_enseignant")
	private Enseignant enseignant;

	public Enseignant getEnseignant() {
		return enseignant;
	}

	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}

	public Integer getId() {
		return id;

	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumeroMatiere() {
		return numeroMatiere;
	}

	public void setNumeroMatiere(Integer numeroMatiere) {
		this.numeroMatiere = numeroMatiere;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCoef() {
		return coef;
	}

	public void setCoef(String coef) {
		this.coef = coef;
	}

	public String getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}

	public String getDateFin() {
		return dateFin;
	}

	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}

}
