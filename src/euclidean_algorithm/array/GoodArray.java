package euclidean_algorithm.array;

/*
* 1250. Check If It Is a Good Array
* =================================
* Given an array nums of positive integers.
* Your task is to select some subset of nums, multiply each element by
* an integer and add all these numbers. The array is said to be good if
* you can obtain a sum of 1 from the array by any possible subset and
* multiplicand.
*
* Return True if the array is good otherwise return False.
*
* Example 1:
* Input: nums = [12,5,7,23]
* Output: true
* Explanation: Pick numbers 5 and 7.
* 5*3 + 7*(-2) = 1
* */
public class GoodArray {
    public static boolean isGoodArray(int[] nums) {
        if(nums.length == 0) return false;

        int overallGCD = nums[0];
        for (int num : nums) {
            overallGCD = gcd(overallGCD,num);
            if (overallGCD == 1) return true;
        }
        return overallGCD > 1;
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
