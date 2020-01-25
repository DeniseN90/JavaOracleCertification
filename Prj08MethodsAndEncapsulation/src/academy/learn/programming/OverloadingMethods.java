package academy.learn.programming;

import java.util.Arrays;

public class OverloadingMethods {


    public static void main(String[] args) {


        fly(1);
        fly(1.0);
        fly(9L); // long is promoted to double
    }


    public static void fly(int numMiles) { }
    public void fly(short numFeet) { }
    public boolean fly() { return false; }
    void fly(int numMiles, short numFeet) { }
    public void fly(short numFeet, int numMiles) throws Exception { }

    public void fly (int... n){};
//    public void fly (int[] n){}; DOESN'T COMPILE

    public static void fly(double l){};




//    public int fly(int numMiles) { } // DOES NOT COMPILE




}