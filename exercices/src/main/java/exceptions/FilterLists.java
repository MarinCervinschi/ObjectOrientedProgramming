package exceptions;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class FilterLists {
    public static List<List<String>> filterLists(List<List<String>> lists) {
        List<List<String>> ans = new ArrayList<>();
        for (List<String> stringList : lists) {
            try {
                for (String s : stringList) {
                    CheckString.checkString(s);
                }
                ans.add(stringList);
            } catch (ParseException ignored) {

            }
        }
        return ans;
    }
}
