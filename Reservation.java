package planeresv;

import java.util.*;
import java.text.*;

public class Reservation {
    String passengerName;
    int flightNo;
    Date date;

    public Reservation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter passenger name: ");
        passengerName = scanner.next();
        System.out.print("Enter flight number: ");
        flightNo = scanner.nextInt();
        System.out.print("Enter flight date (dd-MM-yyyy): ");
        String dateInput = scanner.next();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        try {
            date = sdf.parse(dateInput);
        } 
        catch (ParseException e) 
        {
            e.printStackTrace();
        }
    }

    public boolean isAvailable(ArrayList<Reservation> reservations, ArrayList<Flight> flights) {
        int capacity = 0;
        for (Flight flight : flights)
        {
            if (flight.getFlightNo() == flightNo)
            {
                capacity = flight.getCapacity();
                break;
            }
        }

        int booked = 0;
        for (Reservation res : reservations) 
        {
            if (res.flightNo == flightNo && res.date.equals(date))
            {
                booked++;
            }
        }

        return booked < capacity;
    }
}
