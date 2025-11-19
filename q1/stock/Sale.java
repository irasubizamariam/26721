package q1.stock;

public class Sale extends Purchase {
    private String saleDate;
    private int soldQuantity; // > 0
    private String customerName;

    public Sale(int id, String createdDate, String updatedDate,
                String warehouseName, String location, String contactNumber,
                String categoryName, String categoryCode,
                String supplierName, String supplierEmail, String supplierPhone,
                String productName, double unitPrice, int stockLimit,
                int quantityAvailable, int reorderLevel,
                String purchaseDate, int purchasedQuantity, String purchaseSupplierName,
                String saleDate, int soldQuantity, String customerName) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber,
                categoryName, categoryCode,
                supplierName, supplierEmail, supplierPhone,
                productName, unitPrice, stockLimit,
                quantityAvailable, reorderLevel,
                purchaseDate, purchasedQuantity, purchaseSupplierName);
        if (saleDate == null || saleDate.isEmpty()) {
            throw new IllegalArgumentException("Sale date cannot be null or empty");
        }
        if (soldQuantity <= 0) {
            throw new IllegalArgumentException("Sold quantity must be greater than 0");
        }
        if (customerName == null || customerName.isEmpty()) {
            throw new IllegalArgumentException("Customer name cannot be empty");
        }
        this.saleDate = saleDate;
        this.soldQuantity = soldQuantity;
        this.customerName = customerName;
    }

    public String getSaleDate() {
        return saleDate;
    }

    public int getSoldQuantity() {
        return soldQuantity;
    }

    public String getCustomerName() {
        return customerName;
    }
}
