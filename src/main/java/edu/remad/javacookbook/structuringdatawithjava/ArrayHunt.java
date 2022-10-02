package edu.remad.javacookbook.structuringdatawithjava;

import java.util.Arrays;
import java.util.Random;

/**
 * Hunts in array a number in the haystack
 */
public class ArrayHunt {

  /**
   * the maximal number
   */
  protected static final int MAX = 4000;

  /**
   * the needle
   */
  protected static final int NEEDLE = 1999;

  /**
   * the stack as array
   */
  int[] haystack;

  /**
   * the Random
   */
  Random r;

  /**
   * Constructor
   */
  public ArrayHunt() {
    haystack = new int[MAX];
    r = new Random();
  }

  /**
   * Runs {qlink ArrayHunt}
   *
   * @param args arguments from environment
   */
  public static void main(String[] args) {
    ArrayHunt h = new ArrayHunt();

    if (args.length == 0) {
      h.play();
    } else {
      int won = 0;
      int games = Integer.parseInt(args[0]);
      for (int i = 0; i < games; i++) {
        if ((h.play())) {
          ++won;
        }
      }

      System.out.println("Computer won " + won + " out of " + games + ".");
    }
  }

  /**
   * Plays
   *
   * @return true / false for playing
   */
  public boolean play() {
    int i;

    for (i = 0; i < MAX; i++) {
      haystack[i] = (int) (r.nextFloat() * MAX);
    }

    Arrays.sort(haystack);

    i = Arrays.binarySearch(haystack, NEEDLE);

    if (i >= 0) {
      System.out.println("Value " + NEEDLE + " occurs on haystack[" + i + "]");
      return true;
    } else {
      System.out.println(
          "Vale " + NEEDLE + "does not occur in haystack; nearest value is " + haystack[-(i + 2)]
              + " (found at " + -(i + 2) + ")");

      return false;
    }
  }

}
