import java.util.HashMap;
import java.util.Map;

class Solution {
    /**
     * Iterate over the array from the right to left, mapping every product between the current element and the previous element into a HashMap.
     * Iterate over tha array again from the left to right, mapping every product between the current element and the previous element into a HashMap. In the end of every iteration, multiply the product of all previous elements and the product of all next elements and store it into an array of products.
     * In the end, return the array of products.
     * Time Complexity:  O(n)
     * Space Complexity: O(n)
     *
     * @param nums An array of integers.
     * @return An array that every element is equal to the product of all the elements of num except itself.
     */
    public int[] productExceptSelf(int[] nums) {
        Map<Integer, Integer> suffix = new HashMap<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (suffix.containsKey(i + 1)) {
                suffix.put(i, suffix.get(i + 1) * nums[i]);
            } else {
                suffix.put(i, nums[i]);
            }
        }

        int[] answer = new int[nums.length];
        Map<Integer, Integer> prefix = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int next = suffix.getOrDefault(i + 1, 1);
            int previous = 1;
            if (prefix.containsKey(i - 1)) {
                previous = prefix.get(i - 1);
                prefix.put(i, previous * nums[i]);
            } else {
                prefix.put(i, nums[i]);
            }
            answer[i] = previous * next;
        }
        return answer;
    }
}
