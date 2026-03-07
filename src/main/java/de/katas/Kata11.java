package de.katas;

/**
 * 122. Best Time to Buy and Sell Stock II
 */
public class Kata11 {

  //@formatter:off
  /**
   * Algorithm:
   * ----------
   * Traverse the array once.
   *
   * For each pair of consecutive days:
   *
   *   diff = prices[i] - prices[i-1]
   *
   * If diff > 0:
   *   we treat this as a profitable trade and add it to the total profit.
   *
   * This implicitly represents:
   *   buy yesterday → sell today
   *
   * Example simulation:
   * -------------------
   * prices = [7, 1, 5, 3, 6, 4]
   *
   * Day transition analysis:
   *
   * 7 → 1  diff = -6  ignore
   * 1 → 5  diff = +4  add profit (buy 1, sell 5)
   * 5 → 3  diff = -2  ignore
   * 3 → 6  diff = +3  add profit (buy 3, sell 6)
   * 6 → 4  diff = -2  ignore
   *
   * total profit = 4 + 3 = 7
   *
   * Complexity:
   * -----------
   * Time  : O(n)
   * Space : O(1)
   */
  //@formatter:on
  public int maxProfit(int[] prices) {
    int maxProfit = 0;


    for (int i = 1; i < prices.length; ++i) {

      if (prices[i] - prices[i - 1] > 0) {
        maxProfit += prices[i] - prices[i - 1];
      }
    }
    return (maxProfit > 0) ? maxProfit : 0;
  }

}
