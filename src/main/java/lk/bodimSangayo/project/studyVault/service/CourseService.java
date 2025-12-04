package lk.bodimSangayo.project.studyVault.service;

import lk.bodimSangayo.project.studyVault.dto.CourseDTO;

import java.util.List;

public interface CourseService {
    void addCourse(CourseDTO courseDTO);
    void deleteCourse(String courseId);
    void updateCourse(String courseId,CourseDTO courseDTO);
    CourseDTO getSelectedCourse(String courseId);
    List<CourseDTO> getAllCourses();
}
