package concept.bubble_sort.array;

public class SortColors {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    swapColors(nums, j, j+1);
                }
            }
        }
    }

    public void swapColors(int[] nums, int a, int b) {
        int tempStore = nums[a];
        nums[a] = nums[b];
        nums[b] = tempStore;
    }
}
