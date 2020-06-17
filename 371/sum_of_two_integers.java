class Solution {
    public int getSum(int a, int b) {
        // iterate till there is no carry
        while (b != 0) {
            // find position where carry is identified
            int carry = a & b;
            // do actual XOR addition and save it in a
            a = a ^ b;
            // bit shift
            b = carry << 1;
        }
        return a;
    }
}