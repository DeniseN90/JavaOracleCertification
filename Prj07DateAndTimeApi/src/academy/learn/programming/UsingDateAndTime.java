package academy.learn.programming;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class UsingDateAndTime {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2030, Month.APRIL, 10);
        System.out.println(localDate);
        localDate = localDate.plusDays(4).plusMonths(2); // you need to reassign it cause it creates a new object
        System.out.println(localDate);


        LocalTime localTime = LocalTime.of(4,12);
        System.out.println(localTime);
        localTime = localTime.plusHours(7).plusSeconds(54);
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println(localDateTime);
        localDateTime = localDateTime.minusHours(7).plusSeconds(54).plusYears(7);
        System.out.println(localDateTime);

        // before Java 8
        System.out.println("Before Java 8");

        Date date = new Date();
        System.out.println(date);
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        calendar.setTime(date);
        calendar.set(Calendar.DATE, 1);
        calendar.set(Calendar.MONTH,6);
        date = calendar.getTime();
        System.out.println(date);

        // trick
        LocalDate ld = LocalDate.of(2019, 6, 4);
        ld.plusMonths(9); // this result is ignored
        System.out.println(ld);

        // ld.plusMinutes(); doesn't compile


    }
}
