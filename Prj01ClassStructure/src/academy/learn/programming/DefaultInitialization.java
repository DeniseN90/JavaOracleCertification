package academy.learn.programming;

public class DefaultInitialization {

    private static boolean myBoolean;
    private static byte myByte;
    private static short myShort;
    private static int myInt;
    private static long myLong;
    private static float myFloat;
    private static double myDouble;
    private static char myChar;

    public static void main(String[] args) {
        int localInt;
//        System.out.println("Local int = " + localInt); local variables are not i nitialized by default
        System.out.println("Boolean " + myBoolean);
        System.out.println("Byte = " + myByte);
        System.out.println("Short = " + myShort);
        System.out.println("Int = " + myInt);
        System.out.println("Long = " + myLong);
        System.out.println("Float = " + myFloat);
        System.out.println("Double = " + myDouble);
        System.out.println("Char = " +  myChar);
    }
}
