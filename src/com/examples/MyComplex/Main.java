package com.examples.MyComplex;

public class Main {
    public static void main(String[] args)
    {
        MyComplex myComplex = new MyComplex();
        System.out.println("Number 1 = "+ myComplex);
        System.out.println("getReal = " + myComplex.getReal());
        myComplex.setReal(1.0);
        System.out.println("new getReal = " + myComplex.getReal());
        System.out.println("getImag = " + myComplex.getImag());
        myComplex.setImag(1.0);
        System.out.println("new getImag = " + myComplex.getImag());
        myComplex.setValue(2.0, 3.0);
        System.out.println("toString = " + myComplex.toString());
        System.out.println(myComplex + " is "+(myComplex.isReal() ? "yes" : "no")+" real number");
        System.out.println(myComplex + " is "+(myComplex.isImaginary() ? "yes" : "no")+" imaginary number");
        System.out.println("equals = " + myComplex.equals(1.2, 1.9));
        System.out.println("equals2 = " + myComplex.equals(new MyComplex(1.3,3.0)));
        System.out.println("magnitude = " + myComplex.magnitude());
        System.out.println("argument = " + myComplex.argument());
        System.out.println("add = " + myComplex.add(new MyComplex(3.3,3.5)));
        System.out.println("addNew = " + myComplex.addNew(new MyComplex(3.7,3.0)));
        System.out.println("subtract = " + myComplex.substract(new MyComplex(1.0,7.0)));
        System.out.println("subtractNew = " + myComplex.subtractNew(new MyComplex(1.3,3.0)));
        System.out.println("multiply = " + myComplex.multiply(new MyComplex(6.0,4.0)));
        System.out.println("divide = " + myComplex.divide(new MyComplex(1.0,3.0)));
        System.out.println("conjugate = " + myComplex.conjugate());
        System.out.println("_____________");


        MyComplex myComplex2 = new MyComplex(4.0, 5.0);
        System.out.println("Number 1 = "+ myComplex2);
        System.out.println("getReal = " + myComplex2.getReal());
        myComplex2.setReal(1.0);
        System.out.println("new getReal = " + myComplex2.getReal());
        System.out.println("getImag = " + myComplex2.getImag());
        myComplex2.setImag(1.0);
        System.out.println("new getImag = " + myComplex2.getImag());
        myComplex2.setValue(2.0, 3.0);
        System.out.println("toString = " + myComplex2.toString());
        System.out.println(myComplex2 + " is "+(myComplex2.isReal() ? "yes" : "no")+" real number");
        System.out.println(myComplex2 + " is "+(myComplex2.isImaginary() ? "yes" : "no")+" imaginary number");
        System.out.println("equals = " + myComplex2.equals(1.2, 1.9));
        System.out.println("equals2 = " + myComplex2.equals(new MyComplex(1.3,3.0)));
        System.out.println("magnitude = " + myComplex2.magnitude());
        System.out.println("argument = " + myComplex2.argument());
        System.out.println("add = " + myComplex2.add(new MyComplex(3.3,3.5)));
        System.out.println("addNew = " + myComplex2.addNew(new MyComplex(3.7,3.0)));
        System.out.println("subtract = " + myComplex2.substract(new MyComplex(1.0,7.0)));
        System.out.println("subtractNew = " + myComplex2.subtractNew(new MyComplex(1.3,3.0)));
        System.out.println("multiply = " + myComplex2.multiply(new MyComplex(6.0,4.0)));
        System.out.println("divide = " + myComplex2.divide(new MyComplex(1.0,3.0)));
        System.out.println("conjugate = " + myComplex2.conjugate());
        System.out.println("_____________");


    }
}
