package oop.polynomials;

public interface Poly {
    double coefficient(int degree);
    double[] coefficients();
    int degree();
    Poly derivative();
}
