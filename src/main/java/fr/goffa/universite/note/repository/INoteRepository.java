package fr.goffa.universite.note.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.goffa.universite.note.domain.Note;
import fr.goffa.universite.note.domain.NotePk;

@Repository
public interface INoteRepository extends JpaRepository<Note, NotePk> {

}
