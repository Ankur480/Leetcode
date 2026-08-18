class Solution {
    public int largestInteger(int[] nums, int k) {

        int n = nums.length;

        // Case 1: Every element forms its own subarray
        if (k == 1) {
            int[] count = new int[51];

            for (int num : nums) {
                count[num]++;
            }

            int answer = -1;

            for (int num : nums) {
                if (count[num] == 1) {
                    answer = Math.max(answer, num);
                }
            }

            return answer;
        }

        // Case 2: Whole array is one subarray
        if (k == n) {
            int answer = -1;

            for (int num : nums) {
                answer = Math.max(answer, num);
            }

            return answer;
        }

        // Case 3: 1 < k < n
        int answer = -1;

        // Only nums[0] and nums[n-1] can appear in exactly one
        // subarray of size k.

        boolean firstUnique = true;

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[0]) {
                firstUnique = false;
                break;
            }
        }

        if (firstUnique) {
            answer = Math.max(answer, nums[0]);
        }

        boolean lastUnique = true;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[n - 1]) {
                lastUnique = false;
                break;
            }
        }

        if (lastUnique) {
            answer = Math.max(answer, nums[n - 1]);
        }

        return answer;
    }
}