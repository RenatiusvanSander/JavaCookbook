package edu.remad.javacookbook.systeminteractions;

public class CheckForSwing {

  public static void main(String[] args) {
    try {
      Class.forName("javax.swing.JButton");
    } catch (ClassNotFoundException e) {
      System.err.println(e);
    }
  }
}
