package edu.remad.javacookbook.stringsandthings;

/**
 * Demonstrates string is stepped through by character at
 */
public class StrCharAt {

  /**
   *
   * @param args the arguments, empty array
   */
  public static void main(String[] args) {
    String a = "A quick bronze fox";
    for (int i = 0; i < a.length(); i++) {
      String message = String.format("charAt is '%c', codePointAt is %3d, casted it's '%c'",
          a.charAt(i), a.codePointAt(i), (char) a.codePointAt(i));
      System.out.println(message);
    }
  }
}
