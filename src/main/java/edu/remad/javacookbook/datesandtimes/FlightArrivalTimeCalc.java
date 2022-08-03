package edu.remad.javacookbook.datesandtimes;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Calculate flight arrival time
 */
public class FlightArrivalTimeCalc {

  /**
   * the flight time
   */
  private static Duration driveTime = Duration.ofHours(1);

  /**
   * Runs the calculator
   *
   * @param args arguments from environment
   */
  public static void main(String[] args) {
    LocalDateTime when = null;

    if(args.length == 0) {
      when = LocalDateTime.now();
    }else {
      String time = args[0];
      LocalTime localTime = LocalTime.parse(time);
      when = LocalDateTime.of(LocalDate.now(), localTime);
    }

    calculateArrival(when);
  }

  /**
   * Calculates Arrival
   *
   * @param takeOffTime the tome the plain took off
   * @return the zoned arrival time
   */
  private static ZonedDateTime calculateArrival(LocalDateTime takeOffTime) {
    ZoneId torontoZone = ZoneId.of("America/Toronto");
    ZoneId londonZone = ZoneId.of("Europe/London");
    ZonedDateTime takeOffTimeZoned = ZonedDateTime.of(takeOffTime, torontoZone);
    Duration flightTime = Duration.ofHours(5).plus(10, ChronoUnit.MINUTES);

    ZonedDateTime arrivalTimeUnZoned = takeOffTimeZoned.plus(flightTime);
    ZonedDateTime arrivalTimeZoned =   arrivalTimeUnZoned.toInstant().atZone(londonZone);
    ZonedDateTime phoneTimeHere =  arrivalTimeUnZoned.minus(driveTime);

    System.out.println("Flight departure time " + takeOffTime);

    return arrivalTimeZoned;
  }
}
