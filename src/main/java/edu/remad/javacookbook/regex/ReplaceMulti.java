package edu.remad.javacookbook.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Replaces several expressions
 */
public class ReplaceMulti {

  /**
   * Main method
   *
   * @param argv the arguments from operating system
   */
  public static void main(String[] argv) {
    Pattern patt = Pattern.compile("cat|dog");
    String line = "The cat and the dog never got along well";
    System.out.println("Input: " + line);
    Matcher matcher = patt.matcher(line);

    while(matcher.find()) {
      String found = matcher.group(0);
      String replacement = computeReplacement(found);
      line= matcher.replaceFirst(replacement);
      matcher.reset(line);
    }

    System.out.println("Final: " + line);
  }

  private static String computeReplacement(String in) {
    switch(in) {
      case "cat": return "feline";
      case "dog": return "canine";
      default: return  "aniumal";
    }
  }
}
