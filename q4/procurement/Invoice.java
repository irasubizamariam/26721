package q4.procurement;

public class Invoice extends Inspection {
    private String invoiceNo;
    private double invoiceAmount; // > 0

    public Invoice(int id, String createdDate, String updatedDate,
                   String orgName, String address, String contactEmail,
                   String deptName, String deptCode, String managerName,
                   String supplierName, String supplierTIN, String contact,
                   String productName, double unitPrice, int quantity,
                   String poNumber, String orderDate, double totalAmount,
                   String deliveryDate, String deliveredBy,
                   String inspectorName, String status, String remarks,
                   String invoiceNo, double invoiceAmount) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail,
                deptName, deptCode, managerName,
                supplierName, supplierTIN, contact,
                productName, unitPrice, quantity,
                poNumber, orderDate, totalAmount,
                deliveryDate, deliveredBy,
                inspectorName, status, remarks);
        if (invoiceNo == null || invoiceNo.isEmpty()) {
            throw new IllegalArgumentException("Invoice number cannot be empty");
        }
        if (invoiceAmount <= 0) {
            throw new IllegalArgumentException("Invoice amount must be greater than 0");
        }
        this.invoiceNo = invoiceNo;
        this.invoiceAmount = invoiceAmount;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public double getInvoiceAmount() {
        return invoiceAmount;
    }
}
