package edu.remad.javacookbook.numbers;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Demonstrates number formattin
 */
public class NumFormatDemo {

  /**
   * the double numer
   */
  public static final double INTL_Number = 1024.25;

  /**
   * Main method ti run demo of nuber format
   *
   * @param args arguments of environment
   */
  public static void main(String[] args) {
    NumberFormat defForm = NumberFormat.getInstance();
    NumberFormat ourForm = new DecimalFormat("##0.##");
    double ourNumber = 4567.34;

    System.out.println("defForms pattern is " + ((DecimalFormat) defForm).toPattern());
    System.out.println(INTL_Number + " format as " + defForm.format(INTL_Number));
    System.out.println(ourNumber + " format as " + ourForm.format(ourNumber));
    System.out.println(ourNumber + " format as " + defForm.format(ourNumber));
  }
}
