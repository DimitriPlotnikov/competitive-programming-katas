package de.katas;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 169. Majority Element
 * 
 * Given an array nums of size n, return the majority element. The majority
 * element is the element that appears more than ⌊n / 2⌋ times. You may assume
 * that the majority element always exists in the array.
 */
public class Kata8 {

	public int majorityElement(int[] nums) {
		Map<Integer, Integer> freqs = new HashMap<>();
		
		for (int i = 0; i < nums.length; ++i) {
			Integer freq = freqs.get(nums[i]);
			if (freq == null) {
				freq = 1;
			} else {
				++freq;
			}
			freqs.put(nums[i], freq);
		}
		
		Entry<Integer, Integer> max = null;
		for (Entry<Integer, Integer> freq:freqs.entrySet()) {
			if (max == null) {
				max = freq;
			} else if (freq.getValue() > max.getValue()) {
				max = freq;
			}
		}
		return max.getKey();
	}

}
