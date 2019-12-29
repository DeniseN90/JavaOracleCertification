package academy.learn.programming;

import java.util.Arrays;

public class NestedLoops {
    public static void main(String[] args) {
        for(int hours = 1; hours <= 6; hours ++){
            for(int minutes = 0; minutes < 60; minutes ++){
                System.out.println(hours+":"+minutes);
            }
        }


        String [][] twoDArray = new String[][] {
                {"One","Two"},
                {"Three", "Four","Five"},
                {"Six", "Seven", "Eigth", "Nine"}

        };

        System.out.println(Arrays.toString(twoDArray));

        for(String[] arr: twoDArray){
            System.out.println(Arrays.toString(arr));
            
        }

        OUTER: for(String[] arr: twoDArray){
            INNER: for(int i = 0; i < arr.length; i ++){
            if(arr[i].length() %2  == 0){
//                break INNER;
//                break OUTER;
//                continue INNER;
                continue OUTER;
            }
                System.out.println(arr[i]+ " ");
            }

            System.out.println();
        }

        int x = 10;
        while(x > 0){
            do {
                x -= 1;
            } while(x > 5);
        }

        System.out.println("X = " + x );


    }
}
