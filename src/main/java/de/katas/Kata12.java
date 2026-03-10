package de.katas;

/**
 * 55. Jump Game
 */
public class Kata12 {

  //@formatter:off
  /**
   * Jump Game (LeetCode 55)
   *
   * Greedy approach:
   * ----------------
   * While iterating through the array we maintain one invariant:
   *
   *   maxReach = the farthest index we can reach so far.
   *
   * If at any time we encounter an index i such that:
   *
   *   i > maxReach
   *
   * then that index is unreachable, which means the end of the array
   * cannot be reached.
   *
   *
   * Algorithm:
   * ----------
   * 1. Start with maxReach = nums[0]
   * 2. Iterate through the array
   * 3. If current index i is greater than maxReach → return false
   * 4. Otherwise update the farthest reachable position:
   *
   *      maxReach = max(maxReach, i + nums[i])
   *
   * 5. At the end check if maxReach covers the last index.
   *
   *
   * ---------------------------------------------------------
   * Simulation 1 (successful case)
   * ---------------------------------------------------------
   *
   * nums = [2,3,1,1,4]
   * index: 0 1 2 3 4
   *
   * Initial:
   *   maxReach = nums[0] = 2
   *
   * i = 1
   *   1 <= 2 → reachable
   *   reach = 1 + 3 = 4
   *   maxReach = max(2,4) = 4
   *
   * i = 2
   *   2 <= 4 → reachable
   *   reach = 2 + 1 = 3
   *   maxReach = 4
   *
   * i = 3
   *   3 <= 4 → reachable
   *   reach = 3 + 1 = 4
   *   maxReach = 4
   *
   * i = 4
   *   4 <= 4 → reachable
   *
   * maxReach = 4 >= lastIndex (4)
   *
   * result = true
   *
   *
   * ---------------------------------------------------------
   * Simulation 2 (failure case)
   * ---------------------------------------------------------
   *
   * nums = [3,2,1,0,4]
   * index: 0 1 2 3 4
   *
   * Initial:
   *   maxReach = 3
   *
   * i = 1
   *   1 <= 3 → reachable
   *   reach = 1 + 2 = 3
   *   maxReach = 3
   *
   * i = 2
   *   2 <= 3 → reachable
   *   reach = 2 + 1 = 3
   *   maxReach = 3
   *
   * i = 3
   *   3 <= 3 → reachable
   *   reach = 3 + 0 = 3
   *   maxReach = 3
   *
   * i = 4
   *   4 > 3 → unreachable
   *
   * result = false
   *
   *
   * Complexity:
   * -----------
   * Time  : O(n)
   * Space : O(1)
   */
  //@formatter:on
  public boolean canJump(int[] nums) {
    int maxReach = nums[0];
    for (int i = 1; i < nums.length; ++i) {
      if (i > maxReach) {
        return false;
      }
      
      maxReach = Math.max(maxReach, i + nums[i]);
    }
    return maxReach >= nums.length - 1;
  }

}
