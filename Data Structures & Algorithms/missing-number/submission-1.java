class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        int actualsum  = 0;
        for(int i : nums){
            actualsum += i;
        }

        int expectedSum = n * (n+1) / 2;

        return expectedSum - actualsum;
    }
}
