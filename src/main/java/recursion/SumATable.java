package recursion;

public class SumATable {

    public static int sum(int[] array) {
        return sum(0, array);
    }

    private static int sum(int index, int[] array) {
        return array.length == index ? 0 : array[index] + sum(index + 1, array);
    }
}
