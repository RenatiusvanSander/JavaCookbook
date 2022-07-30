package edu.remad.javacookbook.stringsandthings;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.logging.Logger;

public class Entab {

  /**
   * the logger
   */
  private static Logger logger = Logger.getLogger(Entab.class.getSimpleName());

  /**
   * the tabs logic handler
   */
  protected Tabs tabs;

  /**
   * Constructor
   *
   * @param n the number
   */
  public Entab(int n) {
    tabs = new Tabs(n);
  }

  /**
   * Constructor
   */
  public Entab() {
    tabs = new Tabs();
  }

  /**
   * Delegates tab spacing information to tabs
   *
   * @return the tabs spacing as number
   */
  public int getTabSpacing() {
    return tabs.getTabSpacing();
  }

  /**
   * En tabs
   *
   * @param is  input stream of {@link BufferedReader}
   * @param out the out stream of {@link PrintWriter}
   * @throws Exception
   */
  public void entab(BufferedReader is, PrintWriter out) throws Exception {
    is.lines().forEach(line -> {
      out.println(entabLine(line));
    });
  }

  /**
   * Entabs line
   *
   * @param line the line as {@link String}
   * @return the modified line
   */
  public String entabLine(String line) {
    int N = line.length();
    int outCol = 0;
    StringBuilder sb = new StringBuilder();
    char ch;
    int consumedSpaces = 0;

    for (int inCol = 0; inCol < N; inCol++) {
      ch = line.charAt(inCol);

      if (ch == ' ') {
        logger.info("Got space at " + inCol);

        if (tabs.isTabStop(inCol)) {
          logger.info("Got a tab stop " + inCol);
          sb.append('\t');
          outCol += consumedSpaces;
          consumedSpaces = 0;
        } else {
          consumedSpaces++;
        }

        continue;
      }

      while (inCol - 1 > outCol) {
        logger.info("Padding space at " + inCol);
        sb.append(' ');
        outCol++;
      }

      sb.append(ch);
      outCol++;
    }

    for (int i = 0; i < consumedSpaces; i++) {
      logger.info("Padding space at end # " + i);
      sb.append(' ');
    }

    return sb.toString();
  }

  /**
   * En tabs
   *
   * @param is  input stream of the {@link BufferedReader}
   * @param out the output stream from {@link PrintStream}
   */
  public void entab(BufferedReader is, PrintStream out) throws Exception {
    entab(is, new PrintWriter(out));
  }

  public static void main(String[] argv) throws Exception {
    Entab et = new Entab(8);
    if(argv.length == 0) {
      et.entab(new BufferedReader(new InputStreamReader(System.in)), System.out);
    } else {
      for(String filename : argv) {
        et.entab(new BufferedReader(new FileReader(filename)), System.out);
      }
    }
  }
}
