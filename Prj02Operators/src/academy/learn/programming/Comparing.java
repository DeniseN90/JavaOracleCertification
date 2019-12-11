package academy.learn.programming;

public class Comparing {
    public static void main(String[] args) {
        Integer myInt = 127;
        Integer myOtherInt = 127; // the hashcode of these 2 will be the same

        System.out.println(myInt == myOtherInt);
        System.out.println("128 = 128 " + ( 128 == 128));

        myInt = 128;
        myOtherInt = 128;
        System.out.println(myInt == myOtherInt); // zanzaaaa
        System.out.println(myInt.equals(myOtherInt));


        Integer a = new Integer(1);
        Integer b = new Integer(1);
        Integer c = 1; //this is already on the heap

        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(c==b);

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(c.equals(b));

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(c));

        Integer w = 178;
        Integer z = 178;

        System.out.println(w==z); // false




    }
}
