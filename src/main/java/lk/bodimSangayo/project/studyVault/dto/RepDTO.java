package lk.bodimSangayo.project.studyVault.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class RepDTO implements Serializable {
    private String repId;
    private String studentId;
    private String addedByAdminId;
    private String level;
    private String stuNo;
    private String gender;
    private LocalDate startDate;
}
