class Solution {
    private static final int ABSENT = -1;

    /**
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     */
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if (nums[pivot] == target) {
            return pivot;
        } else if (nums[nums.length - 1] < target) {
            return binarySearch(nums, 0, pivot - 1, target);
        } else {
            return binarySearch(nums, pivot + 1, nums.length - 1, target);
        }
    }

    private int binarySearch(int[] nums, int low, int high, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ABSENT;
    }

    private int findPivot(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            if (nums[low] <= nums[high]) {
                return low;
            }

            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
