package q2.flight;

import java.util.Scanner;

public class FlightSystemDemo {

    public void run(Scanner scanner) {
        System.out.println("--- FLIGHT BOOKING SYSTEM (Q2) ---");

        System.out.print("Enter Entity ID (>0): ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter created date: ");
        String createdDate = scanner.nextLine();
        System.out.print("Enter updated date: ");
        String updatedDate = scanner.nextLine();

        System.out.print("Enter airport name: ");
        String airportName = scanner.nextLine();
        System.out.print("Enter airport code (3 uppercase letters): ");
        String airportCode = scanner.nextLine();
        System.out.print("Enter airport location: ");
        String airportLocation = scanner.nextLine();

        System.out.print("Enter airline name: ");
        String airlineName = scanner.nextLine();
        System.out.print("Enter airline code (2-4 letters): ");
        String airlineCode = scanner.nextLine();
        System.out.print("Enter airline contact email: ");
        String airlineEmail = scanner.nextLine();

        System.out.print("Enter flight number: ");
        String flightNumber = scanner.nextLine();
        System.out.print("Enter departure: ");
        String departure = scanner.nextLine();
        System.out.print("Enter destination: ");
        String destination = scanner.nextLine();
        System.out.print("Enter base fare (>0): ");
        double baseFare = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter pilot name: ");
        String pilotName = scanner.nextLine();
        System.out.print("Enter pilot license number: ");
        String licenseNumber = scanner.nextLine();
        System.out.print("Enter pilot experience years (>=2): ");
        int experienceYears = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter cabin crew name: ");
        String crewName = scanner.nextLine();
        System.out.print("Enter crew role: ");
        String role = scanner.nextLine();
        System.out.print("Enter crew shift (Day/Night): ");
        String shift = scanner.nextLine();

        System.out.print("Enter passenger name: ");
        String passengerName = scanner.nextLine();
        System.out.print("Enter passenger age (>0): ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter passenger gender: ");
        String gender = scanner.nextLine();
        System.out.print("Enter passenger contact: ");
        String contact = scanner.nextLine();

        System.out.print("Enter booking date: ");
        String bookingDate = scanner.nextLine();
        System.out.print("Enter seat number: ");
        String seatNumber = scanner.nextLine();
        System.out.print("Enter travel class (Economy/Business/First): ");
        String travelClass = scanner.nextLine();

        System.out.print("Enter payment date: ");
        String paymentDate = scanner.nextLine();
        System.out.print("Enter payment method: ");
        String paymentMethod = scanner.nextLine();
        System.out.print("Enter amount paid (>0): ");
        double amountPaid = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter ticket number: ");
        String ticketNumber = scanner.nextLine();
        System.out.print("Enter ticket issue date: ");
        String issueDate = scanner.nextLine();

        System.out.print("Enter taxes amount (>=0): ");
        double taxes = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter discounts amount (>=0): ");
        double discounts = Double.parseDouble(scanner.nextLine());

        try {
            Ticket ticket = new Ticket(
                    id, createdDate, updatedDate,
                    airportName, airportCode, airportLocation,
                    airlineName, airlineCode, airlineEmail,
                    flightNumber, departure, destination, baseFare,
                    pilotName, licenseNumber, experienceYears,
                    crewName, role, shift,
                    passengerName, age, gender, contact,
                    bookingDate, seatNumber, travelClass,
                    paymentDate, paymentMethod, amountPaid,
                    ticketNumber, issueDate,
                    taxes, discounts
            );

            double finalFare = ticket.calculateFare();

            System.out.println();
            System.out.println("=== TICKET DETAILS ===");
            System.out.println("Ticket Number: " + ticket.getTicketNumber());
            System.out.println("Issue Date: " + ticket.getIssueDate());
            System.out.println("Passenger: " + ticket.getPassengerName() + ", Age: " + ticket.getAge());
            System.out.println("Flight: " + ticket.getFlightNumber() + " (" + ticket.getDeparture() + " -> " + ticket.getDestination() + ")");
            System.out.println("Travel Class: " + ticket.getTravelClass() + ", Seat: " + ticket.getSeatNumber());
            System.out.println("Base Fare: " + ticket.getBaseFare());
            System.out.println("Taxes: " + ticket.getTaxes());
            System.out.println("Discounts: " + ticket.getDiscounts());
            System.out.println("Final Fare (base + taxes - discounts): " + finalFare);
        } catch (IllegalArgumentException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
