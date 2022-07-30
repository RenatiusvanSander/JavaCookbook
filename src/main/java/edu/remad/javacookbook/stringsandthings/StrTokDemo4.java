package edu.remad.javacookbook.stringsandthings;

import java.util.StringTokenizer;

public class StrTokDemo4 {

  /**
   * maximal fields as number
   */
  public final static int MAXFIELDS = 5;

  /**
   * the delimeter
   */
  public final static String DELIM = "|";

  /**
   * method to process
   *
   * @param line the line as string content
   * @return the array of strings
   */
  public static String[] process(String line) {
    String[] results = new String[MAXFIELDS];

    StringTokenizer st = new StringTokenizer(line, DELIM, true);

    int i = 0;
    while (st.hasMoreTokens()) {
      String s = st.nextToken();

      if (s.equals(DELIM)) {
        if (i++ >= MAXFIELDS) {
          throw new IllegalArgumentException("Input line " + line + " has too many fields");
        }

        results[i] = s;
      }
    }

    return results;
  }

  /**
   * @param input   input
   * @param outputs several outputs
   */
  public static void printResults(String input, String[] outputs) {
    System.out.println("Input: " + input);

    for (String s : outputs) {
      System.out.println("Output " + s + " was: " + s);
    }
  }

  /**
   * main-method
   *
   * @param args arguments
   */
  public static void main(String[] args) {
    printResults("A|B|C|D", process("A|B|C|D"));
    printResults("A||C|D", process("A||C|D"));
    printResults("A|||D|E", process("A|||D|E"));
  }
}
