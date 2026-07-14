# 304. Range Sum Query 2D - Immutable

|              |                                                     |
| ------------ | --------------------------------------------------- |
| **Level**    | Medium                                              |
| **Source**   | [LeetCode #304](https://leetcode.com/problems/range-sum-query-2d-immutable/) |
| **Topics**   | Array, Design, Matrix, Prefix Sum                   |
| **Attempts** | 1                                                    |

## Problem

Given a 2D matrix, handle multiple queries of summing the elements inside a rectangle defined by its upper-left corner `(row1, col1)` and lower-right corner `(row2, col2)`.

**Example**

```
Input:  matrix = [[3,0,1,4,2],[5,6,3,2,1],[1,2,0,1,5],[4,1,0,1,7],[1,0,3,0,5]]
        sumRegion(2, 1, 4, 3) -> 8
Output: 8
```

**Constraints**

- `1 <= rows, cols <= 200`
- `-10^5 <= matrix[i][j] <= 10^5`
- `0 <= row1 <= row2 < rows`
- `0 <= col1 <= col2 < cols`
- At most `10^4` calls to `sumRegion`.

## Attempt Log

| #                                    | Date       | Language | Approach            | Time | Space | Result             | Notes |
| ------------------------------------ | ---------- | -------- | ------------------- | ---- | ----- | ------------------ | ----- |
| [01](attempts/01-java/Solution.java) | 2026-07-14 | Java     | 2D prefix sum with 1-padded border to avoid bounds checks | O(rows·cols) build, O(1) query | O(rows·cols) | 🟡 Solved with hints | Needed a hint on the inclusion-exclusion formula for the padded prefix matrix |

<!-- Result legend: ✅ Solved unaided · 🟡 Solved with hints · ❌ Gave up / wrong · ⏱️ TLE/MLE -->

## Review & Ideas to Improve

- Same padded prefix-sum pattern as 303 (1D), extended to 2D: `prefix[r][c]` stores the sum of the rectangle `matrix[0..r-1][0..c-1]`.
- Inclusion-exclusion for a query rectangle: bottom-right minus the two overlapping strips plus the doubly-subtracted corner.
