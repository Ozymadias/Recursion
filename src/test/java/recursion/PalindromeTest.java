package recursion;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class PalindromeTest {
    @DataProvider
    private static Object[][] palindromes() {
        return new Object[][]{
                {"abba"},
                {"kajak"},
                {"ala"},
                {"a"},
                {""},
        };
    }

    @Test(dataProvider = "palindromes")
    public void shouldRecognizePalindromes(String palindrome) {
        assertTrue(Palindrome.isPalindrome(palindrome));
    }

    @DataProvider
    private static Object[][] notPalindromes() {
        return new Object[][]{
                {"abbas"},
                {"kajaki"},
                {"hala"},
                {"any non palindrome"},
        };
    }

    @Test(dataProvider = "notPalindromes")
    public void shouldRecognizeNotPalindromes(String notPalindrome) {
        assertFalse(Palindrome.isPalindrome(notPalindrome));
    }

    @DataProvider
    private static Object[][] palindromicArrays() {
        return new Object[][]{
                {new int[]{1, 2, 3, 2, 1}},
                {new int[]{2, 4, 4, 2}},
                {new int[]{2, 2, 2, 2}},
                {new int[]{}},
                {new int[]{7}},
                {new int[]{7, 7}},
                {new int[]{7, 7, 7}},
        };
    }

    @Test(dataProvider = "palindromicArrays")
    public void shouldRecognizePalindromicArrays(int[] palindrome) {
        assertTrue(Palindrome.isPalindrome(palindrome));
    }

    @DataProvider
    private static Object[][] notPalindromicArrays() {
        return new Object[][]{
                {new int[]{1, 2, 3, 4, 5}},
                {new int[]{2, 2, 2, 4}},
                {new int[]{2, 2, 2, 2, 8}},
                {new int[]{3, 4}},
                {new int[]{7, 8, 8}},
        };
    }

    @Test(dataProvider = "notPalindromicArrays")
    public void shouldRecognizeNotPalindromicArrays(int[] notPalindrome) {
        assertFalse(Palindrome.isPalindrome(notPalindrome));
    }
}