package hotel.customer;
import hotel.reservation.RoomBooking;

import java.util.ArrayList;

abstract public class Customer {
    String name;
    String email;
    ArrayList<RoomBooking> roomBookings;
    public int numOfGuests;
}
