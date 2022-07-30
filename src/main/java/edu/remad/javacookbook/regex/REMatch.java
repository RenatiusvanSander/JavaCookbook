package edu.remad.javacookbook.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REMatch {

  public static void main(String[] argv) {
    String patt = "Q[^u]\\d+\\.";
    Pattern r = Pattern.compile(patt);
    String line = "Order QT300. Now!";
    Matcher m = r.matcher(line);
    if (m.find()) {
      System.out.println(patt + " matches \"" + m.group(0) + "\" in \"" + line + "\"");
    } else {
      System.out.println("NO MATCH");
    }
  }
}
