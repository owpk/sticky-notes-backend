package owpk.backend.repositories.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import owpk.backend.entities.jpa.Note;

@Repository
public interface NotesRepository extends JpaRepository<Note, Long>, JpaSpecificationExecutor<Note> {

}