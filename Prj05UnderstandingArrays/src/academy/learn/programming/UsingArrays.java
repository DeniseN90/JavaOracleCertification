package academy.learn.programming;

import java.util.Arrays;

public class UsingArrays {
    public static void main(String[] args) {
        String[] pets = { "parrot","cat","dog" };
        for(String s : pets){
            System.out.println(s);
        }
        System.out.println(pets[2]);
        System.out.println(Arrays.toString(pets));

        int[] numbers = new int [5];
        System.out.println(Arrays.toString(numbers));

        String[] str = new String[5];
        System.out.println(Arrays.toString(str));

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i + 10;
        }

        System.out.println(Arrays.toString(numbers));

        Integer[] nums = new Integer[4];


       /* for(int i = 0; i < nums.length; i++){
            nums[i] = 1 % 3;*/

        Arrays.fill(nums, 1 % 3);
        System.out.println(nums);

        System.out.println(Arrays.toString(nums));

    }
}
