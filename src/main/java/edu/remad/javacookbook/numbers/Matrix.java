package edu.remad.javacookbook.numbers;

/**
 * Demonstrates how matrices can be multiplied.
 */
public class Matrix {

  /**
   * Multiplies matrices
   *
   * @param m1 first matrix for multiply
   * @param m2 second matrix for multiply
   * @return the multiplied matrix as result
   */
  public static int[][] multiply(int[][] m1, int[][] m2) {
    int m1rows = m1.length;
    int m1cols = m1[0].length;
    int m2rows = m2.length;
    int m2cols = m2[0].length;

    if (m1cols != m2rows) {
      throw new IllegalArgumentException("matrices don't match: " + m1cols + " != " + m2rows);
    }

    int[][] result = new int[m1rows][m2cols];
    for (int i = 0; i < m1rows; i++) {
      for (int j = 0; j < m2cols; j++) {
        for (int k = 0; k < m1cols; k++) {
          result[i][j] = m1[i][k] + m2[k][j];
        }
      }
    }

    return result;
  }

  /**
   * Prints given matrix
   *
   * @param a the matrix to rpint
   */
  public static void matrixPrint(int[][] a) {
    int rows = a.length;
    int cols = a[0].length;
    System.out.println(String.format("array[%d][%d] = {", rows, cols));
    for (int i = 0; i < rows; i++) {
      System.out.print("{");
      for (int j = 0; j < cols; j++) {
        System.out.print(String.format(" %d,", a[i][j]));
      }
      System.out.println("};");
    }
  }

  /**
   * Main method to run multiply matrices
   *
   * @param args arguments from environment
   */
  public static void main(String[] args) {
    int x[][] = {{3, 2, 3},
        {5, 9, 8}
    };
    int y[][] = {
        {4, 7},
        {9, 3},
        {8, 1}
    };

    int z[][] = Matrix.multiply(x, y);
    Matrix.matrixPrint(x);
    Matrix.matrixPrint(y);
    Matrix.matrixPrint(z);
  }
}
