package edu.remad.javacookbook.stringsandthings;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class DeTab {

  Tabs ts;

  /**
   * Constructor
   *
   * @param n the number
   */
  public DeTab(int n) {
    ts = new Tabs(n);
  }

  /**
   * Constructor
   */
  public DeTab() {
    ts = new Tabs();
  }

  /**
   * Main method
   *
   * @param args the arguments from operating system.
   */
  public static void main(String[] args) {
    DeTab dt = new DeTab(8);
    dt.detab(new BufferedReader(new InputStreamReader(System.in)), new PrintWriter(System.out));
  }

  /**
   * De tabs
   *
   * @param is  input stream of the {@link BufferedReader}
   * @param out out stream of {@link PrintWriter}
   */
  public void detab(BufferedReader is, PrintWriter out) {
    is.lines().forEach(line -> {
      out.println(detabLine(line));
    });
  }

  /**
   * De tabs line
   *
   * @param line the line
   * @return the modified string
   */
  private String detabLine(String line) {
    char c;
    int col = 0;
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < line.length(); i++) {
      if ((c = line.charAt(i)) != '\t') {
        sb.append(c);
        ++col;
        continue;
      }

      do {
        sb.append(' ');
      } while (!ts.isTabStop(++col));
    }

    return sb.toString();
  }
}
