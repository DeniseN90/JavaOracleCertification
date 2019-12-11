package academy.learn.programming;

public class CreatingStrings {
    public static void main(String[] args) {
        String text = "Hello!";
        String anotherText = new String("Hello!");
        System.out.println(System.identityHashCode(text));
        System.out.println(System.identityHashCode(anotherText));
        //concatenation
        System.out.println(2+3);
        System.out.println("a" + "b");
        System.out.println( 1 + 2  + "b");

        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four );

        int number = 10;
        int anotherNumber = 20;
        System.out.println("result = " + number + anotherNumber);

        String str = "";
        for(int i = 0; i < 10 ; i ++){
            str += i;
        }
        System.out.println("Str  = " + str);

        String hello = "hello ";
        String world = "world";
        String helloWorld = hello+ world;
        System.out.println(hello);


    }
}
