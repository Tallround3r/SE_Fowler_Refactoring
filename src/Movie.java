public class Movie
{
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String title;
//    private int priceCode;
    private Price priceCode;
    
    public Movie(String newtitle, Price priceCode)
    {
        title = newtitle;
        this.priceCode = priceCode;
    }
    public Price getPriceCode()
    {
        return priceCode;
    }
    public void setPriceCode(Price newPriceCode)
    {
        this.priceCode = newPriceCode;
    }
    public String getTitle()
    {
        return title;
    }
}