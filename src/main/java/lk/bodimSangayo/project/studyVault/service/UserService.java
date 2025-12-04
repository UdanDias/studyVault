package lk.bodimSangayo.project.studyVault.service;

import lk.bodimSangayo.project.studyVault.dto.UserDTO;

import java.util.List;

public interface UserService {
    void addUser(UserDTO userDTO);
    void deleteUser(String userId);
    void updateUser(String userId,UserDTO userDTO);
    UserDTO getSelectedUser(String userId);
    List<UserDTO> getAllUsers();
}
