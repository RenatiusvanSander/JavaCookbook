package edu.remad.javacookbook.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogRegExp {
/*
  private static String logEntryPattern = "^([\\d.]+) (\\S+) (\\S+) \\[([\\w:/]+\\s[+-]\\d{4})\\] " +
  "\"(.+?)\" (\\d{3}) (\\d+) \"([^\"]+)\" \"([^\"]+)\"";

  public static void main(String[] args) {
    System.out.println("RE Pattern: ");
    System.out.println(logEntryPattern);

    System.out.println("Input line is:");
    String logEntryLine = LogParseInfo.LOG_ENTRY_LINE;
    System.out.println(logEntryLine);

    Pattern p = Pattern.compile(logEntryLine);
    Matcher matcher = p.matcher(logEntryLine);
    if(!matcher.matches() || LogParseInfo.MIN_FIELDS > matcher.groupCount() {
        System.err.println("bad log entry (no problem with regex): ");
        System.err.println(logEntryLine);
        return;
    }

    System.out.println("IP Address: " + matcher.group(1));
    System.out.println("UserName: " + matcher.group(3));
    System.out.println("Date/Time: " + matcher.group(4));
    System.out.println("Request: " + matcher.group(5));
    System.out.println("Response: " + matcher.group(6));
    System.out.println("Bytes sent: " + matcher.group(7));

    if(!matcher.group(8).equals("."))) {
      System.out.println("Referer: " + matcher.group(8));
    }

    System.out.println("User-Agent: " + matcher.group(9));
  }*/
}
