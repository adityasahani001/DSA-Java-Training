// Leetcode 53
//Brute Force 
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
            int sum = 0;
            for(int j = i; j < nums.length; j++) {
                sum = sum + nums[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
}
TC = O(N^2)
SC = O(1)

// Optimal Approach 
  
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];

        if(sum > maxSum) {
            maxSum = sum;
            }    
        if(sum < 0){
            sum = 0;
            }
        }
        return maxSum;
    }
}

TC = O(N)
SC = O(1)
