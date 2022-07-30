package edu.remad.javacookbook.regex;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Grep programmed with java NIO
 */
public class GrepNIO {

  /**
   * Main method
   *
   * @param args the arguments from operating system
   */
  public static void main(String[] args) throws IOException {
    if (args.length < 2) {
      System.err.println("Usage: GrepNIO patt file [...]");
      System.exit(1);
    }

    Pattern p = Pattern.compile(args[0]);
    for (int i = 1; i < args.length; i++) {
      process(p, args[i]);
    }
  }

  /**
   * Method to process
   *
   * @param pattern  the compiled pattern
   * @param fileName the string encoded argument
   */
  private static void process(Pattern pattern, String fileName) throws IOException {
    FileInputStream fis = new FileInputStream(fileName);
    FileChannel fc = fis.getChannel();

    ByteBuffer buf = fc.map(MapMode.READ_ONLY, 0, fc.size());

    CharBuffer cbuf = StandardCharsets.ISO_8859_1.newDecoder().decode(buf);

    Matcher m = pattern.matcher(cbuf);
    while (m.find()) {
      System.out.println(m.group(0));
    }
    fis.close();
  }
}
