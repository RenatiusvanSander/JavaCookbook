package edu.remad.javacookbook.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Demonstrates a second replace of strings by a regex.
 */
public class ReplaceDemo2 {

  /**
   * Main method
   *
   * @param argv the arguments from operating system
   */
  public static void main(String[] argv) {
    // Make an RE pattern
    String patt = "(\\w+)\\s+(\\w+)";

    // A test input
    String input = "Ian Darwin";
    System.out.println("Input: " + input);

    // Run it from a RE instance and see that it works
    Pattern r = Pattern.compile(patt);
    Matcher m = r.matcher(input);
    m.find();
    System.out.println("Replaced: " + m.replaceFirst("$2, $1"));
  }
}
