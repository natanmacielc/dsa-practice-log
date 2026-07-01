---
name: dsa
description: Scaffold a new DSA practice problem or log a new attempt on an existing one, keeping README.md, per-problem README, and attempts/ folder in sync. Use when the user asks to add/create a new problem, or to log/record a new attempt/re-solve of an existing problem.
---

# DSA practice log maintenance

This repo has no build system; each problem is a self-contained folder under
`problems/<level>/<NNNN>-<slug>/`. This skill automates the two recurring
chores described in `/CLAUDE.md`: adding a new problem, and logging a new
attempt on an existing one. Read `/CLAUDE.md` first if not already in context
— it defines the folder conventions and the "no `package` statement" rule.

Determine which mode applies from the user's request, then follow the
matching steps below.

## Mode 1 — New problem

Trigger: user gives a LeetCode number/slug/level (or a URL) for a problem not
yet in the repo.

Inputs needed (ask only for what's missing): LeetCode number, title/slug,
level (easy/medium/hard), topics, problem statement/example/constraints
(user can paste these, or fetch from a LeetCode URL if given), language for
attempt 01 (default Java).

Steps:
1. Zero-pad the number to 4 digits and slugify the title (lowercase,
   hyphens) to build the folder name, e.g. `0125-valid-palindrome`.
2. Copy `templates/problem-README.md` to
   `problems/<level>/<NNNN>-<slug>/README.md` and fill in: title, level,
   source link (`https://leetcode.com/problems/<slug>/`), topics, problem
   description/example/constraints. Leave `**Attempts**` at `0` and the
   Attempt Log table empty (template row removed) until Mode 2 runs.
3. Create `attempts/01-<lang>/Solution.java` (or matching extension) from
   `templates/Solution.java`, adapted to this repo's convention: **no
   `public` modifier on the class** (existing attempts use bare
   `class Solution`), Javadoc with Time/Space complexity placeholders.
4. Do NOT add the top-level `README.md` index row or bump totals yet —
   that happens once there's a real attempt (Mode 2), since the index
   tracks solved attempts, not empty scaffolds. If the user wants the
   problem scaffolded and immediately solved in one go, chain straight
   into Mode 2 after writing the code.

## Mode 2 — Log a new attempt

Trigger: user has written/solved code for a problem (new or already
existing) and wants the log updated. This is the "three places" update
required by `/CLAUDE.md`.

Steps:
1. Find the problem folder under `problems/<level>/<NNNN>-*/`. If it
   doesn't exist yet, run Mode 1 first.
2. Determine the next attempt number `NN` = existing max in `attempts/` + 1
   (never overwrite an existing attempt folder).
3. Write the solution to `attempts/NN-<lang>/Solution.java`:
   - no `package` statement, self-contained
   - Javadoc with real Time/Space complexity
4. Update the problem's `README.md`:
   - Add a row to **Attempt Log** with date (today), language, one-line
     approach, time/space complexity, and result emoji (✅/🟡/❌/⏱️ per the
     legend — ask the user which if not stated).
   - Bump `**Attempts**` count in the metadata table.
   - Optionally add a note to **Review & Ideas to Improve** if the user
     mentions an alternative approach or lesson learned.
5. Update the top-level `/README.md`:
   - Add or update this problem's row in the index table (keep rows sorted
     by number within their Level section), with the same Topics used in
     the problem README, `Langs` column, current `Attempts` count, and
     `Last` = today's date.
   - Recompute and update the `**Totals:**` line (count rows per level).

Ask the user for today's date if not available from context rather than
guessing.

## Notes

- Always re-read `/CLAUDE.md` conventions if unsure — they override
  anything here.
- Never overwrite an existing `attempts/NN-*/` folder.
- Keep Java files self-contained and copy-paste ready for the LeetCode
  editor (no package, no external imports beyond `java.util.*` etc. as
  needed).