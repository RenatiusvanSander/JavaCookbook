package edu.remad.javacookbook.numbers;

import java.text.NumberFormat;

/**
 * Demonstrates number formatting
 */
public class NumFormat2 {

  /**
   * the data to show
   */
  public static final double data[] = {0, 1, 22d / 7, 100.2345678};

  /**
   * Main method to run number format example
   *
   * @param argv arguments from environment
   */
  public static void main(String[] argv) {
    NumberFormat form = NumberFormat.getInstance();

    // Set it to look like 999.99[99]
    form.setMinimumIntegerDigits(3);
    form.setMinimumFractionDigits(2);
    form.setMaximumFractionDigits(4);

    // Now print using it
    for (int i = 0; i < data.length; i++) {
      System.out.println(data[i] + "\tformat as " + form.format(data[i]));
    }
  }
}
