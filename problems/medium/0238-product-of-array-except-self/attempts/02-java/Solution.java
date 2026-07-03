class Solution {
    /**
     * Computes an array where each element is the product of all other elements,
     * without using division and without extra space beyond the output array.
     *
     * Approach: Two passes over the output array.
     * 1. First pass (left to right): answer[i] holds the product of all elements
     *    to the LEFT of i.
     * 2. Second pass (right to left): multiply answer[i] by the running product
     *    of all elements to the RIGHT of i.
     *
     * Time Complexity:  O(n) — two linear passes over nums.
     * Space Complexity: O(1) extra space — only the output array and two scalar
     * accumulators are used (output array excluded per problem statement).
     *
     * @param nums input array of integers
     * @return array where result[i] = product of all nums[j] for j != i
     */
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        // Pass 1: answer[i] = product of everything to the left of i
        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        // Pass 2: multiply in the product of everything to the right of i
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return answer;
    }
}
