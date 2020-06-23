import java.util.*;

class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    int[] nums1 = {1,2,2,1};
    int[] nums2 = {2,2};
    int[] result = s.intersect(nums1, nums2);
    System.out.println(result);
  }
}

class Solution {
    // The problem description is a bit vague, by intersection, they mean
    // the common elements that appear in both arrays. I think being contiguous
    // is not a concern here. So, it just has to do with counting frequencies,
    // and when both frequency maps have the same number, we choose the lower of 
    // the two since that is an 'intersection'.
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> intersection = new ArrayList<Integer>();
        HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();
        // compute frequency counts for the two arrays
        for (int num : nums1) {
            if (map1.containsKey(num)) {
                map1.put(num, map1.get(num) + 1);
            } else {
                map1.put(num, 1);
            }
        }

        for (int num : nums2) {
            if (map2.containsKey(num)) {
                map2.put(num, map2.get(num) + 1);
            } else {
                map2.put(num, 1);
            }
        }

        for (int key : map1.keySet()) {
            if (map2.containsKey(key)) {
                // if both arrays contain the element, we want the lower count
                int minValue = Math.min(map1.get(key), map2.get(key));
                // Add the element minValue number of times to the list
                while (minValue > 0) {
                    intersection.add(key);
                    minValue--;
                }
            }
        }
        // return result as an array
        int[] result = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }
        
        return result;
    }
}