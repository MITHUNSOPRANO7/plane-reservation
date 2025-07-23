package planeresv;

public class Flight {
    private int flightNo;
    private boolean ac;
    private int capacity;

    public Flight(int no, boolean ac, int cap) {
        this.flightNo = no;
        this.ac = ac;
        this.capacity = cap;
    }

    public int getFlightNo() {
        return flightNo;
    }

    public boolean isAc() {
        return ac;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setAc(boolean val) {
        ac = val;
    }

    public void setCapacity(int cap) {
        capacity = cap;
    }

    public void displayFlightInfo() {
        System.out.println("Flight No: " + flightNo + " | AC: " + ac + " | Seats: " + capacity);
    }
}
