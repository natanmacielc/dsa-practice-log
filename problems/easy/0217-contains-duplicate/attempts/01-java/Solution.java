import java.util.HashSet;
import java.util.Set;

public class Solution {
    /**
     * Store each value from array into a HashSet, natively removing duplicates. If the set's final size is different from array length, it means that array contains duplicate.
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * @param nums An array of numbers
     * @return If any value appears at least twice in the array
     */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}
