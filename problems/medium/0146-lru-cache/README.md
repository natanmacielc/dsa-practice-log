# 146. LRU Cache

|              |                                                                     |
| ------------ | ------------------------------------------------------------------- |
| **Level**    | Medium                                                               |
| **Source**   | [LeetCode #146](https://leetcode.com/problems/lru-cache/)           |
| **Topics**   | Hash Table, Linked List, Design, Doubly-Linked List                 |
| **Attempts** | 1                                                                     |

## Problem

Design a data structure that follows the Least Recently Used (LRU) cache
eviction policy, supporting `get(key)` and `put(key, value)` in O(1) time
each. The cache has a fixed `capacity`; when full, a `put` evicts the least
recently used entry before inserting the new one.

**Example**

```
Input:  ["LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"]
        [[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]]
Output: [null, null, null, 1, null, -1, null, -1, 3, 4]
```

**Constraints**

- `1 <= capacity <= 3000`
- `0 <= key <= 10^4`
- `0 <= value <= 10^5`
- At most `2 * 10^5` calls to `get` and `put`

## Attempt Log

| #                                    | Date       | Language | Approach                                                                 | Time | Space | Result             | Notes |
| ------------------------------------ | ---------- | -------- | ------------------------------------------------------------------------- | ---- | ----- | ------------------ | ----- |
| [01](attempts/01-java/Solution.java) | 2026-07-13 | Java     | Doubly linked list (MRU at head, LRU at tail) + `HashMap<key, Node>` for O(1) lookup | O(1) | O(capacity) | 🟡 Solved with hints | Needed a hint to land on the sentinel head/tail node trick for splice-free insert/remove |

<!-- Result legend: ✅ Solved unaided · 🟡 Solved with hints · ❌ Gave up / wrong · ⏱️ TLE/MLE -->

## Review & Ideas to Improve

- Sentinel `head`/`tail` nodes avoid null checks when removing/inserting at the ends — key pattern for this style of DLL.
- Watch for shadowed variable declarations when reusing a variable name (`node`) inside a nested block that already has one in scope — caught and removed a duplicate `Node node = cache.get(key);` inside the `put` method's `if` branch.
