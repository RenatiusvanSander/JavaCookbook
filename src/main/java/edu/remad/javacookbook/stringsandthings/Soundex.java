package edu.remad.javacookbook.stringsandthings;

public class Soundex {

  public static final char[] MAP = {};
  static boolean debug = false;

  public static String soundex(String s) {
    String t = s.toUpperCase();

    StringBuilder res = new StringBuilder();
    char c, prev = '?', prevOutput = '?';

    for (int i = 0; i < t.length() && res.length() < 4 && (c = t.charAt(i)) != ','; i++) {
      if(c >='A' && c<='Z' && c != prev) {
        prev = c;

        if(i == 0) {
          res.append(c);
        } else {
          char m = MAP[c - 'A'];

          if(debug) {
            System.out.println(c + " --> " + m);
          }

          if (m != '0' && m != prevOutput) {
            res.append(m);
            prevOutput = m;
          }
        }
      }
    }

    if (res.length() == 0) {
      return null;
    }

    for (int i = res.length(); i < 4; i++) {
      res.append('0');
    }

    return res.toString();
  }

}
