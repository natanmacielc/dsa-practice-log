# 242. Valid Anagram

|              |                                                            |
| ------------ | ---------------------------------------------------------- |
| **Level**    | Easy                                                       |
| **Source**   | [LeetCode #242](https://leetcode.com/problems/valid-anagram/) |
| **Topics**   | Hash Table, String, Sorting                                |
| **Attempts** | 1                                                          |

## Problem

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s` (same
characters with the same frequencies).

**Example**

```
Input:  s = "anagram", t = "nagaram"
Output: true
```

**Constraints**

- `1 <= s.length, t.length <= 5 * 10^4`
- Base version assumes lowercase English letters. Follow-up: handle full Unicode.

## Attempt Log

| #                                     | Date       | Language | Approach                                             | Time | Space | Result    | Notes                     |
| ------------------------------------- | ---------- | -------- | ---------------------------------------------------- | ---- | ----- | --------- | ------------------------- |
| [01](attempts/01-java/Solution.java)  | 2026-07-01 | Java     | Single `int[26]` counter: `++` for `s`, `--` for `t`; all zero ⇒ anagram | O(n) | O(1)  | ✅ Solved | Imported initial solution |

## Review & Ideas to Improve

- Fixed-size count array is optimal for the lowercase-letters constraint.
- Follow-up (Unicode): swap the array for a `HashMap<Character, Integer>`.
