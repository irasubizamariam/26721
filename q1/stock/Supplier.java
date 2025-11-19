package q1.stock;

public class Supplier extends Category {
    private String supplierName;
    private String supplierEmail;
    private String supplierPhone; // 10-digit phone

    public Supplier(int id, String createdDate, String updatedDate,
                    String warehouseName, String location, String contactNumber,
                    String categoryName, String categoryCode,
                    String supplierName, String supplierEmail, String supplierPhone) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber,
                categoryName, categoryCode);
        if (supplierName == null || supplierName.isEmpty()) {
            throw new IllegalArgumentException("Supplier name cannot be empty");
        }
        if (!isValidEmail(supplierEmail)) {
            throw new IllegalArgumentException("Invalid supplier email");
        }
        if (!isValidPhone(supplierPhone)) {
            throw new IllegalArgumentException("Supplier phone must be 10 digits");
        }
        this.supplierName = supplierName;
        this.supplierEmail = supplierEmail;
        this.supplierPhone = supplierPhone;
    }

    protected boolean isValidEmail(String email) {
        return email != null && email.contains("@") && email.contains(".");
    }

    protected boolean isValidPhone(String phone) {
        return phone != null && phone.matches("\\d{10}");
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public String getSupplierPhone() {
        return supplierPhone;
    }
}
