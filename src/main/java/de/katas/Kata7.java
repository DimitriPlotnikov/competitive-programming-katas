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
	    if (nums.length <= 2) {
	        return nums.length;
	    }

	    int write = 2;  // first two elements are always allowed

	    for (int read = 2; read < nums.length; ++read) {
	        if (nums[read] != nums[write - 2]) {
	            nums[write++] = nums[read];
	        }
	    }

	    return write;
	}

}
