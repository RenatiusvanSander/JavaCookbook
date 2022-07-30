package edu.remad.javacookbook.systeminteractions;

public class MacOsProperty {

  public static void main(String[] args) {
    boolean isMacOs = System.getProperty("mrj.version") != null;

    if(isMacOs) {
      System.setProperty("apple.laf.useScreenMnuBar", "true");
      System.setProperty("com.apple.mrj.application.apple.menu.about.name", "My Super App");
    }
  }
}
