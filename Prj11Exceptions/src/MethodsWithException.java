/**
 * Created by catenate on 26/02/2020.
 */

class NoMoreMeatException extends Exception {}
class NoMorePlantsException extends RuntimeException{}

interface Omnivore {
    void eatMeat(int amount) throws Exception;
    void eatPlants(int amount);
}

class Bear implements Omnivore{

    @Override
    public void eatMeat(int amount) throws NoMoreMeatException {
        if (amount <= 0){
            throw new NoMoreMeatException();
        }
        System.out.println("Eating meat");
    }

    // this compiles cause it's unchecked
    @Override
    public void eatPlants(int amount) {
        if (amount <= 0){
            throw new NoMorePlantsException();
        }
        System.out.println("Eating plants");

    }
}
public class MethodsWithException {

    public static void main(String[] args) {
        Bear bear = new Bear();

        try {
            bear.eatMeat(2);
            bear.eatPlants(-2);

        } catch (NoMorePlantsException e){
            e.printStackTrace();
            System.out.println("can't eat plants");
        } catch (NoMoreMeatException e){
            e.printStackTrace();
            System.out.println("can't eat meat");
        } finally {
            System.out.println("finally");
        }

       //  bear.eatPlants(-2);
    }


}
