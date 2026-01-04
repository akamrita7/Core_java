package stream;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class LocalDateTimeexp {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        LocalDateTime dateTime = LocalDateTime.now();
        LocalDate parsed = LocalDate.parse("2025-12-28");
        String formatted = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        long daysBetween = ChronoUnit.DAYS.between(date, parsed);
        LocalDate nextWeek = date.plusDays(7);
        LocalDate nextMonth = date.plusMonths(1);
        boolean isLeap = LocalDate.now().isLeapYear();
        if (date.isAfter(parsed)){
            System.out.println("args = " + Arrays.toString(args));
        }

    }
}
