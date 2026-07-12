class Solution {
    /**
     * Walk nums with a read pointer; whenever the current element differs
     * from val, write it to the write-pointer slot and advance the write
     * pointer. The write pointer ends up holding the count of kept elements.
     * Time Complexity:  O(n)
     * Space Complexity: O(1)
     *
     * @param  nums array to compact in-place
     * @param  val  value to remove
     * @return number of elements in nums not equal to val
     */
    public int removeElement(int[] nums, int val) {
        int numbersDifferentToVal = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num != val) {
                nums[numbersDifferentToVal++] = num;
            }
        }
        return numbersDifferentToVal;
    }
}
