import java.util.*;

class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    boolean result = s.isPowerOfThree(27);
    System.out.println(result);
  }
}

class Solution {
    public boolean isPowerOfThree(int n) {
        long powerOfThree = 1;
        while (powerOfThree < n) {
            powerOfThree *= 3;
            System.out.println(powerOfThree);
        }
        return (int) powerOfThree == n;
    }
}