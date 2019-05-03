
public class ChildrenMovie implements Price
{
    double rentalCost = 0;
    int frequentRenterPoints = 0;


    @Override
    public double calculatePricingForRental(Rental rental)
    {
        rentalCost = 1.5;
        if (rental.getDaysRented() > 3)
            rentalCost += (rental.getDaysRented() - 3) * 1.5;
        return rentalCost;
    }

    @Override
    public int calculateFrequentRenterPoints(Rental rental)
    {
        return 1;
    }

}
