package oop.polynomials;

import java.util.Objects;
import java.util.stream.IntStream;

public abstract class AbstractPoly implements Poly {
    protected double[] derive() {
        if (degree() == 0) {
            return new  double[]{0.0};
        }
        return IntStream.range(1, degree() + 1)
                .mapToDouble(i -> coefficient(i) * i).toArray();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(coefficients());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (!(o instanceof Poly p)) {
            return false;
        }
        if (degree() != p.degree()) {
            return false;
        }
        for (int i = 0; i <= degree(); i++) {
            if (coefficient(i) != p.coefficient(i)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < degree(); i++) {
            sb.append(coefficient(i)).append("x^").append(i).append(" + ");
        }
        sb.append(coefficient(degree())).append("x^").append(degree());
        return sb.toString();
    }

}
