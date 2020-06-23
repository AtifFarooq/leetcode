import java.util.*;

class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    int result = s.reverse(123);
    System.out.println(result);
  }
}

class Solution {
    public int reverse(int x) {
        long reversed = 0;
        while (x != 0) {
            reversed = (10 * reversed)  + x % 10;
            x /= 10;
            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) reversed;
    }
}