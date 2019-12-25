package academy.learn.programming;

import java.util.Arrays;

public class UnderstandingArrays {
    public static void main(String[] args) {
        int[] arr = new int[3]; // array with 3 elements initialized to 0
        int[] anotherArr = new int[] {3,6,12}; // redundant
        int [] arrThree = {7,9,12};

        double[] b = new double[4*5/2]; //creates a double arr of 10 elements

        int x = 6;
        int y = 4;

        double[] c = new double[x*y];

        // we can also use anonymous arrays, without specifying the type on the right side
        int [] three = {5,9,15};

        int [] four = {}; //size is 0 and can't change


        int[]a;
        int a2 []; //both are legal

        int[] ids, types; //create 2 arrays, but it's bad practice
        int ids2[], types2; //create 1 array and 1 int

        String[] animals = {"parrot", "dog", "cat"};
        String[] myAnimals = animals;
        String[] otherAnimals = {"parrot", "dog", "cat"};

        System.out.println(animals.equals(myAnimals)); // it checks reference equality
        System.out.println(animals== myAnimals);  // same thing here
        System.out.println(Arrays.equals(animals, myAnimals)); // will check elements one by one

        System.out.println(animals.equals(otherAnimals)); // not the same reference
        System.out.println(animals == otherAnimals);
        System.out.println(Arrays.equals(animals, otherAnimals)); // will check elements one by one


        System.out.println(animals);
        System.out.println(animals.toString());
        System.out.println(Arrays.toString(animals));
    }
}
