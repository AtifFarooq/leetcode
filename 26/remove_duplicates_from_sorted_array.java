class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    int[] nums = {0,0,1,1,1,2,2,3,3,4};
    int len = s.removeDuplicates(nums);
    System.out.println(len);
  }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        // account for edge cases
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // introduce two pointers
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            // increment the slower pointer & 
            // swap values if elements not same
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}