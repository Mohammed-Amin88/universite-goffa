package fr.goffa.universite.matiere.business;

import java.util.List;

import fr.goffa.universite.enseignant.domain.Enseignant;
import fr.goffa.universite.matiere.domain.Matiere;

public interface IMatiereBusiness {

	public List<Matiere> getMatieres();

	public Matiere getMatiere(Integer id);

	public void save(Matiere matiere);

	public List<Enseignant> FindAllEnseignants();

	public List<Enseignant> getAllEnseignants();

	public Enseignant getEnseignantById(Integer id);

}
