class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    int[] nums = {0,1,0,3,12};
    s.moveZeroes(nums);
    System.out.println(nums);
  }
}

class Solution {
    public void moveZeroes(int[] nums) {
       // declare two pointers
       int i = 0;
       int j;
       for (j = 0; j < nums.length; j++) {
          // the moment the 'explorer' pointer sees a 
          // non zero value, we swap with the anchor
          if (nums[j] != 0) {
              // do a swap
              int temp = nums[i];
              nums[i] = nums[j];
              nums[j] = temp;
              // increase the 'anchor' pointer
              i++;
          }
       }
    }
}