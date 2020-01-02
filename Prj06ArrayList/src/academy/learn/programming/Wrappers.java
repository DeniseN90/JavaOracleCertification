package academy.learn.programming;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by catenate on 02/01/2020.
 */
public class Wrappers {
    public static void main(String[] args) {
        List<Double> doubleList = new ArrayList<>();

        doubleList.add(10.5); // autoboxing
        doubleList.add(new Double(6.8)); // redundant
        doubleList.remove(6.8);   // autoboxing
        double first = doubleList.get(0); //unboxing

        System.out.println(doubleList);
        System.out.println(first);



        List<Integer> numbers = new ArrayList<>();
        numbers.add(null);
//        int number = numbers.get(0); NullPointerException

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.remove(1);  //removes the item at index 1, but there is also remove(Object o)

        System.out.println(nums);





    }
}
