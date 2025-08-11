package de.katas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Kata5Test {

  @Test
  public void testInput1() {
    int nums1[] = new int[] {1,2,3,0,0,0};
    int nums2[] = new int[] {2,5,6};
    int expected[] = new int[] {1,2,2,3,5,6};
    
    Kata5 solution = new Kata5();
    solution.merge(nums1, 3, nums2, 3);
    Assertions.assertArrayEquals(expected, nums1);
  }
  
  @Test
  public void testInput2() {
    int nums1[] = new int[] {1};
    int nums2[] = new int[] {};
    int expected[] = new int[] {1};
    
    Kata5 solution = new Kata5();
    solution.merge(nums1, 1, nums2, 0 );
    Assertions.assertArrayEquals(expected, nums1);
  }
  
  @Test
  public void testInput3() {
    int nums1[] = new int[] {0};
    int nums2[] = new int[] {1};
    int expected[] = new int[] {1};
    
    Kata5 solution = new Kata5();
    solution.merge(nums1, 0, nums2, 1);
    Assertions.assertArrayEquals(expected, nums1);
  }

}
