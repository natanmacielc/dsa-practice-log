# 1419. Minimum Number of Frogs Croaking

|              |                                                     |
| ------------ | --------------------------------------------------- |
| **Level**    | Medium                                              |
| **Source**   | [LeetCode #1419](https://leetcode.com/problems/minimum-number-of-frogs-croaking/) |
| **Topics**   | Hash Table, String, Counting                        |
| **Attempts** | 1                                                    |

## Problem

Given a string `croakOfFrogs` representing multiple frogs' overlapping calls
of "croak", return the minimum number of frogs needed to produce it, or `-1`
if the string is not a valid combination of "croak" sequences.

**Example**

```
Input:  croakOfFrogs = "crcoakroak"
Output: 2
```

**Constraints**

- `1 <= croakOfFrogs.length <= 10^5`
- `croakOfFrogs` is either `'c'`, `'r'`, `'o'`, `'a'`, or `'k'`.

## Attempt Log

| #                                    | Date       | Language | Approach            | Time | Space | Result             | Notes |
| ------------------------------------ | ---------- | -------- | ------------------- | ---- | ----- | ------------------- | ----- |
| [01](attempts/01-java/Solution.java) | 2026-07-17 | Java     | Single pass counting each letter of "croak", tracking active frogs and validating order via decrementing previous letter's count | O(n) | O(1) | 🟡 Solved with hints | |

<!-- Result legend: ✅ Solved unaided · 🟡 Solved with hints · ❌ Gave up / wrong · ⏱️ TLE/MLE -->

## Review & Ideas to Improve

- <what to try differently, alternative approaches, patterns to remember>
