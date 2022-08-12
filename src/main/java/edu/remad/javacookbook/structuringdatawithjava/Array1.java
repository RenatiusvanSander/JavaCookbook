package edu.remad.javacookbook.structuringdatawithjava;

import java.time.LocalDate;

/**
 * Concerning arrays
 */
public class Array1 {

  /**
   * Run main method to poulate arrays.
   *
   * @param args arguments from environment
   */
  public static void main(String[] args) {
    int[] monthLen1;
    monthLen1 = new int[12];
    int[] monthLen2 = new int[12];
    int[] monthLen3 = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    final int MAX = 10;
    LocalDate[] days = new LocalDate[MAX];
    for (int i = 0; i < MAX; i++) {
      days[i] = LocalDate.of(2022, 02, i + 1);
    }

    int[][] me = new int[10][];
    for (int i = 0; i < 10; i++) {
      me[i] = new int[24];
    }

    System.out.println(me.length);
    System.out.println(me[0].length);
  }
}
