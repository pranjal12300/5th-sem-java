/*1. Check for Anagram 
Determine if two strings are anagrams of each other (ignore case, spaces, and 
punctuation). 
Input: "Listen", "Silent" → Output: True  */



import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String s1, String s2) {
        s1 = s1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        s2 = s2.replaceAll("[^a-zA-Z]", "").toLowerCase();

        if (s1.length() != s2.length()) return false;

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";

        System.out.println(isAnagram(str1, str2)); 
    }
}
