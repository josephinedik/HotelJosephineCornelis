package hotel.restaurant;

import hotel.reservation.Bookable;

public class Table implements Bookable {
    boolean available = true;
    int nr;
    int amountOfPeople = 2;
    public Table(int nr){
        this.nr = nr;
    }




    public boolean availability(){
        return available;
    }
    public double getPrice(){
        return 10.50;
    }
}
