class Solution {
    /*
        Time Complexity: O(n)
        Space Complexity: O(n)
    */
    public int[] sortedSquares(int[] nums) {
        int n = nums.length, left = 0, right = n - 1;
        int [] result = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            int leftSquared = nums[left] * nums[left], rightSquared = nums[right] * nums[right];

            if (leftSquared >= rightSquared) {
                result[i] = leftSquared;
                left++;
            } else {
                result[i] = rightSquared;
                right--;
            }
        }

        return result;
    }
}
