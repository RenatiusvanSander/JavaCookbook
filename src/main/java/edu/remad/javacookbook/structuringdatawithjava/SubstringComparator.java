package edu.remad.javacookbook.structuringdatawithjava;

import java.util.Comparator;

/**
 * Compares sub strings to sort a list.
 */
public class SubstringComparator implements Comparator<String> {

  @Override
  public int compare(String s1, String s2) {
    s1 = s1.substring(1);
    s2 = s2.substring(1);

    return s1.compareTo(s2);
  }
}
