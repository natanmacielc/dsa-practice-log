class Solution {

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int left = 1, right = 1;
        int result = nums[0];

        for (int i = 0; i < n; i++) {
            left *= nums[i];
            right *= nums[n - 1 - i];

            result = Math.max(result, Math.max(left, right));

            if (left == 0) {
                left++;
            }

            if (right == 0) {
                right++;
            }
        }

        return result;
    }
}
