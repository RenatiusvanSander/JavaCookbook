package edu.remad.javacookbook.objectorientedtechniques;

import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

/**
 * All classes
 */
public class AllClasses {

  /**
   * Gets results
   */
  public void getResults() {
    JButton b = new JButton("Press me");
    b.addActionListener((ActionEvent evt) -> {
      Data loc = new Data();
      loc.x = ((Component) evt.getSource()).getX();
      loc.y = ((Component) evt.getSource()).getY();
      System.out.println("Thanks for pressing me");
    });
  }

  /**
   * data stores information
   */
  public class Data {

    /**
     * numeric x-coordinate
     */
    int x;

    /**
     * numeric y-coordinate
     */
    int y;
  }

  /**
   * Constructor
   */
  public AllClasses() {
  }
}

/**
 * Another class with
 */
class AnotherClass {

  /**
   * package public Constructor
   */
  AnotherClass() {
  }
}
