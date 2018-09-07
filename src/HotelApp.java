import hotel.Hotel;
import hotel.customer.BusinessCustomer;
import hotel.customer.Customer;
import hotel.customer.PrivateCustomer;
import hotel.exception.NoRoomException;
import hotel.restaurant.Restaurant;

import java.time.LocalDate;

public class HotelApp {
    public static void main(String[] args){
        Hotel hotel = new Hotel("The Marriott", 200, 30);

        Customer customer = new PrivateCustomer("Cornelis", 5, true);
        Restaurant restaurant = hotel.restaurant;
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

        try {
            restaurant.makeTableBooking(LocalDate.of(2018, 9, 12), 5);
        }catch (Exception e){
            System.out.println("No more tables!");
        }

        BusinessCustomer business = new BusinessCustomer(1000, 3000);
        try {
            hotel.makeRoomBooking(checkin, checkout, business.numOfGuests);
        } catch (NoRoomException e) {
            System.out.println("No rooms for your business available! Take your "
                    + business.amountOfDeductableTax + " euros and leave!");
        }
    }
}
