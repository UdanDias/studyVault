package lk.bodimSangayo.project.studyVault.controller;

import lk.bodimSangayo.project.studyVault.dto.RepDTO;
import lk.bodimSangayo.project.studyVault.dto.StudentDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {
    @GetMapping
    public String health(){
        return "OK";
    }
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addStudent(@RequestBody StudentDTO studentDTO){
        System.out.println(studentDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @DeleteMapping("/{studentId}")
    public ResponseEntity<Void> deleteStudent(@PathVariable String studentId){
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @PatchMapping("/{studentId}")
    public ResponseEntity<Void> updateStudent(@PathVariable String studentId ,@RequestBody StudentDTO studentDTO){
        System.out.println(studentDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/getSelectedStudent/{studentId}")
    public ResponseEntity<StudentDTO> getSelectedStudent(@PathVariable String studentId){
        return ResponseEntity.ok(new StudentDTO(
                        "S001",
                        "Kasun Perera",
                        "C001",
                        "kasun.perera@example.com",
                        "2023CS001",
                        "0771234567",
                        "Level 1",
                        "2023",
                        "Male",
                        "Faculty of Computing",
                        "Computer Science"
                ));
    }
    @GetMapping("/getAllStudents")
    public ResponseEntity<List<StudentDTO>>getAllStudents(){
        return ResponseEntity.ok(new ArrayList<StudentDTO>(
                Arrays.asList(
                        new StudentDTO(
                                "S001",
                                "Kasun Perera",
                                "C001",
                                "kasun.perera@example.com",
                                "2023CS001",
                                "0771234567",
                                "Level 1",
                                "2023",
                                "Male",
                                "Faculty of Computing",
                                "Computer Science"
                        ),
                        new StudentDTO(
                                "S001",
                                "Kasun Perera",
                                "C001",
                                "kasun.perera@example.com",
                                "2023CS001",
                                "0771234567",
                                "Level 1",
                                "2023",
                                "Male",
                                "Faculty of Computing",
                                "Computer Science"
                        )
                )
        ));
    }
}
