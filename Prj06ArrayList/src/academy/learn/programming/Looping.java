package academy.learn.programming;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by catenate on 03/01/2020.
 */
public class Looping {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(createArray());


        //for loop
        long startTime = System.currentTimeMillis();
        for (int i = 0 ; i < list.size(); i++){
            String temp = list.get(i);
        }
        long totalTime = System.currentTimeMillis() - startTime;
        System.out.println("TOTAL TIME FOR LOOP = " + totalTime);


        // for each loop
        startTime = System.currentTimeMillis();

        for(String temp : list){}

        totalTime = System.currentTimeMillis() - startTime;
        System.out.println("TOTAL TIME FOR EACH LOOP = " + totalTime);


        // iterator
        startTime = System.currentTimeMillis();

        for(Iterator<String> listIterator = list.iterator(); listIterator.hasNext(); ){
            String temp = listIterator.next();
        }

        totalTime = System.currentTimeMillis() - startTime;
        System.out.println("TOTAL TIME ITERATOR= " + totalTime);
    }





    public static String[] createArray(){
        String[] array = new String[100_000_000];
        for(int i = 0; i < array.length; i++){
            array[i] = "Array " + i;
        }

        return array;
    }
}
