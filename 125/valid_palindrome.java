class Main {
  public static void main(String[] args) {
    Solution solution = new Solution();
    String s = "A man, a plan, a canal: Panama";
    System.out.println(solution.isPalindrome(s));
  }
}

class Solution {
    public boolean isPalindrome(String s) {
        // remove non alpha-numeric characters from the string
        String trimmedString = "";
        for (char c : s.toCharArray()) {
          if (Character.isLetter(c) || Character.isDigit(c)) {
              trimmedString += c;
          }
        }
        trimmedString = trimmedString.toLowerCase();
        // declare pointers
        int i = 0;
        int j = trimmedString.length() - 1;

        // while pointers do not collide
        while (j >= i) {
            if (trimmedString.charAt(i) != trimmedString.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}