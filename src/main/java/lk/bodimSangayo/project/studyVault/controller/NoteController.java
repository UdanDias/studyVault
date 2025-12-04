package lk.bodimSangayo.project.studyVault.controller;

import lk.bodimSangayo.project.studyVault.dto.NoteDTO;
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
@RequestMapping("/api/v1/note")
public class NoteController {
    @GetMapping
    public String healthCheck() {
        return "OK";
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addNote(NoteDTO noteDTO) {
        System.out.println(noteDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @DeleteMapping("/{noteId}")
    public ResponseEntity<Void> deleteNote(@PathVariable String noteId) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @PatchMapping(value = "/{noteId}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> updateNote(@PathVariable String noteId,@RequestBody NoteDTO noteDTO) {
        System.out.println(noteDTO);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @GetMapping("/getSelectedNote/{noteId}")
    public ResponseEntity<NoteDTO> getSelectedNote(@PathVariable String noteId) {
        return ResponseEntity.ok(new NoteDTO(
                        "N001",
                        "C001",
                        "Introduction to OOP Concepts",
                        "Level 1",
                        LocalDate.of(2024, 1, 15),
                        Time.valueOf("10:30:00")
                )
        );
    }
    @GetMapping("/getAllNotes")
    public ResponseEntity<List<NoteDTO>> getAllNotes(){
        return ResponseEntity.ok(new ArrayList<NoteDTO>(
                Arrays.asList(
                        new NoteDTO(
                                "N001",
                                "C001",
                                "Introduction to OOP Concepts",
                                "Level 1",
                                LocalDate.of(2024, 1, 15),
                                Time.valueOf("10:30:00")
                        ),
                        new NoteDTO(
                                "N002",
                                "C002",
                                "Introduction to Java Concepts",
                                "Level 2",
                                LocalDate.of(2024, 1, 15),
                                Time.valueOf("10:30:00")
                        )
                )

        ));
    }
}
