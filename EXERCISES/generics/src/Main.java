import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /* IterableToString */
        System.out.println("IterableToString: ");
        System.out.println(IterableToString.iterableToString(new ArrayList<>(Arrays.asList(1, 2, 3))));
        System.out.println(IterableToString.iterableToString(new ArrayList<>(List.of("a", "b", "c"))));
        System.out.println();
    }
}