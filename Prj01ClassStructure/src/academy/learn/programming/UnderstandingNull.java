package academy.learn.programming;

public class UnderstandingNull {
    static Object myObj = new Object();
    static Object myOtherObj; // it will be null
    static Object anotherObject = null; // redundant
    static int myInt = 0; // redundant

    static String myString;

    public static void main(String[] args) {

        Object myLocalObject = new Object();
        Object anotherLocalObject;

        String name = "java";
        String surname = null; // in this case you need to initialize it if you want to use it

        System.out.println("myObj = " + myObj);
        System.out.println("myOtherObj = " + myOtherObj);
        System.out.println("myInt = " + myInt);
        System.out.println("anotherObject = " + anotherObject);
        System.out.println("myLocalObject = " + myLocalObject);

//        System.out.println("anotherLocalObject = " + anotherLocalObject);

        System.out.println("name = " + name);
        System.out.println("surname = " + surname); // warning cause it will always be null
        System.out.println("myString = " + myString);

        myString.toLowerCase(); // null pointer exception
        // System.out.println("myString = " + myString);

    }
}
