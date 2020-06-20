import java.util.*;

class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    int[] nums = {9,6,4,2,3,5,7,0,1};
    int answer = s.missingNumber(nums);
    System.out.println(answer);
  }
}

class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
          set.add(num);
        }
        int expectedCount = nums.length + 1;
        for (int i = 0; i < expectedCount; i++) {
          if (!set.contains(i)) {
            return i;
          }
        }
        return -1;
    }

    public int missingNumberGauss(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int i = 0; i < nums.length; i++) {
            actualSum += nums[i];
        }
        return expectedSum - actualSum;
    }

}
