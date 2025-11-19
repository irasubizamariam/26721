package q6.payroll;

import java.util.Scanner;

public class Q6Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PayrollSystemDemo demo = new PayrollSystemDemo();
        demo.run(scanner);
        scanner.close();
    }
}
