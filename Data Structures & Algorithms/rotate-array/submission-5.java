class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;

        rotate(nums,0,nums.length-1);
        rotate(nums,0,k-1);
        rotate(nums,k,nums.length-1);
    }

    private void rotate(int[] arr, int i , int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}