package de.katas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Kata16Test {

  @Test
  public void testInput01() {
    String s = "abc", t = "ahbgdc";

    boolean res = new Kata16().isSubsequence(s, t);
    Assertions.assertTrue(res);
  }

  @Test
  public void testInput02() {
    String s = "acb", t = "ahbgdc";

    boolean res = new Kata16().isSubsequence(s, t);
    Assertions.assertFalse(res);
  }
}
