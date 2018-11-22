package fr.goffa.universite.matiere.controller;

import org.springframework.ui.Model;

import fr.goffa.universite.matiere.domain.Matiere;

public interface IMatiereController {

	public String getMatieres(Model model);

	public String getMatieretById(Model model, Integer id);

	public String ajouterFormulaireMatiere(Model model);

	public String ajouterMatiere(Model model, Matiere Matiere, Integer id);

	public String modifierFormulaireMatiere(Model model, Integer id);

	public String modifierMatiere(Model model, Matiere matiere, Integer id);

}
