class Rental
{
    private Movie movie;
    private int daysRented;

    public Rental(Movie newmovie, int newdaysRented)
    {
        movie = newmovie;
        daysRented = newdaysRented;
    }
    public int getDaysRented()
    {
        return daysRented;
    }
    public Movie getMovie()
    {
        return movie;
    }

    public double getPrice()
    {
        return movie.getPriceCode().calculatePricingForRental(this);
    }

    public int getGainedRenterPoints()
    {
        return movie.getPriceCode().calculateFrequentRenterPoints(this);
    }

    public String getReport()
    {
        return "\t" + this.getMovie().getTitle() + "\t" + "\t" + this.getDaysRented() + "\t"
            + String.valueOf(this.getPrice()) + "\n";
    }
}