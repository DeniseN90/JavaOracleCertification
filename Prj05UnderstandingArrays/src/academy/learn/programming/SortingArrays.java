package academy.learn.programming;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {
        int[] numbers = { 6, 9, 1 };
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        String[] strings = {"50", "23", "7"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));
        
    }
}
