/*2. Recursive Fibonacci with Memoization 
Implement Fibonacci using recursion and memoization to avoid recomputation. 
Input: fib(10) → Output: 55  */


import java.util.HashMap;

public class Recursionex {

    static HashMap<Integer, Integer> memo = new HashMap<>();

    public static int fib(int n) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        if (n <= 1) {
            return n;
        }
        int result = fib(n - 1) + fib(n - 2);
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci of 10: " + fib(10));  
    }
}
