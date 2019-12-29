package academy.learn.programming;

import java.util.Arrays;

public class SearchingArrays {
    public static void main(String[] args) {
        int[] numbers = { 6, 9, 1 , 2, 8, 4, 3};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.binarySearch(numbers,2));
        System.out.println(Arrays.binarySearch(numbers,5));
        System.out.println(Arrays.binarySearch(numbers,7));

        int[] unsorted = {3, 8, 4, 1 };

        System.out.println(Arrays.binarySearch(unsorted, 5));
    }

}
