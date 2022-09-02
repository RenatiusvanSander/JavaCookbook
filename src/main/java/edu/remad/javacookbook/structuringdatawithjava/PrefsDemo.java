package edu.remad.javacookbook.structuringdatawithjava;

import java.io.IOException;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;

/**
 * Demonstrates the usage of java preferences
 */
public class PrefsDemo {

  /**
   * Run the demonstration of preferences
   *
   * @param args arguments of einvironment
   */
  public static void main(String[] args) throws BackingStoreException, IOException {
    Preferences prefs = Preferences.userNodeForPackage(PrefsDemo.class);
    String text = prefs.get("textFontName", "lucida-bright");
    String display = prefs.get("displayFontName", "lucida-backletter");
    System.out.println(text);
    System.out.println(display);

    prefs.put("textFontName", "times-roman");
    prefs.put("isplayFontName", "helvetica");

    Preferences child = prefs.node("a/b");
    child.putInt("meaning", 42);
    child.putDouble("pi", Math.PI);

    prefs.exportSubtree(System.out);
  }
}
