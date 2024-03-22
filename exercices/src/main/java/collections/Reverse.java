package collections;

import java.util.ArrayDeque;
import java.util.List;

public class Reverse {
    public static List<String> reverse(List<String> sentence) {
        ArrayDeque<String> stack = new ArrayDeque<>();
        for (String s : sentence) {
            stack.addFirst(s);
        }
        return stack.stream().toList();
    }
}
