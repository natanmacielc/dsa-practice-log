# 875. Koko Eating Bananas

|              |                                                     |
| ------------ | --------------------------------------------------- |
| **Level**    | Medium                                              |
| **Source**   | [LeetCode #875](https://leetcode.com/problems/koko-eating-bananas/) |
| **Topics**   | Array, Binary Search                                |
| **Attempts** | 1                                                    |

## Problem

Koko has `piles` of bananas and `h` hours to eat them all. Each hour she picks
one pile and eats up to `k` bananas from it (if the pile has fewer than `k`,
she finishes it and stops for that hour). Find the minimum integer eating
speed `k` such that she can eat all the bananas within `h` hours.

**Example**

```
Input:  piles = [3,6,7,11], h = 8
Output: 4
```

**Constraints**

- `1 <= piles.length <= 10^4`
- `piles.length <= h <= 10^9`
- `1 <= piles[i] <= 10^9`

## Attempt Log

| #                                    | Date       | Language | Approach            | Time | Space | Result             | Notes |
| ------------------------------------ | ---------- | -------- | ------------------- | ---- | ----- | ------------------- | ----- |
| [01](attempts/01-java/Solution.java) | 2026-07-16 | Java     | Binary search on eating speed, checking hours needed per candidate `k` | O(n log max(pile)) | O(1) | 🟡 Solved with hints | |

<!-- Result legend: ✅ Solved unaided · 🟡 Solved with hints · ❌ Gave up / wrong · ⏱️ TLE/MLE -->

## Review & Ideas to Improve

- <what to try differently, alternative approaches, patterns to remember>
