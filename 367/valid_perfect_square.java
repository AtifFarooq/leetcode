class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 1) return true;
        // We use longs to prevent integer overflow
        // since the max val for num is 2^31 - 1
        long i = 1;
        long j = num;
        while (i <= j) {
            long mid = i + ((j - i) / 2);
            long result = mid * mid;
            if (result == num) {
                return true;
            } else if (result > num) {
                // result is on the left
                j = mid - 1;
            } else {
                // result is on the right
                i = mid + 1;
            }
        }
        return false;
    }
}