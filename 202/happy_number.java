import java.util.*;

class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    int nums = 19;
    boolean result = s.isHappy(nums);
    System.out.println(result);
  }
}

class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        // loop while the number does not become one
        while (n != 1) {
            int sum = 0;
            // iterate over each last digit of n
            int current = n;
            while (current != 0) {
                int lastDigit = current % 10;
                sum += (lastDigit * lastDigit);
                // remove the last digit
                current /= 10;
            }
            // add this sum to the set of 'seen' sums
            if (!set.contains(sum)) {
                set.add(sum);
            } else {
                // we are in a cycle
                return false;
            }
            n = sum;
        }
        // we have a lucky number
        return true;
    }
}