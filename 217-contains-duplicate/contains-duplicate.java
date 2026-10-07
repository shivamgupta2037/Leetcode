class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length; i++){
            if(map.containsKey(nums[i])){
                int val = map.get(nums[i]);
                val = val+1;
                map.put(nums[i],val);
            }else{

                map.put(nums[i],1);
            }
        }
        for(int valu : map.values()){
            if(valu >= 2){
                return true;
            }
        }
        return false;
    }
}