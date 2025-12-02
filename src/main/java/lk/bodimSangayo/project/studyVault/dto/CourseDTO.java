package lk.bodimSangayo.project.studyVault.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CourseDTO implements Serializable {
    private String courseId;
    private String courseName;
    private String department;
    private String credits;
}
