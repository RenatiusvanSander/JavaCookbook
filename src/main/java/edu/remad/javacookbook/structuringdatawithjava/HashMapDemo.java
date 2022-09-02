package edu.remad.javacookbook.structuringdatawithjava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Demonstrates the use of {@link HashMap}
 */
public class HashMapDemo {

  /**
   * Runs demonstration of Java's {@link HashMap}
   *
   * @param args arguments from environment
   */
  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();
    map.put("Adobe", "Mountain View, CA");
    map.put("IBM", "White Plains, NY");
    map.put("O'Reilly", "Sebastopol, CA");

    String queryString = "O'Reilly";
    System.out.println("You asked about" + queryString + ".");
    String resultString = map.get(queryString);
    System.out.println("They are localted in: " + resultString);
    System.out.println();

    for (String key : map.keySet()) {
      System.out.println("key " + key + "; value " + map.get(key));
    }

    map.entrySet()
        .forEach(me -> System.out.println("Key " + me.getKey() + "; Value " + me.getValue()));

    Iterator<String> it = map.keySet().iterator();
    while(it.hasNext()) {
      String key = it.next();

      if(key.equals("Sun") || key.equals("Netscape")) {
        it.remove();
        continue;
      }

      System.out.println("Company " + key + "; Address " + map.get(key));
    }
  }
}
