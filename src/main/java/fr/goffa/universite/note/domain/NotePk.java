package fr.goffa.universite.note.domain;

import java.io.Serializable;

import javax.persistence.Column;

public class NotePk implements Serializable {

	@Column(name = "ID_ETUDIANT")
	private Integer idEtudiant;

	@Column(name = "ID_MATIERE")
	private Integer idMatiere;

	public Integer getIdEtudiant() {
		return idEtudiant;
	}

	public void setIdEtudiant(Integer idEtudiant) {
		this.idEtudiant = idEtudiant;
	}

	public Integer getIdMatiere() {
		return idMatiere;
	}

	public void setIdMatiere(Integer idMatiere) {
		this.idMatiere = idMatiere;
	}

}
