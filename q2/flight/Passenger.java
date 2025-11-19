package q2.flight;

public class Passenger extends CabinCrew {
    private String passengerName;
    private int age; // > 0
    private String gender;
    private String contact;

    public Passenger(int id, String createdDate, String updatedDate,
                     String airportName, String airportCode, String airportLocation,
                     String airlineName, String airlineCode, String contactEmail,
                     String flightNumber, String departure, String destination, double baseFare,
                     String pilotName, String licenseNumber, int experienceYears,
                     String crewName, String role, String shift,
                     String passengerName, int age, String gender, String contact) {
        super(id, createdDate, updatedDate, airportName, airportCode, airportLocation,
                airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare,
                pilotName, licenseNumber, experienceYears,
                crewName, role, shift);
        if (passengerName == null || passengerName.isEmpty()) {
            throw new IllegalArgumentException("Passenger name cannot be empty");
        }
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be greater than 0");
        }
        if (gender == null || gender.isEmpty()) {
            throw new IllegalArgumentException("Gender must be provided");
        }
        if (contact == null || contact.isEmpty()) {
            throw new IllegalArgumentException("Contact must be provided");
        }
        this.passengerName = passengerName;
        this.age = age;
        this.gender = gender;
        this.contact = contact;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getContact() {
        return contact;
    }
}
