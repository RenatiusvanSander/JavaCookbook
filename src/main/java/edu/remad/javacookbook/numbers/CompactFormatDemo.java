package edu.remad.javacookbook.numbers;

import java.text.NumberFormat;
import java.text.ParseException;

/**
 * Demonstrates compact formatting of numbers
 */
public class CompactFormatDemo {

  /**
   * number of this demo
   */
  static final Number[] nums = {0, 1, 1.25, 1234, 12345, 123456.78, 123456789012L};

  /**
   * numbers encoded as strings
   */
  static final String[] strs = {"1", "1.25", "1234", "12.345K", "123456.78", "123456789012L"};

  /**
   * Main methodto run compact formatting demo.
   *
   * @param args arguments from environment
   */
  public static void main(String[] args) throws ParseException {
    NumberFormat cnf = NumberFormat.getNumberInstance();
    System.out.println("Formatting:");
    for (Number n : nums) {
      cnf.setParseIntegerOnly(false);
      cnf.setMinimumFractionDigits(2);
      System.out.println(n + ": " + cnf.format(n));
    }
    System.out.println("Parsing:");

    for (String s : strs) {
      System.out.println(s + ": " + cnf.parse(s));
    }
  }
}
