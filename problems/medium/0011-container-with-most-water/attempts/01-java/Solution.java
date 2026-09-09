class Solution {
    /**
     * Two pointers starting at both ends; the area is bounded by the shorter
     * line, so always move the pointer at the shorter line inward — moving
     * the taller one can only shrink width without ever growing the height.
     * Time Complexity:  O(n)
     * Space Complexity: O(1)
     *
     * @param  height the height of each vertical line
     * @return the maximum area of water two lines can contain
     */
    public int maxArea(int[] height) {
        int n = height.length, left = 0, right = n - 1, maxArea = 0;
        while (left < right) {
            int width = right - left, minHeight = Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, width * minHeight);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
