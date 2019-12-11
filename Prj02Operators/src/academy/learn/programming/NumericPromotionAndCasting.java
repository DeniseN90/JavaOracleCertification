package academy.learn.programming;

public class NumericPromotionAndCasting {

    public static void main(String[] args) {
        //    promotion is converting to a bigger data type

        byte a = 5;
        short b = 1;
        int c = 4;
        double d = 6;
        float e = 7.3F;

        double total = a + b + c + d + e; // everything promoted to double

        System.out.println("Total = " + total);

        // casting is transforming bigger data types variables into smaller data types
        // you loose precision
        double f = 5.5;
        int g = (int) f ;
        byte h = 15;

//        byte byteResult = (byte) f + g + h; doesn't compile without parenthesis
        byte byteResult = (byte) (f + g + h);


        short i = 8;
        short j = 9 ;
        short k = (short) (i + j); // need to cast cause short are automatically converted to int



    }




}
