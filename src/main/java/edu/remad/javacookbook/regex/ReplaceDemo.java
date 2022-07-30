package edu.remad.javacookbook.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Demonstrates replace by regex
 */
public class ReplaceDemo {

  /**
   * Main method
   *
   * @param argv the arguments from operating system
   */
  public static void main(String[] argv) {
    // Make an RE pattern to match as a word only (\b=word boundary)
    String patt = "\\bfavor\\b";

    // A test input
    String input = "Do me a favor? Fetch my favorite.";
    System.out.println("Input: " + input);

    // Run it from a RE instance and see that it works
    Pattern r = Pattern.compile(patt);
    Matcher m = r.matcher(input);
    System.out.println("ReplaceAll: " + m.replaceAll("favour"));

    // Show appendReplacement method
    m.reset();
    StringBuilder sb = new StringBuilder();
    System.out.println("Append methods: ");
    while (m.find()) {
      m.appendReplacement(sb, "favour");
    }
    m.appendTail(sb);
    System.out.println(sb.toString());
  }

}
