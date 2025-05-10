class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mergedIdx = m + n;
        m--;
        n--;

        for(int i = mergedIdx-1; i >= 0; i--){
            if(m < 0) {
                nums1[i] = nums2[n];
                n--;
                continue;
            } 
            if(n < 0) {
                nums1[i] = nums1[m];
                m--;
                continue;
            }

            if(nums1[m] > nums2[n]) {
                nums1[i] = nums1[m];
                m--;
            } else {
                nums1[i] = nums2[n];
                n--;
            }
        }
    }
}