package lk.bodimSangayo.project.studyVault.service;

import lk.bodimSangayo.project.studyVault.dto.PaperDTO;
import lk.bodimSangayo.project.studyVault.dto.RepDTO;

import java.util.List;

public interface RepService {
    void addRep(RepDTO repDTO);
    void deleteRep(String repId);
    void updateRep(String repId,RepDTO repDTO);
    RepDTO getSelectedRep(String repId);
    List<RepDTO> getAllReps();
}
