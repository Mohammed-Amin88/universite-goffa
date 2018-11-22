package fr.goffa.universite.matiere.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.goffa.universite.enseignant.business.IEnseignantBusiness;
import fr.goffa.universite.enseignant.domain.Enseignant;
import fr.goffa.universite.matiere.business.IMatiereBusiness;
import fr.goffa.universite.matiere.domain.Matiere;
import fr.goffa.universite.matiere.repository.IMatiereRepository;

@Service
public class MatiereBusinessImpl implements IMatiereBusiness {
	@Autowired
	private IMatiereRepository matiereRepository;

	@Autowired
	private IEnseignantBusiness enseignantBusiness;

	@Override
	public List<Matiere> getMatieres() {

		return matiereRepository.findAll();
	}

	@Override
	public Matiere getMatiere(Integer id) {
		return matiereRepository.getOne(id);
	}

	@Override
	public void save(Matiere matiere) {
		matiereRepository.save(matiere);

	}

	@Override
	public List<Enseignant> getAllEnseignants() {
		List<Enseignant> e = enseignantBusiness.getEnseignants();
		return e;
	}

	@Override
	public List<Enseignant> FindAllEnseignants() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Enseignant getEnseignantById(Integer id) {
		Enseignant enseignant = enseignantBusiness.getEnseignant(id);
		return enseignant;
	}

}
