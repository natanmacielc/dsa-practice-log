class Solution {
    /**
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     * @param nums An array of sorted and unique integers in ascending order.
     * @param target An integer that should be found.
     * @return The index of target in nums array, if it exists, otherwise, return -1.
     */
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int half = left + (right - left) / 2;
            int num = nums[half];
            if (num < target) {
                left = ++half;
            } else if (num > target) {
                right = --half;
            } else {
                return half;
            }
        }
        return -1;
    }
}
