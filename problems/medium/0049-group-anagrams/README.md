# 49. Group Anagrams

|              |                                                     |
| ------------ | --------------------------------------------------- |
| **Level**    | Medium                                               |
| **Source**   | [LeetCode #49](https://leetcode.com/problems/group-anagrams/) |
| **Topics**   | Array, Hash Table, String, Sorting                   |
| **Attempts** | 1                                                   |

## Problem

Given an array of strings, group the strings that are anagrams of each other into the same sublist. Return the groups in any order.

**Example**

```
Input:  strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
```

**Constraints**

- 1 <= strs.length <= 10^4
- 0 <= strs[i].length <= 100
- strs[i] consists of lowercase English letters.

## Attempt Log

| #                                    | Date       | Language | Approach            | Time | Space | Result             | Notes |
| ------------------------------------ | ---------- | -------- | ------------------- | ---- | ----- | ------------------ | ----- |
| [01](attempts/01-java/Solution.java) | 2026-07-01 | Java     | Hash map keyed by per-string 26-letter frequency signature | O(n·k) | O(n) | ✅ Solved unaided | Signature avoids sorting each string |

<!-- Result legend: ✅ Solved unaided · 🟡 Solved with hints · ❌ Gave up / wrong · ⏱️ TLE/MLE -->

## Review & Ideas to Improve

- <what to try differently, alternative approaches, patterns to remember>