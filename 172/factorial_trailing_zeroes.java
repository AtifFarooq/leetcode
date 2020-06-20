import java.util.*;
import java.math.*;

class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    int n = 13;
    int answer = s.trailingZeroes(n);
    System.out.println(answer);
  }
}

class Solution {
    public int trailingZeroes(int n) {
      // trailing zeroes are the same as the max number of
      // complete (2 * 5) pairs of factors of n. There will
      // always be more 2s than 5s, so we can use 5s as a 
      // limiting case. Subsequent divisions will give us
      // cases that contain multiple factors themselves
      // (such as 25 being made up of 5 *5)
      int count = 0;
      while (n >= 5) {
        int temp = n / 5;
        count += temp;
        n = temp;
      }
      return count;
    }
}
