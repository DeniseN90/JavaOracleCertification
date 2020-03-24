package academy.learn.programming.questions;

/**
 * Created by catenate on 22/03/2020.
 */

interface Nocturnal {
    default boolean isBlind(){
        return true;
    }

    static void main(String[] args) {
        Nocturnal noc = new Owl();
        System.out.println(noc.isBlind()); //false
    }
}

public class Owl implements Nocturnal{
    public boolean isBlind(){
        return false;
    }

    public static void main(String[] args) {
        Nocturnal nocturnal = (Nocturnal)new Owl();
        System.out.println(nocturnal.isBlind()); //false
    }
}


class Cat implements Nocturnal{

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.isBlind()); //true
    }
}