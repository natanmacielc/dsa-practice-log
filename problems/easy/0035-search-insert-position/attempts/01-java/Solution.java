class Solution {
    /**
     * Binary search over the sorted array; when the loop exits without a
     * match, `left` has converged to the correct insertion index.
     * Time Complexity:  O(log n)
     * Space Complexity: O(1)
     *
     * @param  nums   sorted array of distinct integers
     * @param  target value to search for
     * @return index of target if found, otherwise the insertion index
     */
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int half = left + (right - left) / 2;
            int current = nums[half];
            if (current == target) {
                return half;
            } else if (current < target) {
                left = ++half;
            } else if (current > target) {
                right = --half;
            }
        }
        return left;
    }
}
