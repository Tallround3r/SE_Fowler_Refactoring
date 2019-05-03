import java.util.ArrayList;

class Customer
{
    private String name;
    private ArrayList<Rental> rentalList = new ArrayList<Rental>();
    private int frequentRenterPoints;
    private double completePayment;
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
        completePayment = 0;
        frequentRenterPoints = 0;

        rentalList.stream().forEach(rental -> {

            completePayment += rental.getCost();

            frequentRenterPoints += rental.getGainedRenterPoints();

            rentalStatus += rental.getReport();
        });

        //add footer lines
        rentalStatus += "Amount owed is " + String.valueOf(completePayment) + "\n";
        rentalStatus += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        return rentalStatus;
    }

}
