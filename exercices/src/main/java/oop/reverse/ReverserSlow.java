package oop.reverse;

public class ReverserSlow implements Reverser {
    public String reverse(String s) {
        char[] ans = new char[s.length()];
        int i = s.length() - 1;
        for (char c : s.toCharArray()) {
            ans[i--] += c;
        }
        return String.valueOf(ans);
    }
}
