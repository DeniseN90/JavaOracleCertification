package academy.learn.programming;

public class DecimalNumericPrimitives {

    public static void main(String[] args) {

        //float myNumber = 24.6;
        float myNumber = 9.89F;

        float myFloat = 7.765_09F;

        double myDouble = 76.98_7;

        double anotherDouble = 2.87F; // float automatically converted in double

        double d = 2.78D; // d is optional

        double scientific = 5.000251E03; // e means it is written in scientific notation
                                        // the number after the e indicates how many spots you need to move the comma

        double dd = 5000.251;

        // decimal number in hexadecimal notation
        // p indicates hexadecimal floating point number
        double hexPi = 0x1.91eb851eb851fp1;
        System.out.println("HexPi = " + hexPi);

        double amount = 0xE;

    }

}
