package q4.procurement;

public class Delivery extends PurchaseOrder {
    private String deliveryDate;
    private String deliveredBy;

    public Delivery(int id, String createdDate, String updatedDate,
                    String orgName, String address, String contactEmail,
                    String deptName, String deptCode, String managerName,
                    String supplierName, String supplierTIN, String contact,
                    String productName, double unitPrice, int quantity,
                    String poNumber, String orderDate, double totalAmount,
                    String deliveryDate, String deliveredBy) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail,
                deptName, deptCode, managerName,
                supplierName, supplierTIN, contact,
                productName, unitPrice, quantity,
                poNumber, orderDate, totalAmount);
        if (deliveryDate == null || deliveryDate.isEmpty()) {
            throw new IllegalArgumentException("Delivery date cannot be empty");
        }
        if (deliveredBy == null || deliveredBy.isEmpty()) {
            throw new IllegalArgumentException("Delivered by cannot be empty");
        }
        this.deliveryDate = deliveryDate;
        this.deliveredBy = deliveredBy;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public String getDeliveredBy() {
        return deliveredBy;
    }
}
