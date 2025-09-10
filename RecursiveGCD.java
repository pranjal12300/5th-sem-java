/*1. Recursive GCD (Euclidean Algorithm) 
Implement a recursive method to compute the greatest common divisor (GCD) of two 
numbers. 
Input: gcd(24, 36) → Output: 12  */


public class Recursion {

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println("GCD of 24 and 36: " + gcd(24, 36));  
    }
}
