package edu.remad.javacookbook.stringsandthings;

public class Tabs {

  /**
   * the def tab space as number
   */
  public final static int DEFTABSPACE = 8;
  /**
   * the constant for maximal lines
   */
  public final static int MAXLINE = 255;
  /**
   * the def tab space
   */
  protected int tabSpace = DEFTABSPACE;

  /**
   * Constructor
   *
   * @param n the number
   */
  public Tabs(int n) {
    if (n <= 0) {
      n = 1;
    }

    tabSpace = n;
  }

  /**
   * Constructor
   */
  public Tabs() {
    this(DEFTABSPACE);
  }

  /**
   * Gets tab spacing
   *
   * @return the tab spacing as number
   */
  public int getTabSpacing() {
    return tabSpace;
  }

  /**
   * Validates tab stop
   *
   * @param col the column as number
   * @return true / false for is a tab stop
   */
  public boolean isTabStop(int col) {
    if (col <= 0) {
      return false;
    }

    return (col + 1) % tabSpace == 0;
  }
}
