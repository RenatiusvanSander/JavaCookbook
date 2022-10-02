package edu.remad.javacookbook.structuringdatawithjava;

/**
 * This stack is more a toy than a stack.
 */
public class ToyStack {

  /**
   * maximal depth of 10
   */
  protected int MAX_DEPTH = 10;

  /**
   * depth of 0
   */
  protected int depth = 0;

  /**
   * the stack objects as storage
   */
  protected int[] stack = new int[MAX_DEPTH];

  /**
   * Pushes a number to stack
   *
   * @param n number to add to stack
   */
  protected void push(int n) {
    stack[depth++] = n;
  }

  /**
   * Pops an object from stack
   *
   * @return take one number from stack and return that
   */
  protected  int pop() {
    return stack[--depth];
  }

  /**
   * Peeks
   *
   * @return number from stack
   */
  protected int peek() {
    return stack[depth-1];
  }
}
