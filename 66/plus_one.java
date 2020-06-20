import java.util.*;

class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    int[] digits = {1,2,3};
    int[] answer = s.plusOne(digits);
  }
}

class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newDigitsArray = new int[digits.length + 1];
        newDigitsArray[0] = 1;
        return newDigitsArray;
    }
}
