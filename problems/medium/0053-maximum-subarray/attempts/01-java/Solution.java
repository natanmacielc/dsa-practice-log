class Solution {
    /**
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int largest = nums[0];

        for (int num : nums) {
            sum += num;
            largest = Math.max(largest, sum);

            if (sum < 0) {
                sum = 0;
            }
        }

        return largest;
    }
}
