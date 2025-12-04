package lk.bodimSangayo.project.studyVault.service.serviceImpl;

import lk.bodimSangayo.project.studyVault.dto.CourseDTO;
import lk.bodimSangayo.project.studyVault.service.CourseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Override
    public void addCourse(CourseDTO courseDTO) {

    }

    @Override
    public void deleteCourse(String courseId) {

    }

    @Override
    public void updateCourse(String courseId, CourseDTO courseDTO) {

    }

    @Override
    public CourseDTO getSelectedCourse(String courseId) {
        return null;
    }

    @Override
    public List<CourseDTO> getAllCourses() {
        return List.of();
    }
}
