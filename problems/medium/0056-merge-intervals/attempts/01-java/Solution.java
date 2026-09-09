import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    /**
     * Sort intervals by start; sweep through and extend the current interval's
     * end whenever the next interval overlaps (its start is within the
     * current range), otherwise start a new merged interval.
     * Time Complexity:  O(n log n) for the sort
     * Space Complexity: O(n) for the merged list / sort
     *
     * @param  intervals array of [start, end] intervals
     * @return the intervals after merging all overlapping ones
     */
    public int[][] merge(int[][] intervals) {
        List<int[]> merged = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int[] current = intervals[0];
        merged.add(current);
        for (int i = 1; i < intervals.length; i++) {
            int[] next = intervals[i];
            if (current[1] >= next[0]) {
                current[1] = Math.max(current[1], next[1]);
            } else {
                current = next;
                merged.add(next);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
