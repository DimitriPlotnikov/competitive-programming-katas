package de.katas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Kata15Test {

  @Test
  public void testInput01() {
    int[] g = new int[] {1, 2, 3};
    int[] s = new int[] {1, 1};
    int n = 1;

    int res = new Kata15().findContentChildren(g, s);
    Assertions.assertEquals(n, res);
  }

  @Test
  public void testInput02() {
    int[] g = new int[] {1, 2};
    int[] s = new int[] {1, 2, 3};
    int n = 2;

    int res = new Kata15().findContentChildren(g, s);
    Assertions.assertEquals(n, res);
  }

  @Test
  public void testInput03() {
    int[] g = new int[] {1, 2};
    int[] s = new int[] {};
    int n = 0;

    int res = new Kata15().findContentChildren(g, s);
    Assertions.assertEquals(n, res);
  }
}
