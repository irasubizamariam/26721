package q1.stock;

public class Purchase extends StockItem {
    private String purchaseDate;
    private int purchasedQuantity; // > 0
    private String purchaseSupplierName;

    public Purchase(int id, String createdDate, String updatedDate,
                    String warehouseName, String location, String contactNumber,
                    String categoryName, String categoryCode,
                    String supplierName, String supplierEmail, String supplierPhone,
                    String productName, double unitPrice, int stockLimit,
                    int quantityAvailable, int reorderLevel,
                    String purchaseDate, int purchasedQuantity, String purchaseSupplierName) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber,
                categoryName, categoryCode,
                supplierName, supplierEmail, supplierPhone,
                productName, unitPrice, stockLimit,
                quantityAvailable, reorderLevel);
        if (purchaseDate == null || purchaseDate.isEmpty()) {
            throw new IllegalArgumentException("Purchase date cannot be null or empty");
        }
        if (purchasedQuantity <= 0) {
            throw new IllegalArgumentException("Purchased quantity must be greater than 0");
        }
        if (purchaseSupplierName == null || purchaseSupplierName.isEmpty()) {
            throw new IllegalArgumentException("Purchase supplier name cannot be empty");
        }
        this.purchaseDate = purchaseDate;
        this.purchasedQuantity = purchasedQuantity;
        this.purchaseSupplierName = purchaseSupplierName;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public int getPurchasedQuantity() {
        return purchasedQuantity;
    }

    public String getPurchaseSupplierName() {
        return purchaseSupplierName;
    }
}
