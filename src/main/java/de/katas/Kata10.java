package de.katas;

/**
 * 121. Best Time to Buy and Sell Stock
 */
public class Kata10 {

  //@formatter:off
  /**
   * LeetCode 121 – Best Time to Buy and Sell Stock
   *
   * O(n) solution using a single pass.
   *
   * Core idea (textual, no visualization):
   * ------------------------------------
   * We iterate once from left to right.
   *
   * At each day j:
   *  - we assume today is the selling day
   *  - we compute the profit using the smallest price seen BEFORE today
   *  - we update the maximum profit if this profit is better
   *  - then we update the smallest price seen so far
   *
   * Invariants:
   * -----------
   * - minPrice = smallest price seen so far (buy day)
   * - maxProfit >= 0 (no trade is always allowed)
   *
   * Textual simulation example:
   * ---------------------------
   * prices = [7, 1, 5, 3, 6, 4]
   *
   * Initial state:
   *   minPrice = 7
   *   maxProfit = 0
   *
   * Day 0:
   *   curPrice  = 7
   *   actProfit = 7 - 7 = 0
   *   maxProfit = max(0, 0) = 0
   *   minPrice  = min(7, 7) = 7
   *
   * Day 1:
   *   curPrice  = 1
   *   actProfit = 1 - 7 = -6
   *   maxProfit = max(0, -6) = 0
   *   minPrice  = min(7, 1) = 1
   *
   * Day 2:
   *   curPrice  = 5
   *   actProfit = 5 - 1 = 4
   *   maxProfit = max(0, 4) = 4
   *   minPrice  = min(1, 5) = 1
   *
   * Day 3:
   *   curPrice  = 3
   *   actProfit = 3 - 1 = 2
   *   maxProfit = max(4, 2) = 4
   *   minPrice  = min(1, 3) = 1
   *
   * Day 4:
   *   curPrice  = 6
   *   actProfit = 6 - 1 = 5
   *   maxProfit = max(4, 5) = 5
   *   minPrice  = min(1, 6) = 1
   *
   * Final result:
   *   maxProfit = 5
   */
  //@formatter:on
  public int maxProfit(int[] prices) {
    int maxProfit = 0;
    int minPrice = prices[0];

    for (int i = 0; i < prices.length; ++i) {
      int curProfit = prices[i] - minPrice;
      int curPrice = prices[i];

      if (curPrice < minPrice) {
        minPrice = curPrice;
      }

      if (curProfit > maxProfit) {
        maxProfit = curProfit;
      }
    }
    return (maxProfit > 0) ? maxProfit : 0;
  }

}
