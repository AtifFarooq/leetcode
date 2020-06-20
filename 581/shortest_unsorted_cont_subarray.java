import java.util.*;

class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    int[] nums = {2, 6, 4, 8, 10, 9, 15};
    int result = s.findUnsortedSubarray(nums);
    System.out.println(result);
  }
}

class Solution {
    public int findUnsortedSubarray(int[] nums) {
        // make a copy of nums and sort it
        int[] sorted_nums = nums.clone();
        Arrays.sort(sorted_nums);
        int min = nums.length;
        int max = 0;
        // compare nums with copy
        // keep track of smallest & largest
        // indices where mismatches happen
        for (int i = 0; i < nums.length; i++) {
          if (nums[i] != sorted_nums[i]) {
            min = Math.min(min, i);
            max = Math.max(max, i);
          }
        }

        return (max - min > 0 ? (max - min) + 1 : 0);
    }

    public int findUnsortedSubarrayConstantSpace(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // if there is a dip in the value
        // going from left to right
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                min = Math.min(min, nums[i + 1]);
            }
        }

        // if there is an increase in value
        // going from left to right
        for (int i = nums.length - 1; i > 0; i--) {
            System.out.println(i);
            if (nums[i] < nums[i - 1]) {
                max = Math.max(max, nums[i - 1]);
            }
        }

        int left;
        int right;
        // go over nums and compare elements with 
        // values of min and max to determine their
        // correct positions. We know that the first
        // part of nums is already sorted, so look 
        // for the first element larger than min
        // (and vice verca)
        for (left = 0; left < nums.length; left++) {
          if (min < nums[left]) {
              break;
          }
        }

        for (right = nums.length - 1; right >= 0; right--) {
            if (max > nums[right]) {
                break;
            }
        }

        return (right - left > 0 ? (right - left) + 1 : 0 );
    }
}