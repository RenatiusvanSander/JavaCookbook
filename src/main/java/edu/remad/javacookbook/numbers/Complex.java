package edu.remad.javacookbook.numbers;

/**
 *
 */
public class Complex {

  /**
   * real part
   */
  private double r;

  /**
   * imaginary part
   */
  private double i;

  /**
   * Constructor
   *
   * @param rr real number part
   * @param it imaginary number part
   */
  Complex(double rr, double it) {
    this.r = rr;
    this.i = it;
  }

  /**
   * Adds two complex numbers
   *
   * @param c1 first complex number
   * @param c2 second complex number
   * @return complex number of addition
   */
  public static Complex add(Complex c1, Complex c2) {
    return new Complex(c1.r + c2.r, c1.i + c2.i);
  }

  /**
   * Substracts two complex numbers
   *
   * @param c1 first complex number
   * @param c2 second complex number
   * @return complex number of substraction
   */
  public static Complex substract(Complex c1, Complex c2) {
    return new Complex(c1.r - c2.r, c1.i - c2.i);
  }

  /**
   * Multiplies two complex numbers
   *
   * @param c1 first complex number
   * @param c2 second complex number
   * @return result is a complex number
   */
  public static Complex multiply(Complex c1, Complex c2) {
    return new Complex(c1.r * c2.r - c1.i * c2.i, c1.r * c2.i + c1.i * c2.r);
  }

  /**
   * Divides two complex numbers
   *
   * @param c1 first complex number
   * @param c2 second complex number
   * @return result is a complex number of division
   */
  public static Complex divide(Complex c1, Complex c2) {
    return new Complex((c1.r * c2.r + c1.i * c2.i) / (c2.r * c2.i + c2.i * c2.i),
        (c1.i * c2.r - c1.r * c2.i) / (c2.r * c2.r + c2.i * c2.i));
  }

  /**
   * To string method
   *
   * @return this instance as {@link String}
   */
  public String toString() {
    StringBuilder sb = new StringBuilder();

    if (i > 0) {
      sb.append('+');
    }

    return sb.append(i).append('i').toString();
  }

  /**
   * Gets real part
   *
   * @return reap part of complemx number
   */
  public double getReal() {
    return r;
  }

  /**
   * Gets imaginary part
   *
   * @return imaginary number of complex number
   */
  public double getImaginary() {
    return i;
  }

  /**
   * Gets magnitude
   *
   * @return magnitude of the real part
   */
  public double magnitude() {
    return Math.sqrt(r * r + i * i);
  }

  /**
   * Adds complex numbers
   *
   * @param other complex number to add
   * @return result as complex number of addition
   */
  public Complex add(Complex other) {
    return add(this, other);
  }

  /**
   * Substracts complex numbers
   *
   * @param other complex number to substract
   * @return result of substracting two complex numbers
   */
  public Complex subtract(Complex other) {
    return substract(this, other);
  }

  /**
   * Multiplies two complex numbers.
   *
   * @param other complex number to multiply
   * @return result of multiplication of two complex numbers
   */
  public Complex multiply(Complex other) {
    return multiply(this, other);
  }

  /**
   * Validates equality
   *
   * @param o complex number to compare
   * @return true / false for is equal
   */
  public boolean equals(Object o) {
    if (o.getClass() != Complex.class) {
      throw new IllegalArgumentException("Complex.equals argument must be a Complex");
    }

    Complex other = (Complex) o;

    return r == other.r && i == other.i;
  }

  /**
   * Calculates hash code
   *
   * @return hash code
   */
  public int hashCode() {
    return (int) (r) | (int) i;
  }
}
