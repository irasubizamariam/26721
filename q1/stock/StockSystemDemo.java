package q1.stock;

import java.util.Scanner;

public class StockSystemDemo {

    public void run(Scanner scanner) {
        System.out.println("--- STOCK MANAGEMENT SYSTEM (Q1) ---");

        System.out.print("Enter Entity ID (>0): ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter created date: ");
        String createdDate = scanner.nextLine();
        System.out.print("Enter updated date: ");
        String updatedDate = scanner.nextLine();

        System.out.print("Enter warehouse name: ");
        String warehouseName = scanner.nextLine();
        System.out.print("Enter warehouse location: ");
        String location = scanner.nextLine();
        System.out.print("Enter warehouse contact number (10 digits): ");
        String contactNumber = scanner.nextLine();

        System.out.print("Enter category name: ");
        String categoryName = scanner.nextLine();
        System.out.print("Enter category code (alphanumeric, >=3 chars): ");
        String categoryCode = scanner.nextLine();

        System.out.print("Enter supplier name: ");
        String supplierName = scanner.nextLine();
        System.out.print("Enter supplier email: ");
        String supplierEmail = scanner.nextLine();
        System.out.print("Enter supplier phone (10 digits): ");
        String supplierPhone = scanner.nextLine();

        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();
        System.out.print("Enter unit price (>0): ");
        double unitPrice = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter stock limit (>=0): ");
        int stockLimit = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter quantity available (>=0): ");
        int quantityAvailable = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter reorder level (>=0): ");
        int reorderLevel = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter purchase date: ");
        String purchaseDate = scanner.nextLine();
        System.out.print("Enter purchased quantity (>0): ");
        int purchasedQuantity = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter purchase supplier name: ");
        String purchaseSupplierName = scanner.nextLine();

        System.out.print("Enter sale date: ");
        String saleDate = scanner.nextLine();
        System.out.print("Enter sold quantity (>0): ");
        int soldQuantity = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter total items (>=0): ");
        int totalItems = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter stock value (>=0): ");
        double stockValue = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter report date: ");
        String reportDate = scanner.nextLine();
        System.out.print("Enter remarks: ");
        String remarks = scanner.nextLine();

        try {
            StockReport report = new StockReport(
                    id, createdDate, updatedDate,
                    warehouseName, location, contactNumber,
                    categoryName, categoryCode,
                    supplierName, supplierEmail, supplierPhone,
                    productName, unitPrice, stockLimit,
                    quantityAvailable, reorderLevel,
                    purchaseDate, purchasedQuantity, purchaseSupplierName,
                    saleDate, soldQuantity, customerName,
                    totalItems, stockValue,
                    reportDate, remarks
            );

            System.out.println();
            System.out.println(report.generateReport());
        } catch (IllegalArgumentException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
