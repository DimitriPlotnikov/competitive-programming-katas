package de.katas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Kata7Test {

  @Test
  public void testInput01() {
    int[] nums = new int[] {1, 1, 1, 2, 2, 3}; // Input array
    int[] expectedNums = new int[] {1, 1, 2, 2, 3}; // The expected answer with correct length

    int k = new Kata7().removeDuplicates(nums); // Calls your implementation

    Assertions.assertEquals(expectedNums.length, k);
    for (int i = 0; i < k; i++) {
      assert nums[i] == expectedNums[i];
    }
  }

}
