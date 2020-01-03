package academy.learn.programming;

import java.util.*;

/**
 * Created by catenate on 02/01/2020.
 */
public class IteratingLists {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(6);
        numbers.add(8);
        numbers.add(5);

        System.out.println(numbers);
        for(int i = 0; i < numbers.size(); i++) {
            System.out.println("Number at index " + i + " is " + numbers.get(i));
           // numbers.remove(i);
        }
        System.out.println(numbers);


        for(Integer number: numbers){
            System.out.println(number);
           // numbers.remove(2);
        }


        for(Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext();){ // no increment specified
            Integer number = iterator.next();
            System.out.println(number);
            iterator.remove();
        }

        System.out.println("numbers is now =  " + numbers);


        numbers.addAll(Arrays.asList(3,7,1,2,9,87,32,12));  // copies a collection inside another

       for(ListIterator<Integer> listIterator = numbers.listIterator(3); listIterator.hasPrevious(); ){  // to iterate backwards
           System.out.println(listIterator.previous());
           listIterator.remove();
       }
        System.out.println(numbers);

    }

}
