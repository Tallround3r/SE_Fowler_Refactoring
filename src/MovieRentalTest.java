import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MovieRentalTest
{
    
    Movie m1 = new Movie("movie1", 1);
    Movie m2 = new Movie("movie2", 2);
    Rental r1 = new Rental(m1, 10);
    Rental r2 = new Rental(m2, 5);
    Customer c1 = new Customer("joe");
    String result;
    final String EXPECTED = "RentalRecordforjoeTitleDaysAmountmovie11030.0movie254.5Amountowedis34.5Youearned3frequentrenterpoints";

    @Test
    void resultIsCorrect()
    {
        c1.addRental(r1);   
        c1.addRental(r2); 
        result = c1.statement();
        assertEquals(EXPECTED, result.replaceAll(" ", "").replaceAll("\n", "").replaceAll("\r", "").replaceAll("\t", ""));
    }

}