package academy.learn.programming;

public class StringPoolStringEquality {
    public static void main(String[] args) {
        String name = "John";
        String anotherName = "John";
        String john = "Jo"+"hn"; // it checks the pool
        String wtf = new String("John");

        System.out.println(name == anotherName);
        System.out.println(name == john);
        System.out.println(name == wtf);

        System.out.println(name.equals(anotherName));
        System.out.println(name.equals(john));
        System.out.println(name.equals(wtf));

        System.out.println(System.identityHashCode(name));
        System.out.println(System.identityHashCode(anotherName));
        System.out.println(System.identityHashCode(wtf ));

        String str1 = "abc";
        String str2 = "ab";
        String str3 = str2 + "c";
        System.out.println(str1 == str3);




    }
}
