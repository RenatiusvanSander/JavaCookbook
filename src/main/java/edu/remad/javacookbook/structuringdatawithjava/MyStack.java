package edu.remad.javacookbook.structuringdatawithjava;

/**
 * Concerning functionality of a stack and implements {@link SimpleStack}
 *
 * @param <T> the class instance the stack handles
 */
public class MyStack<T> implements SimpleStack<T> {

  /**
   * the initial depth number with 0.
   */
  private int depth = 0;

  /**
   * the space limit of the stack
   */
  public static final int DEFAULT_INITIAL = 10;

  /**
   * the stack
   */
  private T[] stack;

  /**
   * Constructor
   */
  public MyStack() {
    this(DEFAULT_INITIAL);
  }

  /**
   * Constructor
   *
   * @param howBig how many elements space the stack shall have
   */
  public MyStack(int howBig) {
    if (howBig <= 0) {
      throw new IllegalArgumentException(howBig + " must be positive, but was " + howBig);
    }

    stack = (T[]) new Object[howBig];
  }

  @Override
  public boolean empty() {
    return depth == 0;
  }

  @Override
  public void push(T obj) {
    stack[depth++] = obj;
  }

  @Override
  public T pop() {
    --depth;

    T tmp = stack[depth];
    stack[depth] = null;

    return tmp;
  }

  @Override
  public T peek() {
    return depth == 0 ? null : stack[depth - 1];
  }

  /**
   * @return true / false for next object exists
   */
  public boolean hasNext() {
    return depth > 0;
  }

  /**
   * @return true / false for the stack has room
   */
  public boolean hasRoom() {
    return depth < stack.length;
  }

  /**
   * Gets stack's depth
   *
   * @return the depth of stack as number
   */
  public int getStackDepth() {
    return this.depth;
  }
}
