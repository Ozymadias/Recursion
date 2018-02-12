package recursion;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static recursion.SumOfNaturalNumbers.sumOfNaturalNumbersTo;

public class SumOfNaturalNumbersTest {
    @DataProvider
    private static Object[][] dpName() {
        return new Object[][]{
                {0, 0},
                {1, 1},
                {2, 3},
                {3, 6},
                {4, 10},
                {5, 15},
                {6, 21},
                {7, 28},
                {8, 36},
                {9, 45},
                {10, 55},
                {11, 66}
        };
    }

    @Test(dataProvider = "dpName")
    public void sumOfNaturalNumbersShouldBeEqualToExpectedResult(int n, int result) {
        Assert.assertEquals(sumOfNaturalNumbersTo(n), result);
    }
}