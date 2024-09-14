package concept.bubble_sort;

import concept.bubble_sort.array.Leetcode1423;
import concept.bubble_sort.array.ThreeSum;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,1};
        int k = 3;
        Leetcode1423 solution = new Leetcode1423();
        System.out.println(solution.maxScore(nums, k));
    }
}
