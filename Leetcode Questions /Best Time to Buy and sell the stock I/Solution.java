// Leetcode 121 Problem statement solution

import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }}
        return maxProfit;
}}

class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = sol.maxProfit(prices);
        System.out.println("Maximum Profit: " + result);
    }
}

----------------------------------------------------------------------------------------------------->
#in class by Abhishek Sir
----------------------------------------------------------------------------------------------------->

class Solution {
    public int maxProfit(int[] prices) {
   
    int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;
    
    for(int i = 0; i<prices.length; i++){
        minPrice = Math.min(minPrice, prices[i]);
        maxProfit = Math.max(maxProfit, prices[i]-minPrice);
    }
    return maxProfit;
}
}
