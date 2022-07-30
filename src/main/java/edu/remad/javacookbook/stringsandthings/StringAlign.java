package edu.remad.javacookbook.stringsandthings;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;

/**
 *
 */
public class StringAlign extends Format {

  /**
   * serial version UID.
   */
  private static final long serialVersionUID = 1L;

  /**
   * the justify
   */
  public enum Justify {
    LEFT,
    CENTER,
    RIGHT,
  }

  /**
   * the justify
   */
  private Justify just;

  /**
   * the max chars
   */
  private int maxChars;

  /**
   *
   * @param maxChars the maximal characters
   * @param just justify
   */
  public  StringAlign(int maxChars, Justify just) {
    switch(just) {
      case LEFT:
      case CENTER:
      case RIGHT:
        this.just = just;
        break;
      default:
        throw new IllegalArgumentException("invalid justification arg.");
    }

    if(maxChars < 0) {
      throw new IllegalArgumentException("maxChars must be positive");
    }

    this.maxChars = maxChars;
  }

  @Override
  public StringBuffer format(Object input, StringBuffer where, FieldPosition ignore) {
    String s = input.toString();
    String wanted = s.substring(0, Math.min(s.length(), maxChars) );

    switch(just) {
      case RIGHT:
        pad(where, maxChars - wanted.length());
        break;
      case CENTER:
        int toAdd = maxChars - wanted.length();
        pad(where, toAdd/2);
        where.append(wanted);
        pad(where, toAdd - toAdd/2);
        break;
      case LEFT:
        where.append(wanted);
        pad(where, maxChars - wanted.length());
        break;
    }

    return where;
  }

  /**
   * Pads the string
   *
   * @param to the string buffer
   * @param howMany how many
   */
  protected final void pad(StringBuffer to, int  howMany) {
    for(int i = 0; i < howMany; i++) {
      to.append(' ');
    }
  }

  /**
   * Formats
   *
   * @param s the string
   * @return the formatted string
   */
  String format(String s) {
    return format(s, new StringBuffer(), null).toString();
  }

  @Override
  public Object parseObject(String source, ParsePosition pos) {
    return source;
  }
}
