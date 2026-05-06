class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int x = m + n -1;
        
        while(j >= 0) { // First process all the elements of second element
            if(i >= 0 && nums1[i] > nums2[j]) {
                nums1[x] = nums1[i];
                i--;
            } else {
                nums1[x] = nums2[j];
                j--;
            }
            x--;
        }

    }
}