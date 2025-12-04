package lk.bodimSangayo.project.studyVault.service.serviceImpl;

import lk.bodimSangayo.project.studyVault.dto.NoteDTO;
import lk.bodimSangayo.project.studyVault.service.NoteService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {
    @Override
    public void addNote(NoteDTO noteDTO) {

    }

    @Override
    public void deleteNote(String noteId) {

    }

    @Override
    public void updateNote(String noteId, NoteDTO noteDTO) {

    }

    @Override
    public NoteDTO getSelectedNote(String noteId) {
        return null;
    }

    @Override
    public List<NoteDTO> getAllNotes() {
        return List.of();
    }
}
