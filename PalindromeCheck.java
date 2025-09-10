/*3. Palindrome Check with Recursion 
Write a recursive function to check if a string is a palindrome (ignore case & 
punctuation). 
Input: "Able was I ere I saw Elba" → Output: True  */

public class Recursionexample {

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return isPalindromeHelper(s, 0, s.length() - 1);
    }

    private static boolean isPalindromeHelper(String s, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        return isPalindromeHelper(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        System.out.println("Is palindrome: " + isPalindrome("Able was I ere I saw Elba")); 
    }
}
