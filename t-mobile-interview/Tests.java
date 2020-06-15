import Solution.PostfixCalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Tests {
    
    @Test
    public void testPrintSolution(){
        String[] expression = new String[]{"4.5", "5.5", "+"};
        assertEquals(new Double(10), PostfixCalculator.calculateExpression(expression));
    }

    @Test
    public void testComplicatedPrintSolution(){
        String[] expression = new String[]{"3.5", "2", "+", "4.25", "4", "*", "-"};
        assertEquals(new Double(-11.5), PostfixCalculator.calculateExpression(expression));
    }
    
    @Test
    public void testNegativeSubstraction(){
        String[] expression = new String[]{"4.5",  "5.25", "-"};
        assertEquals(new Double(-0.75), PostfixCalculator.calculateExpression(expression));
    }

    // @Test(expected = NumberFormatException.class)
    // public void testThrowsNFE(){
    //     solution.parseInteger("23c");
    // }

    // @Test
    // public void testExpectedException() {
    // Assertions.assertThrows(NumberFormatException.class, () -> {
    //     Integer.parseInt("One");
    // });
    // }
}