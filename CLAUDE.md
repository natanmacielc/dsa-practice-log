# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## What this repo is

A personal DSA practice log, not an application. Each LeetCode-style problem has its own folder holding a description, a running **attempt log**, and every attempt's code preserved separately so past attempts can be re-solved and diffed against. There is **no build system** (no Maven/Gradle), no shared source tree, and no test suite — each `Solution.java` is a standalone, self-contained file.

## Structure

```
problems/<level>/<number>-<slug>/    level = easy | medium | hard; number = zero-padded LeetCode #
├── README.md                        metadata table, description, Attempt Log, review notes
└── attempts/NN-<lang>/Solution.java attempt #NN in <lang>; kept separate, never overwritten
templates/                           problem-README.md + Solution.java to copy for new work
README.md                            guide + master index table of all problems
```

## Conventions (important — these are deliberate)

- **Java files declare no `package`.** They must stay self-contained and copy-paste ready for the LeetCode editor. Do not add package statements when creating or editing attempts.
- **Never overwrite an existing attempt.** A re-solve goes in a new `attempts/NN-<lang>/` folder with the next number. Preserving old attempts for comparison is the whole point of the repo.
- Complexity is recorded in **both** the code's Javadoc and the problem's Attempt Log table.
- Result legend used in Attempt Logs: ✅ Solved unaided · 🟡 Solved with hints · ❌ Gave up / wrong · ⏱️ TLE/MLE.

## Common tasks

- **Compile-check a solution:** `javac -d /tmp/out problems/<...>/attempts/NN-java/Solution.java` (there is no project-wide build).
- **Add a new problem:** copy `templates/problem-README.md` to the new problem folder's `README.md`, fill it in, then add the code under `attempts/01-<lang>/`.
- **When adding an attempt, update three places:** the problem README's Attempt Log (new row) and its **Attempts** count, and the matching row in the top-level `README.md` index table.
