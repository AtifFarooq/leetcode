class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    Integer answer = s.removePalindromeSub("aba");
    System.out.println(answer);
  }
}


class Solution {
    public int removePalindromeSub(String s) {
        // the catch here is that there can only BE
        // these three cases since the string only
        // consists of 'a' and 'b' chars
        if (s.length() == 0) return 0;
        if (isPalindrome(s)) return 1;
        return 2;        
    }

    public boolean isPalindrome(String s) {
      int i = 0;
      int j = s.length() - 1;
      while (i < j) {
        if (s.charAt(i) != s.charAt(j)) {
          return false;
        }
        i++;
        j--;
      }
      return true;
    }
}