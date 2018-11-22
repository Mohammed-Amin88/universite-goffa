package fr.goffa.universite.matiere.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.goffa.universite.enseignant.domain.Enseignant;
import fr.goffa.universite.matiere.business.IMatiereBusiness;
import fr.goffa.universite.matiere.controller.IMatiereController;
import fr.goffa.universite.matiere.domain.Matiere;

@Controller
public class MatiereControllerImpl<Matieres> implements IMatiereController {
	@Autowired
	private IMatiereBusiness matiereBusiness;

	@Override
	@RequestMapping("/matieres")
	public String getMatieres(Model model) {
		List<Matiere> matieres = matiereBusiness.getMatieres();
		model.addAttribute("matieres", matieres);
		return "matiere/matieres";

	}

	@Override
	@RequestMapping("/matiere")
	public String getMatieretById(Model model, @RequestParam Integer id) {
		Matiere m = matiereBusiness.getMatiere(id);
		model.addAttribute("matiere", m);

		return "matiere/matiere";
	}

	@Override
	@RequestMapping("/ajouterMatiere")
	public String ajouterFormulaireMatiere(Model model) {
		List<Enseignant> enseignants = matiereBusiness.getAllEnseignants();
		model.addAttribute("enseignants", enseignants);

		Matiere m = new Matiere();
		model.addAttribute("matiere", m);
		return "matiere/ajouterMatiere";

	}

	@Override
	@PostMapping("/addMatiere")
	public String ajouterMatiere(Model model, @ModelAttribute Matiere matiere, @RequestParam Integer idEnseignant) {
		Enseignant enseignant = matiereBusiness.getEnseignantById(idEnseignant);
		matiere.setEnseignant(enseignant);
		matiereBusiness.save(matiere);
		return "redirect:/matieres";

	}

	@Override
	@GetMapping("/modifierMatiere")
	public String modifierFormulaireMatiere(Model model, @RequestParam Integer id) {
		Matiere e = matiereBusiness.getMatiere(id);
		List<Enseignant> enseignants = matiereBusiness.getAllEnseignants();
		model.addAttribute("enseignants", enseignants);
		model.addAttribute("matiere", e);
		return "matiere/modifierMatiere";
	}

	@Override
	@PostMapping("/modifierMatiere")
	public String modifierMatiere(Model model, @ModelAttribute Matiere matiere, @RequestParam Integer idEnseignant) {
		Enseignant enseignant = matiereBusiness.getEnseignantById(idEnseignant);
		matiere.setEnseignant(enseignant);
		matiereBusiness.save(matiere);
		return "redirect:/matieres";
	}

}
