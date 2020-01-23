package academy.learn.programming;

import academy.learn.programming.common.Foo;

/**
 * Created by catenate on 23/01/2020.
 */
public class AccessModifiers {

    public static void main(String[] args) {

        Foo foo = new Foo();
        foo.publicPrint();
//        foo.protectedPrint(); DOESN'T COMPILE
//        foo.defaultPrint(); DOESN'T COMPILE
//        foo.privatePrint(); DOESN'T COMPILE

    }

}
