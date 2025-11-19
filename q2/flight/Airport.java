package q2.flight;

public class Airport extends Entity {
    private String airportName;
    private String code; // 3 uppercase letters
    private String location;

    public Airport(int id, String createdDate, String updatedDate,
                   String airportName, String code, String location) {
        super(id, createdDate, updatedDate);
        if (airportName == null || airportName.isEmpty()) {
            throw new IllegalArgumentException("Airport name cannot be empty");
        }
        if (location == null || location.isEmpty()) {
            throw new IllegalArgumentException("Location cannot be empty");
        }
        if (code == null || !code.matches("[A-Z]{3}")) {
            throw new IllegalArgumentException("Airport code must be 3 uppercase letters");
        }
        this.airportName = airportName;
        this.code = code;
        this.location = location;
    }

    public String getAirportName() {
        return airportName;
    }

    public String getCode() {
        return code;
    }

    public String getLocation() {
        return location;
    }
}
