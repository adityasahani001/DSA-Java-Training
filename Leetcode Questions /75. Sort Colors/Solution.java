// LeetCode 75 SortColors

//Better
class Solution {
    public void sortColors(int[] nums) {
        int count0 = 0;
        int count1= 0;
        int count2 = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                count0++;
            } else if(nums[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }
        for(int i = 0; i < nums.length; i++) {
            if(i < count0) {
                nums[i] = 0;
            }else if (i < count0 + count1) {
                nums[i] = 1;
            } else {
                nums[i] = 2;
            }
        }
    }
}


//Optimal
class Solution {
    public void sortColors(int[] nums) {
       int start = 0;
       int middle = 0;
       int end = nums.length - 1;

       while (middle <= end) {
        if(nums[middle] == 0) {
            int temp = nums[start];
            nums[start] = nums[middle];
            nums[middle] = temp;
            start++;
            middle++;
        } else if (nums[middle] == 1) {
            middle++;
        } else {
            int temp = nums[middle];
            nums[middle] = nums[end];
            nums[end] = temp;
            end--;
            }
       }
    }
}
