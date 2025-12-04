package lk.bodimSangayo.project.studyVault.service;

import lk.bodimSangayo.project.studyVault.dto.StudentDTO;

import java.util.List;

public interface StudentService {
    void addStudent(StudentDTO studentDTO);
    void deleteStudent(String studentId);
    void updateStudent(String studentId,StudentDTO studentDTO);
    StudentDTO getSelectedStudent(String studentId);
    List<StudentDTO> getAllStudents();
}
