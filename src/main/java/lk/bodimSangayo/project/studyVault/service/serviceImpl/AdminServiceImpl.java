package lk.bodimSangayo.project.studyVault.service.serviceImpl;

import lk.bodimSangayo.project.studyVault.dto.AdminDTO;
import lk.bodimSangayo.project.studyVault.service.AdminService;
import lk.bodimSangayo.project.studyVault.util.UtilData;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminServiceImpl implements AdminService {
    @Override
    public void addAdmin(AdminDTO adminDTO) {
        adminDTO.setAdminId(UtilData.generateAdminId());
        System.out.println(adminDTO);


    }

    @Override
    public void deleteAdmin(String adminId) {

    }

    @Override
    public void updateAdmin(String adminId, AdminDTO adminDTO) {

    }

    @Override
    public AdminDTO getSelectedAdmin(String adminId) {
        return null;
    }

    @Override
    public List<AdminDTO> getAllAdmins() {
        return List.of();
    }
}
