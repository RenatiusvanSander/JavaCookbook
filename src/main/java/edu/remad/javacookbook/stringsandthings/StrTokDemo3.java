package edu.remad.javacookbook.stringsandthings;

import java.util.StringTokenizer;

public class StrTokDemo3 {

  /**
   * main-method
   *
   * @param args argument from operating system
   */
  public static void main(String[] args) {
    StringTokenizer st = new StringTokenizer("Hello, World|of|Java", ", |", true);

    while (st.hasMoreElements()) {
      System.out.println("Token: " + st.nextElement());
    }
  }
}
