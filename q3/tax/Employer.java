package q3.tax;

public class Employer extends Taxpayer {
    private String employerName;
    private String employerTIN; // valid TIN
    private String contact; // phone = 10 digits

    public Employer(int id, String createdDate, String updatedDate,
                    String authorityName, String region, String email,
                    String categoryName, double rate, String code,
                    String tin, String taxpayerName, String address,
                    String employerName, String employerTIN, String contact) throws TaxDataException {
        super(id, createdDate, updatedDate, authorityName, region, email,
                categoryName, rate, code,
                tin, taxpayerName, address);
        if (employerName == null || employerName.isEmpty()) {
            throw new TaxDataException("Employer name cannot be empty");
        }
        if (!isValidTin(employerTIN)) {
            throw new TaxDataException("Employer TIN must be 9 digits");
        }
        if (!isValidPhone(contact)) {
            throw new TaxDataException("Contact phone must be 10 digits");
        }
        this.employerName = employerName;
        this.employerTIN = employerTIN;
        this.contact = contact;
    }

    private boolean isValidPhone(String phone) {
        return phone != null && phone.matches("\\d{10}");
    }

    public String getEmployerName() {
        return employerName;
    }

    public String getEmployerTIN() {
        return employerTIN;
    }

    public String getContact() {
        return contact;
    }
}
