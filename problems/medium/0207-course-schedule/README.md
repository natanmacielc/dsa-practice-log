# 207. Course Schedule

|              |                                                     |
| ------------ | --------------------------------------------------- |
| **Level**    | Medium                                              |
| **Source**   | [LeetCode #207](https://leetcode.com/problems/course-schedule/) |
| **Topics**   | Graph, Topological Sort, BFS, DFS                   |
| **Attempts** | 1                                                    |

## Problem

Given `numCourses` and a list of prerequisite pairs `[a, b]` meaning course `b`
must be taken before course `a`, determine whether it's possible to finish all
courses (i.e. the prerequisite graph has no cycle).

**Example**

```
Input:  numCourses = 2, prerequisites = [[1,0]]
Output: true
```

**Constraints**

- `1 <= numCourses <= 2000`
- `0 <= prerequisites.length <= 5000`
- `prerequisites[i].length == 2`
- `0 <= a, b < numCourses`
- All the pairs `[a, b]` are distinct.

## Attempt Log

| #                                    | Date       | Language | Approach            | Time | Space | Result             | Notes |
| ------------------------------------ | ---------- | -------- | ------------------- | ---- | ----- | ------------------- | ----- |
| [01](attempts/01-java/Solution.java) | 2026-07-16 | Java     | Kahn's algorithm (BFS topological sort) with in-degree counting | O(v + e) | O(v + e) | ✅ Solved unaided | |

<!-- Result legend: ✅ Solved unaided · 🟡 Solved with hints · ❌ Gave up / wrong · ⏱️ TLE/MLE -->

## Review & Ideas to Improve

- <what to try differently, alternative approaches, patterns to remember>
