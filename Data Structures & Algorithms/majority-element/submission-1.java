class Solution {
    public int majorityElement(int[] nums) {
        
        Map<Integer,Integer> freqMap = new HashMap<>();

        int res = 0; 
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            freqMap.put(nums[i],freqMap.getOrDefault(nums[i],0) + 1);

            if(freqMap.get(nums[i]) > nums.length / 2){
                res = nums[i];
                return res;
            }
        }
    return res;

    }
}