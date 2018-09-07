package hotel;

import hotel.exception.NoRoomException;
import hotel.reservation.RoomBooking;
import hotel.restaurant.Restaurant;

import java.time.LocalDate;
import java.util.ArrayList;

public class Hotel {
    Restaurant restaurant;
    String name;
    Room[] rooms;
    public Hotel(String name, int amountOfRooms){
        this.restaurant = new Restaurant();
        this.name = name;
        this.rooms = new Room[amountOfRooms];
        for (int i = 0; i < amountOfRooms; i++) {
            rooms[i] = new SleepingRoom();
        }
        ((SleepingRoom)rooms[0]).amountOfPeople = 5;
        ((SleepingRoom)rooms[1]).amountOfPeople = 5;
    }

    public RoomBooking makeRoomBooking(LocalDate checkin, LocalDate checkout, int numOfGuests) throws NoRoomException {
        int numOfGuestsRemaining = numOfGuests;
        ArrayList<Room> bookedRooms = new ArrayList<Room>(0);
        for (int i = 0; i < rooms.length; i++){
            if (((SleepingRoom)rooms[i]).available){
                numOfGuestsRemaining = numOfGuestsRemaining - ((SleepingRoom)rooms[i]).amountOfPeople;
                //System.out.println(numOfGuestsRemaining);
                bookedRooms.add(rooms[i]);
                System.out.println("We booked room "+i);
                ((SleepingRoom)rooms[i]).available = false;
                if (numOfGuestsRemaining <= 0){
                    break;
                }
            }
        }
        if (numOfGuestsRemaining > 0) {
            throw new NoRoomException();
        }
        RoomBooking roomBooking = new RoomBooking(checkin, checkout, bookedRooms);
        return roomBooking;
    }
}
