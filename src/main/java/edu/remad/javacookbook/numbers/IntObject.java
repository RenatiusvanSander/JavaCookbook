package edu.remad.javacookbook.numbers;

/**
 * Demonstrates int to Object conversion.
 */
public class IntObject {

  /**
   * Method to demonstrates int to Integer
   *
   * @param args arguments from environment
   */
  public static void main(String[] args) {
    Integer i1 = Integer.valueOf(42);
    System.out.println(i1.toString());

    int i2 = i1.intValue();
    System.out.println(i2);
  }
}
