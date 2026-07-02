# 13. Roman to Integer

|              |                                                     |
| ------------ | --------------------------------------------------- |
| **Level**    | Easy                                                 |
| **Source**   | [LeetCode #13](https://leetcode.com/problems/roman-to-integer/) |
| **Topics**   | Hash Table, Math, String                             |
| **Attempts** | 1                                                   |

## Problem

Convert a Roman numeral string to its integer value, accounting for subtractive
notation (e.g. `IV` = 4, `IX` = 9).

**Example**

```
Input:  s = "LVIII"
Output: 58
```

**Constraints**

- 1 <= s.length <= 15
- s consists only of the characters `('I', 'V', 'X', 'L', 'C', 'D', 'M')`.
- It is guaranteed that s is a valid Roman numeral in the range [1, 3999].

## Attempt Log

| #                                    | Date       | Language | Approach            | Time | Space | Result             | Notes |
| ------------------------------------ | ---------- | -------- | ------------------- | ---- | ----- | ------------------ | ----- |
| [01](attempts/01-java/Solution.java) | 2026-07-01 | Java     | Lookup table by letter; subtract twice the previous value when it's smaller than current | O(k) | O(1) | ✅ Solved unaided | k = length of s |

<!-- Result legend: ✅ Solved unaided · 🟡 Solved with hints · ❌ Gave up / wrong · ⏱️ TLE/MLE -->

## Review & Ideas to Improve

- <what to try differently, alternative approaches, patterns to remember>
