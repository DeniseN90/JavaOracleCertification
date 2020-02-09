package academy.learn.programming;

public class Eagle extends Bird{


    // OVERLOADED METHOD
    public int fly(int height){
        System.out.println("Eagle flies at " + height);
        return height;
    }

    @Override
    public void eat(int amount) {
        System.out.println("Eagle is eating");
        System.out.println(amount);
    }

    public int eat(){
        super.eat(8);
        System.out.println("Overloaded eat");
        return 1;
    }

}