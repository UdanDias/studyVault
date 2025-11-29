package lk.bodimSangayo.project.studyVault.dto;

import java.io.Serializable;
import java.sql.Time;
import java.time.LocalDate;

public class NoteDTO implements Serializable {
    private String noteId;
    private String courseId;
    private String noteTitle;
    private String level;
    private LocalDate savedDate;
    private Time savedTime;

}
