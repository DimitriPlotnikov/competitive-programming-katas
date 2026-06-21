package de.katas;

/**
 * 45. Jump Game II
 */
public class Kata13 {

  private static int[] memo;

  //@formatter:off
  // i: [0,1,2,3,4]
  // v: [2,3,1,1,4]
  // i = 0:
  //
  // a = jump(1, v)
  // b = jump(2, v)
  // 1 + min(a,b)
  //
  //@formatter:on
  public int jump(int[] nums) {
    memo = new int[nums.length];
    for (int i = 0; i < nums.length; ++i) {
      memo[i] = Integer.MAX_VALUE;
    }
    return doJump(nums, 0);
  }

  private int doJump(int[] nums, int offset) {
    if (memo[offset] != Integer.MAX_VALUE) {
      return memo[offset];
    }

    if (offset == nums.length - 1) {
      return 0;
    }

    // there is guarantee that it works
    int minJumps = Integer.MAX_VALUE;

    for (int i = 1; i <= nums[offset] && (offset + i) < nums.length; ++i) {
      int curMin = doJump(nums, offset + i);
      if (curMin < minJumps) {
        minJumps = curMin;
      }
    }

    memo[offset] = (minJumps != Integer.MAX_VALUE) ? minJumps + 1 : Integer.MAX_VALUE;
    return memo[offset];
  }

}
