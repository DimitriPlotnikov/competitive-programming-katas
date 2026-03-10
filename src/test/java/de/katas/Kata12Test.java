package de.katas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Kata12Test {

  @Test
  public void testInput01() {
    int[] nums = new int[] {2, 3, 1, 1, 4};

    boolean res = new Kata12().canJump(nums);

    Assertions.assertEquals(true, res);
  }

  @Test
  public void testInput02() {
    int[] nums = new int[] {3, 2, 1, 0, 4};

    boolean res = new Kata12().canJump(nums);

    Assertions.assertEquals(false, res);
  }
}
