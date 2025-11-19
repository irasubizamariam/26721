package q3.tax;

public class Taxpayer extends TaxCategory {
    private String tin; // 9 digits
    private String taxpayerName;
    private String address;

    public Taxpayer(int id, String createdDate, String updatedDate,
                    String authorityName, String region, String email,
                    String categoryName, double rate, String code,
                    String tin, String taxpayerName, String address) throws TaxDataException {
        super(id, createdDate, updatedDate, authorityName, region, email,
                categoryName, rate, code);
        if (!isValidTin(tin)) {
            throw new TaxDataException("TIN must be 9 digits");
        }
        if (taxpayerName == null || taxpayerName.isEmpty()) {
            throw new TaxDataException("Taxpayer name cannot be empty");
        }
        if (address == null || address.isEmpty()) {
            throw new TaxDataException("Address cannot be empty");
        }
        this.tin = tin;
        this.taxpayerName = taxpayerName;
        this.address = address;
    }

    protected boolean isValidTin(String tin) {
        return tin != null && tin.matches("\\d{9}");
    }

    public String getTin() {
        return tin;
    }

    public String getTaxpayerName() {
        return taxpayerName;
    }

    public String getAddress() {
        return address;
    }
}
