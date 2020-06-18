import java.util.*;
import java.util.Map;

class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    int[] nums = {2,2,1};
    Integer answer = s.singleNumber(nums);
    System.out.println(answer);
  }
}

class Solution {
    public int singleNumber(int[] nums) {
        // Most basic HashMap solution
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
          if (!map.containsKey(num)) {
            map.put(num, 1);
          } else {
            int count = map.get(num);
            map.put(num, count + 1);
          }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
          if (entry.getValue() == 1) {
            return entry.getKey();
          }
        }
        return -1;
    }

    public int singleNumberXOR(int[] nums) {
        // Better solution: use XOR
        // XOR of 0 and some bit returns that bit -> 1 XOR 0 = 1
        // XOR of two same bits results in a 0 -> 1 XOR 1 = 0
        // XOR can be chained together, pairs of numbers will 'cancel out'
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
          answer ^= nums[i];
        }
        return answer;
    }

}