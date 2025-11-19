package q4.procurement;

import java.util.Scanner;

public class Q4Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProcurementSystemDemo demo = new ProcurementSystemDemo();
        demo.run(scanner);
        scanner.close();
    }
}
