package concept.bubble_sort.string;

import java.util.Arrays;

/*
* 3. Longest Substring Without Repeating Characters
* Given a string s, find the length of the longest substring without repeating characters.
*
Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


Constraints:

0 <= s.length <= 5 * 10^4
s consists of English letters, digits, symbols and spaces.
*
* */
public class LSWRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {

        int maxLength = 0;


        for (int i = 0; i < s.length(); i++) {
            int[] hash = new int[256];
              hash[i] = 0;
            for (int j = i; j < s.length(); j++) {
                if (hash[s.charAt(j)] == 1) break;
                int length = j - i + 1;
                maxLength = Math.max(length, maxLength);
                hash[s.charAt(j)] = 1;
            }
        }
        return maxLength;
    }

    public int enhancedLengthOfLongestSubstring(String s){
        int[] hash = new int[256];
        for (int i = 0; i < 256; i++) {
            hash[i] = -1;
        }
        int maxLength = 0, left = 0, right = 0;

        while (right < s.length()) {
            if (hash[s.charAt(right)] != -1){
                if(hash[s.charAt(right)] >= left){
                    left = hash[s.charAt(right)] + 1;
                }
            }

            int length  = right - left + 1;
            maxLength = Math.max(length, maxLength);
            hash[s.charAt(right)] = right;
            right++;
        }
        return maxLength;
    }
}
