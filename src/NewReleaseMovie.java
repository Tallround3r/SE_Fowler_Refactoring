
public class NewReleaseMovie implements Price
{
    int frequentRenterPoints = 0;


    @Override
    public double calculatePricingForRental(Rental rental)
    {
        return rental.getDaysRented() * 3;
    }

    @Override
    public int calculateFrequentRenterPoints(Rental rental)
    {
        return rental.getDaysRented() > 1 ? 2 : 1;
    }

}
