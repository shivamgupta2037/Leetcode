class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] op = new int[nums.length];

        int left = 1;

        for(int i=0;i<nums.length;i++){
            op[i] = left;
            left *= nums[i];
        }
        int right = 1;
        for(int j =nums.length-1;j>=0;j--){
            op[j] *= right;
            right *= nums[j];
        }
        return op;
        
    }
}  
