/*3. Word Frequency Counter 
Count the frequency of each unique word in a sentence (case insensitive). 
Input: "The cat and the dog." → Output: the: 2, cat: 1, and: 1, dog: 
1  */


import java.util.*;
public class WordFrequency {
    public static void countWordFrequency(String sentence) {
       
        sentence = sentence.toLowerCase().replaceAll("[^a-z ]", "");   
        String[] words = sentence.split("\\s+");
        Map<String, Integer> freqMap = new LinkedHashMap<>();
        for (String word : words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String input = "The cat and the dog.";
        countWordFrequency(input);
    }
}
