package hotel.customer;

public class PrivateCustomer extends Customer {
    String name;
    boolean travelingWithChildren;
    public PrivateCustomer(String name, int numOfGuests){
        this.name = name;
        this.travelingWithChildren = false;
        this.numOfGuests = numOfGuests;
    }
    public PrivateCustomer(String name, int numOfGuests, boolean travelingWithChildren){
        this.name = name;
        this.travelingWithChildren = travelingWithChildren;
        this.numOfGuests = numOfGuests;
    }

}
