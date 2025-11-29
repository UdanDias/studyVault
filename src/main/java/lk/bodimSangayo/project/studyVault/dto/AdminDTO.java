package lk.bodimSangayo.project.studyVault.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class AdminDTO implements Serializable {
    private String adminId;
    private String name;
    private String email;
    private String phone;
    private LocalDate joinedDate;
}
