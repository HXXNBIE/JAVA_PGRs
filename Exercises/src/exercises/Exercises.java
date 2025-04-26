package exercises;

import java.util.Scanner;

public class Exercises {

    public static void main(String[] args) {
        // Exercise 1
        System.out.println("---- Exercise 1 ----");
        for (int counter = 0; counter < 35; counter++) {
            System.out.println("No: " + (counter + 1));
        }

        // Exercise 2
        int number;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("---- Exercise 2 ----");
        System.out.println("Enter a number: ");
        number = keyboard.nextInt();

        for (int i = 0; i < number; i++) {
            System.out.println(i + 1);
        }

        // Exercise 3
        System.out.println("---- Exercise 3 ----");
        for (int counterTr = 199; counterTr < 250; counterTr = counterTr + 2) {
            System.out.println("Number " + (counterTr + 1));
        }

        // Exercise 4
        System.out.println("---- Exercise 4 ----");
        for (int restMonth = 11; restMonth > 1; restMonth = restMonth - 1) {
            System.out.println("Month " + (restMonth - 1));
        }

        // Execirse 5
        System.out.println("---- Exercise 5 ----");
        String content;

        System.out.println("Enter a text: ");
        content = keyboard.next();

        while (!content.equalsIgnoreCase("Exit")) {
            System.out.println("Text: " + content);

            System.out.println("Repeat text: ");
            content = keyboard.nextLine();
        }
        
        System.out.println("All exercises finished");
    }
}
