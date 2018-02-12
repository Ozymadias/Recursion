package recursion;

public class Palindrome {
    public static boolean isPalindrome(String string) {
        int length = string.length();
        return length <= 1 || (string.charAt(0) == string.charAt(length - 1) && isPalindrome(string.substring(1, length - 1)));
    }

    public static boolean isPalindrome(int[] array) {
        return isPalindrome(0, array);
    }

    private static boolean isPalindrome(int index, int[] array) {
        int length = array.length;
        return index == length || (array[index] == array[length - 1 - index] && isPalindrome(index + 1, array));
    }
}
