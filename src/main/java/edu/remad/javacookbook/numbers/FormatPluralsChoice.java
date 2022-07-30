package edu.remad.javacookbook.numbers;

import java.text.ChoiceFormat;

/**
 * Demonstrates formatting with plural choice
 */
public class FormatPluralsChoice extends FormatPlurals {

  /**
   * ChoiceFormat to just give pluralized word
   */
  static double[] limits = {0, 1, 2};
  static String[] formats = {"reviews", "review", "reviews"};
  static ChoiceFormat pluralizedFormat = new ChoiceFormat(limits, formats);

  /**
   * quantize formatter
   */
  static ChoiceFormat quantizedFormat = new ChoiceFormat(
      "0#no reviews|1#one review|1<many reviews");

  /**
   * The test data for plural formatting
   */
  static int[] data = {-1, 0, 1, 2, 3};

  /**
   * main method to run format plurals
   *
   * @param args arguments from environment
   */
  public static void main(String[] args) {
    System.out.println("Pluralized Format");
    for (int i : data) {
      System.out.println("Found " + i + " " + pluralizedFormat.format(i));
    }

    System.out.println("Quantized Format");
    for (int i : data) {
      System.out.println("Found " + quantizedFormat.format(i));
    }
  }
}
