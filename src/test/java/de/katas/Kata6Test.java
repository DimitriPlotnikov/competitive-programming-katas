package de.katas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Kata6Test {

  @Test
  public void testInput1() {
    int[] nums = new int[] {3, 2, 2, 3}; // Input array
    int val = 3; // Value to remove
    int[] expectedNums = new int[] {2, 2}; // The expected answer with correct length.
    // It is sorted with no values equaling val.

    int k = new Kata6().removeElement(nums, val); // Calls your implementation

    assertSolution(nums, expectedNums, k);
  }

  private void assertSolution(int[] nums, int[] expectedNums, int k) {
    Assertions.assertEquals(expectedNums.length, k);

    for (int i = 0; i < expectedNums.length; i++) {
      Assertions.assertEquals(expectedNums[i], nums[i]);
    }
  }
}
