package edu.remad.javacookbook.numbers;

import org.apache.commons.math3.complex.Complex;

/**
 * Complex demo of Apache Common Math3
 */
public class ComplexDemoACM {

  /**
   * main method to run some poperations with complex numbers
   *
   * @param args arguments from environment
   */
  public static void main(String[] args) {
    Complex c = new Complex(3, 5);
    Complex d = new Complex(2, -2);

    System.out.println(c);
    System.out.println(c + ".getReal() = " + c.getReal());
    System.out.println(String.format("%s + %s = %s", c, d, c.add(d)));
    System.out.println(String.format("%s * %s = %s", c, d, c.multiply(d)));
    System.out.println(c.divide(d));
  }
}
