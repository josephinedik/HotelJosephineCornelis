package hotel;

import hotel.exception.NoRoomException;
import hotel.reservation.RoomBooking;
import hotel.restaurant.Restaurant;

import java.time.LocalDate;
import java.util.ArrayList;

public class Hotel {
    public Restaurant restaurant;
    String name;
    SleepingRoom[] rooms;
    public Hotel(String name, int amountOfRooms, int amountOfTables){
        this.restaurant = new Restaurant(amountOfTables);
        this.name = name;
        this.rooms = new SleepingRoom[amountOfRooms];
        for (int i = 0; i < amountOfRooms; i++) {
            rooms[i] = new SleepingRoom(i+1);
        }
        rooms[0].amountOfPeople = 5;
        rooms[1].amountOfPeople = 5;
    }

    public RoomBooking makeRoomBooking(LocalDate checkin, LocalDate checkout, int numOfGuests) throws NoRoomException {
        int numOfGuestsRemaining = numOfGuests;
        ArrayList<SleepingRoom> bookedRooms = new ArrayList<SleepingRoom>(0);
        for (int i = 0; i < rooms.length; i++){
            if (numOfGuestsRemaining <= 0){
                break;
            }
            if (rooms[i].available){
                numOfGuestsRemaining = numOfGuestsRemaining - rooms[i].amountOfPeople;
                bookedRooms.add(rooms[i]);
            }
        }

        if (numOfGuestsRemaining > 0) {
            throw new NoRoomException();
        }

        for (int i = 0; i < bookedRooms.size(); i++) {
            bookedRooms.get(i).available = false;
            System.out.println("We booked room "+ bookedRooms.get(i).number);
        }

        RoomBooking roomBooking = new RoomBooking(checkin, checkout, bookedRooms);
        return roomBooking;
    }
}
