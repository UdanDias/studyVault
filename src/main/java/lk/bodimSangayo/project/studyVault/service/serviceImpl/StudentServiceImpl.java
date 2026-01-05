package lk.bodimSangayo.project.studyVault.service.serviceImpl;

import lk.bodimSangayo.project.studyVault.dto.StudentDTO;
import lk.bodimSangayo.project.studyVault.service.StudentService;
import lk.bodimSangayo.project.studyVault.util.UtilData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public void addStudent(StudentDTO studentDTO) {
        studentDTO.setStudentId(UtilData.generateStudentId());
        System.out.println(studentDTO);
    }

    @Override
    public void deleteStudent(String studentId) {

    }

    @Override
    public void updateStudent(String studentId, StudentDTO studentDTO) {

    }

    @Override
    public StudentDTO getSelectedStudent(String studentId) {
        return null;
    }

    @Override
    public List<StudentDTO> getAllStudents() {
        return List.of();
    }
}
