class Solution {
    /**
     * Create an integer variable called 'n' and store the length of the array of integers 'nums' on it.
     * Create an array of integers called 'ans' and initialize it with one new integer array with the double size of 'nums'.
     * Iterate over the integer array 'nums' using a for loop.
     * Add every element in the integer array 'ans' at the same index and index + 'n'.
     * End of for loop.
     * Return the array of integers 'ans'.
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n * 2];
        for (int i = 0; i < n; i++) {
            int current = nums[i];
            ans[i] = nums[i];
            ans[i + n] = current;
        }
        return ans;
    }
}
