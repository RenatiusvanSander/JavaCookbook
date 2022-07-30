package edu.remad.javacookbook.stringsandthings;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 *
 */
public class UseLocales {

  /**
   *
   * @param args
   */
  public static void main(String[] args) {
    Locale frLocale = Locale.FRANCE;
    Locale ukLocale = new Locale("en", "UK");

    DateTimeFormatter defaultDateFormatter = DateTimeFormatter.ofLocalizedDateTime(
        FormatStyle.MEDIUM);
    DateTimeFormatter frDateFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
        .localizedBy(frLocale);
    DateTimeFormatter ukDateFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
        .localizedBy(ukLocale);

    LocalDateTime now = LocalDateTime.now();
    System.out.println("Default: " + ' ' + now.format(defaultDateFormatter));
    System.out.println(frLocale.getDisplayName() + ' ' + now.format(frDateFormatter));
    System.out.println(ukLocale.getDisplayName() + ' ' + now.format(ukDateFormatter));
  }

}
