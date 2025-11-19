package q3.tax;

import java.util.Scanner;

public class TaxSystemDemo {

    public void run(Scanner scanner) {
        System.out.println("--- TAX ADMINISTRATION SYSTEM (Q3) ---");

        try {
            System.out.print("Enter Entity ID (>0): ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter created date: ");
            String createdDate = scanner.nextLine();
            System.out.print("Enter updated date: ");
            String updatedDate = scanner.nextLine();

            System.out.print("Enter tax authority name: ");
            String authorityName = scanner.nextLine();
            System.out.print("Enter region: ");
            String region = scanner.nextLine();
            System.out.print("Enter authority email: ");
            String authorityEmail = scanner.nextLine();

            System.out.print("Enter tax category name: ");
            String categoryName = scanner.nextLine();
            System.out.print("Enter tax rate (e.g., 0.3 for 30%): ");
            double rate = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter tax category code (>=3 chars): ");
            String code = scanner.nextLine();

            System.out.print("Enter taxpayer TIN (9 digits): ");
            String tin = scanner.nextLine();
            System.out.print("Enter taxpayer name: ");
            String taxpayerName = scanner.nextLine();
            System.out.print("Enter taxpayer address: ");
            String address = scanner.nextLine();

            System.out.print("Enter employer name: ");
            String employerName = scanner.nextLine();
            System.out.print("Enter employer TIN (9 digits): ");
            String employerTIN = scanner.nextLine();
            System.out.print("Enter employer contact phone (10 digits): ");
            String employerContact = scanner.nextLine();

            System.out.print("Enter employee name: ");
            String employeeName = scanner.nextLine();
            System.out.print("Enter employee salary (>0): ");
            double salary = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter employee TIN (9 digits): ");
            String employeeTIN = scanner.nextLine();

            System.out.print("Enter declaration month (e.g., 2025-10): ");
            String declarationMonth = scanner.nextLine();
            System.out.print("Enter total income (>=0): ");
            double totalIncome = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter assessment date: ");
            String assessmentDate = scanner.nextLine();
            System.out.print("Enter assessed tax (>=0): ");
            double assessedTax = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter payment date: ");
            String paymentDate = scanner.nextLine();
            System.out.print("Enter payment amount (>0): ");
            double paymentAmount = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter tax receipt number: ");
            String receiptNo = scanner.nextLine();
            System.out.print("Enter tax credits (>=0): ");
            double credits = Double.parseDouble(scanner.nextLine());

            TaxRecord record = new TaxRecord(
                    id, createdDate, updatedDate,
                    authorityName, region, authorityEmail,
                    categoryName, rate, code,
                    tin, taxpayerName, address,
                    employerName, employerTIN, employerContact,
                    employeeName, salary, employeeTIN,
                    declarationMonth, totalIncome,
                    assessmentDate, assessedTax,
                    paymentDate, paymentAmount,
                    receiptNo, credits
            );

            double payableTax = record.computeTax();

            System.out.println();
            System.out.println("=== TAX RECORD ===");
            System.out.println("Receipt No: " + record.getReceiptNo());
            System.out.println("Taxpayer: " + taxpayerName + " (TIN: " + tin + ")");
            System.out.println("Employee: " + employeeName + " Salary: " + salary);
            System.out.println("Category: " + categoryName + " Rate: " + rate);
            System.out.println("Credits: " + record.getCredits());
            System.out.println("Payable Tax (salary x rate - credits): " + payableTax);
        } catch (TaxDataException ex) {
            System.out.println("Tax data error: " + ex.getMessage());
        } catch (NumberFormatException ex) {
            System.out.println("Invalid numeric value: " + ex.getMessage());
        }
    }
}
