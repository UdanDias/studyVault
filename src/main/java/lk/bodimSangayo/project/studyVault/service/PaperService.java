package lk.bodimSangayo.project.studyVault.service;

import lk.bodimSangayo.project.studyVault.dto.PaperDTO;

import java.util.List;

public interface PaperService {
    void addPaper(PaperDTO paperDTO);
    void deletePaper(String paperId);
    void updatePaper(String paperId,PaperDTO paperDTO);
    PaperDTO getSelectedPaper(String paperId);
    List<PaperDTO> getAllPapers();
}
