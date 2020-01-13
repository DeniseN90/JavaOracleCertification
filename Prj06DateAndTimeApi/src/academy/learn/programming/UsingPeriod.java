package academy.learn.programming;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class UsingPeriod {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2017, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2017, Month.APRIL, 30);
        cleanAnimalCage(start, end);
        

        Long l = start.toEpochDay();
        System.out.println(l); // number of days since January 1 1970


        Period period = Period.ofWeeks(1);



    }

    public static void cleanAnimalCage(LocalDate start, LocalDate end) {
        while (start.isBefore(end)){
            System.out.println("Need to clean the cage on " + start);
            start = start.plusMonths(1);
        }
    }
}
