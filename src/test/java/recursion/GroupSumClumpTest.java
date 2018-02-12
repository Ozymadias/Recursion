package recursion;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import static recursion.GroupSumClump.groupSumClump;

public class GroupSumClumpTest {

    @DataProvider
    private static Object[][] proper() {
        return new Object[][]{
                {0, new int[]{1, 2, 4, 8, 1}, 14},
                {0, new int[]{2, 4, 8}, 10},
                {0, new int[]{8, 2, 2, 1}, 9},
                {0, new int[]{1}, 1}
        };
    }

    @Test(dataProvider = "proper")
    public void shouldReturnTrueIfCanSumUpToExpectedResult(int start, int[] array, int result) {
        assertTrue(groupSumClump(start, array, result));
    }

    @DataProvider
    private static Object[][] improper() {
        return new Object[][]{
                {0, new int[]{2, 4, 4, 8}, 14},
                {0, new int[]{8, 2, 2, 1}, 11},
                {0, new int[]{9}, 1},
                {0, new int[]{}, 1}
        };
    }

    @Test(dataProvider = "improper")
    public void shouldReturnFalseIfCanNotSumUpToExpectedResult(int start, int[] array, int result) {
        assertFalse(groupSumClump(start, array, result));
    }
}