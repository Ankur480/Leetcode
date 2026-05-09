class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }

        if(nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }

        int[] Tracker1 = new int[nums.length];
        int[] Tracker2 = new int[nums.length];

        // Case 1 -> first house include, last exclude

        Tracker1[0] = nums[0];
        Tracker1[1] = Math.max(nums[0], nums[1]);

        for(int i = 2; i < nums.length - 1; ++i){

            Tracker1[i] = Math.max(nums[i] + Tracker1[i - 2],
                                   Tracker1[i - 1]);
        }

        // Case 2 -> first exclude, last include

        Tracker2[1] = nums[1];
        Tracker2[2] = Math.max(nums[1], nums[2]);

        for(int i = 3; i < nums.length; ++i){

            Tracker2[i] = Math.max(nums[i] + Tracker2[i - 2],
                                   Tracker2[i - 1]);
        }

        return Math.max(Tracker1[nums.length - 2],
                         Tracker2[nums.length - 1]);
    }
}