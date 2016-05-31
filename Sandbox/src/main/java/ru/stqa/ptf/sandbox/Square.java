package ru.stqa.ptf.sandbox;

/**
 * Created by Owner on 5/27/2016.
 */
public class Square {

  public double l;
  public Square(double l){
    this.l = l;
  }
  public double area() {
    return this.l * this.l;
  }
}
