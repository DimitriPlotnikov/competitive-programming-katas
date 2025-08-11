package de.katas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Kata4Test {

  @Test
  public void testInput01() {
    int[] nums = new int[] {1, 1, 2}; // Input array
    int[] expectedNums = new int[] {1, 2}; // The expected answer with correct length

    int k = new Kata4().removeDuplicates(nums); // Calls your implementation

    Assertions.assertEquals(expectedNums.length, k);
    for (int i = 0; i < k; i++) {
      assert nums[i] == expectedNums[i];
    }
  }

  @Test
  public void testInput02() {
    int[] nums = new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}; // Input array
    int[] expectedNums = new int[] {0, 1, 2, 3, 4}; // The expected answer with correct length

    int k = new Kata4().removeDuplicates(nums); // Calls your implementation

    Assertions.assertEquals(expectedNums.length, k);
    for (int i = 0; i < k; i++) {
      assert nums[i] == expectedNums[i];
    }
  }

}
