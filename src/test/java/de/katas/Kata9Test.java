package de.katas;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Kata9Test {

  @Test
  public void testInput00() {
    int[] nums = new int[] {1, 2, 3, 4}; // Input array

    int[] expected = new int[] {3, 4, 1, 2}; // Input array
    int k = 2;
    new Kata9().rotate(nums, k); 
    
    print(nums, expected);
    
    Assertions.assertArrayEquals(expected, nums);
  }

  private void print(int[] nums, int[] expected) {
    System.out.println("Is:     " + Arrays.toString(nums));
    System.out.println("Should: " + Arrays.toString(expected));
  }
  
  @Test
  public void testInput01() {
    int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7}; // Input array

    int[] expected = new int[] {5, 6, 7, 1, 2, 3, 4}; // Input array
    int k = 3;
    new Kata9().rotate(nums, k); 
    
    print(nums, expected);
    
    Assertions.assertArrayEquals(expected, nums);
  }

  @Test
  public void testInput02() {
    int[] nums = new int[] {-1, -100, 3, 99}; // Input array

    int[] expected = new int[] {3, 99, -1, -100}; // Input array
    int k = 2;
    new Kata9().rotate(nums, k); 

    print(nums, expected);
    
    Assertions.assertArrayEquals(expected, nums);
  }
  
  @Test
  public void testInput03() {
    int[] nums = new int[] {-1}; // Input array

    int[] expected = new int[] {-1}; // Input array
    int k = 2;
    new Kata9().rotate(nums, k); 

    print(nums, expected);
    
    Assertions.assertArrayEquals(expected, nums);
  }


}
