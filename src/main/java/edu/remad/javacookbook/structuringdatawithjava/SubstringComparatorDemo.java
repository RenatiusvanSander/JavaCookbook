package edu.remad.javacookbook.structuringdatawithjava;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Demonstrates the running substring comparator.
 */
public class SubstringComparatorDemo {

  /**
   * Run th sorting with substring comparator
   *
   * @param unused system environment variables are not used
   */
  public static void main(String[] unused) {
    String[] strings = {"painful", "mainly", "gaining", "raindrops"};

    Arrays.sort(strings);
    dump(strings, "Using default sort");
    Arrays.sort(strings, new SubstringComparator());
    dump(strings, "Using SubstringComparator");

    System.out.println("Functional approach:");
    Arrays.stream(strings)
        .sorted(Comparator.comparing(s -> s.substring(1)))
        .forEach(System.out::println);
  }

  /**
   * Dumps
   *
   * @param args the arguments to dump
   * @param title the title
   */
  private static void dump(String[] args, String title) {
    System.out.println(title);

    for(String s : args) {
      System.out.println(s);
    }
  }
}
