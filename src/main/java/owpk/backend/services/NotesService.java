package owpk.backend.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import owpk.backend.repositories.jpa.NotesRepository;

@Service
@RequiredArgsConstructor
public class NotesService {

    private final  NotesRepository notesRepository;
}
