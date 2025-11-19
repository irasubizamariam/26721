package q5.attendance;

import java.util.Scanner;

public class Q5Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AttendanceSystemDemo demo = new AttendanceSystemDemo();
        demo.run(scanner);
        scanner.close();
    }
}
