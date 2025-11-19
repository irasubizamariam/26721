package q2.flight;

public class Airline extends Airport {
    private String airlineName;
    private String airlineCode; // 2-4 letters
    private String contactEmail;

    public Airline(int id, String createdDate, String updatedDate,
                   String airportName, String airportCode, String airportLocation,
                   String airlineName, String airlineCode, String contactEmail) {
        super(id, createdDate, updatedDate, airportName, airportCode, airportLocation);
        if (airlineName == null || airlineName.isEmpty()) {
            throw new IllegalArgumentException("Airline name cannot be empty");
        }
        if (airlineCode == null || !airlineCode.matches("[A-Za-z]{2,4}")) {
            throw new IllegalArgumentException("Airline code must be 2 to 4 letters");
        }
        if (!isValidEmail(contactEmail)) {
            throw new IllegalArgumentException("Invalid airline email");
        }
        this.airlineName = airlineName;
        this.airlineCode = airlineCode;
        this.contactEmail = contactEmail;
    }

    private boolean isValidEmail(String email) {
        return email != null && email.contains("@") && email.contains(".");
    }

    public String getAirlineName() {
        return airlineName;
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public String getContactEmail() {
        return contactEmail;
    }
}
