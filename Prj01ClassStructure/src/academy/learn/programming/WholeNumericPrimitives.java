package academy.learn.programming;

public class WholeNumericPrimitives {
    public static void main(String[] args) {
        //long max = 367464645646;
        long max = 8_7878_876_786_876L;
        //long n = 2300987987979879879;
        long n = 23009879;
        int i = (int) n;
        //int j = n;

        /*octal (0 - 7) not liked by compilers, cause can be
         *confused wih decimal literals
        */
        int oct = 07;
        int secondOct = 010;

        int someOct = oct + secondOct;

        System.out.println("Octal number = " + someOct);
        System.out.println(Integer.toOctalString(someOct));


        /* hexadecimal (0 - 9 and A - F)
        *
        * */

        int firstHex = 0xF;
        System.out.println(firstHex);
        int secondHex = 0x1E;
        int hexSum = firstHex + secondHex;
        System.out.println("Hex sum = " + hexSum);
        System.out.println("*****");
        System.out.println(Integer.toHexString(hexSum));

        // binary
        int firstBin = 0b1001;
        int secondBin = 0b0111;
        int sumBin = firstBin + secondBin;

        System.out.println("Binary sum = "+ sumBin);
        System.out.println(Integer.toBinaryString(sumBin));


    }

}
