package de.katas;

/**
 * 189. Rotate Array
 */
public class Kata9 {

  public void rotate(int[] nums, int k) {
    k = k % nums.length;

    // 1, 2, 3, 4 -> 4, 3, 2, 1
    reverse(nums, 0, nums.length - 1);
    
    // 4, 3, 2, 1 -> 3, 4, 2, 1
    reverse(nums, 0, k - 1);
    
    // 3, 4, 2, 1 -> 3, 4, 1, 2
    reverse(nums, k, nums.length - 1);
    
  }

  // nums = [1, 2, 3, 4]
  // k = 2
  // [3, 4, 1, 2]
  public void reverse(int[] nums, int left, int right) {
    while (left < right) {
      int tmp = nums[left];
      nums[left] = nums[right];
      nums[right] = tmp;
      ++left;
      --right;
    }
  }

  // naive implementation with additional memory usage for tmp data.
  public void rotateOld(int[] nums, int k) {
    k = k % nums.length;

    int buf[] = new int[k];

    for (int i = 0; i < k; ++i) {
      // e.g.
      // nums = [1, 2, 3, 4]
      // k =2
      // #i = 0: nums.length - k + i == 4 - 2 + 0 == 2
      // #i = 1: nums.length - k + i == 4 - 2 + 1 == 3
      buf[i] = nums[nums.length - k + i];
    }

    for (int j = nums.length - 1; j >= k; --j) {
      // @formatter:off
      /*
       * Shift elements to the right by k positions.
       *
       * Example:
       * nums = [1, 2, 3, 4]
       * k = 2
       *
       * Initial state:
       * nums = [1, 2, 3, 4]
       *
       * Iteration details (right to left):
       *
       * j = 3:
       *   nums[3] = nums[3 - 2] = nums[1] = 2
       *   nums becomes [1, 2, 3, 2]
       *
       * j = 2:
       *   nums[2] = nums[2 - 2] = nums[0] = 1
       *   nums becomes [1, 2, 1, 2]
       *
       * After loop:
       * - Original elements [1, 2] are shifted right by k positions
       * - First k positions are free to be filled from buffer
       */
      // @formatter:on
      nums[j] = nums[j - k];
    }

    for (int i = 0; i < k; ++i) {
      nums[i] = buf[i];
    }
  }

}
