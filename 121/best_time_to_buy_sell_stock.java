class Main {
  public static void main(String[] args) {
    int[] prices = {7,1,5,3,6,4};
    Solution s = new Solution();
    int result = s.maxProfit(prices);
    System.out.println(result);
  }
}

class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            // update min price to lowest you see 
            //  or determine if you should sell
            if (prices[i] < min) {
                min = prices[i];
            } else if (prices[i] - min > maxProfit) {
                maxProfit = prices[i] - min;
            }
        }
        return maxProfit;
    }
}