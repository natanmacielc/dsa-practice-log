class Solution {

    /**
     * Time Complexity: O(n log (min(time) * totalTrips))
     * Space Complexity: O(1)
     */
    public long minimumTime(int[] time, int totalTrips) {
        long low = time[0];
        for (int bus : time) {
            low = Math.min(low, bus);
        }
        long high = low * totalTrips;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (tripsTaken(time, mid, totalTrips) < totalTrips) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    private long tripsTaken(int[] time, long hours, int totalTrips) {
        long trips = 0;
        for (int bus : time) {
            trips += hours / bus;
            if (trips >= totalTrips) {
                return trips;
            }
        }
        return trips;
    }
}
