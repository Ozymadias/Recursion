package recursion;

public class GCD {
    public static int gcd(int a, int b) {
        return a * b == 0 ? a + b : gcd(a - (b * (a/b)), b - (a * (b/a)));
    }
}
