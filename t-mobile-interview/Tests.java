import Solution.Solution;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Tests {
    Solution solution = new Solution();
    
    @Test
    public void testPrintSolution(){
        String[] s = new String[]{"Hello", "World"};
        solution.printSolution(s);
        assertEquals(s.length, 2);
    }

    @Test(expected = NumberFormatException.class)
    public void testThrowsNFE(){
        solution.parseInteger("23c");
    }

    @Test
    public void testExpectedException() {
    Assertions.assertThrows(NumberFormatException.class, () -> {
        Integer.parseInt("One");
    });
    }
}