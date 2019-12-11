package academy.learn.programming;

public class IfElseStatement {
    public static void main(String[] args) {
        boolean b = true;

        if(b){ // !b
            System.out.println(b);
        } else {
            System.out.println("false");
        }

        int x = 1;
//        if(x) won't compile

//        if(x=1) won't compile

        if(x==1){

        }

        int testScore = 76;

        char grade;

        if(testScore >= 90)
            grade = 'A';
        else if(testScore >= 80)
            grade = 'B';
        else if(testScore >= 70)
            grade = 'C';
        else if (testScore >= 60)
            grade = 'D';
        else
            grade = 'F';

        System.out.println("grade = " + grade);

        int hour = 10;
        if(hour < 11) System.out.println("Morning"); // if the order is inverted the second line wouldn't be reached
        else if(hour < 17) System.out.println("Afternoon");
        else  System.out.println("Evening");

    }
}
