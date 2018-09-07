package hotel.restaurant;

import hotel.exception.NoTableException;
import hotel.reservation.TableBooking;
import hotel.restaurant.Table;

import java.time.LocalDate;
import java.util.ArrayList;

public class Restaurant {
    Table[] tables;
    public Restaurant(int amountOfTables){
        tables = new Table[amountOfTables];
        for (int i = 0; i < amountOfTables; i++) {
            tables[i] = new Table();
        }
    }
    
    public TableBooking makeTableBooking(LocalDate day, int numOfGuests) throws NoTableException{
        int numOfGuestsRemaining = numOfGuests;
        ArrayList<Table> bookedTables = new ArrayList<Table>(0);
        for (int i = 0; i < tables.length; i++){
            if (tables[i].availability()){
                numOfGuestsRemaining = numOfGuestsRemaining - tables[i].amountOfPeople;
                //System.out.println(numOfGuestsRemaining);
                bookedTables.add(tables[i]);
                System.out.println("We booked table "+i);
                tables[i].available = false;
                if (numOfGuestsRemaining <= 0){
                    break;
                }
            }
        }
        if (numOfGuestsRemaining > 0) {
            throw new NoTableException();
        }
        TableBooking tableBooking = new TableBooking(day, bookedTables);
        return tableBooking;        
    }
}
