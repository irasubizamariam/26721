package q2.flight;

import java.util.Scanner;

public class Q2Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FlightSystemDemo demo = new FlightSystemDemo();
        demo.run(scanner);
        scanner.close();
    }
}
