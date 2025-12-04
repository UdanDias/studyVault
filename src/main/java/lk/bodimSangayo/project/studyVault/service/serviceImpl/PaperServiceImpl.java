package lk.bodimSangayo.project.studyVault.service.serviceImpl;

import lk.bodimSangayo.project.studyVault.dto.PaperDTO;
import lk.bodimSangayo.project.studyVault.service.PaperService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaperServiceImpl implements PaperService {
    @Override
    public void addPaper(PaperDTO paperDTO) {

    }

    @Override
    public void deletePaper(String paperId) {

    }

    @Override
    public void updatePaper(String paperId, PaperDTO paperDTO) {

    }

    @Override
    public PaperDTO getSelectedPaper(String paperId) {
        return null;
    }

    @Override
    public List<PaperDTO> getAllPapers() {
        return List.of();
    }
}
