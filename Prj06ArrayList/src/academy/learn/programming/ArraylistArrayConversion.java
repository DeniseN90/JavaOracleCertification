package academy.learn.programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by catenate on 02/01/2020.
 */
public class ArraylistArrayConversion {
    public static void main(String[] args) {

        // ARRAYLIST => ARRAY
        List<String> names = new ArrayList<>();
        names.add("Tony");
        names.add("Jimmy");
        names.add("Anthony");

        Object [] namesArray = names.toArray();  // the arraylist of strings is converted into an array of objects
        System.out.println("name array length= " + namesArray.length);


        String [] stringNames = names.toArray(new String[0]);  // (new String[names.size()]);

        String [] anotherArray = names.toArray(new String[names.size()]);



        // ARRAY => ARRAYLIST  they are linked

        String[] petsArray = {"dog", "cat", "seagull", "piggy"};

        // it is possible to pass the strings directly in as parameters
        List<String> petsList = Arrays.asList(petsArray); // it returns a fixed size list

        System.out.println("pet list size = " + petsList.size());

        petsList.set(0, "bird");
        System.out.println(petsList);
        System.out.println(Arrays.toString(petsArray));

        petsArray[0] = "husky";
        System.out.println(petsList);
        System.out.println(Arrays.toString(petsArray));

      /*  petsList.add("bo");         unsopported operation
        petsList.remove("seagull");*/





    }
}
