class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    int[] nums = {10,1,1,200};
    int result = s.rob(nums);
    System.out.println(result);
  }
}

class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) return nums[0];
        
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        // At every position, what is the max amount that
        // we can rob? Either the current val + last valid sum,
        // or last valid sum (dp[i - 1])
        for (int i = 2; i < dp.length; i++) {
          dp[i] = Math.max(dp[i - 1], nums[i] + dp[i - 2]);
        }
        // the max that we can rob is the last element
        return dp[dp.length - 1];
    }
}