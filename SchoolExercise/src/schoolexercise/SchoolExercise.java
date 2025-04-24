package schoolexercise;

import java.util.Scanner;

public class SchoolExercise {

    public static void main(String[] args) {
        int age;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("*** = ENGLISH SCHOOL ***");
        System.out.println("Enter the student's age: ");
        age = keyboard.nextInt();

        if (age >= 4 && age <= 6) {
            System.out.println("The KINDER group schedule is Monday to Wednesday and 16 to 17hrs");
        } else {
            if (age == 7 || age == 8) {
                System.out.println("The 1ST YEAR group schedule is Tuesday and Thursday from 16:30 to 17:30hrs");
            } else {
                if (age == 9 || age == 10) {
                    System.out.println("The 2ND YEAR group schedule is Tuesday and Thursday from 17:30 to 19hrs");
                } else {
                    if (age >= 11 && age <= 13) {
                        System.out.println("The 3RD YEAR group schedule is Monday and Wednesday from 17 to 18:30hrs");
                    } else {
                        System.out.println("You have entered an age that does not correspond to any schedule");
                    }
                }
            }
        }
    }

}
