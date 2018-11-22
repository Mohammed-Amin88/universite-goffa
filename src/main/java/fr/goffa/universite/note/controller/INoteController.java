package fr.goffa.universite.note.controller;

import org.springframework.ui.Model;

public interface INoteController {

	public String getNotes(Model model);

	public String getNotetById(Model model, Integer id);

}
