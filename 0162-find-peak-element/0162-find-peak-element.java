class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length;
        int Storeindex = -1;
        while(left <= right)
        {
            int mid = left + (right-left) / 2;
            if(mid == nums.length - 1 || nums[mid] > nums[mid + 1]) {
            Storeindex = mid;
            right = mid-1;
            }
            else {
                left = mid + 1;
            }
        }
        return Storeindex;
    }
}