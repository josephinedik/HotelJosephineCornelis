package hotel.reservation;

import hotel.SleepingRoom;

import java.time.LocalDate;
import java.util.ArrayList;

public class RoomBooking {
    LocalDate checkin;
    LocalDate checkout;
    ArrayList<SleepingRoom> rooms;
    public RoomBooking(LocalDate checkin, LocalDate checkout, SleepingRoom room){
        this.checkin = checkin;
        this.checkout = checkout;
        this.rooms = new ArrayList<SleepingRoom>(0);
        this.rooms.add(room);
    }
    public RoomBooking(LocalDate checkin, LocalDate checkout, ArrayList<SleepingRoom> rooms){
        this.checkin = checkin;
        this.checkout = checkout;
        this.rooms = rooms;
    }
}
