package edu.remad.javacookbook.numbers;

/**
 * Demonstrates worst until best case fractional multiplication.
 */
public class FractMult {

  public static void main(String[] u) {
    double d1 = 0.666 * 5;// fast, but obscure and inaccurate
    System.out.println(d1);

    double d2 = 2 / 3 * 5; // wrong answer  2/3 == 0, 0*5 = 0
    System.out.println(d2);

    double d3 = 2d / 3d * 5; // normal
    System.out.println(d3);

    double d4 = (2 * 5) / 3d; // one step done as integer, almost same answer
    System.out.println(d4);

    int i = 2 * 5 / 3; // fast, approximate integer answer
  }
}
