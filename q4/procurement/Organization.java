package q4.procurement;

public class Organization extends Entity {
    private String orgName;
    private String address;
    private String contactEmail;

    public Organization(int id, String createdDate, String updatedDate,
                        String orgName, String address, String contactEmail) {
        super(id, createdDate, updatedDate);
        if (orgName == null || orgName.isEmpty()) {
            throw new IllegalArgumentException("Organization name cannot be empty");
        }
        if (address == null || address.isEmpty()) {
            throw new IllegalArgumentException("Address cannot be empty");
        }
        if (!isValidEmail(contactEmail)) {
            throw new IllegalArgumentException("Invalid contact email");
        }
        this.orgName = orgName;
        this.address = address;
        this.contactEmail = contactEmail;
    }

    private boolean isValidEmail(String email) {
        return email != null && email.contains("@") && email.contains(".");
    }

    public String getOrgName() {
        return orgName;
    }

    public String getAddress() {
        return address;
    }

    public String getContactEmail() {
        return contactEmail;
    }
}
