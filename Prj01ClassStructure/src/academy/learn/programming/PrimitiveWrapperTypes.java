package academy.learn.programming;

public class PrimitiveWrapperTypes {

    public static void main(String[] args) {
        int myInt = 10;
        Integer myInteger = new Integer(10); // unnecessary boxing
        Integer anotherInteger = 20;


        Integer myOtherInteger = Integer.valueOf(23); // unnecessary boxing
        Integer myIntegerFour = Integer.parseInt("45");
        Integer myIntegerFive = null;

        System.out.println("myInt = " + myInt);
        System.out.println("myInteger = " + myInteger);
        System.out.println("anotherInteger = " + anotherInteger);
        System.out.println("myOtherInteger = " + myOtherInteger);
        System.out.println("myIntegerFour = " + myIntegerFour);
        System.out.println("myIntegerFive = " + myIntegerFive);


        int myIntTwo = myOtherInteger; // unboxing


        System.out.println("myIntTwo = " + myIntTwo);

        Integer myIntegerSix = myInt; // boxing

        System.out.println("myIntegerSix = " + myIntegerSix);

       // int myIntThree = myIntegerFive; // null pointer exception
        printSum(1,8 ); // auto-boxing

        printSum(myInteger , anotherInteger);
    }

    static void printSum(Integer a, Integer b) {

        System.out.println("Sum = " + ( a + b ));
    }
}
