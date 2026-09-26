package de.katas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Kata14Test {

  @Test
  public void testInput01() {
    int[] flowerbed = new int[] {1, 0, 0, 0, 1};
    int n = 1;

    boolean res = new Kata14().canPlaceFlowers(flowerbed, n);

    Assertions.assertEquals(true, res);
  }

  @Test
  public void testInput02() {
    int[] flowerbed = new int[] {1, 0, 0, 0, 1};
    int n = 2;

    boolean res = new Kata14().canPlaceFlowers(flowerbed, n);

    Assertions.assertEquals(false, res);
  }

  @Test
  public void testInput03() {
    int[] flowerbed = new int[] {1, 0, 0, 0, 0, 1};
    int n = 2;

    boolean res = new Kata14().canPlaceFlowers(flowerbed, n);

    Assertions.assertEquals(false, res);
  }

  @Test
  public void testInput04() {
    int[] flowerbed = new int[] {0, 0, 1, 0, 1};
    int n = 1;

    boolean res = new Kata14().canPlaceFlowers(flowerbed, n);

    Assertions.assertEquals(true, res);
  }

  @Test
  public void testInput05() {
    int[] flowerbed = new int[] {0, 0, 1, 0, 1};
    int n = 1;

    boolean res = new Kata14().canPlaceFlowers(flowerbed, n);

    Assertions.assertEquals(true, res);
  }

  @Test
  public void testInput06() {
    int[] flowerbed = new int[] {1, 0, 0, 0, 1, 0, 0};
    int n = 1;

    boolean res = new Kata14().canPlaceFlowers(flowerbed, n);

    Assertions.assertEquals(true, res);
  }

  @Test
  public void testInput07() {
    int[] flowerbed = new int[] {1, 0, 0, 0, 1, 0, 0};
    int n = 2;

    boolean res = new Kata14().canPlaceFlowers(flowerbed, n);

    Assertions.assertEquals(true, res);
  }
}
