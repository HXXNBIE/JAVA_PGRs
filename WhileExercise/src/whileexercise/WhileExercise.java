package whileexercise;

import java.util.Scanner;

public class WhileExercise {

    public static void main(String[] args) {
        // bucle example with counter
        /*int counter = 0;
        
        while (counter < 10){
            System.out.println("I'm the way No " + counter);
            counter ++;
        }*/

        // bucle example with sentinel
        boolean flag = true;
        Scanner keyboard = new Scanner(System.in);
        String answer;

        while (flag == true) {
            System.out.println("The value of my flag is: " + flag);
            System.out.println("Are you subscribed to the group? " + flag);

            System.out.println("Do you want to unsubscribe from the group? ");
            answer = keyboard.next();

            if (answer.equalsIgnoreCase("yes")) {
                flag = false;
            }
        }
    }
}
