class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    Boolean answer = s.repeatedSubstringPattern("ab");
    System.out.println(answer);
  }
}


class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String newString = s + s;
        String modifiedString = newString.substring(1, newString.length() - 1);
        return modifiedString.contains(s);
    }
}