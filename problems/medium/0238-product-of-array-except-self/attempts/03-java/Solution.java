class Solution {
    /**
     * Fill the answer array with prefix products in a first pass, then multiply
     * in the suffix products while walking right to left, using a single running
     * variable instead of a second array.
     * Time Complexity:  O(n)
     * Space Complexity: O(1) extra (excluding the output array)
     *
     * @param  nums input array
     * @return array where each element is the product of all other elements
     */
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        answer[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        int rightProduct = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return answer;
    }
}
