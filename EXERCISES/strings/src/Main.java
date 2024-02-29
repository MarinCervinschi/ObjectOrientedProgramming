public class Main {
    public static void main(String[] args) {

        // Concatenate
        System.out.println("Concatenate: ");
        System.out.println(Concatenate.concatenate(new String[]{"Hello", " ", "World!"}));
        System.out.println(Concatenate.concatenate(new String[]{"H", "e", "llo", " ", "World!"}));
        System.out.println(Concatenate.concatenate(new String[]{"Hello World", "!"}));
        System.out.println();

        // Reverse
        System.out.println("Reverse: ");
        System.out.println(Reverse.reverse("String test"));
        System.out.println(Reverse.reverse("John Doe"));
        System.out.println(Reverse.reverse("Hello World!"));
        System.out.println();

        // RemoveFirstTwoChars
        System.out.println("RemoveFirstTwoChars: ");
        System.out.println(RemoveFirstTwoChars.removeFirstTwoChars("Hello World!"));
        System.out.println(RemoveFirstTwoChars.removeFirstTwoChars("No"));
        System.out.println(RemoveFirstTwoChars.removeFirstTwoChars("Y"));
        System.out.println();

        // RemoveFirstTwoCharsIf
        System.out.println("RemoveFirstTwoCharsIf: ");
        System.out.println(RemoveFirstTwoCharsIf.removeFirstTwoCharsIf("Hello World!"));
        System.out.println(RemoveFirstTwoCharsIf.removeFirstTwoCharsIf("Good World!"));
        System.out.println(RemoveFirstTwoCharsIf.removeFirstTwoCharsIf("Ho"));
        System.out.println(RemoveFirstTwoCharsIf.removeFirstTwoCharsIf("Ne"));
        System.out.println(RemoveFirstTwoCharsIf.removeFirstTwoCharsIf("Y"));
        System.out.println();
//
//        // GoodAtTheBeginning
//        System.out.println("GoodAtTheBeginning: ");
//        System.out.println();
//
//        // GoodAroundTheBeginning
//        System.out.println("GoodAroundTheBeginning: ");
//        System.out.println();
//
//        // RemoveFirstLast
//        System.out.println("RemoveFirstLast: ");
//        System.out.println();
//
//        // DuplicateChars
//        System.out.println("DuplicateChars: ");
//        System.out.println();
//
//        // Palindrome
//        System.out.println("Palindrome: ");
//        System.out.println();
//
//        // CountYZ
//        System.out.println("CountYZ: ");
//        System.out.println();

//        // EqualIsNot
//        System.out.println("EqualIsNot: ");
//        System.out.println();

//        //  SumDigits
////        System.out.println("SumDigits: ");
////        System.out.println();


    }
}