class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    String[] strs = {"flower","flow","flight"};
    String solution = s.longestCommonPrefix(strs);
    System.out.println(solution);
  }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        // if the string array is empty or null, return empty string
        if (strs == null || strs.length == 0) {
            return "";
        }

        // set the first element as the default longest common prefex
        String prefix = strs[0];
        // loop from the second element to the end of the array
        for (int i = 1; i < strs.length; i++) {
            int index  = 0;
            String currentWord = strs[i];
            while (index < prefix.length() && index < currentWord.length()
            && prefix.charAt(index) == currentWord.charAt(index)) {
                index++;
            }

            // if index still zero here, no common prefix
            if (index == 0) {
                return "";
            }

            // update longest common prefix
            prefix = prefix.substring(0, index);
        }
        return prefix;
    }
}