package edu.remad.javacookbook.structuringdatawithjava;

/**
 * A simple stack
 */
public interface SimpleStack<T> {

  /**
   * Validates empty.
   *
   * @return true / false for stack is empty
   */
  boolean empty();

  /**
   * Adds anobject to stack
   *
   * @param obj the object to add to Stack
   */
  void push(T obj);

  /**
   * @return   object of the stack and remove
   */
  T pop();

  /**
   * @return latest objet from stack without removing it from stack.
   */
  T peek();
}
