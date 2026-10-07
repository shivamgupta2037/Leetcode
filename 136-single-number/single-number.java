class Solution {
    public int singleNumber(int[] nums) {
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
        for(int key : map.keySet()){
            if(map.get(key)==1){
                return key;
            }
        }
        return -1;
    }
}