package academy.learn.programming;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class UsingPeriod {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2017, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2017, Month.APRIL, 30);
        cleanAnimalCage(start, end);

        LocalDate startDate = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate endDate = LocalDate.of(2015, Month.MARCH, 30);
        Period period = Period.ofMonths(1); // create a period
        performAnimalEnrichment(startDate, endDate, period);


        Long l = start.toEpochDay();
        System.out.println(l); // number of days since January 1 1970
    }

    public static void cleanAnimalCage(LocalDate start, LocalDate end) {
        while (start.isBefore(end)){
            System.out.println("Need to clean the cage on " + start);
            start = start.plusMonths(1);
        }
    }


    private static void performAnimalEnrichment(LocalDate start,
                                                LocalDate end,
                                                Period period) {
        // uses the generic period
        LocalDate upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plus(period); // adds the period
        }
    }


}
