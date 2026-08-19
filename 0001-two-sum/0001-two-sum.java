class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0; i<nums.length; i++)
        {
            int required = target - nums[i];
            if(map.containsKey(required)) {
                int[] result = {map.get(required),i};
                return result;
            }

            map.put(nums[i], i);
        }
        int[] empty = {};
        return empty;
    }
}