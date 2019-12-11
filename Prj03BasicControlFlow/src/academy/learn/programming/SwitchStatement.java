package academy.learn.programming;

import java.util.Random;
import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        int dayOfWeek = 0;

        switch (dayOfWeek) {
            case 0:
                System.out.println("monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Weekend");
                break;
        }

        Random rand = new Random();
        int c = rand.nextInt(26) + 'a'; //character arithmetic, adding offset to produce lower case letter
        System.out.println("C = "+ c);
        System.out.println((char) c );

        switch (c) {
            case 'a':
            case 'e':   //this 5 case will give the same output
            case 'i':
            case 'o':
            case 'u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("Not a vowel");
        }


        Scanner input = new Scanner(System.in);

        int quantity;
        String color;
        String flowerType = "";
        Character extra = null;

        System.out.print("Please enter a color: ");
        color = input.next();
        System.out.print("Please enter the quantity: ");
        quantity = input.nextInt();

        final String red = "red";
        final String blue = "blue";
        final String yellow = "yellow";
        final String purple = "purple";
        final String white = "white";

        switch(color){
            case red:
                flowerType = "rose";
                break;
            case blue:
                flowerType = "iris";
                break;
            case yellow:
                flowerType = "daffodil";
                break;
            case purple:
                flowerType = "sage";
                break;
            case white:
                flowerType = "dogwood";
                break;
            default:
                System.out.println("Invalid color.");
        }
        switch(quantity){
            case 1:
                break;
            default:
                extra = 's';
                break;
        }
        System.out.println("You have " + quantity +" "+ flowerType+ extra + ".");
    }


}

