package euclidean_algorithm;

import java.util.ArrayList;
import java.util.List;

public class ReplaceNonCoPrime {
    public static List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> nonCoPrimeList = new ArrayList<>();
        for (int num : nums) {
            nonCoPrimeList.add(num);


            while (nonCoPrimeList.size() > 1) {
                int a = nonCoPrimeList.get(nonCoPrimeList.size() - 1);
                int b = nonCoPrimeList.get(nonCoPrimeList.size() - 2);

                if (isNonCoPrime(a, b)) {
                    int merged = lcm(a, b);
                    nonCoPrimeList.set(nonCoPrimeList.size() - 2, merged);
                    nonCoPrimeList.remove(nonCoPrimeList.size() - 1);

                } else {
                    break;
                }
            }
        }
        return nonCoPrimeList;
    }

    public static boolean isNonCoPrime(int a, int b) {
        return gcd(a,b) > 1;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return  (a/ gcd(a,b))*b;
    }
}
