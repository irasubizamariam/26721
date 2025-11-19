package q6.payroll;

import java.util.Scanner;

public class PayrollSystemDemo {

    public void run(Scanner scanner) {
        System.out.println("--- PAYROLL MANAGEMENT SYSTEM (Q6 - RSSB) ---");

        System.out.print("Enter Entity ID (>0): ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter created date: ");
        String createdDate = scanner.nextLine();
        System.out.print("Enter updated date: ");
        String updatedDate = scanner.nextLine();

        System.out.print("Enter organization name: ");
        String orgName = scanner.nextLine();
        System.out.print("Enter organization code (>=3 chars): ");
        String orgCode = scanner.nextLine();
        System.out.print("Enter RSSB number (8 digits): ");
        String rssbNumber = scanner.nextLine();
        System.out.print("Enter organization contact email: ");
        String contactEmail = scanner.nextLine();

        System.out.print("Enter department name: ");
        String deptName = scanner.nextLine();
        System.out.print("Enter department code (>=3 chars): ");
        String deptCode = scanner.nextLine();
        System.out.print("Enter department manager name: ");
        String managerName = scanner.nextLine();

        System.out.print("Enter employee ID (>=1000): ");
        int employeeID = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter employee full name: ");
        String fullName = scanner.nextLine();
        System.out.print("Enter employee position: ");
        String position = scanner.nextLine();
        System.out.print("Enter base salary (>0): ");
        double baseSalary = Double.parseDouble(scanner.nextLine());
        System.out.print("Is employee RSSB registered? (true/false): ");
        boolean rssbRegistered = Boolean.parseBoolean(scanner.nextLine());

        System.out.print("Enter payroll month (1-12): ");
        int month = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter payroll year (>=2000): ");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter period start date: ");
        String startDate = scanner.nextLine();
        System.out.print("Enter period end date: ");
        String endDate = scanner.nextLine();

        System.out.print("Enter basic pay (>=0): ");
        double basicPay = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter transport allowance (>=0): ");
        double transportAllowance = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter housing allowance (>=0): ");
        double housingAllowance = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter PAYE tax amount (>=0): ");
        double payeTax = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter loan deduction amount (>=0): ");
        double loanDeduction = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter overtime hours (>=0): ");
        double overtimeHours = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter overtime rate (>=0): ");
        double overtimeRate = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter bonus amount (>=0): ");
        double bonus = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter payslip number: ");
        String payslipNumber = scanner.nextLine();
        System.out.print("Enter payslip issue date: ");
        String issueDate = scanner.nextLine();

        try {
            Payslip payslip = new Payslip(
                    id, createdDate, updatedDate,
                    orgName, orgCode, rssbNumber, contactEmail,
                    deptName, deptCode, managerName,
                    employeeID, fullName, position,
                    baseSalary, rssbRegistered,
                    month, year, startDate, endDate,
                    basicPay, transportAllowance, housingAllowance,
                    payeTax, loanDeduction,
                    overtimeHours, overtimeRate, bonus,
                    payslipNumber, issueDate
            );

            String output = payslip.generatePayslip();
            System.out.println();
            System.out.println(output);
        } catch (IllegalArgumentException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
