package academy.learn.programming;

public class PolyParameters {


    public static void main(String[] args) {

        Husky husky = new Husky(9);
        printDetails(husky);

        Cat cat = new Cat(9);
        printDetails(cat);

        Animal rex = createAnimal("Rex", 9);
        printDetails(rex);

        Animal gatto = createAnimal("Kitty", 5);
        printDetails(gatto);



    }


    static void printDetails(Animal animal){
        animal.printDetails();

    }

    static Animal createAnimal(String name, int age) {
        if(name.equals("Rex")){
            Animal husky= new Husky(age);
            husky.setName(name);
            return husky;
        } else if(name.equals("Kitty")){
            Animal cat = new Cat(age);
            cat.setName(name);
            return cat;
        } else return new Rabbit(age);
    }
}