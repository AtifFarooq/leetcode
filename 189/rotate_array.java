class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

/** Solution using extra array */
// class Solution {
//     public void rotate(int[] nums, int k) {
//         // using extra array
//         int[] temp = new int[nums.length];
//         for (int i = 0; i < nums.length; i++) {
//             temp[(i + k) % nums.length] = nums[i];
//         }
//         for (int i = 0; i < nums.length; i++) {
//             nums[i] = temp[i];
//         }
//     }
// }