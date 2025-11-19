package q5.attendance;

public class Institution extends Entity {
    private String institutionName;
    private String code; // >= 3 chars
    private String address;

    public Institution(int id, String createdDate, String updatedDate,
                       String institutionName, String code, String address) {
        super(id, createdDate, updatedDate);
        if (institutionName == null || institutionName.isEmpty()) {
            throw new IllegalArgumentException("Institution name cannot be empty");
        }
        if (code == null || code.length() < 3) {
            throw new IllegalArgumentException("Code must be at least 3 characters");
        }
        if (address == null || address.isEmpty()) {
            throw new IllegalArgumentException("Address cannot be empty");
        }
        this.institutionName = institutionName;
        this.code = code;
        this.address = address;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public String getCode() {
        return code;
    }

    public String getAddress() {
        return address;
    }
}
