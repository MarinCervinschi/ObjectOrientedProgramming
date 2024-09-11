package oop.polynomials;

import java.util.Arrays;

public class ArrayPoly extends AbstractPoly {
    double[] coefficients;

    public ArrayPoly(double[] coefficients) {
        this.coefficients = coefficients;
    }

    @Override
    public Poly derivative() {
        return new ArrayPoly(derive());
    }

    @Override
    public int degree() {
        return coefficients.length - 1;
    }

    @Override
    public double[] coefficients() {
        return Arrays.copyOf(coefficients, coefficients.length);
    }

    @Override
    public double coefficient(int c) {
        return coefficients[c];
    }
}
