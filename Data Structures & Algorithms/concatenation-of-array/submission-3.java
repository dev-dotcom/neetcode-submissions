class Solution {
    public int[] getConcatenation(int[] nums) {
        int N = nums.length ;
        int[] arr = new int[N*2];
        for(int i = 0; i < nums.length; i++){
            arr[i] = nums[i];
            arr[i + N] = nums[i];
        }
        return arr;
    }
}