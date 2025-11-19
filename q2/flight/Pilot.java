package q2.flight;

public class Pilot extends Flight {
    private String pilotName;
    private String licenseNumber;
    private int experienceYears; // >= 2

    public Pilot(int id, String createdDate, String updatedDate,
                 String airportName, String airportCode, String airportLocation,
                 String airlineName, String airlineCode, String contactEmail,
                 String flightNumber, String departure, String destination, double baseFare,
                 String pilotName, String licenseNumber, int experienceYears) {
        super(id, createdDate, updatedDate, airportName, airportCode, airportLocation,
                airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare);
        if (pilotName == null || pilotName.isEmpty()) {
            throw new IllegalArgumentException("Pilot name cannot be empty");
        }
        if (licenseNumber == null || licenseNumber.isEmpty()) {
            throw new IllegalArgumentException("License number cannot be empty");
        }
        if (experienceYears < 2) {
            throw new IllegalArgumentException("Experience must be at least 2 years");
        }
        this.pilotName = pilotName;
        this.licenseNumber = licenseNumber;
        this.experienceYears = experienceYears;
    }

    public String getPilotName() {
        return pilotName;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public int getExperienceYears() {
        return experienceYears;
    }
}
