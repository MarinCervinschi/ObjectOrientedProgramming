public class Palindrome {
    public static boolean isPalindrome(String string) {
        StringBuilder sb = new StringBuilder(string);
        return sb.reverse().toString().equals(string);
    }
}
