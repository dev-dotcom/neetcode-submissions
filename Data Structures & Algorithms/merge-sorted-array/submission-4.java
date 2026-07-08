class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int index1 = m - 1;
        int last = nums1.length - 1;
        int index2 = n - 1;

        while(index1 >= 0 && index2 >= 0){
            if(nums1[index1] > nums2[index2]){
                nums1[last] = nums1[index1];
                index1--;
            }
            else {
                 nums1[last] = nums2[index2];
                 index2--;
            }
            last--;
        }

        if(index2>=0){
            while(index2 >= 0){
                nums1[last] = nums2[index2];
                index2--;
                last--;
            }
        }
        
    }
}