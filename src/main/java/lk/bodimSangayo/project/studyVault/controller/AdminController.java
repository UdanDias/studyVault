package lk.bodimSangayo.project.studyVault.controller;

import lk.bodimSangayo.project.studyVault.dto.AdminDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Slf4j
@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {

    @GetMapping()
    public String healthCheck(){
        return "OK";
    }
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addAdmin(@RequestBody AdminDTO adminDTO){
        System.out.println(adminDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @DeleteMapping("{adminId}")
    public ResponseEntity<Void> deleteAdmin(@PathVariable String adminId){
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @PatchMapping(value = "{adminId}", consumes = APPLICATION_JSON_VALUE,produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> updateAdmin(@PathVariable String adminId,@RequestBody AdminDTO adminDTO){
        System.out.println(adminDTO);
        return ResponseEntity.ok().build();
    }
    @GetMapping("/getSelectedAdmin/{adminId}")
    public ResponseEntity<AdminDTO> getSelectedAdmin(@PathVariable String adminId){
        return ResponseEntity.ok(new AdminDTO(
                "A001",
                "Kasun Perera",
                "kasun.perera@example.com",
                "0771234567",
                LocalDate.of(2023, 5, 12)
        ));

    }
    @GetMapping("/getAllAdmins")
    public ResponseEntity<List<AdminDTO>>getAllAdmins(){
        List<AdminDTO> adminList=new ArrayList<>();
        adminList.add(
                new AdminDTO(
                "A001",
                "Kasun Perera",
                "kasun.perera@example.com",
                "0771234567",
                LocalDate.of(2023, 5, 12)
                ));
        adminList.add(new AdminDTO(
                "A001",
                "Kasun Perera",
                "kasun.perera@example.com",
                "0771234567",
                LocalDate.of(2023, 5, 12)
                ));
        adminList.add(new AdminDTO(
                        "A001",
                        "Kasun Perera",
                        "kasun.perera@example.com",
                        "0771234567",
                        LocalDate.of(2023, 5, 12)
                ));
        return ResponseEntity.ok(adminList);

    }


}
