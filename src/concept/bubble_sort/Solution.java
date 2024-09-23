package concept.bubble_sort;


import concept.bubble_sort.string.Leetcode30;

public class Solution {
    public static void main(String[] args) {
        String s = "wordgoodgoodgoodbestword";
        String[] word = {"word","good","best","good"};
        Leetcode30 solution = new Leetcode30();
        System.out.println(solution.findSubstring(s, word));
    }
}
