class Solution {
    /**
     * Compute the total sum once, then scan left to right tracking the running
     * left sum and deriving the right sum from the total, avoiding a second pass.
     * Time Complexity:  O(n)
     * Space Complexity: O(1)
     *
     * @param  nums input array
     * @return the leftmost pivot index, or -1 if none exists
     */
    private static final int NO_PIVOT_INDEX = -1;

    public int pivotIndex(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightSum = total - leftSum - nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }

        return NO_PIVOT_INDEX;
    }
}
