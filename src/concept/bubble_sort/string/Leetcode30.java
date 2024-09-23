package concept.bubble_sort.string;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;


public class Leetcode30 {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || words == null || words.length == 0) return result;

        int wordLength = words[0].length();
        int wordCount = words.length;


        // Create a frequency map for the words
        HashMap<String, Integer> wordMap = new HashMap<>();
        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }

        // Iterate over possible starting points based on word length
        for (int offset = 0; offset < wordLength; offset++) {
            HashMap<String, Integer> currentMap = new HashMap<>();
            int left = offset;
            int right = offset;
            int count = 0;

            while (right + wordLength <= s.length()) {
                String word = s.substring(right, right + wordLength);

                // Move right pointer
                if (wordMap.containsKey(word)) {
                    currentMap.put(word, currentMap.getOrDefault(word, 0) + 1);
                    count++;

                    // Adjust the left pointer if necessary
                    while (currentMap.get(word) > wordMap.get(word)) {
                        String leftWord = s.substring(left, left + wordLength);
                        currentMap.put(leftWord, currentMap.get(leftWord) - 1);
                        count--;
                        left += wordLength;
                    }

                    // If count matches the word count, record the starting index
                    if (count == wordCount) {
                        result.add(left);
                    }
                } else {
                    // If the current word is not in the wordMap, reset
                    currentMap.clear();
                    count = 0;
                    left = right + wordLength;
                }

                right += wordLength;
            }
        }

        return result;
    }
}
