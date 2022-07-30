package edu.remad.javacookbook.numbers;

/**
 * Demonstrates java's autoboxing of number types
 */
public class AutoboxDemo {

  /**
   * method to run demonstration
   *
   * @param args arguments from environment. E.g operating system
   */
  public static void main(String[] args) {
    int i = 42;
    int result = foo(i);
    System.out.println(result);
  }

  /**
   * Does nothing. java does autobox of int to Integer.
   *
   * @param i number to autobox
   * @return the autoboxed Integer
   */
  private static Integer foo(int i) {
    return i;
  }
}
