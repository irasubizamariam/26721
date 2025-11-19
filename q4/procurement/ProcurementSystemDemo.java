package q4.procurement;

import java.util.Scanner;

public class ProcurementSystemDemo {

    public void run(Scanner scanner) {
        System.out.println("--- PROCUREMENT MANAGEMENT SYSTEM (Q4) ---");

        System.out.print("Enter Entity ID (>0): ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter created date: ");
        String createdDate = scanner.nextLine();
        System.out.print("Enter updated date: ");
        String updatedDate = scanner.nextLine();

        System.out.print("Enter organization name: ");
        String orgName = scanner.nextLine();
        System.out.print("Enter organization address: ");
        String address = scanner.nextLine();
        System.out.print("Enter organization contact email: ");
        String contactEmail = scanner.nextLine();

        System.out.print("Enter department name: ");
        String deptName = scanner.nextLine();
        System.out.print("Enter department code (alphanumeric, >=3): ");
        String deptCode = scanner.nextLine();
        System.out.print("Enter manager name: ");
        String managerName = scanner.nextLine();

        System.out.print("Enter supplier name: ");
        String supplierName = scanner.nextLine();
        System.out.print("Enter supplier TIN (9 digits): ");
        String supplierTIN = scanner.nextLine();
        System.out.print("Enter supplier contact phone (10 digits): ");
        String supplierContact = scanner.nextLine();

        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();
        System.out.print("Enter unit price (>0): ");
        double unitPrice = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter quantity (>=0): ");
        int quantity = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter PO number: ");
        String poNumber = scanner.nextLine();
        System.out.print("Enter order date: ");
        String orderDate = scanner.nextLine();
        System.out.print("Enter total PO amount (>0): ");
        double totalAmount = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter delivery date: ");
        String deliveryDate = scanner.nextLine();
        System.out.print("Enter delivered by: ");
        String deliveredBy = scanner.nextLine();

        System.out.print("Enter inspector name: ");
        String inspectorName = scanner.nextLine();
        System.out.print("Enter inspection status (Passed/Failed): ");
        String status = scanner.nextLine();
        System.out.print("Enter inspection remarks: ");
        String remarks = scanner.nextLine();

        System.out.print("Enter main invoice number: ");
        String invoiceNo = scanner.nextLine();
        System.out.print("Enter main invoice amount (>0): ");
        double invoiceAmount = Double.parseDouble(scanner.nextLine());

        System.out.print("How many invoices in total to include in report? ");
        int invoiceCount = Integer.parseInt(scanner.nextLine());
        double[] invoiceAmounts = new double[invoiceCount];
        for (int i = 0; i < invoiceCount; i++) {
            System.out.print("Enter amount for invoice " + (i + 1) + ": ");
            invoiceAmounts[i] = Double.parseDouble(scanner.nextLine());
        }

        System.out.print("Enter report date: ");
        String reportDate = scanner.nextLine();
        System.out.print("Enter report summary: ");
        String summary = scanner.nextLine();

        try {
            ProcurementReport report = new ProcurementReport(
                    id, createdDate, updatedDate,
                    orgName, address, contactEmail,
                    deptName, deptCode, managerName,
                    supplierName, supplierTIN, supplierContact,
                    productName, unitPrice, quantity,
                    poNumber, orderDate, totalAmount,
                    deliveryDate, deliveredBy,
                    inspectorName, status, remarks,
                    invoiceNo, invoiceAmount,
                    reportDate, summary,
                    invoiceAmounts
            );

            double totalInvoices = report.calculateTotal();

            System.out.println();
            System.out.println("=== PROCUREMENT REPORT ===");
            System.out.println("Report Date: " + report.getReportDate());
            System.out.println("Organization: " + orgName + " (" + address + ")");
            System.out.println("Department: " + deptName + " [" + deptCode + "]");
            System.out.println("Supplier: " + supplierName + " TIN: " + supplierTIN);
            System.out.println("Product: " + productName + " Qty: " + quantity + " Unit Price: " + unitPrice);
            System.out.println("PO: " + poNumber + " Date: " + orderDate + " Total: " + totalAmount);
            System.out.println("Delivery: " + deliveryDate + " By: " + deliveredBy);
            System.out.println("Inspection: " + status + " by " + inspectorName + " Remarks: " + remarks);
            System.out.println("Main Invoice: " + invoiceNo + " Amount: " + invoiceAmount);
            System.out.println("Total of all invoice amounts: " + totalInvoices);
            System.out.println("Summary: " + report.getSummary());
        } catch (IllegalArgumentException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
