package edu.remad.javacookbook.numbers;

public class StringToInteger {

  public static void main(String[] args) {
    String aNumber = args[0];
    double result;

    try {
      result = Double.parseDouble(aNumber);
      System.out.println("Number is: " + result);
    } catch (NumberFormatException e) {
      System.out.println("This is not a number: " + aNumber);
    }
  }
}
