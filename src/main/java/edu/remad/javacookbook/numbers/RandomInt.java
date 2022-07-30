package edu.remad.javacookbook.numbers;

import java.util.Random;

/**
 * Demonstrates random numbers
 */
public class RandomInt {

  /**
   * Main method to run randowm numbers examples
   *
   * @param a arguments from environment
   */
  public static void main(String[] a) {
    Random r = new Random();

    for (int i = 0; i < 1000; i++) {
      System.out.println(1 + r.nextInt(10));
    }
  }
}
