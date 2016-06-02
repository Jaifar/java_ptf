package ru.stqa.ptf.sandbox;

/**
 * Created by Owner on 6/2/2016.
 */
public class PointD {
  public static void main(String[] arg) {
    int x1 = 1, y1 = 1, x2 = 5, y2 = 5;
    double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    System.out.println(distance);
  }
}
