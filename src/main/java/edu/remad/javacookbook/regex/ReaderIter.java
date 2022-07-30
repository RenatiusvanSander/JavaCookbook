package edu.remad.javacookbook.regex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Iterates over a string encoded content and prints the matching word
 */
public class ReaderIter {

  /**
   * Main method
   *
   * @param args the arguments from operating system
   */
  public static void main(String[] args) throws IOException {
    Pattern patt = Pattern.compile("[A-Za-z][a-z]+");

    Files.lines(Path.of(args[0])).forEach(line -> {
      Matcher m = patt.matcher(line);
      while (m.find()) {
        int start = m.start(0);

        int end = m.end(0);

        System.out.println(line.substring(start, end));
      }
    });
  }
}
