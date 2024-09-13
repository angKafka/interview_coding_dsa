package concept.problems;

import concept.two_pointer.TwoSum;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(TwoSum.enhancedTwoSum(nums, target)));
    }
}
