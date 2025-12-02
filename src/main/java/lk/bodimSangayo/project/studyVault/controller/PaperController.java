package lk.bodimSangayo.project.studyVault.controller;

import lk.bodimSangayo.project.studyVault.dto.PaperDTO;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/paper")
public class PaperController {
    private final SmartInitializingSingleton smartInitializingSingleton;

    public PaperController(SmartInitializingSingleton smartInitializingSingleton) {
        this.smartInitializingSingleton = smartInitializingSingleton;
    }

    @GetMapping
    public String healthCheck() {
        return "OK";
    }
    @PostMapping(consumes= MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addPaper(@RequestBody PaperDTO paperDTO) {
        System.out.println(paperDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @DeleteMapping("/{paperId}")
    public ResponseEntity<Void> deletePaper(@PathVariable String paperId) {
        return ResponseEntity.noContent().build();
    }
    @PatchMapping("/{paperId}")
    public ResponseEntity<Void> updatePaper(@PathVariable String paperId, @RequestBody PaperDTO paperDTO) {
        System.out.println(paperDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/getSelectedPaper/{paperId}")
    public ResponseEntity<PaperDTO>getSelectedPaper(@PathVariable String paperId) {
        return ResponseEntity.ok(new PaperDTO(
                        "P001",
                        "C001",
                        "OOP Midterm Paper",
                        "Level 1",
                        "Semester 1",
                        false,
                        LocalDate.of(2024, 1, 20),
                        Time.valueOf("09:00:00")
                )
        );
    }
    @GetMapping("/getAllPapers")
    public ResponseEntity<List<PaperDTO>> getAllPapers() {
        return ResponseEntity.ok(new ArrayList<PaperDTO>(
                Arrays.asList(
                        new PaperDTO(
                                "P001",
                                "C001",
                                "OOP Midterm Paper",
                                "Level 1",
                                "Semester 1",
                                false,
                                LocalDate.of(2024, 1, 20),
                                Time.valueOf("09:00:00")
                        ),
                        new PaperDTO(
                                "P001",
                                "C001",
                                "OOP Midterm Paper",
                                "Level 1",
                                "Semester 1",
                                false,
                                LocalDate.of(2024, 1, 20),
                                Time.valueOf("09:00:00")
                        )


                )
        ));
    }
}
