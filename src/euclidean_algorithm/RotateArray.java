package euclidean_algorithm;

import concept.EuclideanGCD;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        int n = nums.length;
        int indexInnerLoop = 0;
        int currentPosition = 0;
        int cycle = EuclideanGCD.gcd(n, k);
        for (int indexOuterLoop = 0; indexOuterLoop < cycle; indexOuterLoop++) {
            int temp = nums[indexOuterLoop];
            indexInnerLoop = indexOuterLoop;
            do{
                currentPosition = (indexInnerLoop + k) % n;
                int tempVal = nums[currentPosition];
                nums[currentPosition] = temp;
                temp = tempVal;

                indexInnerLoop = currentPosition;
            }while(indexOuterLoop != indexInnerLoop);
        }
    }
}
