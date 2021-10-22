package com.examples.MyPolynomial;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }
    public int getDegree() {
        return coeffs.length-1;
    }
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(Double.toString(coeffs[coeffs.length-1]) + "x^" + Double.toString(coeffs.length-1));
        for (int i = coeffs.length-2; i>0; --i) {
            if (coeffs[i] == 0)
                continue;
            if (coeffs[i]>0)
                builder.append("+");

            builder.append(Double.toString(coeffs[i]) + "x");
            if (i != 1)
                builder.append("^" + i);
        }
        if (coeffs[0] != 0) {
            if (coeffs[0]>0)
                builder.append("+");
            builder.append(Double.toString(coeffs[0]));
        }
        return builder.toString();

    }
    public double evaluate(double x)
    {
        double sum  = 0.0;
        double item = 1.0;
        for (int i = 0; i < coeffs.length; i++) {
            item *= (i == 0 ? 1.0 : x);
            sum  += item * coeffs[i] ;
        }
        return sum;
    }

    public MyPolynomial add(MyPolynomial right) {
        double[] newCoeffs = new double[Math.max(coeffs.length, right.coeffs.length)];
        for (int i = 0; i < coeffs.length; ++i)
            newCoeffs[i] += coeffs[i];
        for (int i = 0; i < right.coeffs.length; ++i)
            newCoeffs[i] += right.coeffs[i];
        return new MyPolynomial(newCoeffs);
    }
    public MyPolynomial multiply(MyPolynomial right) {
        double[] newCoeffs = new double[coeffs.length + right.coeffs.length];
        for (int i = 0; i < coeffs.length; ++i) {
            for (int j = 0; j < right.coeffs.length; ++j)
                newCoeffs[i + j] += coeffs[i] * right.coeffs[j];
        }
        return new MyPolynomial(newCoeffs);
    }
}
