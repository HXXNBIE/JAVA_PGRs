package haberdasheryexercise;

import java.util.Scanner;

public class HaberdasheryExercise {

    public static void main(String[] args) {
        // haberdashery data
        int numberPackages;
        double totalAmount, difference, discount, discountTotal;
        Scanner keyboard = new Scanner(System.in);

        // Consult nopkgs
        System.out.println("Enter the number of packages: ");
        numberPackages = keyboard.nextInt();

        // Evaluation
        if (numberPackages < 5) {
            System.out.println("Retail purchases are not allowed. Minimum package quantity: 5");
        } else {
            // Consult totalMount
            System.out.println("Enter total purchase amount: ");
            keyboard = new Scanner(System.in);
            totalAmount = keyboard.nextDouble();

            if (numberPackages >= 5 && numberPackages <= 15) {
                System.out.println("The shipping cost is 10USD");
                totalAmount = totalAmount + 10;
            } else {
                System.out.println("Your order is free of charge. Thank you for your purchase.");
            }
            if (totalAmount < 100) {
                difference = 100 - totalAmount;
                System.out.println("The amount is less than 100USD, so there is no discount. To do this, you need to purchase" + difference + "USD.");
            } else {
                if (totalAmount >= 100 && totalAmount <= 300) {
                    discount = totalAmount * 0.05;
                    discountTotal = totalAmount - discount;
                    System.out.println("For your purchase you have a 5% discount which is equivalent to: " + discount + ". The total discounted amount is: " + discountTotal);
                } else {
                    discount = totalAmount * 0.10;
                    discountTotal = totalAmount - discount;
                    System.out.println("For your purchase you have a 10% discount which is equivalent to:" + discount + ". The total discounted amount is: " + discountTotal);
                }
            }
        }
    }

}
