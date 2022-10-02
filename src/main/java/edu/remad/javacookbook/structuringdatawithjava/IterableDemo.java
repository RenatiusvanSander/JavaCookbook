package edu.remad.javacookbook.structuringdatawithjava;

import java.util.Iterator;

/**
 * Iterable demo
 */
public class IterableDemo {

  /**
   * Runs iterable demonstration
   *
   * @param args arguments from environment
   */
  public static void main(String[] args) {
    Demo demo = new Demo();

    for (Iterator<String> it = demo.iterator(); it.hasNext(); ) {
      String s = it.next();
      System.out.println(s);
    }
  }

  /**
   * The iterator of type String
   */
  private static class Demo implements Iterator<String> {

    /**
     * the data
     */
    private static final String[] data = {"One", "Two", "Three"};

    /**
     * the demo iterator
     */
    private final DemoIterator demoIterator = new DemoIterator();

    @Override
    public boolean hasNext() {
      return this.demoIterator.hasNext();
    }

    @Override
    public String next() {
      return this.demoIterator.next();
    }

    /**
     * Gets Iterator
     *
     * @return the Iterator
     */
    public Iterator<String> iterator() {
      return new DemoIterator();
    }

    /**
     * The demo iterator which implements {@link Iterator}
     */
    private class DemoIterator implements Iterator<String> {

      /**
       * the integer
       */
      int i = 0;

      /**
       * Has next.
       *
       * @return true / false for has next
       */
      public boolean hasNext() {
        return i < data.length;
      }

      /**
       * Next
       *
       * @return the next data
       */
      public String next() {
        return data[i++];
      }

      /**
       * Removes
       */
      public void remove() {
        throw new UnsupportedOperationException("remove");
      }
    }
  }
}
