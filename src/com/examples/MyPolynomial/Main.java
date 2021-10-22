package com.examples.MyPolynomial;

public class Main {
    public static void main(String[] args) {

        MyPolynomial myPolynomial = new MyPolynomial(1.0, 2.0, 3.0);
        System.out.println("myPolynomial = "+myPolynomial.getDegree());
        System.out.println("toString = " + myPolynomial.toString());
        System.out.println("evaluate = " + myPolynomial.evaluate(2.0));
        System.out.println("add = " + myPolynomial.add(new MyPolynomial(1.0,2.0,3.0,4.0)));
        System.out.println("multiply = " + myPolynomial.multiply(new MyPolynomial(1.0,2.0,3.0,4.0)));
    }
}
