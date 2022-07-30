package edu.remad.javacookbook.stringsandthings;

import java.io.BufferedReader;
import java.io.IOException;

public class CheckSum {

  public static void main(String[] args) {
    //BufferedReader br = new BufferedReader();
  }

  /**
   * Processes the string
   *
   * @param is input stream as {@link BufferedReader}
   * @return the sum
   */
  public static int process(BufferedReader is) {
    int sum = 0;

    try {
      String inputLine;

      while( (inputLine = is.readLine()) != null) {
        for(char c : inputLine.toCharArray()) {
          sum += c;
        }
      }
    } catch (IOException e) {
      throw new RuntimeException("IOException: " + e);
    }

    return sum;
  }
}
