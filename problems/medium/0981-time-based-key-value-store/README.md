# 981. Time Based Key-Value Store

|              |                                                     |
| ------------ | --------------------------------------------------- |
| **Level**    | Medium                                               |
| **Source**   | [LeetCode #981](https://leetcode.com/problems/time-based-key-value-store/) |
| **Topics**   | Hash Table, String, Binary Search, Design            |
| **Attempts** | 1                                                     |

## Problem

Design a time-based key-value store that can store multiple values for the
same key at different timestamps, and retrieve the value for a key at (or
just before) a given timestamp.

**Example**

```
Input:  set("foo", "bar", 1); get("foo", 1); get("foo", 3);
        set("foo", "bar2", 4); get("foo", 4); get("foo", 5)
Output: null, "bar", "bar", "bar2", "bar2"
```

**Constraints**

- `1 <= key.length, value.length <= 100`
- `1 <= timestamp <= 10^7`
- `set` is called with strictly increasing `timestamp` for the same key.
- At most `2 * 10^5` calls total to `set` and `get`.

## Attempt Log

| #                                    | Date       | Language | Approach            | Time | Space | Result             | Notes |
| ------------------------------------ | ---------- | -------- | ------------------- | ---- | ----- | ------------------ | ----- |
| [01](attempts/01-java/Solution.java) | 2026-09-09 | Java     | Map each key to a list of (timestamp, value) entries in insertion/timestamp order; binary search for the largest timestamp <= the query | O(1) set, O(log n) get | O(n) | 🟡 Solved with hints | |

<!-- Result legend: ✅ Solved unaided · 🟡 Solved with hints · ❌ Gave up / wrong · ⏱️ TLE/MLE -->

## Review & Ideas to Improve

- <what to try differently, alternative approaches, patterns to remember>
