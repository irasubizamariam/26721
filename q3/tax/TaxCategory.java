package q3.tax;

public class TaxCategory extends TaxAuthority {
    private String categoryName;
    private double rate; // > 0
    private String code; // >= 3 chars

    public TaxCategory(int id, String createdDate, String updatedDate,
                       String authorityName, String region, String email,
                       String categoryName, double rate, String code) throws TaxDataException {
        super(id, createdDate, updatedDate, authorityName, region, email);
        if (categoryName == null || categoryName.isEmpty()) {
            throw new TaxDataException("Category name cannot be empty");
        }
        if (rate <= 0) {
            throw new TaxDataException("Rate must be greater than 0");
        }
        if (code == null || code.length() < 3) {
            throw new TaxDataException("Code must have at least 3 characters");
        }
        this.categoryName = categoryName;
        this.rate = rate;
        this.code = code;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public double getRate() {
        return rate;
    }

    public String getCode() {
        return code;
    }
}
