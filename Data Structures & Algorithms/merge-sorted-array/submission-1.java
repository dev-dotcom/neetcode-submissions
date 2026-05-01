class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int last = m + n - 1;
        int m1 = m -1;
        int n1 = n - 1;

        while(m1>=0 && n1 >=0){
            if(nums1[m1] > nums2[n1]){
                nums1[last] = nums1[m1];
                m1--;
            }
            else{
                nums1[last] = nums2[n1];
                n1--;
            }
            last --;
        }

        while(n1 >= 0){
            nums1[last] = nums2[n1];
            n1--;
            last--;
        }
        
    }
}