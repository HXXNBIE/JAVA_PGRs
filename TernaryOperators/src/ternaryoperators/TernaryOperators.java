package ternaryoperators;

import java.util.Scanner;

public class TernaryOperators {

    public static void main(String[] args) {
        double grade;
        String finalCond;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the grade of the student's: ");
        grade = keyboard.nextDouble();

        finalCond = (grade >= 6) ? "Approved" : "Failed";

        System.out.println("The student's status is: " + finalCond);
    }

}
