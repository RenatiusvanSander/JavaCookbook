package edu.remad.javacookbook.datesandtimes;

import java.time.Clock;
import java.time.LocalDateTime;

/**
 * Testable for showing local date time now with system's default time zone.
 */
public class TestableDateTime {

  /**
   * the clock
   */
  private static Clock clock = Clock.systemDefaultZone();

  /**
   * Method to show local date time
   *
   * @param args arguments from environment
   */
  public static void main(String[] args) {
    System.out.println("It is now " + LocalDateTime.now());
  }

  /**
   * Sets clock.
   *
   * @param clock the clock to set
   */
  public static void setClock(Clock clock) {
    TestableDateTime.clock = clock;
  }
}
