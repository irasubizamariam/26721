import q1.stock.StockSystemDemo;
import q2.flight.FlightSystemDemo;
import q3.tax.TaxSystemDemo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StockSystemDemo stockDemo = new StockSystemDemo();
        FlightSystemDemo flightDemo = new FlightSystemDemo();
        TaxSystemDemo taxDemo = new TaxSystemDemo();

        while (true) {
            System.out.println("============================");
            System.out.println("  OOP ASSIGNMENT MENU");
            System.out.println("============================");
            System.out.println("1. Question 1 - Stock Management System");
            System.out.println("2. Question 2 - Flight Booking System");
            System.out.println("3. Question 3 - Tax Administration System");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            String choiceStr = scanner.nextLine();
            int choice;
            try {
                choice = Integer.parseInt(choiceStr);
            } catch (NumberFormatException ex) {
                System.out.println("Invalid choice. Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    stockDemo.run(scanner);
                    break;
                case 2:
                    flightDemo.run(scanner);
                    break;
                case 3:
                    taxDemo.run(scanner);
                    break;
                case 0:
                    System.out.println("Exiting. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Unknown option. Please choose 0-3.");
            }

            System.out.println();
            System.out.println("Press Enter to return to the menu...");
            scanner.nextLine();
        }
    }
}
