package hotel.reservation;

import hotel.restaurant.Table;

import java.time.LocalDate;
import java.util.ArrayList;

public class TableBooking {
    LocalDate day;
    ArrayList<Table> tables;

    public TableBooking(LocalDate day, Table table){
        this.day=day;
        this.tables = new ArrayList<Table>(0);
        this.tables.add(table);
    }
    public TableBooking(LocalDate day, ArrayList<Table> tables){
        this.day = day;
        this.tables = tables;
    }
}
