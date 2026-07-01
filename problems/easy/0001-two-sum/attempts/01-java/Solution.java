import java.util.HashMap;
import java.util.Map;

public class Solution {
    /**
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * @param nums An array of integers.
     * @param target An integer that represents the desired value when adding up two different indices of the array.
     * @return An array with both nums indices, that when they're added up, the result is equal than target.
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int expected = target - nums[i];
            if (map.containsKey(expected)) {
                return new int[]{map.get(expected), i};
            } else {
                map.put(nums[i], i);
            }
        }

        return new int[0];
    }
}
