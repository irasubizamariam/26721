package q2.flight;

public class CabinCrew extends Pilot {
    private String crewName;
    private String role;
    private String shift; // Day/Night

    public CabinCrew(int id, String createdDate, String updatedDate,
                     String airportName, String airportCode, String airportLocation,
                     String airlineName, String airlineCode, String contactEmail,
                     String flightNumber, String departure, String destination, double baseFare,
                     String pilotName, String licenseNumber, int experienceYears,
                     String crewName, String role, String shift) {
        super(id, createdDate, updatedDate, airportName, airportCode, airportLocation,
                airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare,
                pilotName, licenseNumber, experienceYears);
        if (crewName == null || crewName.isEmpty()) {
            throw new IllegalArgumentException("Crew name cannot be empty");
        }
        if (role == null || role.isEmpty()) {
            throw new IllegalArgumentException("Role cannot be empty");
        }
        if (shift == null || !(shift.equalsIgnoreCase("Day") || shift.equalsIgnoreCase("Night"))) {
            throw new IllegalArgumentException("Shift must be Day or Night");
        }
        this.crewName = crewName;
        this.role = role;
        this.shift = shift;
    }

    public String getCrewName() {
        return crewName;
    }

    public String getRole() {
        return role;
    }

    public String getShift() {
        return shift;
    }
}
