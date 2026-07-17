# DSA Practice Log

A structured log of my data-structures & algorithms practice. Every problem lives
in its own folder with a description, a running **attempt log**, and each attempt's
code preserved separately — so I can re-solve a problem later and compare against my
past self.

## How it's organized

```
problems/<level>/<number>-<slug>/
├── README.md                 # description, metadata, attempt log, review notes
└── attempts/
    ├── 01-java/Solution.java  # attempt #1 (language in the folder name)
    ├── 02-java/Solution.java  # a later re-attempt — kept separate for diffing
    └── 02-python/Solution.py  # same attempt idea in another language
```

- **Level** — `easy` / `medium` / `hard` (top-level folders under `problems/`).
- **Problem** — folder prefixed with the LeetCode number (zero-padded) for stable sorting, e.g. `0001-two-sum`.
- **Description & metadata** — the problem's `README.md`: source link, topics, examples, constraints.
- **Language & attempts** — each attempt is its own `attempts/NN-<lang>/` folder, so nothing is overwritten and any two attempts can be diffed.
- **Number of attempts / results** — tracked in the per-problem **Attempt Log** table and summarized in the index below.

## How to add a new attempt

1. Find (or create) the problem folder under `problems/<level>/`.
   - New problem: copy `templates/problem-README.md` → `problems/<level>/<num>-<slug>/README.md` and fill it in.
2. Create `attempts/NN-<lang>/` with the next attempt number and drop your solution in
   (start from `templates/Solution.java` for Java). **Don't peek at older attempts until you're done** — that's the point.
