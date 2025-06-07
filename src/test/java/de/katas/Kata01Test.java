package de.katas;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class Kata01Test {


  /**
   * Rigorous Test :-)
   */
  @Test
  public void shouldAnswerWithTrue() {
    Kata01 solver = new Kata01();
    String s1 = "ab", s2 = "eidbaooo";
    Assertions.assertTrue(solver.checkInclusion(s1, s2));
  }

  @Test
  public void computeAllPermutations() {
    Kata01 solver = new Kata01();
    String s1 = "ab", s2 = "eidbaooo";
    List<String> r = solver.computeAllPermutations("ABC");
    r.forEach((String s) -> System.out.println("" + s));
  }
}
