package q6.payroll;

public class Organization extends Entity {
    private String orgName;
    private String orgCode;      // >= 3 chars
    private String rssbNumber;   // 8 digits
    private String contactEmail; // valid email

    public Organization(int id, String createdDate, String updatedDate,
                        String orgName, String orgCode, String rssbNumber, String contactEmail) {
        super(id, createdDate, updatedDate);
        if (orgName == null || orgName.isEmpty()) {
            throw new IllegalArgumentException("Organization name cannot be empty");
        }
        if (orgCode == null || orgCode.length() < 3) {
            throw new IllegalArgumentException("Org code must be at least 3 characters");
        }
        if (rssbNumber == null || !rssbNumber.matches("\\d{8}")) {
            throw new IllegalArgumentException("RSSB number must be 8 digits");
        }
        if (!isValidEmail(contactEmail)) {
            throw new IllegalArgumentException("Invalid contact email");
        }
        this.orgName = orgName;
        this.orgCode = orgCode;
        this.rssbNumber = rssbNumber;
        this.contactEmail = contactEmail;
    }

    private boolean isValidEmail(String email) {
        return email != null && email.contains("@") && email.contains(".");
    }

    public String getOrgName() {
        return orgName;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public String getRssbNumber() {
        return rssbNumber;
    }

    public String getContactEmail() {
        return contactEmail;
    }
}
