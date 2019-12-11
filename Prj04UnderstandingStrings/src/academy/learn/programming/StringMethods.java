package academy.learn.programming;

public class StringMethods {
    public static void main(String[] args) {
        String str = "cat is fun";
        System.out.println("length = " + str.length());

        System.out.println("char = " + str.charAt(8));
        System.out.println("index = " + str.indexOf('a'));
        System.out.println("index = " + str.indexOf('a', 10));
        System.out.println("index = " + str.indexOf("is"));

        String a = str.substring(5, 8);
        System.out.println("a = " + a);
        System.out.println(str.substring(4 , 4)); // empty string

        System.out.println("AbCd".toLowerCase());


        String text = "java";
        String textTwo = "Java";
        String textThree = "ja";

        System.out.println(text.equals(textTwo));
        System.out.println(text.equalsIgnoreCase(textTwo));

        System.out.println(text.startsWith("ja"));
        System.out.println(text.startsWith(textThree));
        System.out.println(text.startsWith("J".toLowerCase())); //this can be done with with string literals

        System.out.println(text.contains(textThree));
        System.out.println(text.contains("av"));
        System.out.println("Java".contains("j"));

        String myString = "Java " + "is " + " a "+ " programming ";
        System.out.println(myString.replace('a', 'b'));
        System.out.println(myString.replace(' ', '-'));
        System.out.println(myString);

        System.out.println(myString.length());
        System.out.println(myString.trim().length());
    }
}
