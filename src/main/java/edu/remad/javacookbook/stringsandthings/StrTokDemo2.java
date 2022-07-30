package edu.remad.javacookbook.stringsandthings;

import java.util.StringTokenizer;

public class StrTokDemo2 {

  /**
   * main-method
   *
   * @param args argument from operating system
   */
  public static void main(String[] args) {
    StringTokenizer st = new StringTokenizer("Hello, World|of|Java", ", |");

    while (st.hasMoreElements()) {
      System.out.println("Token: " + st.nextElement());
    }
  }
}
