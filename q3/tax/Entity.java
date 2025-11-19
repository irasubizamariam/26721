package q3.tax;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) throws TaxDataException {
        if (id <= 0) {
            throw new TaxDataException("ID must be greater than 0");
        }
        if (createdDate == null || createdDate.isEmpty() || updatedDate == null || updatedDate.isEmpty()) {
            throw new TaxDataException("Dates must not be null or empty");
        }
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getId() {
        return id;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }
}
