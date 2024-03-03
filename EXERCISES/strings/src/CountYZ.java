public class CountYZ {
    public static int countYZ(String string) {
        int count = 0;
        int len = string.length();
        for (int i = 0; i < len; i++) {
            if ((string.charAt(i) == 'y' || string.charAt(i) == 'z') &&
                    (i + 1 != len && string.charAt(i + 1) == 0x20) || i + 1 == len){
                count++;
            }
        }
        return count;
    }
}
