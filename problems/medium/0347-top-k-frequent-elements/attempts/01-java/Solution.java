import java.util.*;

class Solution {
    /**
     * Time Complexity: O(n) Linear
     * Space Complexity: O(n) Linear
     * @param nums An array of non-null integers.
     * @param k An integer in the range of the array, representing the number of desired elements.
     * @return an array containing the k most frequent elements, in any order.
     */
    public int[] topKFrequent(int[] nums, int k) {
        if (nums.length == k) {
            return nums;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.merge(num, 1, Integer::sum);
        }

        List<List<Integer>> frequency = new ArrayList<>(Collections.nCopies(nums.length + 1, null));
        for (int key : map.keySet()) {
            int freq = map.get(key);
            if (frequency.get(freq) == null) {
                frequency.set(freq, new ArrayList<>());
            }
            frequency.get(freq).add(key);
        }

        int[] topKFrequent = new int[k];
        int count = 0;
        for (int i = frequency.size() - 1; count < k; i--) {
            List<Integer> bucket = frequency.get(i);
            if (bucket == null) {
                continue;
            }
            for (int num : bucket) {
                topKFrequent[count++] = num;
            }
        }

        return topKFrequent;
    }
}
