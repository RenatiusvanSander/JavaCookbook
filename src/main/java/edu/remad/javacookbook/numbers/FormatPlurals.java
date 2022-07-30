package edu.remad.javacookbook.numbers;

/**
 * Formats plurals
 */
public class FormatPlurals {

  /**
   * Main method
   *
   * @param args arguments form environment
   */
  public static void main(String[] args) {
    report(0);
    report(1);
    report(2);
  }

  /**
   * Reports
   *
   * @param n the number
   */
  public static void report(int n) {
    System.out.println("We used" + n + " item" + (n == 1 ? "" : "s"));
  }
}
