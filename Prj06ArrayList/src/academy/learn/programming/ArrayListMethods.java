package academy.learn.programming;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by catenate on 30/12/2019.
 */
public class ArrayListMethods {
    public static void main(String[] args) {
       // List list = new ArrayList<>();   same as List<Object>
        List<Object> list = new ArrayList<>();
        list.add("dog");
        list.add(5);
        System.out.println(list);

        // add
        List<String> pets = new ArrayList<>(); // the compiler knows that just strings go here
        pets.add("dog");
        pets.add(0, "cat");
        System.out.println(pets);
//        pets.add(6); this list can hold just strings
        pets.add(1, "parrot");
        System.out.println(pets);
        pets.add(0, "fish");
        System.out.println(pets);

        // remove
        pets.remove("parrot");
        System.out.println(pets  );
        pets.remove(2);
        System.out.println(pets);


        // set
        pets.set(0, "sea lion");  // pets[0] = "sea lion" => in case of arrays
        System.out.println(pets);

//      pets.set(6, "dodo");  indexOutOfBoundException


        // isEmpty()
        System.out.println(pets.isEmpty());

        // size
        System.out.println(pets.size());

        // contains
        System.out.println(pets.contains("cat"));


        // equals  -> same elements in same order

        List<String> newPets = new ArrayList<>();
        newPets = pets;  // they point at the same object
        System.out.println("newpets == pets ->" + (newPets == pets));
        System.out.println(newPets.equals(pets));


        pets.add(0, "fish");

        System.out.println(pets.equals(newPets));


        //clear
        pets.clear();
        System.out.println(pets.size());




    }
}
