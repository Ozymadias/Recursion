package recursion;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumATableTest {
    @DataProvider
    private static Object[][] dp() {
        return new Object[][]{
                {new int[]{1, 2, 3, 4, 5}, 15},
                {new int[]{2, 2, 2, 4}, 10},
                {new int[]{2, 2, 2, 2}, 8},
                {new int[]{}, 0},
                {new int[]{7}, 7},
        };
    }

    @Test(dataProvider = "dp")
    public void name(int[] array, int sum) {
        Assert.assertEquals(SumATable.sum(array), sum);
    }
}