package academy.learn.programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by catenate on 02/01/2020.
 */
public class SortingArrayList {
    public static void main(String[] args) {
        List<String> numsList = new ArrayList<>();
        numsList.add("20");
        numsList.add("500");
        numsList.add("12");
        numsList.add("98");
        numsList.add("32");
        numsList.add("34");

        System.out.println(numsList);

        Collections.sort(numsList);

        System.out.println("Sorted = " + numsList);

        List<Integer> numbers = Arrays.asList(10,3,6,7,8,1);
        System.out.println(numbers);

        Collections.sort(numbers);
        System.out.println(numbers);

    }
}
