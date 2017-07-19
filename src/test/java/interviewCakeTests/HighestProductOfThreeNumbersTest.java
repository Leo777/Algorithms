package interviewCakeTests;

import interviewCake.HighestNumberCalculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class HighestProductOfThreeNumbersTest {

    @Test
    public void getHighestProduct(){
        int[] input = {10,1,20,5,7,11,8,30,15};
        HighestNumberCalculator calculator = new HighestNumberCalculator();
        assertEquals(30*15*20, calculator.getProductOf3HighestValue(input));
    }

    @Test
    public void getHighestProductWithNegativeNumbers(){
        int[] input = {-10,12,3,20};
        HighestNumberCalculator calculator = new HighestNumberCalculator();
        assertEquals(12*3*20, calculator.getProductOf3HighestValue(input));
    }
}
