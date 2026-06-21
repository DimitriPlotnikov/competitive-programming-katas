package de.katas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Kata13Test {

  @Test
  public void testInput01() {
    int[] nums = new int[] {2, 3, 1, 1, 4};

    int res = new Kata13().jump(nums);

    Assertions.assertEquals(2, res);
  }

  @Test
  public void testInput02() {
    int[] nums = new int[] {3, 2, 0, 1, 4};

    int res = new Kata13().jump(nums);

    Assertions.assertEquals(2, res);
  }
}
