import java.util.ArrayList;

class Customer
{
    private String name;
    private ArrayList<Rental> rentalList = new ArrayList<Rental>();
    private int frequentRenterPoints;
    private double rentalPrice;
    private String rentalStatus;

    public Customer(String name)
    {
        this.name = name;
        rentalStatus = "Rental Record for " + this.name + "\n";
        rentalStatus += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";
    }

    public void addRental(Rental rentalToAdd)
    {
        rentalList.add(rentalToAdd);
    }

    public String getName()
    {
        return this.name;
    }

    public String getRentalReport()
    {
        rentalPrice = 0;
        frequentRenterPoints = 0;

        rentalList.forEach(rental -> {

            rentalPrice += rental.getPrice();

            frequentRenterPoints += rental.getGainedRenterPoints();

            rentalStatus += rental.getReport();
        });

        rentalStatus += "Amount owed is " + String.valueOf(rentalPrice) + "\n";
        rentalStatus += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        return rentalStatus;
    }

}
