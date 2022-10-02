package edu.remad.javacookbook.structuringdatawithjava;

/**
 * Array Two Objects
 */
public class ArrayTwoObjects {

  /**
   * Main runs two array two objects
   *
   * @param args argument from environment
   */
  public static void main(String[] args) {
    print("from getArrayInfo", getArrayInfo());
  }

  /**
   * Prints
   *
   * @param tag   the tag
   * @param array two-dimensional string array
   */
  public static void print(String tag, String[][] array) {
    System.out.println(String.format("Array %s is  %d x %d", tag, array.length, array[0].length));
    System.out.println(String.format("Array[0][0] = %s", array[0][0]));
    System.out.println(String.format("Array[0][1] = %s", array[0][1]));
    System.out.println(String.format("Array[1][0] = %s", array[1][0]));
    System.out.println(String.format("Array[0][0] = %s", array[0][0]));
    System.out.println(String.format("Array[1][1] = %s", array[1][1]));
  }

  /**
   * Gets array info
   *
   * @return two-dimensional String
   */
  public static String[][] getArrayInfo() {
    String[][] info;
    info = new String[10][10];
    for (int i = 0; i < info.length; i++) {
      for (int j = 0; j < info[i].length; j++) {
        info[i][j] = String.format("String[%d,%d]", i, j);
      }
    }

    return info;
  }
}
