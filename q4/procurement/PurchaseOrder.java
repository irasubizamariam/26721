package q4.procurement;

public class PurchaseOrder extends Product {
    private String poNumber;
    private String orderDate;
    private double totalAmount; // > 0

    public PurchaseOrder(int id, String createdDate, String updatedDate,
                         String orgName, String address, String contactEmail,
                         String deptName, String deptCode, String managerName,
                         String supplierName, String supplierTIN, String contact,
                         String productName, double unitPrice, int quantity,
                         String poNumber, String orderDate, double totalAmount) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail,
                deptName, deptCode, managerName,
                supplierName, supplierTIN, contact,
                productName, unitPrice, quantity);
        if (poNumber == null || poNumber.isEmpty()) {
            throw new IllegalArgumentException("PO number cannot be empty");
        }
        if (orderDate == null || orderDate.isEmpty()) {
            throw new IllegalArgumentException("Order date cannot be empty");
        }
        if (totalAmount <= 0) {
            throw new IllegalArgumentException("Total amount must be greater than 0");
        }
        this.poNumber = poNumber;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
    }

    public String getPoNumber() {
        return poNumber;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
