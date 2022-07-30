package edu.remad.javacookbook.systeminteractions;

import java.util.Map;
import java.util.Properties;

public class SystemProperties {

  public static void main(String[] args) {
    Properties systemProperties = System.getProperties();

    for(Map.Entry<Object, Object> entry :systemProperties.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
  }
}
