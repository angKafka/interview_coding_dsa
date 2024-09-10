package concept;

public class LcmNumber {
    public static int lcm(int a, int b) {
        return  (a*b)/EuclideanGCD.gcd(a,b);
    }
}
