import hotel.Hotel;
import hotel.customer.Customer;
import hotel.customer.PrivateCustomer;

import java.time.LocalDate;

public class HotelApp {
    public static void main(String[] args){
        Hotel hotel = new Hotel("The Marriott", 200);

        Customer customer = new PrivateCustomer("Cornelis", 5, true);
        LocalDate checkin = LocalDate.of(2018, 9, 7);
        LocalDate checkout = LocalDate.of(2018, 9, 12);
        try {
            hotel.makeRoomBooking(checkin, checkout, customer.numOfGuests);
        }catch (Exception e){
            System.out.println("No rooms available!");
        }
        LocalDate checkin1 = LocalDate.of(2018, 9, 7);
        LocalDate checkout1 = LocalDate.of(2018, 9, 12);
        try {
            hotel.makeRoomBooking(checkin1, checkout1, customer.numOfGuests);
        }catch (Exception e){
            System.out.println("No rooms available!");
        }

    }
}
