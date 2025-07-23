package planeresv;

import java.util.*;

public class ReservationSystem {
    public static void main(String[] args) {
        ArrayList<Flight> flights = new ArrayList<>();
        ArrayList<Reservation> reservations = new ArrayList<>();

        // Predefined Flights
        flights.add(new Flight(101, true, 3));
        flights.add(new Flight(202, false, 50));
        flights.add(new Flight(303, true, 48));

        Scanner scanner = new Scanner(System.in);
        int userOption = 1;

        System.out.println("=== Available Flights ===");
        for (Flight f : flights) {
            f.displayFlightInfo();
        }

        while (userOption == 1) {
            System.out.println("\nEnter 1 to Book a Flight or 2 to Exit:");
            userOption = scanner.nextInt();

            if (userOption == 1) {
                Reservation reservation = new Reservation();
                if (reservation.isAvailable(reservations, flights)) {
                    reservations.add(reservation);
                    System.out.println("✅ Reservation confirmed!");
                } else {
                    System.out.println("❌ Flight full. Try another flight or date.");
                }
            }
        }

        System.out.println("Thank you for using the Plane Reservation System!");
    }
}
