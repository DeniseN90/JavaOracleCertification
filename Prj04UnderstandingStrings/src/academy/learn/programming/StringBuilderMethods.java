package academy.learn.programming;

public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("programming");
        String sub = sb.substring(sb.indexOf("g"), sb.indexOf("mi"));

        System.out.println(sub);

        int len = sb.length();
        char ch = sb.charAt(5);

        System.out.println("len = " + len);
        System.out.println("ch = " + ch);

        StringBuilder b = new StringBuilder().append(1).append("L");
        b.append("- ").append(true);

        System.out.println("B = " + b);

        StringBuilder builder = new StringBuilder("programming");
        builder.insert(7, "128");
        builder.insert(2, true);
        System.out.println("builder = " + builder);

        builder.delete(4,9);
        System.out.println(builder);

        builder.deleteCharAt(2);
        System.out.println(builder);

        // builder.delete(4, 1); // runtime exception
        builder.delete(1, 1); // this won't change anything

        builder.reverse();
        System.out.println(builder);

        StringBuilder s = new StringBuilder("123ABC");
        s.reverse().reverse();
        System.out.println("S = " + s);

        String sOne = s.reverse().toString();
        sOne = sOne.toLowerCase(); // you can't call this method on a SB
        System.out.println("sOne = " + sOne);

        System.out.println("S = " + s);
    }
}
