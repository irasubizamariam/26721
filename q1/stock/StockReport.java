package q1.stock;

public final class StockReport extends Inventory {
    private String reportDate;
    private String remarks;

    public StockReport(int id, String createdDate, String updatedDate,
                       String warehouseName, String location, String contactNumber,
                       String categoryName, String categoryCode,
                       String supplierName, String supplierEmail, String supplierPhone,
                       String productName, double unitPrice, int stockLimit,
                       int quantityAvailable, int reorderLevel,
                       String purchaseDate, int purchasedQuantity, String purchaseSupplierName,
                       String saleDate, int soldQuantity, String customerName,
                       int totalItems, double stockValue,
                       String reportDate, String remarks) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber,
                categoryName, categoryCode,
                supplierName, supplierEmail, supplierPhone,
                productName, unitPrice, stockLimit,
                quantityAvailable, reorderLevel,
                purchaseDate, purchasedQuantity, purchaseSupplierName,
                saleDate, soldQuantity, customerName,
                totalItems, stockValue);
        if (reportDate == null || reportDate.isEmpty()) {
            throw new IllegalArgumentException("Report date cannot be empty");
        }
        this.reportDate = reportDate;
        this.remarks = remarks == null ? "" : remarks;
    }

    public String getReportDate() {
        return reportDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public String generateReport() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== STOCK REPORT ===\n");
        sb.append("Report Date: ").append(reportDate).append("\n");
        sb.append("Warehouse: ").append(getWarehouseName()).append(" (" + getLocation() + ")\n");
        sb.append("Category: ").append(getCategoryName()).append(" [" + getCategoryCode() + "]\n");
        sb.append("Supplier: ").append(getSupplierName()).append(" - ").append(getSupplierEmail()).append("\n");
        sb.append("Product: ").append(getProductName()).append(" @ ").append(getUnitPrice()).append("\n");
        sb.append("Quantity Available: ").append(getQuantityAvailable()).append(" (Reorder Level: ").append(getReorderLevel()).append(")\n");
        sb.append("Last Purchase: ").append(getPurchaseDate()).append(" Qty: ").append(getPurchasedQuantity()).append("\n");
        sb.append("Last Sale: ").append(getSaleDate()).append(" Qty: ").append(getSoldQuantity()).append(" to ").append(getCustomerName()).append("\n");
        sb.append("Total Items: ").append(getTotalItems()).append("\n");
        sb.append("Stock Value: ").append(getStockValue()).append("\n");
        sb.append("Remarks: ").append(remarks).append("\n");
        return sb.toString();
    }
}
