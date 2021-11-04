package com.examples.MyComplex;

import java.util.Objects;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {

    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return this.real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return this.imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "( " + real + " + " + imag+"i" + " )";
    }
    public boolean isReal() {
        return (imag == 0);
    }

    public boolean isImaginary() {
        return (real == 0);
    }

    public boolean equals(double real, double imag) {
        return (this.real == real && this.imag == imag);
    }

    public boolean equals(MyComplex another) {
        return (another.real == real || another.imag == imag);
    }

    public double magnitude() {
        return Math.sqrt(real*real + imag*imag);
    }
    public double argument() {
        return Math.atan2(imag, real);
    }
    public MyComplex add(MyComplex right) {
        double newReal = real + right.real;
        double newImag = imag + right.imag;
        return new MyComplex(newReal, newImag);
    }
    public MyComplex addNew(MyComplex right) {
        double newReal = this.real + right.real;
        double newImag = this.imag + right.imag;
        return new MyComplex(newReal, newImag);
    }
        public MyComplex substract(MyComplex right) {
            double newReal = real - right.real;
            double newImag = imag - right.imag;
            return new MyComplex(newReal, newImag);
        }
        public MyComplex subtractNew(MyComplex right){
            double newReal = this.real - right.real;
            double newImag = this.imag - right.imag;
            return new MyComplex(newReal, newImag);
        }
        public MyComplex multiply(MyComplex right){
            double newReal = (real * right.real);
            double newImag = (imag * right.imag);
            return new MyComplex(newReal, newImag);
        }

        public MyComplex divide(MyComplex right){
            double anewReal = (real * right.real) + (imag * right.imag);
            double anewImag = (real * right.imag) - (imag * right.real) ;
            MyComplex newComplexNumber = new MyComplex(anewReal, anewImag);
            double denominator = right.real * right.real + right.imag * right.imag;
            double newReal = anewReal/denominator;
            double newImag = anewImag / denominator;
            return new MyComplex(newReal, newImag);
        }

        public MyComplex conjugate(){
            double newImag = -1 * imag;
            return new MyComplex(real,newImag);
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyComplex myComplex = (MyComplex) o;
        return Double.compare(myComplex.real, real) == 0
                && Double.compare(myComplex.imag, imag) == 0;
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31*result + Double.hashCode(real);
        result = 31*result + Double.hashCode(imag);

        return result;
    }
}
