package academmy.learn.programming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by catenate on 27/01/2020.
 */


class Animal {
    private String type;
    private boolean canSwim;
    private boolean canJump;

    public Animal(String type, boolean canSwim, boolean canJump) {
        this.type = type;
        this.canSwim = canSwim;
        this.canJump = canJump;
    }

    public boolean canJump(){
        return canJump;
    }

    public boolean canSwim(){
        return canSwim;
    }

    public String getType(){
        return type;
    }
}


interface CheckAnimal {
    boolean check(Animal animal);
}

interface CheckTwoAnimals{
    boolean check(Animal a, Animal b);
}


class CheckCanJump implements CheckAnimal{
    @Override
    public boolean check(Animal animal){
        return animal.canJump();
    }
}

public class LambdaExpressions {

    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish", true, false));
        animals.add(new Animal("cat", false, true));
        animals.add(new Animal("dog", true, false));

        print(animals, new CheckCanJump());

        print(animals, animal -> animal.canSwim());
        print(animals, animal ->  ! animal.canSwim());

        // Syntax

        print(animals, (Animal animal) -> {return animal.canSwim();});
        print(animals, (Animal animal) -> animal.canSwim());
        print(animals, (Animal animal) -> {
//            Animal animal = new Animal("mouse", true, true); DOESN'T COMPILE
            return animal.canSwim();  // return is required just if there are more than 1 statement

        });



        Animal a = animals.get(0);
        Animal b = animals.get(1);

        print(a, b, (first, second) -> first.canJump() || second.canJump());



        // PREDICATE

        System.out.println("Predicate");
        checkAnimals(animals, animal -> animal.canSwim());


        // removeIf

        List<String> listaNomi = new ArrayList<>();
        listaNomi.add("John");
        listaNomi.add("Louis");
        listaNomi.add("Karl");
        listaNomi.add("Jonah");
        listaNomi.add("Maryt");

        System.out.println(listaNomi);
        listaNomi.removeIf(nome -> nome.startsWith("K"));
        System.out.println(listaNomi);



    }




    private static void print(List<Animal> list, CheckAnimal checker){
        for(Animal a : list){
            if(checker.check(a)){
                System.out.println(a.getType());
            }
        }

        System.out.println();
    }

    private static void print(Animal a, Animal b, CheckTwoAnimals checker) {
        System.out.println(checker.check(a,b));
    }




    // PREDICATE

    private static void checkAnimals(List<Animal> list, Predicate<Animal> filter){
        for (Animal a : list ){
            if (filter.test(a)){
                System.out.println(a.getType());
            }
        }
        System.out.println();
    }

}
