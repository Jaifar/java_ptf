package ru.stqa.ptf.sandbox;

/**
 * Created by Owner on 5/31/2016.
 */
class Point { int х, у;

  Point(int х, int у) {

    this.x = х;

    this.у = у;

  } }

class PointCreate {

  public static void main(String args[]) {

    Point p = new Point(10,20);

    System.out.println("x = " + p.x + " у = " + p.у);

  } }