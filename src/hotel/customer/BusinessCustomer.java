package hotel.customer;

public class BusinessCustomer extends Customer{
    public int amountOfDeductableTax;

    public BusinessCustomer(int tax, int numOfGuests) {
        amountOfDeductableTax = tax;
        this.numOfGuests = numOfGuests;
    }
}
