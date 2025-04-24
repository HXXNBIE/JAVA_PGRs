package javaexercise;

import java.util.Scanner;

public class JavaExercise {

    public static void main(String[] args) {
        int age;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your age: ");
        age = keyboard.nextInt();

        if (age > 18) {
            System.out.println("You're legal age. Congratulations!");
            if (age > 40) {
                System.out.println("You are from generation X");
            } else {
                System.out.println("You are from generation Millenial");
            }
        } else {
            if (age == 18) {
                System.out.println("You are exactly 18 years old");
            } else {
                System.out.println("You are not of legal age. We're sorry");
            }
        }
        System.out.println("You reached the end");
    }

}
