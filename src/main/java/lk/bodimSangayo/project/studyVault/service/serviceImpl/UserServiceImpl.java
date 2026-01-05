package lk.bodimSangayo.project.studyVault.service.serviceImpl;

import lk.bodimSangayo.project.studyVault.dto.UserDTO;
import lk.bodimSangayo.project.studyVault.service.UserService;
import lk.bodimSangayo.project.studyVault.util.UtilData;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Override
    public void addUser(UserDTO userDTO) {
        userDTO.setUserId(UtilData.generateUserId());
        userDTO.setAccountCreatedDate(UtilData.generateTodayDate());
        userDTO.setAccountCreatedTime(UtilData.generateCurrentTime());
        System.out.println(userDTO);
    }

    @Override
    public void deleteUser(String userId) {

    }

    @Override
    public void updateUser(String userId, UserDTO userDTO) {

    }

    @Override
    public UserDTO getSelectedUser(String userId) {
        return null;
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return List.of();
    }
}
