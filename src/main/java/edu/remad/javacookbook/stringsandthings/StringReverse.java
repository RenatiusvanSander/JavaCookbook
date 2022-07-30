package edu.remad.javacookbook.stringsandthings;

import java.util.Stack;
import java.util.StringTokenizer;

public class StringReverse {

  public static void main(String[] args) {
    String s = "Father Charles Goes Down And  Ends Battle";

    Stack<String> myStack = new Stack<>();
    StringTokenizer st = new StringTokenizer(s);
    while (st.hasMoreTokens()) {
      myStack.push(st.nextToken());
    }

    // prints stack backwards
    System.out.println('"' + s + '"' + " backwards by word is:\n\t\"");
    while(!myStack.empty()) {
      System.out.print(myStack.pop());
      System.out.print(' ');
    }
    System.out.println('"');
  }
}
