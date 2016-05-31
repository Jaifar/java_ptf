package ru.stqa.ptf.sandbox;

/**
 * Created by Owner on 5/31/2016.
 */
class PointDistance {

  public static void main(String args[]) {

    Point p1 = new Point(0, 0);

    Point p2 = new Point(88, 48);

    System.out.println("p1 = " + p1.x + ", " + p1.y);

    System.out.println("p2 = " + p2.x + ", " + p2.y);

    System.out.println("p1.distance(p2) = " + p1.distance(p2));

    System.out.println("p1.distance(67, 45) = " + p1.distance(67, 45));

  } }