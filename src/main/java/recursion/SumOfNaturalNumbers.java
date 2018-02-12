package recursion;

public class SumOfNaturalNumbers {
    static int sumOfNaturalNumbersTo(int n) {
        return n == 0 ? 0 : sumOfNaturalNumbersTo(n - 1) + n;
    }
}
