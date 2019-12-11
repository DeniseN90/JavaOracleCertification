package test;

public class Rabbit {

    public static void main(String[] args) {
        Rabbit one = new Rabbit();
        Rabbit two = new Rabbit();
        Rabbit three = one;
        one = null;
        Rabbit four = one;  // four is null now
        three = null; // rabbit stored in one is eligible for gc now
        two = null;
        two = new Rabbit();
        System.gc();
    }

}
