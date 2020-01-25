package academy.learn.programming;

public class PassingDataBetweenMethods {

    public static void main(String[] args) {

        // passing an int
        int number = 4;
        System.out.println(number);
        newNumber(number);
        System.out.println(number);


        // passing a string
        String name = "Jimmy";
        System.out.println(name);
        newName(name);
        System.out.println(name);


        // passing a StringBuilder

        StringBuilder sb = new StringBuilder();
        System.out.println(sb);
        build(sb);
        System.out.println(sb);


        StringBuilder s = sb;
        s.append(", how are you?");
        System.out.println(sb);
    }

    public static void newNumber(int n){
        System.out.println(n);
        n = 10;
        System.out.println(n);
    }

    public static void newName(String n){
        System.out.println(n);
        n = "Tom";
        System.out.println(n);

    }

    public static void build (StringBuilder sb){
//        sb = new StringBuilder(); adding this line the Stringbuilder in the main won't be effected
        sb.append("Timmy");
    }
}