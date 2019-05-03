
public class RegularMovie implements Price
{
    double rentalCost;
    int frequentRenterPoints = 0;


    @Override
    public double calculatePricingForRental(Rental rental)
    {
        rentalCost = 2;
        if (rental.getDaysRented() > 2)
            rentalCost += (rental.getDaysRented() - 2) * 1.5;
        return rentalCost;
    }

    @Override
    public int calculateFrequentRenterPoints(Rental rental)
    {
        return 1;
    }

}
