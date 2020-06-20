// the main point here is that whenever s[i] is not equal to s[j],
// we can try 'removing' the element at s[i] or s[j] and seeing
// if the resultant string between i + 1...j r i...j - 1 is a palindrome
// or not (since we know that all the outer words are already palindromic)

class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return isPalindrome(s, i + 1, j) ||
                    isPalindrome(s, i, j - 1);
            }
            i++;
            j--;
        }
        return true;
    }
    
    public boolean isPalindrome(String s, int i, int j) {
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