package utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtils {
    public static LocalDate getLocalDate(String date, String dateFormat){
        LocalDate dateLocal = LocalDate.parse(date, DateTimeFormatter.ofPattern(dateFormat));
        return dateLocal;


    }

    public static String getDateAsString(LocalDate localDate, String dateFormat){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);
        String result = localDate.format(formatter);
        return result;
    }

}
