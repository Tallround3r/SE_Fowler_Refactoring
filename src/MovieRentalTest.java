import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MovieRentalTest
{

    Movie m1 = new Movie("movie1", new NewReleaseMovie());
    Movie m2 = new Movie("movie2", new ChildrenMovie());
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
        result = c1.getRentalReport();
        assertEquals(EXPECTED, result.replaceAll("\\s", "")); //all whitespace removed
    }

}
