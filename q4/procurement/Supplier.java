package q4.procurement;

public class Supplier extends Department {
    private String supplierName;
    private String supplierTIN; // 9 digits
    private String contact;     // valid phone

    public Supplier(int id, String createdDate, String updatedDate,
                    String orgName, String address, String contactEmail,
                    String deptName, String deptCode, String managerName,
                    String supplierName, String supplierTIN, String contact) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail,
                deptName, deptCode, managerName);
        if (supplierName == null || supplierName.isEmpty()) {
            throw new IllegalArgumentException("Supplier name cannot be empty");
        }
        if (supplierTIN == null || !supplierTIN.matches("\\d{9}")) {
            throw new IllegalArgumentException("Supplier TIN must be 9 digits");
        }
        if (!isValidPhone(contact)) {
            throw new IllegalArgumentException("Contact phone must be 10 digits");
        }
        this.supplierName = supplierName;
        this.supplierTIN = supplierTIN;
        this.contact = contact;
    }

    private boolean isValidPhone(String phone) {
        return phone != null && phone.matches("\\d{10}");
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getSupplierTIN() {
        return supplierTIN;
    }

    public String getContact() {
        return contact;
    }
}
