package q1.stock;

public class Inventory extends Sale {
    private int totalItems;     // >= 0
    private double stockValue;  // >= 0

    public Inventory(int id, String createdDate, String updatedDate,
                     String warehouseName, String location, String contactNumber,
                     String categoryName, String categoryCode,
                     String supplierName, String supplierEmail, String supplierPhone,
                     String productName, double unitPrice, int stockLimit,
                     int quantityAvailable, int reorderLevel,
                     String purchaseDate, int purchasedQuantity, String purchaseSupplierName,
                     String saleDate, int soldQuantity, String customerName,
                     int totalItems, double stockValue) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber,
                categoryName, categoryCode,
                supplierName, supplierEmail, supplierPhone,
                productName, unitPrice, stockLimit,
                quantityAvailable, reorderLevel,
                purchaseDate, purchasedQuantity, purchaseSupplierName,
                saleDate, soldQuantity, customerName);
        if (totalItems < 0 || stockValue < 0) {
            throw new IllegalArgumentException("Totals cannot be negative");
        }
        this.totalItems = totalItems;
        this.stockValue = stockValue;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public double getStockValue() {
        return stockValue;
    }
}
