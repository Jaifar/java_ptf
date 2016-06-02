package ru.stqa.ptf.sandbox;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Owner on 5/31/2016.
 */
public class SquareTests {

@Test
  public void testArea() {
  Square s = new Square(5);
 Assert.assertEquals(s.area(), 25.0);

  }
}
