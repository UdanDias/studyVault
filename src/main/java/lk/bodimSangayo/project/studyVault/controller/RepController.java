package lk.bodimSangayo.project.studyVault.controller;

import lk.bodimSangayo.project.studyVault.dto.RepDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/api/v1/rep")
public class RepController {
    @GetMapping
    public String health(){
        return "OK";
    }
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void>addRep(@RequestBody RepDTO repDTO){
        System.out.println(repDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @DeleteMapping("/{repId}")
    public ResponseEntity<Void> deleteRep(@PathVariable String repId){
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @PatchMapping("/{repId}")
    public ResponseEntity<Void> updateRep(@PathVariable String repId ,@RequestBody RepDTO repDTO){
        System.out.println(repDTO);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @GetMapping("/getSelectedRep/{repId}")
    public ResponseEntity<RepDTO> getSelectedRep(@PathVariable String repId){
        return ResponseEntity.ok(new RepDTO(
                        "R002",
                        "S002",
                        "A002",
                        "Level 2",
                        "2022IT005",
                        "Female",
                        LocalDate.of(2022, 9, 5)
                )
        );
    }
    @GetMapping("/getAllReps")
    public ResponseEntity<List<RepDTO>>getAllReps(){
        return ResponseEntity.ok(new ArrayList<RepDTO>(
                Arrays.asList(
                        new RepDTO(
                                "R002",
                                "S002",
                                "A002",
                                "Level 2",
                                "2022IT005",
                                "Female",
                                LocalDate.of(2022, 9, 5)
                        ),
                        new RepDTO(
                                "R002",
                                "S002",
                                "A002",
                                "Level 2",
                                "2022IT005",
                                "Female",
                                LocalDate.of(2022, 9, 5)
                        )


                )
        ));
    }
}
