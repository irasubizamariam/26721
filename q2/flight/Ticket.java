package q2.flight;

public final class Ticket extends Payment {
    private String ticketNumber;
    private String issueDate;
    private double taxes;
    private double discounts;

    public Ticket(int id, String createdDate, String updatedDate,
                  String airportName, String airportCode, String airportLocation,
                  String airlineName, String airlineCode, String contactEmail,
                  String flightNumber, String departure, String destination, double baseFare,
                  String pilotName, String licenseNumber, int experienceYears,
                  String crewName, String role, String shift,
                  String passengerName, int age, String gender, String contact,
                  String bookingDate, String seatNumber, String travelClass,
                  String paymentDate, String paymentMethod, double amountPaid,
                  String ticketNumber, String issueDate,
                  double taxes, double discounts) {
        super(id, createdDate, updatedDate,
                airportName, airportCode, airportLocation,
                airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare,
                pilotName, licenseNumber, experienceYears,
                crewName, role, shift,
                passengerName, age, gender, contact,
                bookingDate, seatNumber, travelClass,
                paymentDate, paymentMethod, amountPaid);
        if (ticketNumber == null || ticketNumber.isEmpty()) {
            throw new IllegalArgumentException("Ticket number cannot be empty");
        }
        if (issueDate == null || issueDate.isEmpty()) {
            throw new IllegalArgumentException("Issue date cannot be empty");
        }
        if (taxes < 0 || discounts < 0) {
            throw new IllegalArgumentException("Taxes and discounts cannot be negative");
        }
        this.ticketNumber = ticketNumber;
        this.issueDate = issueDate;
        this.taxes = taxes;
        this.discounts = discounts;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public double getTaxes() {
        return taxes;
    }

    public double getDiscounts() {
        return discounts;
    }

    public double calculateFare() {
        return getBaseFare() + taxes - discounts;
    }
}
