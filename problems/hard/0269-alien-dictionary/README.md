# 269. Alien Dictionary

|              |                                                     |
| ------------ | --------------------------------------------------- |
| **Level**    | Hard                                                 |
| **Source**   | [LeetCode #269](https://leetcode.com/problems/alien-dictionary/) |
| **Topics**   | Array, String, Topological Sort, Graph, BFS, DFS     |
| **Attempts** | 1                                                    |

## Problem

Given a list of words from an alien language sorted lexicographically by that
language's rules, derive one valid ordering of the alphabet. Return `""` if no
valid ordering exists (a contradictory or invalid input, e.g. a longer word
appearing before its own prefix).

**Example**

```
Input:  words = ["wrt","wrf","er","ett","rftt"]
Output: "wertf"
```

**Constraints**

- `1 <= words.length <= 100`
- `1 <= words[i].length <= 100`
- `words[i]` consists of only lowercase English letters.

## Attempt Log

| #                                    | Date       | Language | Approach            | Time | Space | Result             | Notes |
| ------------------------------------ | ---------- | -------- | ------------------- | ---- | ----- | ------------------ | ----- |
| [01](attempts/01-java/Solution.java) | 2026-09-09 | Java     | Build a precedence graph from the first differing char of each adjacent word pair, then topologically sort with Kahn's algorithm (BFS on in-degree-0 nodes) | O(C) | O(1) | ✅ Solved | Handles the invalid-prefix edge case (`"abc"` before `"ab"`) and detects cycles via leftover in-degree after the BFS. |

<!-- Result legend: ✅ Solved unaided · 🟡 Solved with hints · ❌ Gave up / wrong · ⏱️ TLE/MLE -->

## Review & Ideas to Improve

- <what to try differently, alternative approaches, patterns to remember>
