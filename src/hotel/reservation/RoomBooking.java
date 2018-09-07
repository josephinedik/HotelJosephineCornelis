package hotel.reservation;

import hotel.Room;

import java.time.LocalDate;
import java.util.ArrayList;

public class RoomBooking {
    LocalDate checkin;
    LocalDate checkout;
    ArrayList<Room> rooms;
    public RoomBooking(LocalDate checkin, LocalDate checkout, Room room){
        this.checkin = checkin;
        this.checkout = checkout;
        this.rooms = new ArrayList<Room>(0);
        this.rooms.add(room);
    }
    public RoomBooking(LocalDate checkin, LocalDate checkout, ArrayList<Room> rooms){
        this.checkin = checkin;
        this.checkout = checkout;
        this.rooms = rooms;
    }
}
