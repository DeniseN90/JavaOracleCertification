package academy.learn.programming.common;

/**
 * Created by catenate on 23/01/2020.
 */
public class AnotherFoo {

    public static void main(String[] args) {

        Foo foo = new Foo();
        foo.publicPrint();
        foo.protectedPrint();
        foo.defaultPrint();
//        foo.privatePrint(); DOESN'T COMPILE

    }
}
