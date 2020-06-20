import java.util.*;

class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    String str = "AB";
    int answer = s.titleToNumber(str);
    System.out.println(answer);
  }
}

class Solution {
    public int titleToNumber(String s) {
        if (s == null || s == "") return -1;
        // Base 26 (sum gets += with 26^i * (charAt(i) - 'A') + 1)
        int number = 0;
        for (int i = 0; i < s.length(); i++) {
          number *= 26;
          number += (s.charAt(i) - 'A') + 1;
        }
        return number;
    }
}
