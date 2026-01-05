package lk.bodimSangayo.project.studyVault.service.serviceImpl;

import lk.bodimSangayo.project.studyVault.dto.NoteDTO;
import lk.bodimSangayo.project.studyVault.service.NoteService;
import lk.bodimSangayo.project.studyVault.util.UtilData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {
    @Override
    public void addNote(NoteDTO noteDTO) {
        noteDTO.setNoteId(UtilData.generateNoteId());
        noteDTO.setSavedDate(UtilData.generateTodayDate());
        noteDTO.setSavedTime(UtilData.generateCurrentTime());
        System.out.println(noteDTO);

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
