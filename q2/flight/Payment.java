package q2.flight;

public class Payment extends Booking {
    private String paymentDate;
    private String paymentMethod;
    private double amountPaid; // > 0

    public Payment(int id, String createdDate, String updatedDate,
                   String airportName, String airportCode, String airportLocation,
                   String airlineName, String airlineCode, String contactEmail,
                   String flightNumber, String departure, String destination, double baseFare,
                   String pilotName, String licenseNumber, int experienceYears,
                   String crewName, String role, String shift,
                   String passengerName, int age, String gender, String contact,
                   String bookingDate, String seatNumber, String travelClass,
                   String paymentDate, String paymentMethod, double amountPaid) {
        super(id, createdDate, updatedDate, airportName, airportCode, airportLocation,
                airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare,
                pilotName, licenseNumber, experienceYears,
                crewName, role, shift,
                passengerName, age, gender, contact,
                bookingDate, seatNumber, travelClass);
        if (paymentDate == null || paymentDate.isEmpty()) {
            throw new IllegalArgumentException("Payment date cannot be empty");
        }
        if (paymentMethod == null || paymentMethod.isEmpty()) {
            throw new IllegalArgumentException("Payment method cannot be empty");
        }
        if (amountPaid <= 0) {
            throw new IllegalArgumentException("Amount paid must be greater than 0");
        }
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
        this.amountPaid = amountPaid;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public double getAmountPaid() {
        return amountPaid;
    }
}
