package academy.learn.programming;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by catenate on 24/01/2020.
 */
public class FinalVariables {

    private static final int SIZE = 10;

    public static final List<String> VALUES = new ArrayList<>();


    public static void main(String[] args) {

        int[] myArray = new int[SIZE];

//        SIZE = 11; DOESN'T COMPILE

        for(int i = 0; i < SIZE; i++ ){
            System.out.println(myArray[i]);

        }

        VALUES.add("add");

//        VALUES = new ArrayList<>(); DDOESN'T COMPILE

    }
}
