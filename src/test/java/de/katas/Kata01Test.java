package de.katas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Tests some expected and corner cases.
 */
public class Kata01Test {

  @Test
  public void shouldAnswerWithTrue() {
    Kata01 solver = new Kata01();
    String s1 = "ab", s2 = "eidbaooo";
    Assertions.assertTrue(solver.checkInclusion(s1, s2));
  }

  @Test
  public void shouldAnswerWithFalse() {
    Kata01 solver = new Kata01();
    String s1 = "ab", s2 = "eidboaoo";
    Assertions.assertFalse(solver.checkInclusion(s1, s2));
  }

  @Test
  public void wasWrongOnSubmission1() {
    Kata01 solver = new Kata01();
    String s1 = "dinitrophenylhydrazine", s2 = "acetylphenylhydrazine";
    System.out.println("S1:" + s1.length());
    System.out.println("S2:" + s2.length());
    Assertions.assertFalse(solver.checkInclusion(s1, s2));
  }

}
