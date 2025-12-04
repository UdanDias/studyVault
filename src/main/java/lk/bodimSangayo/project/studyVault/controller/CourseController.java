package lk.bodimSangayo.project.studyVault.controller;

import lk.bodimSangayo.project.studyVault.dto.AdminDTO;
import lk.bodimSangayo.project.studyVault.dto.CourseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/course")
public class CourseController {
    @GetMapping
    public String healthCheck(){
        return "OK";
    }

    @PostMapping()
    public ResponseEntity<Void> addCourse(@RequestBody CourseDTO courseDTO){
        System.out.println(courseDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @PatchMapping("/{courseId}")
    public ResponseEntity<Void> updateCourse(@PathVariable String courseId ,@RequestBody CourseDTO courseDTO){
        System.out.println(courseDTO);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @DeleteMapping("/{courseId}")
    public ResponseEntity<Void>deleteCourse(@PathVariable String courseId){
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/getSelectedCourse/{courseId}")
    public ResponseEntity<CourseDTO> getSelectedCourse(@PathVariable String courseId){
        return ResponseEntity.ok(new CourseDTO(
                        "C001",
                        "Introduction to Programming",
                        "Computer Science",
                        "3"
        ));
    }
    @GetMapping("/getAllCourses")
    public ResponseEntity<List<CourseDTO>> getAllCourses(){
        List<CourseDTO> courseList = new ArrayList<>();
        courseList.add(new CourseDTO(
                        "C001",
                        "Introduction to Programming",
                        "Computer Science",
                        "3"
        ));
        courseList.add(new CourseDTO(
                "C002",
                "Introduction to web fundamentals",
                "Computer Science",
                "2"
        ));
        courseList.add(new CourseDTO(
                "C003",
                "Introduction to Database management Systems",
                "Computer Science",
                "3"
        ));
        return ResponseEntity.ok(courseList);
    }

}
