package edu.remad.javacookbook.stringsandthings;

public class StringBuilderDemo {

  public static void main(String[] args) {
    String s1 = "Hello" + "," + "World";
    System.out.println(s1);

    //Builds a StringBuilder, and append some things to it.
    StringBuilder sb = new StringBuilder();
    sb.append("Hello");
    sb.append(',');
    sb.append(' ');
    sb.append("World");

    // Gets the StringBuilder's value as a String, and print it;
    String s2 = sb.toString();
    System.out.println(s2);

    // Now do the above all over again, but in a more concise (and typical "real-world" Java) fashion.
    System.out.println(new StringBuilder().append("Hello").append(',').append(' ').append("World"));
  }
}
