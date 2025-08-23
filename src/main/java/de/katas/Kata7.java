package de.katas;

/**
 * 80. Remove Duplicates from Sorted Array II Medium Topics premium lock iconCompanies
 * 
 * Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such
 * that each unique element appears at most twice. The relative order of the elements should be kept
 * the same
 */
public class Kata7 {
  
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
