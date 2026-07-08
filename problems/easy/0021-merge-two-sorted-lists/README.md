# 21. Merge Two Sorted Lists

|              |                                                     |
| ------------ | --------------------------------------------------- |
| **Level**    | Easy                                                 |
| **Source**   | [LeetCode #21](https://leetcode.com/problems/merge-two-sorted-lists/) |
| **Topics**   | Linked List, Recursion                               |
| **Attempts** | 1                                                    |

## Problem

Given the heads of two sorted linked lists `list1` and `list2`, merge them into one sorted linked list by splicing together the nodes of the two lists, and return the head of the merged list.

**Example**

```
Input:  list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
```

**Constraints**

- The number of nodes in both lists is in the range `[0, 50]`.
- `-100 <= Node.val <= 100`
- Both `list1` and `list2` are sorted in non-decreasing order.

## Attempt Log

| #                                    | Date       | Language | Approach                                                        | Time | Space | Result             | Notes |
| ------------------------------------ | ---------- | -------- | ----------------------------------------------------------------- | ---- | ----- | ------------------ | ----- |
| [01](attempts/01-java/Solution.java) | 2026-07-08 | Java     | Dummy head node, iteratively splice in the smaller of the two current nodes (treating an exhausted list as `Integer.MAX_VALUE`) | O(n) | O(1)  | ✅ Solved unaided | |

<!-- Result legend: ✅ Solved unaided · 🟡 Solved with hints · ❌ Gave up / wrong · ⏱️ TLE/MLE -->

## Review & Ideas to Improve

- <what to try differently, alternative approaches, patterns to remember>
