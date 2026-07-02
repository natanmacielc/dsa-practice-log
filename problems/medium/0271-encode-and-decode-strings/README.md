# 271. Encode and Decode Strings

|              |                                                     |
| ------------ | --------------------------------------------------- |
| **Level**    | Medium                                              |
| **Source**   | [LeetCode #271](https://leetcode.com/problems/encode-and-decode-strings/) |
| **Topics**   | Array, String, Design                               |
| **Attempts** | 1                                                   |

## Problem

Design an algorithm to encode a list of strings into a single string, and a matching algorithm to decode that single string back into the original list. The strings may contain any characters (including your delimiter), so the encoding must be unambiguous.

**Example**

```
Input:  ["neet", "code", "love", "you"]
Encoded: "4#neet4#code4#love3#you"
Output: ["neet", "code", "love", "you"]
```

**Constraints**

- `0 <= strs.length < 100`
- `0 <= strs[i].length < 200`
- `strs[i]` may contain any possible characters out of 256 valid ASCII characters.

## Attempt Log

| #                                    | Date       | Language | Approach            | Time | Space | Result             | Notes |
| ------------------------------------ | ---------- | -------- | ------------------- | ---- | ----- | ------------------ | ----- |
| [01](attempts/01-java/Solution.java) | 2026-07-02 | Java     | Length-prefix encoding (`<len>#<str>`) | O(n) | O(n)  | ✅ Solved          | Delimiter-safe since length bounds the read |

<!-- Result legend: ✅ Solved unaided · 🟡 Solved with hints · ❌ Gave up / wrong · ⏱️ TLE/MLE -->

## Review & Ideas to Improve

- <what to try differently, alternative approaches, patterns to remember>
