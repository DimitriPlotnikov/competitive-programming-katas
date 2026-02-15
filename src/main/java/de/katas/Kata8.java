package de.katas;

/**
 * 169. Majority Element
 * 
 * Given an array nums of size n, return the majority element. The majority
 * element is the element that appears more than ⌊n / 2⌋ times. You may assume
 * that the majority element always exists in the array.
 */
public class Kata8 {

	/**
	 * Boyer-Moore majority vote algorithm
	 */
	public int majorityElement(int[] nums) {
		int candidate = 0;
		int freq = 0;
		
		for (int n:nums) {
			if (freq == 0) {
				candidate = n;
				freq = 1;
			} else {
				if (n == candidate) {
					++freq;
				} else {
					--freq;
				}
			}
		}
		return candidate;
	}

}
