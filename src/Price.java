public interface Price
{
    public double calculatePricingForRental(Rental rental);
    
    public int calculateFrequentRenterPoints(Rental rental);
}
