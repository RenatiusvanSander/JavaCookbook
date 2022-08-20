package edu.remad.javacookbook.structuringdatawithjava;

import java.util.Date;

/**
 * Demos the instanceof {@link MyStack}
 */
public class MyStackDemo {

  /**
   * Runs the stack.
   *
   * @param args arguments from environment
   */
  public static void main(String[] args) {
    MyStack<String> ms1 = new MyStack<>();
    ms1.push("billg");
    ms1.push("scottm");

    while (ms1.hasNext()) {
      String name = ms1.pop();
      System.out.println(name);
    }

    MyStack ms2 = new MyStack<>();
    ms2.push("billg");
    ms2.push("scottm");
    ms2.push(new Date());

    try {
      String bad = (String) ms2.pop();
      System.err.println("Didn't get expected exception, popped " + bad);
    } catch (ClassCastException ex) {
      System.out.println("Did get expected exception");
    }

    while (ms2.hasNext()) {
      String name = (String) ms2.pop();
      System.out.println(name);
    }
  }

}
