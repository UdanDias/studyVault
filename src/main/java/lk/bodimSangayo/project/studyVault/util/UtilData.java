package lk.bodimSangayo.project.studyVault.util;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

public class UtilData {
    public static String generateAdminId(){
        return "A/"+UUID.randomUUID();
    }
    public static String generateCourseId(){
        return "C/"+UUID.randomUUID();
    }
    public static String generateNoteId(){
        return "N/"+UUID.randomUUID();
    }
    public static String generatePaperId(){
        return "P/"+UUID.randomUUID();
    }
    public static String generateRepId(){
        return "R/"+UUID.randomUUID();
    }
    public static String generateStudentId(){
        return "S/"+UUID.randomUUID();
    }
    public static String generateUserId(){
        return "U/"+UUID.randomUUID();
    }
    public static LocalDate generateTodayDate(){
        return LocalDate.now();
    }
    public static Time generateCurrentTime(){
        return Time.valueOf(LocalTime.now());
    }


}
