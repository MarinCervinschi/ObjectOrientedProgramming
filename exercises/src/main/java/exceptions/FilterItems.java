package exceptions;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class FilterItems {

    public static List<String> filterItems(List<String> strings) {
        List<String> ans = new ArrayList<>();
        for (String s : strings) {
            try {
                CheckString.checkString(s);
                ans.add(s);
            } catch (ParseException ignored) {

            }
        }
        return ans;
    }
}
