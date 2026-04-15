class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
         
        while(l<r){
            int temp = numbers[l] + numbers[r];
            if( temp > target){
                r--;
                continue;
            }
            if(temp < target){
                l++;
                continue;
            }
            if(temp == target){
                break;
            }
        }
        return new int[]{l+1,r+1};
    }
}
