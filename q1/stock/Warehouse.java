package q1.stock;

public class Warehouse extends Entity {
    private String warehouseName;
    private String location;
    private String contactNumber; // 10-digit phone

    public Warehouse(int id, String createdDate, String updatedDate,
                     String warehouseName, String location, String contactNumber) {
        super(id, createdDate, updatedDate);
        if (warehouseName == null || warehouseName.isEmpty()) {
            throw new IllegalArgumentException("Warehouse name cannot be empty");
        }
        if (location == null || location.isEmpty()) {
            throw new IllegalArgumentException("Location cannot be empty");
        }
        if (!isValidPhone(contactNumber)) {
            throw new IllegalArgumentException("Contact number must be 10 digits");
        }
        this.warehouseName = warehouseName;
        this.location = location;
        this.contactNumber = contactNumber;
    }

    private boolean isValidPhone(String phone) {
        return phone != null && phone.matches("\\d{10}");
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public String getLocation() {
        return location;
    }

    public String getContactNumber() {
        return contactNumber;
    }
}
