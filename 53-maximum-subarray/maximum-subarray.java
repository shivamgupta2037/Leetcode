class Solution {
    int max = -10000000;
    int sum = 0;
    public int maxSubArray(int[] nums) {
        for(int i =0 ;i<nums.length;i++){
            sum += nums[i];
            if(sum>max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
        
    }
}