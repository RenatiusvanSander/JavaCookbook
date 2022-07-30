package edu.remad.javacookbook.datesandtimes;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Demonstrates current date time
 */
public class CurrentDateTime {

  /**
   * Method to get date time now.
   *
   * @param args arguments from environment
   */
  public static void main(String[] args) {
    LocalDate dNow = LocalDate.now();
    System.out.println(dNow);
    LocalTime tNow = LocalTime.now();
  }
}
