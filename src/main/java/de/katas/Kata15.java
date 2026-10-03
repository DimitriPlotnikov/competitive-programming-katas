package de.katas;

import java.util.Arrays;

/** 455. Assign Cookies */
public class Kata15 {

  /** greedy solution. Sorts greed factors and cookies. Assigns them with a first match. */
  public int findContentChildren(int[] g, int[] s) {
    int assigned = 0;
    int child = 0;
    int cookie = 0;

    Arrays.sort(g);
    Arrays.sort(s);

    while (child < g.length && cookie < s.length) {
      // System.out.println(String.format("start: g = %d, s = %d", g[child], s[cookie]));
      if (g[child] <= s[cookie]) {
        // System.out.println(String.format("match: g = %d, s = %d", g[child], s[cookie]));
        ++assigned;
        ++child;
      }
      ++cookie;
    }

    return assigned;
  }
}
