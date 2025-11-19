package q4.procurement;

public class Product extends Supplier {
    private String productName;
    private double unitPrice; // > 0
    private int quantity;     // >= 0

    public Product(int id, String createdDate, String updatedDate,
                   String orgName, String address, String contactEmail,
                   String deptName, String deptCode, String managerName,
                   String supplierName, String supplierTIN, String contact,
                   String productName, double unitPrice, int quantity) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail,
                deptName, deptCode, managerName,
                supplierName, supplierTIN, contact);
        if (productName == null || productName.isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be empty");
        }
        if (unitPrice <= 0) {
            throw new IllegalArgumentException("Unit price must be greater than 0");
        }
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }
}
