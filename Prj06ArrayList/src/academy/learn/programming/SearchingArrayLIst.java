package academy.learn.programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by catenate on 02/01/2020.
 */
public class SearchingArrayLIst {
    public static void main(String[] args) {
        List<String> numsList = new ArrayList<>();
        numsList.add("500");
        numsList.add("40");
        numsList.add("50");
        numsList.add("9");
        numsList.add("32");

        System.out.println(numsList);

        int index = Collections.binarySearch(numsList, "40");  // unexpected result since the list is not sorted
        System.out.println("INDEX = " + index);
        Collections.sort(numsList);

        int realIndex = Collections.binarySearch(numsList, "32");
        System.out.println("REAL INDEX = " + realIndex);

    }
}
