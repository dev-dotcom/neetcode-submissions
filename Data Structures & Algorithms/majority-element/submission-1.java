class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int score = 0;
        int pick = 0;
        for(int i = 0; i < nums.length; i++){

            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
            
            if(map.get(nums[i]) > score){
                pick = nums[i];
                score = map.get(nums[i]);
            }
        }
        return pick;
    }
}