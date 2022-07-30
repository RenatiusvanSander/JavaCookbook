package edu.remad.javacookbook.numbers;

import java.math.BigInteger;

/**
 * Class concerning big numbers
 */
public class BigNums {

  /**
   * Demonstrates big numbers
   *
   * @param args arguments from system environment
   */
  public static void main(String[] args) {
    String longestMax = String.format("Here's Long.MAX_VALUE %d", Long.MAX_VALUE);
    System.out.println(longestMax);

    BigInteger bigInt = new BigInteger("3419229223372036854775807");
    String biggestInteger = String.format("Here's a biggger number: %d", bigInt);
    System.out.println(biggestInteger);

    String floatingBiggestNumber = String.format("Here it is a double: %f", bigInt.doubleValue());
    System.out.println(floatingBiggestNumber);
  }
}
