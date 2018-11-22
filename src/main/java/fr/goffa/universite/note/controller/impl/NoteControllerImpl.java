package fr.goffa.universite.note.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.goffa.universite.note.business.INoteBusiness;
import fr.goffa.universite.note.controller.INoteController;
import fr.goffa.universite.note.domain.Note;

@Controller
public class NoteControllerImpl implements INoteController {
	@Autowired
	private INoteBusiness noteBusiness;

	@Override
	@RequestMapping("/notes")
	public String getNotes(Model model) {
		List<Note> notes = noteBusiness.getNotes();
		model.addAttribute("notes", notes);
		return "note/notes";

	}

	@Override
	@RequestMapping("/note")
	public String getNotetById(Model model, @RequestParam Integer id) {
		Note n = noteBusiness.getNotetById(id);
		model.addAttribute("note", n);

		return "note/note";
	}

}
