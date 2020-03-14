package academy.learn.programming;

/**
 * Created by catenate on 24/01/2020.
 */
public class StaticInitialization {

    private static final int NUM_SECONDS_PER_HOUR;

 /*   public StaticInitialization(){
        NUM_SECONDS_PER_HOUR = 60;
    }*/



    static {
        int numSecondsPerMinute = 60;
        int numMinutesPerHour = 60;
        NUM_SECONDS_PER_HOUR = numSecondsPerMinute * numMinutesPerHour;
    }



    private static int one;
    private static final int two;
    private static final int three = 3;
//    private static final int four; // DOES NOT COMPILE CAUSE IT IS INITIALIZED
    static {
        one = 1;
        two = 2;
//        three = 3; // DOES NOT COMPILE
//        two = 4; // DOES NOT COMPILE
        }


    public static void main(String[] args) {



    }
}
