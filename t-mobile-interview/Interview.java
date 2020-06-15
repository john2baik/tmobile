import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import Solution.Solution;

public class Interview{

    Solution solution = new Solution();
    public static void main(String[] args){
        System.out.println("Please Enter the Postfix Expression: \n");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] s = input.split(" ");

        Solution solution = new Solution();
        solution.printSolution(s);
        sc.close();
    }



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