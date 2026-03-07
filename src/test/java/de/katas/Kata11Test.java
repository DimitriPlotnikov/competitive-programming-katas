package de.katas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Kata11Test {
  @Test
  public void testInput01() {
    int[] prices = new int[] {7, 1, 5, 3, 6, 4};

    int profit = new Kata11().maxProfit(prices);

    Assertions.assertEquals(7, profit);
  }

  @Test
  public void testInput02() {
    int[] prices = new int[] {7, 6, 4, 3, 1}; // Input array

    int profit = new Kata11().maxProfit(prices);

    Assertions.assertEquals(0, profit);
  }

  @Test
  public void testInput03() {
    int[] prices = new int[] {1, 2, 3, 4, 5}; // Input array

    int profit = new Kata11().maxProfit(prices);

    Assertions.assertEquals(4, profit);
  }

}
