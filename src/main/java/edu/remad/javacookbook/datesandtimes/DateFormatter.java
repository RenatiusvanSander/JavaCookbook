package edu.remad.javacookbook.datesandtimes;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Demonstrates date formatter.
 */
public class DateFormatter {

  /**
   * Runs main method to demonstrates date formatter.
   *
   * @param args argument from environment
   */
  public static void main(String[] args) {
    DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/LL/dd");
    System.out.println(df.format(LocalDate.now()));

    System.out.println(LocalDate.parse("2014/04/01", df));

    DateTimeFormatter nTZ = DateTimeFormatter.ofPattern("d MMMM, yyyy HH:mm a");
    System.out.println(ZonedDateTime.now().format(nTZ));
  }
}
