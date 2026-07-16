class Solution {
    /**
     * Time Complexity: O(n log max(pile))
     * Space Complexity: O(1)
     */
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (hoursNeeded(piles, mid) <= h) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private long hoursNeeded(int[] piles, int k) {
        long hours = 0;
        for (int pile : piles) {
            hours += (pile + k - 1) / k;
        }
        return hours;
    }
}
