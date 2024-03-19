package oop.polynomials;

import java.util.ArrayList;

public class ListPoly extends AbstractPoly{
    ArrayList<Double> coefficients;

    public ListPoly(double[] coefficients) {
        this.coefficients = new ArrayList<>();
        for (double c : coefficients) {
            this.coefficients.add(c);
        }
    }

    @Override
    public double coefficient(int degree) {
        return coefficients.get(degree);
    }

    @Override
    public double[] coefficients() {
        double[] ans = new double[coefficients.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = coefficients.get(i);
        }
        return ans;
    }

    @Override
    public int degree() {
        return coefficients.size() - 1;
    }

    @Override
    public Poly derivative() {
        return new ArrayPoly(derive());
    }
}
