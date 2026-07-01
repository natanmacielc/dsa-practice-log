import java.util.HashSet;
import java.util.Set;

public class Solution {
    /**
     * Iterate over the array of integers and store each element inside the array into a HashSet. After the HashSet got fulfilled, iterate over the HashSet, if the element don't have any previous one, then evaluate its sequence length. If this sequence length is greater than the current largest sequence, then replace it by the current sequence length.
     * At the end of iteration, return the largest sequence length stored into a variable
     * Example:
     * Input: [1, 0, 1, 2]
     * Output: 3
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * @param nums An unsorted array of integers
     * @return the length of the longest consecutive elements sequence
     */
    public int longestConsecutive(int[] nums) {
        int longestSequence = 0;
        if (nums == null || nums.length == 0) {
            return longestSequence;
        }

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int sequence = 1;
                while (set.contains(num + sequence)) {
                    sequence++;
                }
                longestSequence = Math.max(longestSequence, sequence);
            }
        }

        return longestSequence;
    }
}