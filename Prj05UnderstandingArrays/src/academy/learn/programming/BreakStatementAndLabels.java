package academy.learn.programming;

public class BreakStatementAndLabels {
    public static void main(String[] args) {

        MY_LABEL: {
            int[] myArr = {1,2,3}; // useless
        }

        String [] animals = {"dog", "cat", "lizard", "parrot", "snake"};
        for(String animal : animals){
            System.out.println(animal);
        }

        System.out.println("MY_LOOP:");
        MY_LOOP: for(String animal : animals){
                if(animal.equals("cat")){
                    break MY_LOOP;
                }
            System.out.println(animal);
        }

        System.out.println("animal");
        animal : for(String animal : animals){
            if(animal.equals("cat")){
                break animal;
            }
            System.out.println(animal);
        }
        System.out.println("While loop");
        int index = 0;
        while(index < animals.length){
            String animal = animals[index];
            if(animal.equals("lizard")){
                break;
            }
            System.out.println(animal);
            index++;
        }



    }
}
