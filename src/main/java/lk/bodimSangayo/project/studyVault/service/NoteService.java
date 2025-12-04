package lk.bodimSangayo.project.studyVault.service;

import lk.bodimSangayo.project.studyVault.dto.NoteDTO;

import java.util.List;

public interface NoteService {
    void addNote(NoteDTO noteDTO);
    void deleteNote(String noteId);
    void updateNote(String noteId,NoteDTO noteDTO);
    NoteDTO getSelectedNote(String noteId);
    List<NoteDTO> getAllNotes();
}
