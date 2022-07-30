package edu.remad.javacookbook.numbers;

import java.text.DateFormatSymbols;
import java.util.BitSet;
import java.util.stream.IntStream;

public class NumSeries {

  /**
   * the month names
   */
  private static String[] months = new DateFormatSymbols().getMonths();

  /**
   * Main method
   *
   * @param args argumnets from environment
   */
  public static void main(String[] args) {
    IntStream.rangeClosed(1, 12).forEach(i -> System.out.println("Month # " + i));

    for (int i = 1; i <= months.length; i++) {
      System.out.println("Month # " + i);
    }

    for (String month : months) {
      System.out.println(month);
    }

    IntStream.rangeClosed(0, months.length).forEach(i -> System.out.println("Month " + months[i]));

    for (int i = 0; i < months.length; i++) {
      System.out.println("Month " + months[i]);
    }

    for (int i = 11; i <= 27; i += 3) {
      System.out.println("i 0 " + i);
    }

    BitSet b = new BitSet();
    b.set(0);
    b.set(3);
    b.set(8);

    for (int i = 0; i < months.length; i++) {
      if (b.get(i)) {
        System.out.println("Month " + months[i]);
      }
    }

    int[] numbers = {0, 3, 8};

    for (int n : numbers) {
      System.out.println("Month: " + months[n]);
    }
  }
}
