package de.katas;

/**
 * 88. Merge Sorted Array
 */
public class Kata5 {

  /**
   * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
   * 
   * @param nums1.length == m + n
   * @param nums2.length == n
   */
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int p1 = m - 1;
    int p2 = n - 1;
    int p = n + m - 1;

    while (p1 >= 0 && p2 >= 0) {
      if (nums1[p1] > nums2[p2]) {
        nums1[p--] = nums1[p1--];
      } else {
        nums1[p--] = nums2[p2--];
      }

    }
    while (p2 >= 0) {
      nums1[p--] = nums2[p2--];
    }
  }

}
