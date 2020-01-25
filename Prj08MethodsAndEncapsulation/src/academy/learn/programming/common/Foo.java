package academy.learn.programming.common;

/**
 * Created by catenate on 23/01/2020.
 */
public class Foo {


    public void publicPrint(){
        System.out.println("Public");
    }

    protected void protectedPrint(){
        System.out.println("Protected");
    }

    void defaultPrint(){
        System.out.println("Default");
    }

    private void privatePrint(){
        System.out.println("Private");
    }

    public static void main(String[] args) {

        Foo foo = new Foo();
        foo.publicPrint();
        foo.protectedPrint();
        foo.defaultPrint();
        foo.privatePrint();

    }
}
