package recursion;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static recursion.GCD.gcd;

public class GCDTest {
    @DataProvider
    private static Object[][] dp() {
        return new Object[][]{
                {66, 7, 1},
                {66, 14, 2},
                {10, 14, 2},
                {10, 4, 2},
                {66, 33, 33},
                {33, 66, 33},
        };
    }

    @Test(dataProvider = "dp")
    public void shouldReturnProperGreatestCommonDivisor(int a, int b, int gcd) {
        assertEquals(gcd(a, b), gcd);
    }
}