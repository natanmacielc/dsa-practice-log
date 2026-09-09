import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TimeMap {
    private final Map<String, List<Entry>> store;

    private static class Entry {
        int timestamp;
        String value;
        Entry(int timestamp, String value) {
            this.timestamp = timestamp;
            this.value = value;
        }
    }

    /**
     * Each key maps to a list of (timestamp, value) entries kept in
     * insertion order, which is also timestamp order since set() calls for a
     * key are strictly increasing in timestamp. get() binary searches that
     * list for the entry with the largest timestamp <= the query timestamp.
     * Time Complexity:  O(1) for set; O(log n) for get, n = entries for the key
     * Space Complexity: O(n) total entries stored across all keys
     */
    public TimeMap() {
        store = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        store.computeIfAbsent(key, k -> new ArrayList<>())
             .add(new Entry(timestamp, value));
    }

    public String get(String key, int timestamp) {
        List<Entry> entries = store.get(key);
        if (entries == null || entries.isEmpty()) return "";

        int lo = 0, hi = entries.size() - 1;
        String result = "";

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (entries.get(mid).timestamp <= timestamp) {
                result = entries.get(mid).value;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return result;
    }
}
