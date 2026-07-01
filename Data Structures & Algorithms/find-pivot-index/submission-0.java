class Solution {
    public int pivotIndex(int[] nums) {
        int t = 0;
        int l = 0;

        for(int i : nums){
            t += i;
        }

        for(int j = 0; j < nums.length; j++){
            
            if(l == t - l - nums[j]){
                return j;
            }
            
            l += nums[j];
        }
        return -1;
    }
}