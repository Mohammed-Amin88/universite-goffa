package fr.goffa.universite.note.business;

import java.util.List;

import fr.goffa.universite.note.domain.Note;

public interface INoteBusiness {

	public List<Note> getNotes();

	public Note getNotetById(Integer id);

}
