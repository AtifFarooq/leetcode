/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    // use Kadane's algorithm
    if (nums.length == 1) return nums[0];
    var global_max = nums[0];
    var max_current = nums[0];
    for (let i = 1; i < nums.length; i++) {
        max_current = Math.max(max_current + nums[i], nums[i]);
        if (max_current > global_max) {
            global_max = max_current;
        }
    }
    return global_max;
};