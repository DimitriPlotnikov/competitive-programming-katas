package de.katas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Kata8Test {

  @Test
  public void testInput01() {
    int[] nums = new int[] {3, 2, 3}; // Input array

    int k = new Kata8().majorityElement(nums); // Calls your implementation

    Assertions.assertEquals(3, k);
  }

  @Test
  public void testInput02() {
    int[] nums = new int[] {2, 2, 1, 1, 1, 2, 2}; // Input array

    int k = new Kata8().majorityElement(nums); // Calls your implementation

    Assertions.assertEquals(2, k);
  }

  @Test
  public void testInput03() {
    int[] nums = new int[] {6, 5, 5}; // Input array

    int k = new Kata8().majorityElement(nums); // Calls your implementation

    Assertions.assertEquals(5, k);
  }

}
