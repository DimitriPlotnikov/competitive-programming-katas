package de.katas;

/**
 * Remove Duplicates from Sorted Array
 */
public class Kata04 {
  /**
   * @param nums Constraints: 1 <= nums.length <= 3 * 104 -100 <= nums[i] <= 100
   * 
   * @return nums is sorted in non-decreasing order.
   */
  public int removeDuplicates(int[] nums) {
    int write = 1;

    for (int read = 1; read < nums.length; ++read) {
      if (nums[read - 1] != nums[read]) {
        nums[write++] = nums[read];
      }
    }
    return write;
  }
}
