package Solution;

import java.util.Arrays;
import java.util.Stack;

import java.util.*;

public class PostfixCalculator {

    //[3.5, 2, +, 4.25, 4, *, -] = [3.5, 2]
    //[5.5, 4.25, 4, *, -] stack = [5.5]
    //[5.5, 17, -]                    stack = [5.5, 4.25, 4]
    // = -11.5                  stack = [5.5, 17]
    //stack= []

    public static Double calculateExpression(String[] tokens){
        Stack<Double> stack = new Stack<>();
        Set<String> operands = new HashSet<>(Arrays.asList("/", "*", "+", "-"));
        for(int i = 0; i < tokens.length; i++){
            if(operands.contains(tokens[i])){ //operand value
                double second = stack.pop();
                double first = stack.pop();
                stack.push(operandCalculator(tokens[i], first, second));
            } else{
                stack.push(Double.parseDouble(tokens[i]));
            }
        }
        return stack.pop();
    }

    public static Double operandCalculator(String operand, Double first, Double second){
        double ans = 0;
        switch(operand){
            case "+": ans = first+second;
            break;
            case "-": ans = first-second;
            break;
            case "*": ans = first*second;
            break;
            case "/": ans = first/second;
            break;
            default: ans = 0;
        }
        return new Double(ans);
    }

    /*
    Input:   3.5 2 + 4.25 4 * -
    Output:  (3.5 + 2) - (4.25 * 4)
    s = [3.5, 2] ->  sb = (3.5 + 2) -> push
    s = [(3.5 + 2), (4.25 * 4) ]
    */
    public static String convertPostfixToInfix(String[] tokens){
        //StringBuilder sb = new StringBuilder();
        Stack<String> numbers = new Stack<>();
        Set<String> operands = new HashSet<>(Arrays.asList("/", "*", "+", "-"));
        for(int i = 0; i < tokens.length; i++){
            if(operands.contains(tokens[i])){ //operand value
                String second = numbers.pop();
                String first = numbers.pop();
                boolean isLast = (i == tokens.length-1);
                numbers.push(buildInfix(tokens[i], first, second, isLast));
            } else{
                numbers.push(tokens[i]);
            }
        }

        return numbers.pop();
    }

    public static String buildInfix(String operand, String first, String second, boolean isLast){
        StringBuilder sb = new StringBuilder();
        if(isLast) return sb.append(first).append(" "+ operand + " ").append(second).toString();
        else return sb.append("(").append(first).append(" "+ operand + " ").append(second).append( ")").toString();

    }
}