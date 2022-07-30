package edu.remad.javacookbook.regex;

/**
 * String convenience
 */
public class StringConvenience {

  /**
   * main method
   * @param argv the arguments from operating system
   */
  public static void main(String[] argv) {
    String pattern = ".Q[^u]\\d+\\..*";
    String line = "Order QT300. Now!";

    if(line.matches(pattern)) {
      System.out.println(line + " matches \"" + pattern + "\"");
    } else {
      System.out.println("NO MATCH");
    }
  }
}
