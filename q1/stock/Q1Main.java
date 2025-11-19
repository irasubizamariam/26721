package q1.stock;

import java.util.Scanner;

public class Q1Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StockSystemDemo demo = new StockSystemDemo();
        demo.run(scanner);
        scanner.close();
    }
}
