package edu.remad.javacookbook.stringsandthings;

/**
 * Demonstrates streams and forEach.
 */
public class ForEachChar {

  public static void main(String[] args) {
    String mesg = "Hello world";

    System.out.println("Using toCharArray:");
    for (char ch : mesg.toCharArray()) {
      System.out.println(ch);
    }

    System.out.println("Using Streams:");
    mesg.chars().forEach(c -> System.out.println((char)c));
  }
}
