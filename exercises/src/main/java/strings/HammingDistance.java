package strings;

public class HammingDistance {
    public static int hammingDistance(String s1, String s2) {
        if (s1.length() != s2.length()) {
            throw new IllegalArgumentException("String lengths must be equal");
        }
        int ans = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                ans++;
            }
        }
        return ans;
    }
}
