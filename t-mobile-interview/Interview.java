import java.util.Scanner;

import Solution.PostfixCalculator;

public class Interview{

    PostfixCalculator calculator = new PostfixCalculator();
    public static void main(String[] args){
        System.out.println("Please Enter the Postfix Expression: \n");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] s = input.split(" ");
 
        String solution = PostfixCalculator.convertPostfixToInfix(s);
        System.out.println(solution);
        sc.close();
    }
}