package de.katas;

import java.util.Arrays;

/**
 * 72. Edit Distance Given two strings word1 and word2, return the minimum number of operations
 * required to convert word1 to word2.
 * 
 * You have the following three operations permitted on a word:
 * 
 * 1) Insert a character 2) Delete a character 3) Replace a character
 * 
 */
public class Kata3 {
  /**
   * 
   * 0 <= word1.length, word2.length <= 500 word1 and word2 consist of lowercase English letters.
   * Solution: https://web.stanford.edu/class/cs124/lec/med.pdf
   */
  public int minDistance(String word1, String word2) {
    // Example 1:
    //
    // Input: word1 = "horse", word2 = "ros"
    // Output: 3
    // Explanation:
    // horse -> rorse (replace 'h' with 'r')
    // rorse -> rose (remove 'r')
    // rose -> ros (remove 'e')
    //
    // Example 2:
    //
    // Input: word1 = "intention", word2 = "execution"
    // Output: 5
    // Explanation:
    // intention -> inention (remove 't')
    // inention -> enention (replace 'i' with 'e')
    // enention -> exention (replace 'n' with 'x')
    // exention -> exection (replace 'n' with 'c')
    // exection -> execution (insert 'u')

    int memo[][] = createMemo(word1.length(), word2.length());

    return edit_distance_rec_memo(word1, word2, word1.length(), word2.length(), memo);
  }

  public int edit_distance_rec_memo(String word1, String word2, int n, int m, int memo[][]) {
    // If first string is empty, the only option is to insert all characters of second string into
    // first
    if (n == 0) {
      return m;
    }
    if (m == 0) {
      return n;
    }

    // value already computed
    if (memo[n][m] != -1) {
      return memo[n][m];
    }

    // If last characters of two strings are same, nothing much to do. Get the count for
    // remaining strings.
    if (word1.charAt(n - 1) == word2.charAt(m - 1)) {
      memo[n][m] = edit_distance_rec_memo(word1, word2, n - 1, m - 1, memo);
      return memo[n][m];
    }

    int delete, update, insert;
    delete = edit_distance_rec_memo(word1, word2, n - 1, m, memo);
    update = edit_distance_rec_memo(word1, word2, n - 1, m - 1, memo);
    insert = edit_distance_rec_memo(word1, word2, n, m - 1, memo);

    memo[n][m] = min(update, delete, insert) + 1;
    return memo[n][m];
  }

  public int[][] createMemo(int rows, int cols) {
    int m = rows, n = cols;
    int[][] memo = new int[m + 1][n + 1];
    for (int[] row : memo)
      Arrays.fill(row, -1);
    return memo;
  }


  public int edit_distance_rec(String word1, String word2) {
    if (word1.isEmpty()) {
      return word2.length();
    }
    if (word2.isEmpty()) {
      return word1.length();
    }
    if (word1.charAt(0) == word2.charAt(0)) {
      return edit_distance_rec(word1.substring(1), word2.substring(1));
    }

    int delete, update, insert;
    delete = edit_distance_rec(word1.substring(1), word2.substring(0));
    update = edit_distance_rec(word1.substring(1), word2.substring(1));
    insert = edit_distance_rec(word1.substring(0), word2.substring(1));


    return min(update, delete, insert) + 1;
  }

  public static int min(int a, int b, int c) {
    return Math.min(Math.min(a, b), c);
  }

}
