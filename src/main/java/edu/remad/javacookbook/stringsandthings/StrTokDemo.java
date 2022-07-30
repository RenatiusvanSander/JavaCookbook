package edu.remad.javacookbook.stringsandthings;

import java.util.StringTokenizer;

/**
 * Demonstrates the use of {@link StringTokenizer}
 */
public class StrTokDemo {

  /**
   * main-method
   *
   * @param args argument from operating system
   */
  public static void main(String[] args) {
    StringTokenizer st = new StringTokenizer("Hello World of Java");

    while (st.hasMoreTokens()) {
      System.out.println("Token: " + st.nextToken());
    }
  }
}
