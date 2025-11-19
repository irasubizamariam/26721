package q1.stock;

public class Category extends Warehouse {
    private String categoryName;
    private String categoryCode; // alphanumeric; >= 3 chars

    public Category(int id, String createdDate, String updatedDate,
                    String warehouseName, String location, String contactNumber,
                    String categoryName, String categoryCode) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber);
        if (categoryName == null || categoryName.isEmpty()) {
            throw new IllegalArgumentException("Category name cannot be empty");
        }
        if (categoryCode == null || !categoryCode.matches("[A-Za-z0-9]{3,}")) {
            throw new IllegalArgumentException("Category code must be alphanumeric and at least 3 characters");
        }
        this.categoryName = categoryName;
        this.categoryCode = categoryCode;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getCategoryCode() {
        return categoryCode;
    }
}
