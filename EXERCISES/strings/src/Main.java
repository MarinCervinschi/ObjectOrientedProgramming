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

        // GoodAtTheBeginning
        System.out.println("GoodAtTheBeginning: ");
        System.out.println(GoodAtTheBeginning.goodAtTheBeginning("good Sweet"));
        System.out.println(GoodAtTheBeginning.goodAtTheBeginning(" good Sweet"));
        System.out.println(GoodAtTheBeginning.goodAtTheBeginning("goo"));
        System.out.println();

        // GoodAroundTheBeginning
        System.out.println("GoodAroundTheBeginning: ");
        System.out.println(GoodAroundTheBeginning.goodAroundTheBeginning("good Sweet"));
        System.out.println(GoodAroundTheBeginning.goodAroundTheBeginning("_good Sweet"));
        System.out.println(GoodAroundTheBeginning.goodAroundTheBeginning("__good Sweet"));
        System.out.println(GoodAroundTheBeginning.goodAroundTheBeginning("goo"));
        System.out.println();

        // RemoveFirstLast
        System.out.println("RemoveFirstLast: ");
        System.out.println(RemoveFirstLast.removeFirstLast("google"));
        System.out.println(RemoveFirstLast.removeFirstLast("aenema"));
        System.out.println(RemoveFirstLast.removeFirstLast("FF"));
        System.out.println(RemoveFirstLast.removeFirstLast("F"));
        System.out.println();

        // DuplicateChars
        System.out.println("DuplicateChars: ");
        System.out.println(DuplicateChars.duplicateChars("whistleblower"));
        System.out.println(DuplicateChars.duplicateChars("ss"));
        System.out.println(DuplicateChars.duplicateChars("s"));
        System.out.println(DuplicateChars.duplicateChars(""));
        System.out.println();

        // Palindrome
        System.out.println("Palindrome: ");
        System.out.println(Palindrome.isPalindrome("whistleblower"));
        System.out.println(Palindrome.isPalindrome("radar"));
        System.out.println(Palindrome.isPalindrome("r"));
        System.out.println(Palindrome.isPalindrome(""));
        System.out.println();

        // CountYZ
        System.out.println("CountYZ: ");
        System.out.println(CountYZ.countYZ("fez day"));
        System.out.println(CountYZ.countYZ("day fez"));
        System.out.println(CountYZ.countYZ("day fyyyz"));
        System.out.println();

        // EqualIsNot
        System.out.println("EqualIsNot: ");
        System.out.println(EqualIsNot.equalIsNot("This is not"));
        System.out.println(EqualIsNot.equalIsNot("This is notnot"));
        System.out.println(EqualIsNot.equalIsNot("noisxxnotyynotxisi"));
        System.out.println();

        //  SumDigits
        System.out.println("SumDigits: ");
        System.out.println(SumDigits.sumDigits("aa1bc2d3"));
        System.out.println(SumDigits.sumDigits("aa11b33"));
        System.out.println(SumDigits.sumDigits("Chocolate"));
        System.out.println();

    }
}