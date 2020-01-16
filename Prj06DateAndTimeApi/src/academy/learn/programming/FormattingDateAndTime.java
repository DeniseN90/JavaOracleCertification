package academy.learn.programming;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormattingDateAndTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        System.out.println(date.getDayOfWeek()); // MONDAY
        System.out.println(date.getMonth()); // JANUARY
        System.out.println(date.getYear()); // 2020
        System.out.println(date.getDayOfYear()); // 20


        LocalDate data = LocalDate.of(2019, 2, 7);
        LocalTime time = LocalTime.of(22, 6, 6);
        LocalDateTime dateTime = LocalDateTime.of(2019, 2, 7, 22, 5, 45);

        System.out.println(data.format(DateTimeFormatter.ISO_LOCAL_DATE)); // returns a string representation
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        DateTimeFormatter shortFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter mediumFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        System.out.println(shortFormatter.format(dateTime));
        System.out.println(mediumFormatter.format(date));
        // System.out.println(shortFormatter.format(time)); // throws an exception

        // custom formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm:ss");
        System.out.println(dateTime.format(formatter));



    }
}
