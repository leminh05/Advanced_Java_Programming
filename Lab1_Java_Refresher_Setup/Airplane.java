package Lab1_Java_Refresher_Setup;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Airplane {
    // --- Attributes ---
    private String flightNumber;
    private String destination;
    private LocalTime scheduledDeparture;
    private int delayTime; // in minutes
    // --- Constructor ---
    public Airplane(String flightNumber, String destination, LocalTime scheduledDeparture) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.scheduledDeparture = scheduledDeparture;
        this.delayTime = 0; // A new flight has no initial delay.
    }

    // --- Getters ---

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public LocalTime getScheduledDeparture() {
        return scheduledDeparture;
    }
    
    // --- Setters ---

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setScheduledDeparture(LocalTime scheduledDeparture) {
        this.scheduledDeparture = scheduledDeparture;
    }

    public void delay(int minutes) {
        if (minutes > 0) {
            this.delayTime += minutes;
            this.scheduledDeparture = this.scheduledDeparture.plusMinutes(minutes);
            System.out.println("Flight " + this.flightNumber + " has been delayed by " + minutes + " minutes.");
        }
    }

    /** Checks and displays the current status of the flight (On Time or Delayed). */

    public void checkStatus() {
        // Formatter to display time in HH:mm format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        System.out.print("Flight " + flightNumber + " to " + destination + " ");
        if (delayTime == 0) {
            System.out.println("is On Time. Departure: " + scheduledDeparture.format(formatter));
        } else {
            System.out.println("is Delayed. New Departure: " + scheduledDeparture.format(formatter) + 
                               " (Delayed by " + delayTime + " minutes)");
        }
    }
}
