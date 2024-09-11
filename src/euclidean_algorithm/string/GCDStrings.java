package euclidean_algorithm.string;
/*
* 1071. Greatest Common Divisor of Strings
* ========================================
* For two strings s and t, we say "t divides s" if and only
* if s = t + t + t + ... + t + t (i.e., t is concatenated with itself
* one or more times).
* Given two strings str1 and str2, return the largest string x such that
* x divides both str1 and str2.
* Example 1:
* Input: str1 = "ABCABC", str2 = "ABC"
* Output: "ABC"
* */
public class GCDStrings {
    public static String gcdOfStrings(String str1, String str2) {
       if(!(str1+str2).equals(str2+str1)) {
           return "";
       }

       int output = gcd(str1.length(), str2.length());

       StringBuilder sb = new StringBuilder();
       for(int i = 0; i < output; i++) {
           sb.append(str1.charAt(i));
       }
       return sb.toString();
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
