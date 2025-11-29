package lk.bodimSangayo.project.studyVault.dto;

import java.io.Serializable;
import java.sql.Time;
import java.time.LocalDate;

public class PaperDTO implements Serializable {
    private String paperId;
    private String courseId;
    private String name;
    private String level;
    private String semester;
    private Boolean isEndPaper;
    private LocalDate savedDate;
    private Time savedTime;

}