3. Add a row to the problem's **Attempt Log** and bump its **Attempts** count.
4. Update the row for this problem in the [index](#index) below.

## Index

| Level  | #    | Problem                                                                     | Topics                                | Langs | Attempts | Last       |
| ------ | ---- | --------------------------------------------------------------------------- | ------------------------------------- | ----- | -------- | ---------- |
| Easy   | 1    | [Two Sum](problems/easy/0001-two-sum/)                                       | Array, Hash Table                     | Java  | 1        | 2026-07-01 |
| Easy   | 9    | [Palindrome Number](problems/easy/0009-palindrome-number/)                   | Math                                  | Java  | 1        | 2026-07-08 |
| Easy   | 13   | [Roman to Integer](problems/easy/0013-roman-to-integer/)                     | Hash Table, Math, String              | Java  | 1        | 2026-07-01 |
| Easy   | 14   | [Longest Common Prefix](problems/easy/0014-longest-common-prefix/)           | String, Trie                          | Java  | 1        | 2026-07-07 |
| Easy   | 21   | [Merge Two Sorted Lists](problems/easy/0021-merge-two-sorted-lists/)         | Linked List, Recursion                | Java  | 1        | 2026-07-08 |
| Easy   | 20   | [Valid Parentheses](problems/easy/0020-valid-parentheses/)                   | String, Stack                         | Java  | 1        | 2026-07-01 |
| Easy   | 26   | [Remove Duplicates from Sorted Array](problems/easy/0026-remove-duplicates-from-sorted-array/) | Array, Two Pointers | Java  | 1        | 2026-07-12 |
| Easy   | 27   | [Remove Element](problems/easy/0027-remove-element/)                         | Array, Two Pointers                   | Java  | 1        | 2026-07-12 |
| Easy   | 28   | [Find the Index of the First Occurrence in a String](problems/easy/0028-find-the-index-of-the-first-occurrence-in-a-string/) | String, String Matching | Java  | 1        | 2026-07-12 |
| Easy   | 35   | [Search Insert Position](problems/easy/0035-search-insert-position/)         | Array, Binary Search                  | Java  | 1        | 2026-07-12 |
| Easy   | 125  | [Valid Palindrome](problems/easy/0125-valid-palindrome/)                     | String, Two Pointers, RegExp, ASCII   | Java  | 1        | 2026-07-01 |
| Easy   | 217  | [Contains Duplicate](problems/easy/0217-contains-duplicate/)                 | Array, Hash Table                     | Java  | 1        | 2026-07-01 |
| Easy   | 242  | [Valid Anagram](problems/easy/0242-valid-anagram/)                           | Hash Table, String                    | Java  | 1        | 2026-07-01 |
| Easy   | 303  | [Range Sum Query - Immutable](problems/easy/0303-range-sum-query-immutable/) | Array, Design, Prefix Sum             | Java  | 2        | 2026-07-13 |
| Easy   | 704  | [Binary Search](problems/easy/0704-binary-search/)                           | Array, Binary Search                  | Java  | 1        | 2026-07-01 |
| Easy   | 724  | [Find Pivot Index](problems/easy/0724-find-pivot-index/)                     | Array, Prefix Sum                     | Java  | 1        | 2026-07-14 |
| Easy   | 1331 | [Rank Transform of an Array](problems/easy/1331-rank-transform-of-an-array/) | Array, Hash Table, Sorting            | Java  | 1        | 2026-07-12 |
| Easy   | 1929 | [Concatenation of Array](problems/easy/1929-concatenation-of-array/)         | Array, Simulation                     | Java  | 1        | 2026-07-13 |
| Medium | 5    | [Longest Palindromic Substring](problems/medium/0005-longest-palindromic-substring/) | String, DP, Two Pointers     | Java  | 1        | 2026-07-01 |
| Medium | 33   | [Search in Rotated Sorted Array](problems/medium/0033-search-in-rotated-sorted-array/) | Array, Binary Search       | Java  | 1        | 2026-07-16 |
| Medium | 49   | [Group Anagrams](problems/medium/0049-group-anagrams/)                       | Array, Hash Table, String, Sorting    | Java  | 1        | 2026-07-01 |
| Medium | 53   | [Maximum Subarray](problems/medium/0053-maximum-subarray/)                   | Array, DP, Divide and Conquer         | Java  | 1        | 2026-07-17 |
| Medium | 128  | [Longest Consecutive Sequence](problems/medium/0128-longest-consecutive-sequence/) | Array, Hash Table, Union Find | Java  | 1        | 2026-07-01 |
| Medium | 146  | [LRU Cache](problems/medium/0146-lru-cache/)                                 | Hash Table, Linked List, Design, Doubly-Linked List | Java  | 1        | 2026-07-13 |
| Medium | 200  | [Number of Islands](problems/medium/0200-number-of-islands/)                 | Array, DFS, BFS, Union Find, Matrix   | Java  | 1        | 2026-07-15 |
| Medium | 207  | [Course Schedule](problems/medium/0207-course-schedule/)                     | Graph, Topological Sort, BFS, DFS      | Java  | 1        | 2026-07-16 |
| Medium | 230  | [Kth Smallest Element in a BST](problems/medium/0230-kth-smallest-element-in-a-bst/) | Tree, DFS, BST, Binary Tree    | Java  | 1        | 2026-07-16 |
| Medium | 875  | [Koko Eating Bananas](problems/medium/0875-koko-eating-bananas/)             | Array, Binary Search                  | Java  | 1        | 2026-07-16 |
| Medium | 2187 | [Minimum Time to Complete Trips](problems/medium/2187-minimum-time-to-complete-trips/) | Array, Binary Search        | Java  | 1        | 2026-07-17 |
| Medium | 238  | [Product of Array Except Self](problems/medium/0238-product-of-array-except-self/) | Array, Prefix Sum              | Java  | 3        | 2026-07-14 |
| Medium | 271  | [Encode and Decode Strings](problems/medium/0271-encode-and-decode-strings/) | Array, String, Design                 | Java  | 1        | 2026-07-02 |
| Medium | 304  | [Range Sum Query 2D - Immutable](problems/medium/0304-range-sum-query-2d-immutable/) | Array, Design, Matrix, Prefix Sum | Java  | 1        | 2026-07-14 |
| Medium | 337  | [House Robber III](problems/medium/0337-house-robber-iii/)                   | DP, Tree, DFS                         | Java  | 1        | 2026-07-01 |
| Medium | 347  | [Top K Frequent Elements](problems/medium/0347-top-k-frequent-elements/)     | Array, Hash Table, Sorting, Heap, Bucket Sort | Java  | 1        | 2026-07-02 |
| Medium | 547  | [Number of Provinces](problems/medium/0547-number-of-provinces/)             | DFS, BFS, Union Find, Graph           | Java  | 1        | 2026-07-01 |
| Medium | 1020 | [Number of Enclaves](problems/medium/1020-number-of-enclaves/)               | DFS, BFS, Union Find, Matrix          | Java  | 1        | 2026-07-01 |
| Hard   | 834  | [Sum of Distances in Tree](problems/hard/0834-sum-of-distances-in-tree/)     | DP, Tree, DFS, Graph                  | Java  | 1        | 2026-07-01 |

**Totals:** 37 problems — 18 easy · 18 medium · 1 hard.

## Conventions

- **Result legend** (Attempt Log): ✅ Solved unaided · 🟡 Solved with hints · ❌ Gave up / wrong · ⏱️ TLE/MLE.
- Java solution files declare **no package** so they're self-contained and copy-paste ready for the LeetCode editor.
- Time/space complexity is recorded in the code's Javadoc **and** the Attempt Log for quick scanning.
