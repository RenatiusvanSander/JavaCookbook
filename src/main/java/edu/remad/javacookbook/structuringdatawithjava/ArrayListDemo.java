package edu.remad.javacookbook.structuringdatawithjava;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates the array list
 */
public class ArrayListDemo {

  /**
   * Runs demo of array list
   *
   * @param args arguments from environment
   */
  public static void main(String[] args) {
    List<LocalDate> editions = new ArrayList<>();

    editions.add(LocalDate.of(2001, 06, 01));
    editions.add(LocalDate.of(2004, 06, 01));
    editions.add(LocalDate.of(2014, 06, 20));

    System.out.println("Retrieving by index:");
    for(int i = 0; i < editions.size(); i++) {
      System.out.printf("Edition %d was %s\n", i + 1, editions.get(i));
    }

    System.out.println("Retrieving by Iterable:");
    for (LocalDate dt: editions) {
      System.out.println("Edition " + dt);
    }
  }

}
