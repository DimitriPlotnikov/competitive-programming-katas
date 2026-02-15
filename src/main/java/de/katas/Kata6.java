package de.katas;

/**
 * Remove Element
 */
public class Kata6 {

  /**
   * 
   * @param nums an integer array
   * @param val value to remove
   * @return
   */
  public int removeElement(int[] nums, int val) {
    int lo = 0;
    int hi = 50;

    int map[] = new int[hi - lo + 1];

    for (int i = 0; i < nums.length; ++i) {
      ++map[nums[i]];
    }

    int out = 0;
    for (int j = 0; j <= hi; ++j) {
      if (j != val && map[j] > 0) {
        for (int k = 0; k < map[j]; ++k) {
          nums[out++] = j;
        }
      }
    }
    return out;
  }

}
