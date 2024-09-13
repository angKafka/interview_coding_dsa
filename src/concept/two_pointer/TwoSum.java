package concept.two_pointer;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        //O(N^2)
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        return result;
    }


    public static int[] enhancedTwoSum(int[] nums, int target) {

        if (nums == null || nums.length < 2) {
            return nums;
        }
        int[] result = new int[2];
        //O(N)
        int left = 0, right = 1;
        while (left < nums.length-1) {
            if (right >= nums.length) {
                left++;
                right = left + 1;
            } else {
                    int sum = nums[left] + nums[right];
                    if (sum == target) {
                        result[0] = left;
                        result[1] = right;
                        return result;
                    }
                right++;
                }
            }

        return result;
    }
}
