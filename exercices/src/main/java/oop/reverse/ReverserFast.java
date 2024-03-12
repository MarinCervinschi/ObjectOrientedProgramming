package oop.reverse;

public class ReverserFast implements Reverser{
    public String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
