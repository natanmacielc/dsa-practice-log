/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    /**
     * Sort meetings by start time. Use a min-heap of end times to track rooms
     * currently in use; before assigning a new meeting a room, free any room
     * whose meeting has already ended (heap top <= current start).
     * Time Complexity:  O(n log n)
     * Space Complexity: O(n)
     *
     * @param  intervals list of meeting time intervals
     * @return minimum number of rooms required
     */
    public int minMeetingRooms(List<Interval> intervals) {
        Collections.sort(intervals, Comparator.comparingInt(i -> i.start));
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int minMeetingRooms = 0;

        for (Interval interval : intervals) {
            while (!queue.isEmpty() && queue.peek() <= interval.start) {
                queue.poll();
            }
            queue.offer(interval.end);
            minMeetingRooms = Math.max(minMeetingRooms, queue.size());
        }
        return minMeetingRooms;
    }
}
