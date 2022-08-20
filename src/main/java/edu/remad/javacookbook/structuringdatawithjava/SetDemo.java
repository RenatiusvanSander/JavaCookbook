package edu.remad.javacookbook.structuringdatawithjava;

import java.util.HashSet;
import java.util.Set;

/**
 * Demonstrates the use of a set without duplicates
 */
public class SetDemo {

  /**
   * Runs a demonstration with {@link Set}
   *
   * @param args arguments from environment
   */
  public static void main(String[] args) {
    Set<String> hashSet = new HashSet<>();
    hashSet.add("One");
    hashSet.add("Two");
    hashSet.add("One");
    hashSet.add("Three");
    hashSet.forEach(System.out::println);

    Set<Double> nums = Set.of(Math.PI, 22D/7, Math.E);

    Set<String> firstNames = Set.of("Robin","Jaime","Joey");
  }
}
