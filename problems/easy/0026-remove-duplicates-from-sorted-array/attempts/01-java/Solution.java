class Solution {
    /**
     * Walk nums with a read pointer starting at index 1; whenever the
     * current element differs from the last kept unique element, write it
     * to the write-pointer slot and advance the write pointer.
     * Time Complexity:  O(n)
     * Space Complexity: O(1)
     *
     * @param  nums sorted array to de-duplicate in-place
     * @return number of unique elements in nums
     */
    public int removeDuplicates(int[] nums) {
        int uniqueElements = 1;
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if (num != nums[uniqueElements - 1]) {
                nums[uniqueElements++] = num;
            }
        }
        return uniqueElements;
    }
}
