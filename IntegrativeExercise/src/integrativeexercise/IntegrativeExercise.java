package integrativeexercise;

import java.util.Scanner;

public class IntegrativeExercise {

    public static void main(String[] args) {

        String patent = "";
        int parkingType, hours, cont1 = 0, cont2 = 0, cont3 = 3;
        double totalHours, dayTotal = 0;
        Scanner keyboard = new Scanner(System.in);

        while (!patent.equalsIgnoreCase("finish")) {
            System.out.println("Enter your car's license plate: ");
            patent = keyboard.nextLine();

            if (!patent.equalsIgnoreCase("finish")) {
                System.out.println("---- Enter type of service ----");
                System.out.println("[1] Per Hour");
                System.out.println("[2] Half a Day (5 hours)");
                System.out.println("[3] Per Day (10 hours)");
                System.out.println("Service: ");
                keyboard = new Scanner(System.in);
                parkingType = keyboard.nextInt();

                if (parkingType <= 0 || parkingType > 3) {
                    System.out.println("You entered an incorrect service type");
                } else {
                    if (parkingType == 1) {
                        System.out.println("---- SERVICE PER HOUR ----");
                        System.out.println("Enter the number of hours you want to park: ");
                        hours = keyboard.nextInt();
                        totalHours = hours * 3;
                        System.out.println("The total cost of the servicio is: " + totalHours + " USD.");
                        cont1++;
                        dayTotal = dayTotal + totalHours;
                    } else {
                        if (parkingType == 2) {
                            System.out.println("---- SERVICE HALF A DAY ----");
                            System.out.println("------ OFF 5% DISCOUNT ------");
                            totalHours = 15 - (15 * 0.05);
                            System.out.println("The total cost of the service is: " + totalHours + " USD.");
                            cont2++;
                            dayTotal = dayTotal + totalHours;
                        } else {
                            System.out.println("---- SERVICE A DAY ----");
                            System.out.println("--- OFF 10% DISCOUNT ---");
                            totalHours = 30 - (30 * 0.10);
                            System.out.println("The total cost of the servicio is: " + totalHours + " USD.");
                            cont3++;
                            dayTotal = dayTotal + totalHours;
                        }
                    }
                    System.out.println("*** Your service is paid. Thank you for your preference! ***");
                }
                keyboard = new Scanner(System.in);
            }
        }

        System.out.println("================================");
        System.out.println("TOTAL MONETARY AMOUNT OF THE DAY");
        System.out.println("SERVICES PER HOUR:" + cont1);
        System.out.println("SERVICES A HALF DAY: " + cont2);
        System.out.println("SERVICES A DAY: " + cont3);
        System.out.println("TOTAL AMOUNT IS $" + dayTotal + " USD");
    }

}
