import java.util.*;

class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    String result = s.countAndSay(5);
    System.out.println(result);
  }
}

class Solution {
    public String countAndSay(int n) {
        // base cases
        if (n == 1) return "1";
        if (n == 2) return "11";
        // the last string on which we'll do our operation
        String prev = countAndSay(n - 1);
        StringBuilder result = new StringBuilder();
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < prev.length()) {
            // keep increnting i until we reach a different number & keep
            // track of the counts
            while (i < prev.length() && prev.charAt(i) == prev.charAt(j)) {
                i++;
                count++;
            }
            // append 'how many' and 'what' to the string
            result.append(count);
            result.append(prev.charAt(j));
            // reset our 'anchor' pointer j
            j = i;
            count = 0;
        }
        return result.toString();
    }
}