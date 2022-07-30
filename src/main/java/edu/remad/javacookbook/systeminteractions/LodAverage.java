package edu.remad.javacookbook.systeminteractions;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

public class LodAverage {

  public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
    Field f = Unsafe.class.getDeclaredField("theUnsafe");
    f.setAccessible(true);
    Unsafe unsafe = (Unsafe) f.get(null);

    int nelem = 3;

    double[] loadAvg = new double[nelem];
    unsafe.getLoadAverage(loadAvg, nelem);

    for (double d : loadAvg) {
      System.out.printf("%4.2f", d);
    }

    System.out.println();
  }

}
