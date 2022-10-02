package edu.remad.javacookbook.objectorientedtechniques;

/**
 * Demonstrates to use method toString overridden.
 */
public class ToStringWith {

  /**
   * the value of x-coordinate
   */
  private final int x;

  /**
   * the value of y-coordinate
   */
  private final int y;

  /**
   * Constructor
   *
   * @param x value of x-coordinate to set
   * @param y value of y-coordinate to set
   */
  public ToStringWith(final int x, final int y) {
    this.x = x;
    this.y = y;
  }

  /**
   * Runs {@link ToStringWith}
   *
   * @param args arguments from environment
   */
  public static void main(String[] args) {
    int x1 = 4;
    int y1 = 5;
    ToStringWith toStringWith = new ToStringWith(x1, y1);

    System.out.println(toStringWith);
  }

  @Override
  public String toString() {
    return String.format("%s[%d,%d]", this.getClass().getSimpleName(), this.x, this.y);
  }
}
