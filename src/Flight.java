public class Flight {
    private String flightNumber;
    private String destination;
    private int capacity;
    private int bookedSeats;

    // Constructor
    public Flight(String flightNumber, String destination, int capacity, int bookedSeats) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
    }

    // Getters and Setters

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {

        if (capacity < bookedSeats) {
            System.out.println("Invalid capacity: It must be greater than or equal to booked seats");
        } else {
            this.capacity = capacity;
        }

    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }


    public void bookSeat() {
        if (bookedSeats < capacity) {
            bookedSeats++;

            int remainingSeats = getCapacity() - getBookedSeats();

            System.out.println("Seats booked successfully. Remaining seats: " + remainingSeats);
        } else {
            System.out.println("No seats available");
        }

    };

    public void cancelSeat () {
        if (bookedSeats > 0) {
            bookedSeats--;
            System.out.println("Seat cancellation successful. Available seats: " + bookedSeats);
        } else {
            System.out.println("No bookings to cancel.");
        }
    };






}
