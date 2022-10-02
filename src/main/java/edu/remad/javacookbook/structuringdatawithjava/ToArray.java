package edu.remad.javacookbook.structuringdatawithjava;

import java.util.List;

/**
 * Demonstrates the to array method of {@link List} interface
 */
public class ToArray {

  /**
   * Runs the demonstration of to Array.
   *
   * @param args arguments from environment
   */
  public static void main(String[] args) {
    List<String> list = List.of("Blobbo", "Cracked", "Dumbo");
    Object[] o = list.toArray();
    System.out.println("Array of Object has length " + o.length);

    String[] sl = (String[]) list.toArray(new String[0]);
    System.out.println("Array of String has length " + sl.length);
  }
}
