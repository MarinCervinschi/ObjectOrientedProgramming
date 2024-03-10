package oop.basic;

import java.util.Objects;

/**
 * A class RationalNumber representing a rational number.
 */
public class RationalNumber {
    final int numerator;
    final int denominator;

    /**
     * A method to find the greatest common divisor between two numbers.
     * @param a the firs number
     * @param b the second number
     * @return the gcd
     */
    static int greatestCommonDivisor(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        int rest = max % min;
        if (max % min == 0) {
            return min;
        } else {
            return greatestCommonDivisor(min, rest);
        }
    }

    /**
     * A method to find the least common multiple between two numbers
     * @param a the first number
     * @param b the second number
     * @return the lcm
     */
    static int leastCommonMultiple(int a, int b) {
        return Math.abs(a * b) / greatestCommonDivisor(a, b);
    }

    /**
     * Creating the rational number. Before creating the object, numerator and denominator have to be simplified
     * @param numerator the numerator
     * @param denominator the denominator
     */
    public RationalNumber(int numerator, int denominator) {
        int gcd = greatestCommonDivisor(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    /**
     *
     * @return numerator
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     *
     * @return denominator
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * Return the sum of two Rational Number
     * @param o the Rational number to be added
     * @return the sum
     */
    public RationalNumber add(RationalNumber o) {
        int den = leastCommonMultiple(denominator, o.getDenominator());
        int num = (den / denominator * numerator) +
                (den / o.denominator * o.getDenominator());
        return new RationalNumber(num, den);
    }

    /**
     * Return the multiplication of two Rational Numbers
     * @param o the second Rational Number
     * @return the new Number
     */
    public RationalNumber multiply(RationalNumber o) {
        int num = numerator * o.getNumerator();
        int den = denominator * o.getDenominator();
        return new RationalNumber(num, den);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        RationalNumber that = (RationalNumber) o;
        return numerator == that.numerator && denominator == that.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }
    @Override
    public String toString() {
        return "Rational{" + "numerator=" + numerator + ", denominator=" + denominator + '}';
    }
}
