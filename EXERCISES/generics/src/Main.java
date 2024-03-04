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

        /* Divide */
        System.out.println("Divide: ");
        System.out.println(Divide.divide(4, 2));
        System.out.println(Divide.divide(4.0, 2));
        System.out.println(Divide.divide(4, 2.0));
        System.out.println();

        /* Append */
        System.out.println("Append: ");
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3,4));
        Append.append(list1, list2);
        System.out.println(list1);
        ArrayList<String> list3 = new ArrayList<>(List.of("a", "c"));
        ArrayList<String> list4 = new ArrayList<>(List.of("c", "d"));
        Append.append(list3, list4);
        System.out.println(list3);
        System.out.println();

        /* AppendBounded */
        System.out.println("AppendBounded: ");
        AppendBounded.append(list1, list2);
        System.out.println(list1);
        System.out.println();

        /* Reverse */
        System.out.println("Reverse: ");
        ArrayList<Integer> list5 = new ArrayList<>(Arrays.asList(1,2));

        Reverse.reverse(list5);
        System.out.println(list5);

        ArrayList<Integer> list6 = new ArrayList<>(Arrays.asList(1,2, 3, 4));
        Reverse.reverse(list6);
        System.out.println(list6);

        ArrayList<String> list7 = new ArrayList<>(List.of("hello", "world"));
        Reverse.reverse(list7);
        System.out.println(list7);
        System.out.println();


    }
}