package q3.tax;

import java.util.Scanner;

public class Q3Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaxSystemDemo demo = new TaxSystemDemo();
        demo.run(scanner);
        scanner.close();
    }
}
