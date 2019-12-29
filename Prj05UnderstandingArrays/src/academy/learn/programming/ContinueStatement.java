package academy.learn.programming;

public class ContinueStatement {
    public static void main(String[] args) {
        String [] animals = {"dog", "cat", "lizard", "parrot", "snake"};
        for(String animal : animals){
            if(animal.equals("lizard")){
                continue;
            }
            System.out.println(animal);
        }

        for(String animal : animals){
            if(animal.equals("lizard") || animal.equals("dog")){
                continue;
            }
            System.out.println(animal);
        }

        System.out.println("While loop");

        int index = 0;
        while(index < animals.length){
            String animal = animals[index];
            index++;

            if(animal.equals("lizard")){
                continue; // if you put  the increment after the continue, it might be skipped
            }
            System.out.println(animal);
        }


    }
}
