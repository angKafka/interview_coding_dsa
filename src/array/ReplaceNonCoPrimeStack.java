package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReplaceNonCoPrimeStack {
    public static List<Integer> replaceNonCoprimes(int[] nums) {
        Stack<Integer> stack = new Stack<>();

        for (int index=0; index < nums.length; index++) {
            stack.push(nums[index]);

            while (stack.size() > 1) {
                int b = stack.pop();
                int a = stack.pop();

                if (gcd(a,b) > 1) {
                    int merged = lcm(a, b);
                    stack.push(merged);
                } else {
                    stack.push(a);
                    stack.push(b);
                    break;
                }
            }
        }
        return new ArrayList<>(stack);
    }

    public static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, (a % b));
    }

    public static int lcm(int a, int b) {
        return  (a/ gcd(a,b))*b;
    }
}
