package edu.remad.javacookbook.stringsandthings;

public class StringRevChar {

  public static void main(String[] args) {
    String sh = "FCGDAEB";
    System.out.println(sh + " -> " + new StringBuilder(sh).reverse());
  }
}
