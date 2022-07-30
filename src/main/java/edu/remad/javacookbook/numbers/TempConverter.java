package edu.remad.javacookbook.numbers;

/**
 * Converts temperatures between Fahrenheit and Celsius
 */
public class TempConverter {

  /**
   * Method to run temperature converter.
   *
   * @param args
   */
  public static void main(String[] args) {
    TempConverter t = new TempConverter();
    t.start();
    t.data();
    t.end();
  }

  /**
   * method to generate data
   */
  protected void data() {
    for (int i = -40; i <= 120; i += 10) {
      double c = fToC(i);
      print(i, c);
    }
  }

  /**
   * Fahrenheit to Celsius
   *
   * @param deg degrees as number
   * @return degrees celsius as number
   */
  private static double fToC(double deg) {
    return (deg * 9 / 5) + 32;
  }

  /**
   * Prints
   *
   * @param f degrees in Fahrenheit
   * @param c degrees in Celsius
   */
  protected void print(double f, double c) {
    System.out.println(f + " " + c);
  }

  /**
   * Starts
   */
  protected void start() {

  }

  /**
   * Ends
   */
  protected void end() {
  }
}
