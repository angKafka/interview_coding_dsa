package array;

import java.util.List;

public class Solutions {
    public static void main(String[] args) {
        int[] nums = {6,4,3,2,7,6,2};

        List<Integer> result = ReplaceNonCoPrime.replaceNonCoprimes(nums);

        // Print the resulting list
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
