package edu.remad.javacookbook.systeminteractions;

public class GetEnv {

  public static final String SYSTEM_GETENV_PATH = "System.getenv(\"PATH\") = ";

  public static  void main(String[] args) {
    String environment = System.getenv("PATH");

    System.out.println(SYSTEM_GETENV_PATH + environment);

    System.out.println("");
    for(String property : environment.split(":")) {
      System.out.println(SYSTEM_GETENV_PATH + property);
    }
  }
}
