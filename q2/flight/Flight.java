package q2.flight;

public class Flight extends Airline {
    private String flightNumber;
    private String departure;
    private String destination;
    private double baseFare; // > 0

    public Flight(int id, String createdDate, String updatedDate,
                  String airportName, String airportCode, String airportLocation,
                  String airlineName, String airlineCode, String contactEmail,
                  String flightNumber, String departure, String destination, double baseFare) {
        super(id, createdDate, updatedDate, airportName, airportCode, airportLocation,
                airlineName, airlineCode, contactEmail);
        if (flightNumber == null || flightNumber.isEmpty()) {
            throw new IllegalArgumentException("Flight number cannot be empty");
        }
        if (departure == null || departure.isEmpty() || destination == null || destination.isEmpty()) {
            throw new IllegalArgumentException("Departure and destination cannot be empty");
        }
        if (baseFare <= 0) {
            throw new IllegalArgumentException("Base fare must be greater than 0");
        }
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.destination = destination;
        this.baseFare = baseFare;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }

    public double getBaseFare() {
        return baseFare;
    }
}
