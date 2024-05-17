package functional;

import strings.Palindrome;

import java.util.List;

public class AllPalindrome {
    public static boolean allPalindrome(List<String> strings) {
        return strings.stream().allMatch(Palindrome::isPalindrome);
    }
}
