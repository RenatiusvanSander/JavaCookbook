package edu.remad.javacookbook.numbers;

/**
 * Demonstrates a Palindrom
 */
public class Palindrome {

  /**
   * flag for verbose
   */
  public static boolean verbose = true;

  /** the number of digits */
  protected static final int MAX_DIGITS = 19;

  /** store digits here */
  private static long[] digits = new long[MAX_DIGITS];

  /**
   * Method to run Palindrome
   *
   * @param args arguments from environment
   */
  public static void main(String[] args) {

    for (String num : args) {
      try {

        long l = Long.parseLong(num);

        if (l < 0) {
          System.err.println(num + " -> TOO SMALL");
          continue;
        }

        System.out.println(num + "->" + findPalindrome(l));
      } catch (NumberFormatException e) {
        System.err.println(num + "-> INVALID");
      } catch (IllegalStateException e) {
        System.err.println(num + "-> " + e);
      }
    }
  }

  /**
   * Finds Palindrome
   *
   * @param num number to calculate Palndrome for
   * @return string encoded result
   */
  private static long findPalindrome(long num) {
    if (num < 0) {
      throw new IllegalStateException("negative");
    }

    if (isPalindrome(num)) {
      return num;
    }

    if (verbose) {
      System.out.println("Trying");
    }

    return findPalindrome(num + reverseNumber(num));
  }

  /**
   * Checks if a numer is a palindrome
   *
   * @param num the number to check for
   * @return true / false for is a Palindrome
   */
  private static boolean isPalindrome(long num) {
    if (num >= 0 && num <= 9) {
      return true;
    }

    int nDigits = 0;
    while(num > 0) {
      digits[nDigits++] = num % 10;
      num /= 10;
    }
    for(int i = 0; i < nDigits /2; i++) {
      if(digits[i] != digits[nDigits - i -1])  {
        return false;
      }
    }

    return true;
  }

  /**
   * Reverses number
   *
   * @param num number to reverse
   * @return the reversed number
   */
  private static long reverseNumber(long num) {
    int nDigits = 0;

    while(num > 0) {
      digits[nDigits++] = num % 10;
      num /= 10;
    }

    long ret = 0;
    for(int i = 0; i < nDigits; i++) {
      ret *= 10;
      ret += digits[i];
    }

    return ret;
  }
}
