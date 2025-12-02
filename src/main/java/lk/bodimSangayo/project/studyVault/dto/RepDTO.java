package lk.bodimSangayo.project.studyVault.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RepDTO implements Serializable {
    private String repId;
    private String studentId;
    private String addedByAdminId;
    private String level;
    private String stuNo;
    private String gender;
    private LocalDate startDate;
}
