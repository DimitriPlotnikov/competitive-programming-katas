package de.katas;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * permutation-in-string
 * Example 1:
 * {@code
 * Input: s1 = "ab", s2 = "eidbaooo"
 * Output: true
 * Explanation: s2 contains one permutation of s1 ("ba").
 * }
 * Example 2:
 * {@code
 * Input: s1 = "ab", s2 = "eidboaoo"
 * Output: false
 * }
 */
public class Kata01 {

  /**
   * Check if there is permutation of s1 in s2. For this, computes a histogram as sliding windows
   * over s2
   * @param s1 query
   * @param s2 text
   * @return true iff. there is a permutation of s1 in s2
   */
  public boolean checkInclusion(String s1, String s2) {
    if (s1.length() > s2.length()) {
      return false;
    }

    for (int i = 0; i < s2.length() - s1.length() + 1; ++i) {
      String substring = s2.substring(i, i + s1.length());
      boolean t = doCheck(s1, substring);
      if (t) {
        return true;
      }
    }
    return false;
  }

  private boolean doCheck(String s1, String s2) {
    Map<Character, Integer> histS1 = computeCharacterHistogram(s1);
    Map<Character, Integer> histS2 = computeCharacterHistogram(s2);

    return included(histS1, histS2);
  }

  private Map<Character, Integer> computeCharacterHistogram(String word) {
    Map<Character, Integer> freq = new HashMap<>();
    for (Character c:word.toCharArray()) {
      freq.merge(c, 1, Integer::sum);
    }
    return freq;
  }

  private boolean included(Map<Character, Integer> freqA, Map<Character, Integer> freqB) {
    for (Entry<Character, Integer> entry :freqA.entrySet()) {
      Integer freq = freqB.get(entry.getKey());
      if (freq == null || freq < entry.getValue()) {
        return false;
      }
    }
    return true;
  }

}

