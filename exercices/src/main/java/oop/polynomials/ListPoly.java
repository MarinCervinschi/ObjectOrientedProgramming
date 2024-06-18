package oop.polynomials;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class ListPoly extends AbstractPoly {
    ArrayList<Double> coefficients;

    public ListPoly(double[] coefficients) {
        this.coefficients = new ArrayList<>();
        IntStream.range(0, coefficients.length).forEach(i -> this.coefficients.add(coefficients[i]));
    }

    @Override
    public double coefficient(int c) {
        return coefficients.get(c);
    }

    @Override
    public double[] coefficients() {
        return coefficients.stream().mapToDouble(Double::doubleValue).toArray();
    }

    @Override
    public int degree() {
        return coefficients.size() - 1;
    }

    @Override
    public Poly derivative() {
        return new ListPoly(derive());
    }
}
