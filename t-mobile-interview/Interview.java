import Solution.Solution;

public class Interview{
    public static void main(String[] args){
        Solution solution = new Solution();

        String[] s = new String[]{"Hello", "World"};
        runTests(solution);
    }

    public static void runTests(Solution solution){
        String[] s = new String[]{"Hello", "World"};

        solution.printSolution(s);
    }
}