package q2.flight;

public class Booking extends Passenger {
    private String bookingDate;
    private String seatNumber;
    private String travelClass; // Economy/Business/First

    public Booking(int id, String createdDate, String updatedDate,
                   String airportName, String airportCode, String airportLocation,
                   String airlineName, String airlineCode, String contactEmail,
                   String flightNumber, String departure, String destination, double baseFare,
                   String pilotName, String licenseNumber, int experienceYears,
                   String crewName, String role, String shift,
                   String passengerName, int age, String gender, String contact,
                   String bookingDate, String seatNumber, String travelClass) {
        super(id, createdDate, updatedDate, airportName, airportCode, airportLocation,
                airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare,
                pilotName, licenseNumber, experienceYears,
                crewName, role, shift,
                passengerName, age, gender, contact);
        if (bookingDate == null || bookingDate.isEmpty()) {
            throw new IllegalArgumentException("Booking date cannot be empty");
        }
        if (seatNumber == null || seatNumber.isEmpty()) {
            throw new IllegalArgumentException("Seat number cannot be empty");
        }
        if (travelClass == null || !(travelClass.equalsIgnoreCase("Economy") ||
                travelClass.equalsIgnoreCase("Business") ||
                travelClass.equalsIgnoreCase("First"))) {
            throw new IllegalArgumentException("Travel class must be Economy, Business, or First");
        }
        this.bookingDate = bookingDate;
        this.seatNumber = seatNumber;
        this.travelClass = travelClass;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public String getTravelClass() {
        return travelClass;
    }
}
