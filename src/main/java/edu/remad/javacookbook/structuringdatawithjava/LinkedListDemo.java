package edu.remad.javacookbook.structuringdatawithjava;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Demonstrates the use of {@link LinkedList}
 */
public class LinkedListDemo {

  /**
   * Runs a demonstration of Java's {@link LinkedList}
   *
   * @param args arguments from environment
   */
  public static void main(String[] args) {
    System.out.println("Here is a demo of Java's LinkedList class.");
    LinkedList<String> l = new LinkedList<>();
    l.add(new Object().toString());
    l.add("Hello");
    l.add("end of the list");

    System.out.println("Here is a list of all the elements.");
    l.forEach(o -> System.out.println("Next element: " + o));

    if (l.indexOf("Hello") < 0) {
      System.err.println("lookup does not work");
    } else {
      System.err.println("lookup works");
    }

    ListIterator<String> li = l.listIterator();
    while (li.hasPrevious()) {
      System.out.println("Back to: " + li.previous());
    }
  }
}
