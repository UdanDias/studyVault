package lk.bodimSangayo.project.studyVault.service.serviceImpl;

import lk.bodimSangayo.project.studyVault.dto.RepDTO;
import lk.bodimSangayo.project.studyVault.service.RepService;
import lk.bodimSangayo.project.studyVault.util.UtilData;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RepServiceImpl implements RepService {
    @Override
    public void addRep(RepDTO repDTO) {
        repDTO.setRepId(UtilData.generateRepId());
        repDTO.setStartDate(UtilData.generateTodayDate());
        System.out.println(repDTO);
    }

    @Override
    public void deleteRep(String repId) {

    }

    @Override
    public void updateRep(String repId, RepDTO repDTO) {

    }

    @Override
    public RepDTO getSelectedRep(String repId) {
        return null;
    }

    @Override
    public List<RepDTO> getAllReps() {
        return List.of();
    }
}
