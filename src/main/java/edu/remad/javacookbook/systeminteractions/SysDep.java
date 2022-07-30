package edu.remad.javacookbook.systeminteractions;

import java.io.File;

public class SysDep {

  private final static String UNIX_NULL_DEV = "/dev/null";
  private final static String WINDOWS_NULL_DEV = "NUL";
  private final static String FAKE_NULL_DEV = "jnk";

  /**
   *
   * @return
   */
  public static String getDevNull() {
    if(new File(UNIX_NULL_DEV).exists()) {
      return UNIX_NULL_DEV;
    }

    String sys = System.getProperty("os.name");
    if(sys == null) {
      return FAKE_NULL_DEV;
    }

    if(sys.startsWith("Windows")) {
      return WINDOWS_NULL_DEV;
    }

    return FAKE_NULL_DEV;
  }

}
