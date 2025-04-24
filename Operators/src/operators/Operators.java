package operators;

import java.util.Scanner;

public class Operators {

    public static void main(String[] args) {
        // Variables
        Scanner keyboard = new Scanner(System.in);
        int num1, num2, sum;

        System.out.println("Enter the first number: ");
        num1 = keyboard.nextInt();
        System.out.println("Enter the second number: ");
        num2 = keyboard.nextInt();

        sum = num1 + num2;
        System.out.println("The result of the sum is: " + sum);
    }

}
