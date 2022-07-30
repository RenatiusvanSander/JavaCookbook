package edu.remad.javacookbook.numbers;

import edu.remad.javacookbook.numbers.TempConverter;

/**
 * Converts temperatures between Fahrenheit and Celsius
 */
public class TempConverter2 extends TempConverter {

  /**
   * method to run temperature converter
   *
   * @param args arguments from environment
   */
  public static void main(String[] args) {
    TempConverter t = new TempConverter2();
    t.start();
    t.data();
    t.end();
  }

  @Override
  protected void print(double f, double c) {
    System.out.printf("%6.2f %6.2f%n", f, c);
  }

  @Override
  protected void start() {
    System.out.println("Fahr    Centigrade");
  }

  @Override
  protected void end() {
    System.out.println("-----------");
  }
}
