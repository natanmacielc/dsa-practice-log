# 14. Longest Common Prefix

|              |                                                     |
| ------------ | --------------------------------------------------- |
| **Level**    | Easy                                                |
| **Source**   | [LeetCode #14](https://leetcode.com/problems/longest-common-prefix/) |
| **Topics**   | String, Trie                                        |
| **Attempts** | 1                                                   |

## Problem

Find the longest string that is a prefix of every string in the input array. If there is no common prefix, return an empty string `""`.

**Example**

```
Input:  strs = ["flower","flow","flight"]
Output: "fl"
```

**Constraints**

- `1 <= strs.length <= 200`
- `0 <= strs[i].length <= 200`
- `strs[i]` consists of only lowercase English letters.

## Attempt Log

| # | Date | Language | Approach | Time | Space | Result | Notes |
| - | ---- | -------- | -------- | ---- | ----- | ------ | ----- |
| [01](attempts/01-java/Solution.java) | 2026-07-07 | Java | First string as candidate prefix; shrink matching end per string, early-exit when empty | O(n·m) | O(m) | ✅ Solved unaided | Paste had a typo (`matchEnd` → `last`) fixed on log |

<!-- Result legend: ✅ Solved unaided · 🟡 Solved with hints · ❌ Gave up / wrong · ⏱️ TLE/MLE -->

## Review & Ideas to Improve

- <what to try differently, alternative approaches, patterns to remember>
