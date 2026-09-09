# 953. Verifying an Alien Dictionary

|              |                                                     |
| ------------ | --------------------------------------------------- |
| **Level**    | Easy                                                 |
| **Source**   | [LeetCode #953](https://leetcode.com/problems/verifying-an-alien-dictionary/) |
| **Topics**   | Array, Hash Table, String                            |
| **Attempts** | 1                                                     |

## Problem

Given a list of words and a string `order` giving the alien alphabet's letter
order, determine whether `words` is sorted lexicographically according to
that alien order.

**Example**

```
Input:  words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
Output: true
```

**Constraints**

- `1 <= words.length <= 100`
- `1 <= words[i].length <= 20`
- `order.length == 26`
- All characters in `words[i]` and `order` are English lowercase letters.

## Attempt Log

| #                                    | Date       | Language | Approach            | Time | Space | Result             | Notes |
| ------------------------------------ | ---------- | -------- | ------------------- | ---- | ----- | ------------------ | ----- |
| [01](attempts/01-java/Solution.java) | 2026-09-09 | Java     | Map each letter to its rank in `order`, then compare each adjacent word pair by rank at the first differing character, checking the invalid-prefix case first | O(C) | O(1) | ✅ Solved | Simplified version of Alien Dictionary (269) — no graph/topo sort needed since the order is given. |

<!-- Result legend: ✅ Solved unaided · 🟡 Solved with hints · ❌ Gave up / wrong · ⏱️ TLE/MLE -->

## Review & Ideas to Improve

- <what to try differently, alternative approaches, patterns to remember>
