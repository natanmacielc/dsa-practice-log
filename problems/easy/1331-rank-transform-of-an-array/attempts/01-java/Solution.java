import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    /**
     * Sort a clone of arr to determine rank order, assign each distinct
     * value the next rank while scanning the sorted array, then map the
     * original array through the value-to-rank lookup.
     * Time Complexity:  O(n log n)
     * Space Complexity: O(n)
     *
     * @param  arr array to rank-transform
     * @return array where each element is replaced by its rank
     */
    public int[] arrayRankTransform(int[] arr) {
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        Map<Integer, Integer> rankOf = new HashMap<>();
        int rank = 1;
        for (int num : sorted) {
            if (!rankOf.containsKey(num)) {
                rankOf.put(num, rank++);
            }
        }
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = rankOf.get(arr[i]);
        }
        return result;
    }
}
