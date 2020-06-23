class Solution {
    // a two pass hash-map solution
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        // for each element in array, map int to index
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        // for each element, check if its complement exists in our map
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] {i, map.get(complement)};
            }
        }

        return null;       
    }
}