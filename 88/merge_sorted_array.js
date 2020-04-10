var merge = function(nums1, m, nums2, n) {
    // pointers at the last elements of each list
    first = m - 1;
    second = n - 1;

    // loop over nums1 starting from the last place
    for (let index = nums1.length - 1; index >= 0; index--) {
        // account for cases where one of the pointers exits list
        if (second < 0) {
          // use everything remaining in nums1
          nums1[index] = nums1[first];
          first--;
        } else if (first < 0) {
          // use everything remaining in nums2
          nums1[index] = nums2[second];
          second--;
        } else {
          // compare biggest elements and assign to end of nums1
          if (nums2[second] > nums1[first]) {
              nums1[index] = nums2[second];
              second--;
          } else {
              nums1[index] = nums1[first];
              first--;
          }
        }
    }
};

nums1 = [1, 2, 3, 0, 0, 0];
m = 3
nums2 = [2, 5, 6];
n = 3

merge(nums1, m, nums2, n)

// Input:
// nums1 = [1,2,3,0,0,0], m = 3
// nums2 = [2,5,6],       n = 3

// Output: [1,2,2,3,5,6]