package InterviewTest;

import Solution.Solution;
import org.junit.Test;
import org.junit.Assert.*;


public class Test {
    Solution solution = new Solution();
    
    @Test
    public void testSolution(){
        String[] s = new String[]{"hello", "there"};
        solution.printSolution(s);
    }
}