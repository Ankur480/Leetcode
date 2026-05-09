class Solution {
    public int rob(int[] nums) {
        int[] Tracker = new int[nums.length];
        if(nums.length==1) return nums[0];
        Tracker[0] = nums[0];
        Tracker[1] = Math.max(nums[0],nums[1]);
        // Tracker[2] = Math.max(nums[2] + Tracker[2 - 2], Tracker[2-1]);

        for(int i = 2; i< nums.length; ++i){
            Tracker[i] = Math.max(nums[i] + Tracker[i-2], Tracker[i-1]);
        }

        return Tracker[Tracker.length-1];
    }
}