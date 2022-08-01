package edu.remad.javacookbook.datesandtimes;

import java.time.LocalDate;
import java.time.Period;

/**
 * Concerning add a date.
 */
public class DateAdd {

  /**
   * Main method to demonstrates to add a period of 700 days.
   *
   * @param args arguments from environment
   */
  public static void main(String[] args) {
    LocalDate now = LocalDate.now();

    Period p = Period.ofDays(700);
    LocalDate then = now.plus(p);

    System.out.printf("Seven hundred days from %s ls %s%n", now, then);
  }
}
