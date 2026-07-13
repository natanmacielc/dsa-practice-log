# 303. Range Sum Query - Immutable

|              |                                                                          |
| ------------ | ------------------------------------------------------------------------ |
| **Level**    | Easy                                                                      |
| **Source**   | [LeetCode #303](https://leetcode.com/problems/range-sum-query-immutable/) |
| **Topics**   | Array, Design, Prefix Sum                                                |
| **Attempts** | 2                                                                          |

## Problem

Given an integer array `nums`, design a class that can repeatedly answer
`sumRange(left, right)` queries returning the sum of elements between
indices `left` and `right` inclusive.

**Example**

```
Input:  ["NumArray", "sumRange", "sumRange", "sumRange"]
        [[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
Output: [null, 1, -1, -3]
```

**Constraints**

- `1 <= nums.length <= 10^4`
- `-10^5 <= nums[i] <= 10^5`
- `0 <= left <= right < nums.length`
- At most `10^4` calls to `sumRange`

## Attempt Log

| #                                    | Date       | Language | Approach                                                    | Time                                | Space | Result    | Notes |
| ------------------------------------ | ---------- | -------- | ------------------------------------------------------------- | ------------------------------------ | ----- | --------- | ----- |
| [01](attempts/01-java/Solution.java) | 2026-07-13 | Java     | Store `nums` as-is; sum the range with a loop on every query | O(1) construct, O(n) per `sumRange` | O(n)  | ✅ Solved | Brute force — no precomputation |
| [02](attempts/02-java/Solution.java) | 2026-07-13 | Java     | Precompute prefix-sum array; `sumRange` via `prefix[right+1] - prefix[left]` | O(n) construct, O(1) per `sumRange` | O(n)  | 🟡 Solved with hints | Needed a hint to land on prefix sums as the optimal approach |

<!-- Result legend: ✅ Solved unaided · 🟡 Solved with hints · ❌ Gave up / wrong · ⏱️ TLE/MLE -->

## Review & Ideas to Improve

- Brute-force re-sums the range every call — with up to 10^4 queries this is still fine here, but doesn't scale.
- Prefix-sum precompute (attempt 02) trades O(n) space for O(1) queries — the standard pattern for "many range-sum queries on an immutable array."
