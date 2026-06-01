class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        rev(nums, 0, nums.length - 1); // Reverse the entire array
        rev(nums, 0, k - 1);           // Reverse the first k elements
        rev(nums, k, nums.length - 1);
        
    }

    private  void rev(int[] arr, int i, int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}