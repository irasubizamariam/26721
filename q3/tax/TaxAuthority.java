package q3.tax;

public class TaxAuthority extends Entity {
    private String authorityName;
    private String region;
    private String email;

    public TaxAuthority(int id, String createdDate, String updatedDate,
                        String authorityName, String region, String email) throws TaxDataException {
        super(id, createdDate, updatedDate);
        if (authorityName == null || authorityName.isEmpty()) {
            throw new TaxDataException("Authority name cannot be empty");
        }
        if (region == null || region.isEmpty()) {
            throw new TaxDataException("Region cannot be empty");
        }
        if (!isValidEmail(email)) {
            throw new TaxDataException("Invalid authority email");
        }
        this.authorityName = authorityName;
        this.region = region;
        this.email = email;
    }

    private boolean isValidEmail(String email) {
        return email != null && email.contains("@") && email.contains(".");
    }

    public String getAuthorityName() {
        return authorityName;
    }

    public String getRegion() {
        return region;
    }

    public String getEmail() {
        return email;
    }
}
