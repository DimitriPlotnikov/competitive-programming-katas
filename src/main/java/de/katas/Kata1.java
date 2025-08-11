package de.katas;

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
 * Constraints:
 * {@code
 * 1 <= s1.length, s2.length <= 104
 * s1 and s2 consist of lowercase English letters.
 * }
 */
public class Kata1 {

  private final static int INDEX_OF_A = 'a';
  public static final int LETTERS = 26;

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
    int[] histS1 = computeCharacterHistogram(s1);

    for (int i = 0; i < s2.length() - s1.length() + 1; ++i) {
      String substring = s2.substring(i, i + s1.length());
      int[] histS2 = computeCharacterHistogram(substring);

      if (included(histS1, histS2)) {
        return true;
      }
    }
    return false;
  }

  private int[] computeCharacterHistogram(String word) {

    int[] hist = new int[LETTERS]; // 0 by default

    for (Character c:word.toCharArray()) {
      ++hist[c - INDEX_OF_A];
    }
    return hist;
  }

  private boolean included(int[] freqS1, int[] freqS2) {
    for (int i = 0; i < LETTERS; ++i) {
      if (freqS1[i] > freqS2[i]) {
        return false;
      }
    }
    return true;
  }

}

