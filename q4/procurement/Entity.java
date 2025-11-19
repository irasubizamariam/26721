package q4.procurement;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID must be greater than 0");
        }
        if (createdDate == null || createdDate.isEmpty() || updatedDate == null || updatedDate.isEmpty()) {
            throw new IllegalArgumentException("Dates must not be null or empty");
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
