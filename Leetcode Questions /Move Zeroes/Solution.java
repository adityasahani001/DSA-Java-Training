class Solution {
    public void moveZeroes(int[] nums) {
        // int j = 0; // position for next non zero

        // for(int i=0; i<nums.length; i++){
        //     if(nums[i] !=0){
        //         int temp = nums[i];
        //         nums[i] = nums[j];
        //         nums[j] = temp;
        //         j++;
        //     }
        // }

        // above code is also correct
        
        int index = 0;
        for(int i= 0; i<nums.length;i++){
            if(nums[i]!=0){
                nums[index]= nums[i];
                index++;
            }
        }
        while(index<nums.length){
            nums[index]=0;
            index++;
        }
        
    }
}
