package hotel.restaurant;

import hotel.reservation.Bookable;

public class Table implements Bookable {
    boolean available;
    int nr;
    int amountOfPeople;


    public boolean availability(){
        return available;
    }
    public double getPrice(){
        return 10.50;
    }
}
