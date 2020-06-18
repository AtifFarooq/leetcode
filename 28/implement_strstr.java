class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    Integer answer = s.strStr("mississippi", "issipi");
    System.out.println(answer);
  }
}

class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        // if needle is bigger than haystack, it cannot exists in it        
        if (needle.length() > haystack.length()) return -1; 
        // don't want an index out of bounds        
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
          int j;
          for (j = 0; j < needle.length(); j++) {
            if (haystack.charAt(i + j) != needle.charAt(j)) {
              break;
            }
          }

          if (j == needle.length()) {
            return i;
          }
        }
    
        return -1;
    }
}