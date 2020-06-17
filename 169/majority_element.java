class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num: nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
              map.put(num, map.get(num) + 1);
            }
        }

        // init majority entry in map
        Map.Entry<Integer, Integer> majorityEntry = null;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            // update existing majority entry
            if (majorityEntry == null || 
                entry.getValue() > majorityEntry.getValue()) {
                majorityEntry = entry;
            }
        }
        return majorityEntry.getKey();       
    }
}