package lk.bodimSangayo.project.studyVault.controller;

import lk.bodimSangayo.project.studyVault.dto.Role;
import lk.bodimSangayo.project.studyVault.dto.StudentDTO;
import lk.bodimSangayo.project.studyVault.dto.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static lk.bodimSangayo.project.studyVault.dto.Role.*;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    @GetMapping
    public String health(){
        return "OK";
    }
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addUser(@RequestBody UserDTO userDTO){
        System.out.println(userDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @DeleteMapping("/{userId}")
    public ResponseEntity<Void> deleteUser(@PathVariable String userId){
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @PatchMapping("/{userId}")
    public ResponseEntity<Void> updateUser(@PathVariable String userId ,@RequestBody UserDTO userDTO){
        System.out.println(userDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/getSelectedUser/{userId}")
    public ResponseEntity<UserDTO> getSelectedUser(@PathVariable String userId){
        return ResponseEntity.ok(new UserDTO(
                        "U001",
                        "kasun123",
                        "Kasun",
                        "Perera",
                        "password123",
                        "kasun.perera@example.com",
                        "0771234567",
                        LocalDate.of(2002, 5, 10),
                        LocalDate.of(2024, 1, 1),
                        ADMIN
                )
        );
    }
    @GetMapping("/getAllUsers")
    public ResponseEntity<List<UserDTO>>getAllUsers(){
        return ResponseEntity.ok(new ArrayList<UserDTO>(
                Arrays.asList(
                        new UserDTO(
                                "U001",
                                "kasun123",
                                "Kasun",
                                "Perera",
                                "password123",
                                "kasun.perera@example.com",
                                "0771234567",
                                LocalDate.of(2002, 5, 10),
                                LocalDate.of(2024, 1, 1),
                                Role.ADMIN
                        ),
                        new UserDTO(
                                "U001",
                                "kasun123",
                                "Kasun",
                                "Perera",
                                "password123",
                                "kasun.perera@example.com",
                                "0771234567",
                                LocalDate.of(2002, 5, 10),
                                LocalDate.of(2024, 1, 1),
                                Role.REPRESENTATIVE
                        ),
                        new UserDTO(
                                "U001",
                                "kasun123",
                                "Kasun",
                                "Perera",
                                "password123",
                                "kasun.perera@example.com",
                                "0771234567",
                                LocalDate.of(2002, 5, 10),
                                LocalDate.of(2024, 1, 1),
                                Role.STUDENT
                        )
                )
        ));
    }
}
