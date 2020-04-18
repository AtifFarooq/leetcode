class Solution {
    public int firstUniqChar(String s) {
        // make a char map
        int[] char_map = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char_map[s.charAt(i) - 'a']++;
        }
        
        for (char c : s.toCharArray()) {
            if (char_map[c - 'a'] == 1) {
                return s.indexOf(c);
            }
        }
        return -1;
    }
}