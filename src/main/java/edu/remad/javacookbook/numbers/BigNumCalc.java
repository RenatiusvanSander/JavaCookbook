package edu.remad.javacookbook.numbers;

import java.math.BigDecimal;
import java.util.Stack;

/**
 * Demonstrates to calculate big numbers
 */
public class BigNumCalc {

  public static Object[] testInput = {new BigDecimal("3419229223372036854775807.23343"),
      new BigDecimal("2.0"), "*",};

  /**
   * @param args
   */
  public static void main(String[] args) {
    BigNumCalc calc = new BigNumCalc();
    System.out.println(calc.calculate(testInput));
  }

  /**
   * stack of numbers being used in the calculator
   */
  Stack<BigDecimal> stack = new Stack<>();

  private BigDecimal calculate(Object[] testInput) {
    BigDecimal tmp;

    for (int i = 0; i < testInput.length; i++) {
      Object o = testInput[i];

      if (o instanceof BigDecimal) {
        stack.push((BigDecimal) o);
      } else if (o instanceof String) {

        switch (((String) o).charAt(0)) {
          case '+': {
            stack.push(stack.pop()).add(stack.pop());
            break;
          }
          case '*': {
            stack.push(stack.pop()).multiply(stack.pop());
            break;
          }
          case '-': {
            tmp = (BigDecimal) stack.pop();
            stack.push(stack.pop()).subtract(tmp);
            break;
          }
          case '/': {
            tmp = stack.pop();
            stack.push(stack.pop()).divide(tmp, BigDecimal.ROUND_HALF_UP);
            break;
          }
          default: {
            throw new IllegalArgumentException("Unknown OPERATOR popped");
          }
        }
      } else {
        throw new IllegalArgumentException("Syntax error in input");
      }
    }

    return stack.pop();
  }
}

