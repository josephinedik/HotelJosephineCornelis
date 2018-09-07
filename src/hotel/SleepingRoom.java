package hotel;

import hotel.reservation.Bookable;

public class SleepingRoom extends Room implements Bookable {
    boolean available;
    int amountOfPeople;
    int beds;
    int number;
    public boolean availability(){
        return available;
    }
    public double getPrice(){
        return 50.00;
    }

    SleepingRoom(int number) {
        available = true;
        size = 16;
        amountOfPeople = 2;
        beds = 2;
        this.number = number;
    }
}
