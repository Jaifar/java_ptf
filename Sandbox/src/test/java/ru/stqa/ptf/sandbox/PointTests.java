package ru.stqa.ptf.sandbox;

import org.junit.Test;

/**
 * Created by Owner on 6/2/2016.
 */
public class PointTests {
  @Test
  public void testArea(){
    Point d = new distance (7);

    assert d.area() == 5.6;

  }
}
