package de.katas;

/** 392. Is Subsequence */
public class Kata16 {

  /**
   * Given two strings s and t, return true if s is a subsequence of t, or false otherwise. Simple 2
   * pointer solution.
   */
  public boolean isSubsequence(String s, String t) {
    int sIndex = 0;
    int tIndex = 0;

    char[] sChars = s.toCharArray();
    char[] tChars = t.toCharArray();

    while (sIndex < sChars.length && tIndex < tChars.length) {
      if (sChars[sIndex] == tChars[tIndex]) {
        ++sIndex;
        ++tIndex;
      } else {
        ++tIndex;
      }
    }
    return s.length() == sIndex;
  }
}
