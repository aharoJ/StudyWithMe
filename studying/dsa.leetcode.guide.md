# DSA Mastery Constitution — Technique-First Ladder

> **Version:** 1.3
> **Author:** aharoJ
> **Last Updated:** August 2026
> **Purpose:** The single governing document for building the machinery to *derive* algorithms — not to recall problems. Paste it at the start of any LLM session about DSA work.
> **Structure:** One dependency-ordered ladder of techniques. Problems are evidence, never curriculum.
> **Serves:** interview loops (LeetCode-style) and competitive programming (Codeforces/CSES-style) from the same machinery.

---

## What changed in v1.3, and why

v1.2 was a NeetCode-150 wrapper: eighteen categories, eighteen Monday-to-Saturday schedules, a ten-week calendar, and ~60 "templates." It was executed repeatedly and did not work. Three structural reasons, each now fixed:

1. **About a third of its templates were not techniques.** They were memorized solutions to single problems — length-prefix string encoding, the container-with-most-water pointer rule, rotated-array binary search, set-matrix-zeroes marker trick. Typing an answer five times builds recall of that answer. It builds no machinery.
2. **Most of the field was missing.** No number theory, no modular arithmetic, no range-query structures, no computational geometry, no string algorithms beyond a basic trie, no flow or matching, no 0/1 knapsack, no correctness-proof technique, and — most importantly — no method for inferring which techniques are even possible from the input constraints.
3. **The calendar was fiction.** Eighteen category schedules needed 108 program-days against 60 available; the weekly curriculum silently dropped 31 problems to make it fit, while claiming full coverage.

v1.3 replaces all of it with one ladder of **150 rungs** — 138 core (F00–F126 plus grafted/split IDs) and 12 named frontier (X01–X12). There is no calendar, no week, no day, no hour, and no deadline anywhere in this document.

---

## The Commitment

Sign it. Actually write your name.

By adopting this Constitution, I commit to:

1. **Deriving before retrieving** — every implementation follows a model, an invariant or recurrence, a correctness argument, and a complexity budget.
2. **Documenting every failure in the error log** — unnamed bugs repeat forever.
3. **Not advancing until the gates pass** — depth over breadth, evidence over feeling.
4. **Trusting the process when it feels slow** — implementing a heap from scratch when `PriorityQueue` exists feels stupid, and is the entire point.
5. **Showing up on my own cadence, indefinitely** — this program has no end date and measures no elapsed time.

**SIGNED:** \***\*\*\*\*\*\*\***\_\***\*\*\*\*\*\*\***

---

## Article I — Philosophy

You are not learning algorithms for the first time. You are building the machinery to **derive** them under pressure, on problems you have never seen.

### The Three Laws

1. **Derivation over recognition.** If you solved it because you remembered it, you learned nothing. Recognition of a familiar statement can never satisfy a gate.
2. **Machinery over volume.** One technique, modeled and proved and falsified and transferred, beats fifty problems solved once.
3. **Invariants over code.** The invariant is the unit of study. Code is the proof that you hold the invariant; it is not the thing being learned.

### The Interview Reality Check

A 45-minute interview leaves roughly 30 minutes of writing time after clarification, explanation, and testing. But speed is a **benchmark result**, not a study target. You train the machinery without a clock; you measure speed only inside a declared Benchmark run. Training under permanent time pressure produces panic, not fluency.

### The Architect's Trap

Your instincts are built for system design: abstractions, contracts, boundaries. Algorithmic work runs the other way — imperative, line-by-line, mechanical. You must be able to switch modes deliberately. When you sit down to a problem you are not an architect; you are a machinist with an invariant and a blank file.

---

## Article II — Diagnosis

*(Rewritten in v1.3. The previous diagnosis was wrong, and acting on it wasted years.)*

**The previous theory was an implementation-fluency gap** — pattern recognition strong, fingers slow. That theory predicts that typing faster fixes the problem. It was tested repeatedly and it failed.

**The accurate diagnosis:** the prior artifact optimized *recognition of familiar statements* and *reproduction of known implementations*. Repeated completion never established transfer to unfamiliar variants, because a fixed problem list structurally cannot teach it. No number of problems on a list fixes this. Specifically, a list cannot teach:

| What a fixed list cannot teach | Why |
|---|---|
| Direction of reasoning | A list starts at the problem. A deriver starts at the constraints. |
| Correctness argument | Lists validate by test cases, never by proof. |
| Problem reduction | Recognizing an unfamiliar problem *is* a known one in costume. |
| Technique composition | Lists are one technique per problem; hard problems are three or four deep. |
| Construction | Lists are decision/optimization; "output any X such that…" is a different stance. |
| Diagnosis under uncertainty | Having the answer available abolishes the only condition that builds the skill. |

v1.3 therefore measures **separate capabilities**: constraint inference, model and state design, proof, reduction, technique selection and composition, cold Java implementation, adversarial verification, and blind transfer. Implementation fluency remains necessary — but it is one gate among eight, not the root-cause theory.

### Current state

| Property | Value |
|---|---|
| Target | FAANG-tier interview loops **and** Codeforces/CSES-grade derivation |
| Language | Java (non-negotiable — matches production experience) |
| Cadence | Self-chosen, sustained, indefinite. No deadline is recorded here by design. |
| Known-strong | Pattern recognition on *familiar* statements |
| Known-weak | Everything the table above lists — to be replaced by observed gate evidence, not assumed |

This table reports observed evidence and open gates. It never asserts that you already know all algorithms.

---

## Article III — Hard Rules

Violating a hard rule reopens the affected gate. No exceptions.

### Rule 1 — Two modes, declared before work starts

Every task is **Learning Mode** or **Benchmark Mode**, declared before you begin.
- **Learning Mode has no clock.** No elapsed-time threshold, no time box. It ends when you choose.
- **Benchmark Mode** uses a limit you declare in advance, because interviews have clocks. Benchmark speed never substitutes for a mastery gate.

### Rule 2 — No autocomplete, no LSP

LeetCode editor, plain text, or Vim without LSP. The APIs must be known cold. The coach is not autocomplete either: compiler and API mistakes are pointed out only after your attempt.

### Rule 3 — Derive before you type

Before implementation: formalize the contract and constraints, produce the simplest correct brute force, state the invariant or recurrence, and give the complexity budget. Brute force is not a fallback — it is a required derivation tool and your correctness oracle.

### Rule 4 — No running code before the manual trace

Write the complete solution and trace it by hand on adversarial small cases before executing. Running code is not a substitute for thinking.

### Rule 5 — No reveal before recovery is exhausted

In Learning Mode, exhaust the uncertainty-diagnosis chain first (Article VII): formalize contract and constraints → derive a brute-force state → state an invariant or recurrence hypothesis → attack it with counterexamples → name the smallest missing fact. Recovery then permits **one approach-only hint** and your own implementation. **Solution study is the single sanctioned point** at which reference implementation details may be shown. A clean solve needs no reveal. Before solution study: no solution, no pseudocode dump, no line-by-line walkthrough.

### Rule 6 — Immediate learning redo after every task

After a **clean independent solve**: delete the accepted implementation and reconstruct it from the stated model and invariant.
After **recovery or solution study**: close every reference, restate the model and invariant, rewrite from a blank file, trace manually, then run.
This rewrite is mandatory and completes the task's learning cycle. **It does not make the task clean evidence, and it does not by itself pass a rung or a gate.**

### Rule 7 — Mastery evidence is gate-specific and assistance-sensitive

A rung advances only when every gate has independently observed evidence. Help leaves every gate whose substance was supplied **open**; valid independent evidence on unaffected gates is preserved. A shown or substantially supplied solution — including its learning redo — can never certify **Cold Java**, **Blind Transfer**, or **Independent Reconstruction**. A prompt exposed during recovery or solution study is permanently ineligible as Blind Transfer evidence. An open gate closes only through a clean probe with no technique label, no hint, no reference implementation, and no autocomplete.

> **Learning-cycle completion and mastery certification are separate statuses.** Confusing them is how the previous version let a studied solution feel like a passed skill.

### Rule 8 — Same rung until the gates pass; prerequisites are hard

You may not enter a rung whose prerequisites are open. If a failure on a later rung traces to an earlier invariant, that earlier rung **reopens immediately** and is repaired before deeper work continues. There is no time-based review schedule; review is dependency-triggered.

### Rule 9 — Java only

All work, all templates, all benchmarks. No "let me just show the idea in Python."

### Rule 10 — Library use follows implementation

`PriorityQueue` does not replace building a heap. `Arrays.sort` does not replace sorting invariants. `TreeMap` does not replace ordered-set semantics. Implement the machinery from a blank file first; the library is a convenience you earn.

### Rule 11 — Error log every session

`studying/error.log.md`, minimum two lines: what broke, and the root cause or prevention rule. You dictate the content; the coach may type it verbatim but never authors it for you. Procedural records — gate state, rung transitions, reopened prerequisites — are the coach's to write.

---

## Article IV — The Ladder

The curriculum. Traverse top to bottom at whatever pace you choose. Every stated prerequisite appears earlier. Foundations F00–F05 stay active on every later rung.

**Payload class** marks how many independent evidence units a rung holds — the planning signal that replaces time estimates:
- **A — Atomic:** one central invariant, one reusable implementation family, one falsification suite.
- **B — Coupled family:** at most two tightly related variants sharing a proof skeleton, evidenced separately.
- **C — Synthesis:** combines already-passed rungs; introduces no new primitive.

*Numbering note: IDs are stable. Rungs grafted during convergence carry letter suffixes at their dependency position rather than triggering a renumber.*

### Flight 0 — Algorithmic foundations

- **F00 — Problem contracts and modeling** *(A)*. Converts prose into inputs, outputs, constraints, state, and edge-case obligations, so you are provably solving the right problem. **Prereq:** none.
- **F01 — Constraints-to-complexity budgeting** *(A)*. Uses input bounds to *reject* impossible approaches before implementation. This is the master key: it turns problem-solving from recall into search-space pruning. **Prereq:** F00.
- **F02 — Invariants and correctness proofs** *(B)*. Loop invariants, induction, contradiction, exchange, and cut arguments — what lets you justify an algorithm you have never seen. **Prereq:** F00.
- **F03 — Amortized analysis** *(A)*. Why repeated local work in dynamic arrays, windows, stacks, deques, DSU, and heaps still has a tight global bound. **Prereq:** F01, F02.
- **F04 — Java contest mechanics and numeric safety** *(B)*. Fast input, primitive arrays, comparators without subtraction, recursion depth, `long`, overflow, output construction. **Prereq:** F00, F01.
- **F05 — Adversarial testing, naive oracles, differential fuzzing** *(B)*. Turns correctness into an executable claim by generating cases and comparing optimized code against brute force. **Prereq:** F00, F01, F02, F04.
- **F05a — Diagnosing under uncertainty** *(A)* **[grafted]**. The trained procedure for reasoning when you do not know the answer: formalize → brute-force state → invariant hypothesis → counterexample attack → name the smallest missing fact. Practiced deliberately, not only when stuck. **Prereq:** F00, F02, F05.
- **F06 — Arrays, strings, matrices, simulation** *(B)*. Indexing, mutation, traversal, representation, and state-machine fluency. **Prereq:** F00, F04, F05.

### Flight 1 — Representation, ordering, preprocessing

- **F07 — Frequency tables and counting domains** *(A)*. **Prereq:** F01, F06.
- **F08 — Hash sets, maps, grouping, key design** *(B)*. Membership, complement lookup, dedup, canonical grouping, with collision and key-equality assumptions made explicit. **Prereq:** F03, F04, F07.
- **F09 — Bit representation, masks, subset/submask enumeration** *(B)*. **Prereq:** F01, F04, F06.
- **F10 — Orders, comparators, stability, tie rules** *(A)*. **Prereq:** F02, F04, F06.
- **F11 — Elementary sorts from scratch** *(B)*. Insertion and selection are gated evidence; bubble sort is a non-gating contrast. **Prereq:** F01, F02, F10.
- **F12 — Recursion mechanics, stack safety, explicit-stack conversion** *(B)*. **Prereq:** F01, F02, F04, F06.
- **F13 — Divide-and-conquer and merge sort** *(B)*. Includes merge-based counting. **Prereq:** F10, F11, F12.
- **F14 — Partitioning, quicksort, quickselect** *(B)*. **Prereq:** F03, F10, F12, F13.
- **F15 — Counting, bucket, and radix sorts** *(B)*. **Prereq:** F01, F07, F10, F13.
- **F16 — Prefix, suffix, bidirectional accumulations** *(A)*. **Prereq:** F02, F06.
- **F17 — 1-D/2-D prefix sums and prefix XOR** *(B)*. **Prereq:** F04, F09, F16.
- **F18 — 1-D/2-D difference arrays** *(A)*. **Prereq:** F17.
- **F19 — Coordinate compression** *(A)*. **Prereq:** F10, F13, F16.
- **F20 — Offline sorting and event transformation** *(A)*. **Prereq:** F10, F13, F19.

### Flight 2 — Search and linear-scan invariants

- **F21 — Exact binary search** *(A)*. **Prereq:** F02, F10, F13.
- **F22 — Lower/upper bound, predecessor, successor** *(B)*. One partition-point contract; first/last occurrence are variants, not separate techniques. **Prereq:** F21.
- **F23 — Binary search on a monotone predicate** *(A)*. Search becomes "find the truth boundary," not "match a value." **Prereq:** F01, F02, F22.
- **F24 — Answer-space and real-valued binary search** *(B)*. **Prereq:** F04, F23.
- **F25 — Same-direction pointers and stable compaction** *(A)*. **Prereq:** F02, F06.
- **F26 — Opposite-end pointers and elimination proofs** *(B)*. **Prereq:** F02, F10, F13, F25.
- **F27 — Multi-pointer merge, partition, pair counting** *(B)*. Includes Dutch three-way partition. **Prereq:** F14, F25, F26.
- **F28 — Fixed-size windows** *(A)*. **Prereq:** F03, F07, F16.
- **F29 — Variable windows with monotone validity** *(B)*. One skeleton; the shrink condition is the only variable. **Prereq:** F03, F08, F28.
- **F30 — Counting windows and exact-via-at-most transforms** *(B)*. **Prereq:** F02, F29.
- **F31 — Stack, queue, deque implementations** *(B)*. **Prereq:** F03, F04, F06.
- **F32 — Parsing and evaluation stacks** *(A)*. **Prereq:** F31.
- **F33 — Monotonic stacks and boundary ownership** *(B)*. One unresolved-index kernel; value-output and distance-output are variants. **Prereq:** F02, F03, F31.
- **F34 — Monotonic deques** *(A)*. **Prereq:** F03, F28, F31, F33.
- **F35 — Greedy proof patterns** *(B)*. Exchange, stay-ahead, cut, prefix-reset, dominance — so greedy is proved, not guessed. **Prereq:** F01, F02, F10.
- **F36 — Interval normalization, merging, selection** *(B)*. **Prereq:** F20, F26, F35.
- **F37 — Sweep lines, event ordering, concurrency** *(B)*. **Prereq:** F19, F20, F31, F36.
- **F38 — Matrix traversals and in-place transformations** *(B)*. **Prereq:** F06, F16.
- **F39 — Delimiter-safe serialization and manual parsing** *(A)*. **Prereq:** F04, F06.

### Flight 3 — Core data structures

- **F40 — Singly linked-list pointer primitives** *(B)*. **Prereq:** F02, F04.
- **F41 — Fast/slow pointers and functional cycles** *(B)*. **Prereq:** F02, F25, F40.
- **F42 — Linked-list composition and segment surgery** *(C)*. **Prereq:** F13, F40, F41.
- **F43 — Doubly linked lists plus hash indexing** *(C)*. **Prereq:** F08, F40.
- **F44 — Binary heaps and heap sort from scratch** *(B)*. `siftUp`, `siftDown`, linear heapify, in-place heap sort. **Prereq:** F03, F06, F10, F13.
- **F45 — Priority-queue selection and top-k maintenance** *(A)*. **Prereq:** F14, F44.
- **F46 — K-way merge and frontier heaps** *(C)*. **Prereq:** F27, F42, F45.
- **F47 — Two-heaps and partitioned order statistics** *(A)*. **Prereq:** F04, F45.
- **F48 — Ordered maps, ordered sets, multiset emulation** *(B)*. Predecessor/successor and dynamic counts that hashing cannot give. **Prereq:** F08, F10, F22.
- **F49 — Disjoint-set union from scratch** *(B)*. Union-by-size, path compression, amortized proof, component metadata. **Prereq:** F03, F06.
- **F50 — Fenwick trees** *(B)*. **Prereq:** F09, F17.
- **F51 — Segment trees** *(B)*. **Prereq:** F02, F12, F17.
- **F52 — Lazy propagation: range-add/range-sum** *(B)*. **Prereq:** F03, F18, F51.
- **F52a — Lazy propagation: general tag/action composition** *(B)* **[split]**. **Prereq:** F52.
- **F53 — Sparse tables and idempotent static queries** *(A)*. **Prereq:** F17, F21.
- **F54 — Offline query transformation** *(B)*. **Prereq:** F03, F19, F20, F25, F28.
- **F54a — Mo's algorithm** *(B)* **[split]**. **Prereq:** F54.

### Flight 4 — Recursion, search, binary trees

- **F55 — State-space trees and output-sensitive complexity** *(A)*. Brute force as an explicit decision graph; distinguishes avoidable exponential work from unavoidable output size. **Prereq:** F01, F02, F12.
- **F56 — Reversible-state backtracking** *(A)*. choose → explore → un-choose, with exact state restoration. **Prereq:** F05, F12, F55.
- **F57 — Subsets, combinations, permutations, assignment search** *(B)*. **Prereq:** F56.
- **F58 — Duplicate control, symmetry breaking, safe pruning** *(B)*. **Prereq:** F10, F35, F57.
- **F59 — Grid and constraint-state backtracking** *(B)*. Path-local marking **and why flood fill marks permanently while path search restores** — the distinction v1.2 left unstated. **Prereq:** F06, F56, F58.
- **F60 — Binary-tree recursive traversals and structural contracts** *(B)*. **Prereq:** F12, F31.
- **F61 — Iterative tree traversals and level frontiers** *(B)*. **Prereq:** F31, F60.
- **F62 — BST invariants and ordered operations** *(B)*. Validation by ancestor-derived bounds. **Prereq:** F22, F60, F61.
- **F63 — Postorder aggregation and path-state propagation** *(B)*. The asymmetry between what you return upward and what updates the global answer. **Prereq:** F02, F60.
- **F64 — Tree reconstruction and serialization** *(C)*. **Prereq:** F08, F13, F39, F60, F63.
- **F65 — One-shot binary-tree LCA** *(A)*. **Prereq:** F60, F63.

### Flight 5 — Dynamic programming as a state graph

- **F66 — State equivalence and the subproblem DAG** *(A)*. The central test: retained state is sufficient only if it completely determines all futures. **Prereq:** F01, F02, F12, F55.
- **F67 — Top-down memoization** *(A)*. **Prereq:** F08, F12, F66.
- **F68 — Bottom-up tabulation and dependency order** *(B)*. Loop order derived by topologically ordering state dependencies, not guessed. **Prereq:** F01, F66, F67.
- **F69 — Witness reconstruction and parent decisions** *(B)*. Return the actual path, subsequence, partition, edit script, or item set — not just a value. **Prereq:** F68.
- **F70 — Space compression, sentinels, overflow, modular counts** *(B)*. **Prereq:** F04, F68, F69.
- **F71 — One-dimensional and finite-state DP** *(B)*. **Prereq:** F68, F70.
- **F72 — Grid and lattice DP** *(B)*. **Prereq:** F17, F68, F70.
- **F73 — 0/1 knapsack and subset sum** *(B)*. Descending capacity gets a semantic proof, not a memorized direction. **Prereq:** F57, F68, F71.
- **F74 — Unbounded knapsack** *(A)*. Contrasts ascending capacity with 0/1 semantics. **Prereq:** F73.
- **F75 — Bounded, grouped, multidimensional knapsack** *(B)*. **Prereq:** F18, F73, F74.
- **F76 — Sequence DAG DP and quadratic LIS** *(A)*. **Prereq:** F25, F68.
- **F77 — O(n log n) LIS with reconstruction** *(B)*. **Prereq:** F22, F69, F76.
- **F78 — String-prefix and two-sequence DP** *(B)*. **Prereq:** F39, F68, F69.
- **F79 — Interval and split-point DP** *(B)*. **Prereq:** F13, F36, F68.
- **F80 — Bitmask DP** *(B)*. **Prereq:** F09, F57, F68.
- **F80a — SOS and profile DP** *(B)* **[split]**. **Prereq:** F80.
- **F81 — Digit and automaton DP** *(B)*. **Prereq:** F67, F70, F78, F80.
- **F82 — Greedy frontiers and local restarts** *(B)*. Reachability, minimum frontier layers, Kadane reset, prefix resets — each with a named proof. **Prereq:** F16, F35, F71.
- **F83 — Sort-and-heap greedy scheduling** *(B)*. **Prereq:** F35, F36, F45, F48.

### Flight 6 — Graphs and competitive trees

- **F84 — Graph modeling, representations, reductions** *(B)*. Includes recognizing that a story with no graph in it is a graph problem. **Prereq:** F00, F04, F06, F08, F31.
- **F85 — DFS, BFS, path reconstruction** *(B)*. **Prereq:** F05, F12, F31, F69, F84.
- **F86 — Grid, implicit, and state-expanded graphs** *(B)*. **Prereq:** F06, F59, F85.
- **F87 — Components, undirected cycles, bipartite checking** *(B)*. **Prereq:** F85.
- **F88 — Directed cycles and topological ordering** *(B)*. Three-color DFS and Kahn indegrees. **Prereq:** F85.
- **F89 — DAG dynamic programming** *(B)*. **Prereq:** F68, F69, F88.
- **F90 — Multi-source and layered BFS** *(B)*. **Prereq:** F85, F86.
- **F91 — 0–1 BFS** *(A)*. **Prereq:** F34, F84, F90.
- **F92 — Dijkstra and best-first shortest paths** *(B)*. Settled-distance and stale-entry invariants; nonnegative-edge contract stated. **Prereq:** F04, F35, F45, F84, F85.
- **F93 — Bellman–Ford and negative-cycle detection** *(B)*. Includes the bounded-relaxation form that "at most K stops" actually requires. **Prereq:** F01, F02, F67, F84.
- **F94 — Floyd–Warshall and transitive closure** *(A)*. **Prereq:** F04, F68, F84.
- **F95 — Resource-expanded shortest paths** *(B)*. **Prereq:** F66, F86, F91, F92, F93.
- **F95a — Minimax/bottleneck path algebra** *(B)* **[split]**. **Prereq:** F95.
- **F96 — Minimum spanning trees** *(B)*. Kruskal and Prim with cut/exchange proofs. **Prereq:** F35, F45, F49, F84.
- **F97 — Strongly connected components and condensation DAGs** *(B)*. **Prereq:** F85, F88, F89.
- **F98 — Low-link bridges and articulation points** *(B)*. **Prereq:** F02, F85.
- **F99 — Eulerian trails and Hierholzer** *(B)*. **Prereq:** F31, F48, F84, F85.
- **F100 — Rooted-tree metadata and Euler flattening** *(B)*. **Prereq:** F61, F84, F85.
- **F101 — Binary lifting, repeated LCA, tree distance** *(B)*. **Prereq:** F09, F65, F100.
- **F102 — Tree DP and rerooting** *(B)*. **Prereq:** F68, F69, F73, F100.
- **F103 — Functional graphs** *(B)*. **Prereq:** F41, F88, F101.
- **F104 — Heavy-light decomposition** *(C)*. **Prereq:** F51, F52, F100, F101.
- **F105 — Max flow and min cut** *(B)*. **Prereq:** F31, F84, F85, F90.
- **F106 — Bipartite matching and matching reductions** *(B)*. **Prereq:** F87, F105.

### Flight 7 — Number theory, strings, geometry, composition

- **F107 — Euclid, GCD/LCM, divisors, normalized ratios** *(A)*. **Prereq:** F01, F02, F04.
- **F108 — Extended Euclid, modular inverses, linear congruences, CRT** *(B)*. **Prereq:** F107.
- **F109 — Modular arithmetic and binary exponentiation** *(B)*. Every counting answer ends `mod 1e9+7`; this is where that stops being magic. **Prereq:** F04, F09, F108.
- **F110 — Sieve, SPF tables, factorization, divisors, Euler phi** *(B)*. **Prereq:** F06, F107.
- **F111 — Modular combinatorics** *(B)*. Factorial/inverse-factorial nCk. **Prereq:** F67, F109, F110.
- **F111a — Inclusion–exclusion** *(B)* **[split]**. **Prereq:** F111.
- **F112 — Matrix multiplication and exponentiation** *(B)*. **Prereq:** F38, F71, F109.
- **F113 — Probability and expectation** *(B)*. Indicator variables and expected-value DP. **Prereq:** F01, F68, F111.
- **F114 — Finite games and minimax** *(B)*. **Prereq:** F09, F89, F107.
- **F114a — Nim and impartial-game XOR** *(B)* **[split]**. **Prereq:** F114.
- **F115 — String structure, alphabets, borders, periods** *(B)*. **Prereq:** F07, F08, F13, F16, F39.
- **F116 — Tries and prefix-state dictionaries** *(B)*. Wildcard traversal, counts, deletion, subtrie enumeration. **Prereq:** F08, F60, F115.
- **F117 — Prefix function/KMP and Z algorithm** *(B)*. **Prereq:** F16, F22, F115.
- **F118 — Rolling hashes and substring fingerprints** *(B)*. With explicit collision mitigation — a single hash is never proof of equality. **Prereq:** F17, F109, F115.
- **F119 — Palindrome methods: center expansion and DP** *(B)*. **Prereq:** F78, F79, F117, F118.
- **F119a — Manacher** *(B)* **[split]**. **Prereq:** F119.
- **F120 — Aho–Corasick multi-pattern matching** *(C)*. **Prereq:** F85, F116, F117.
- **F121 — Suffix arrays and LCP** *(B)*. **Prereq:** F13, F19, F22, F115, F117.
- **F122 — Exact point/vector geometry** *(B)*. Orientation, cross products, GCD-normalized directions — and why floating-point slopes are a bug. **Prereq:** F04, F10, F107.
- **F123 — Lines, segments, polygons** *(B)*. **Prereq:** F20, F37, F122.
- **F123a — Convex hull and rotating calipers** *(B)* **[split]**. **Prereq:** F123.
- **F124 — Meet-in-the-middle** *(B)*. **Prereq:** F08, F09, F14, F22, F57.
- **F125 — Problem reduction** *(B)* **[split, grafted]**. Recognizing that an unfamiliar problem *is* a known one under a mapping — the highest-leverage competitive skill. Name the canonical target and state the mapping. **Prereq:** F00–F124.
- **F125a — Technique composition** *(C)*. Deliberately chaining independently mastered invariants — Euler tour plus Fenwick, trie plus search, sort plus heap plus sweep. Name the chain before coding. **Prereq:** F125.
- **F125b — Construction mode** *(B)* **[grafted]**. "Output any X such that…" — building from an invariant instead of searching for an answer. A stance interview lists almost never train and contests demand constantly. **Prereq:** F02, F35, F125.
- **F126 — Blind mixed transfer** *(C)*. The terminal rung. Certified only by the frozen assessment in Article VIII. **Prereq:** F125b.

### Named frontier — X01–X12 (non-gating)

These do not block F126. Pull one in only when a demonstrated target needs it.

- **X01 — Augmented randomized BST/treap.** **Prereq:** F03, F14, F48, F62.
- **X02 — Rollback DSU and offline dynamic connectivity.** **Prereq:** F49, F51, F54, F97.
- **X03 — Persistent segment trees.** **Prereq:** F19, F51, F69.
- **X04 — Small-to-large merging and centroid decomposition.** **Prereq:** F13, F48, F100, F102.
- **X05 — Min-cost flow and advanced matching.** **Prereq:** F92, F105, F106, F109.
- **X06 — Suffix automata.** **Prereq:** F120, F121.
- **X07 — Advanced DP optimizations** (monotone deque, divide-and-conquer, Knuth, convex hull, Li Chao). **Prereq:** F34, F48, F79, F80, F109.
- **X08 — Advanced computational geometry.** **Prereq:** F37, F48, F123.
- **X09 — FFT/NTT and polynomial algorithms.** **Prereq:** F13, F109, F111.
- **X10 — Advanced randomized/offline techniques.** **Prereq:** F05, F14, F24, F54.
- **X11 — 2-SAT through implication graphs.** **Prereq:** F97.
- **X12 — Binary tries and XOR optimization.** **Prereq:** F09, F116.

---

## Article V — Session Protocol

A session has a **shape**, not a duration. Learning Mode carries no clock (Rule 1).

1. **Orient.** Read the current rung, its open gates, and any reopened prerequisite.
2. **Derive.** Model the contract and constraints, produce the brute force, state the invariant or recurrence, budget the complexity. (Rule 3)
3. **Implement cold.** Blank file, no autocomplete, no reference. Trace by hand before running. (Rules 2, 4)
4. **Falsify.** Adversarial cases, and where feasible a naive oracle plus a randomized generator; isolate any mismatch to a minimal counterexample. (F05)
5. **Redo.** Delete and reconstruct from the model and invariant. (Rule 6)
6. **Log.** Two lines minimum: what broke, root cause. (Rule 11)

Stop whenever you choose. A session that covers only step 2 is a legitimate session.

### The eight mastery gates

A rung is **done** only when every gate has independently observed evidence. Passing is binary. Confidence, familiarity, copied code, and recognition of a known statement are not evidence.

1. **Model** — from an unlabeled prompt, formalize state, operations, constraints, output contract, and the simplest correct brute force *before* naming the technique.
2. **Applicability** — state the exact preconditions that make the technique valid, and construct a counterexample where a tempting use of it fails.
3. **Derivation** — recover the invariant, recurrence, structure algebra, or greedy choice from first principles, with a correctness argument.
4. **Cold Java** — implement the reusable primitive from a blank file, no reference, no autocomplete; trace manually before running.
5. **Bounds and safety** — derive preprocessing, update, query, total time, auxiliary space, recursion depth, amortized behavior, and numeric risks from your own implementation.
6. **Adversarial verification** — boundary cases plus, where feasible, a naive oracle and randomized generator; isolate mismatches minimally.
7. **Blind transfer** — solve an unfamiliar variation, without being told the rung, and explain why the nearest plausible alternative technique does not fit.
8. **Reconstruction** — delete the accepted implementation and recover it from model and invariant, not visual memory.

If help is required on a gate, that gate stays open; independent evidence on other gates is preserved.

---

## Article VI — Progress

There is **no percentage, no completion estimate, and no elapsed-time metric** in this program by design. A raw count like "30 of 127" is misleading because rung payloads differ, and any duration figure manufactures a failure condition the work itself does not have.

Progress is reported as exactly four things: **capability receipts earned**, **rungs unlocked**, **gate evidence observed**, and **failure modes repaired**.

### State record

```text
current_rung:      Fxx — name
payload_class:     A | B | C
prerequisites:     passed | repair-needed (name which)
open_gates:        [model, applicability, derivation, cold_java, bounds, verification, transfer, reconstruction]
failure_evidence:  concrete counterexample or implementation defect
transfer_evidence: unfamiliar task, and why the technique fit
next_action:       smallest open gate, or prerequisite repair
```

No pace field. No phase field. No quota.

### Capability receipts

Non-gating. Each reports what was observed and what remains out of scope. None predicts an employment outcome.

| Receipt | Closure | Permitted claim |
|---|---|---|
| Derivation foundation | F00–F06 | Can model, budget, prove, implement safely, and falsify foundational algorithms under the gate rubric. |
| Linear algorithms | F07–F39 | Transfer demonstrated across ordering, search, pointers, windows, stacks/deques, greedy foundations, intervals, matrix simulation. |
| Mutable structures | F40–F49 | Linked structures, heaps, ordered state, DSU. |
| Range/offline structures | F50–F54a | Operation-mix selection for dynamic and offline range queries. |
| Recursion and binary trees | F55–F65 | State-space search and binary-tree reasoning. |
| Dynamic programming and greedy | F66–F83 | State formulation, reconstruction, the listed DP families, greedy frontiers and scheduling. |
| Graph foundations | F84–F96 | Graph modeling, traversal, shortest-path selection, MST. |
| Advanced graph/tree | F97–F106 | The listed structural graph and competitive-tree machinery. |
| Contest math/string/geometry | F107–F124 | Transfer within the listed number, string, geometry, game, and meet-in-the-middle families. |
| Mixed-core transfer | F125–F126 | Passed the frozen assessment in Article VIII. |

Benchmark results are reported only under frozen conditions — "5/6 clean passes under the stated benchmark" — never as "FAANG-ready."

---

## Article VII — Recovery and Uncertainty

### The uncertainty-diagnosis chain *(this is rung F05a; practice it deliberately, not only when stuck)*

1. Stop implementing.
2. Restate the contract and constraints in plain English.
3. Derive the brute-force state — what would a correct, stupid solution track?
4. State an invariant or recurrence **hypothesis**.
5. Attack the hypothesis with counterexamples.
6. Name the **smallest missing fact** that blocks you.

Only then does recovery permit **one approach-only hint**, which you implement yourself. Solution study follows only if that fails (Rule 5), and leaves Cold Java, Blind Transfer, and Reconstruction open (Rule 7).

### When burned out

Full stop for at least a day. Physical activity. Return gently — a short orienting session first, a normal one after. There is no penalty and no lost ground; the ladder does not expire.

---

## Article VIII — Terminal Assessment

Replaces the deleted weekly curriculum. Certifies rung F126 and nothing else.

1. **Freeze twelve unlabeled, previously unseen tasks before assessment** — two from each domain: linear/order/search/greedy; data structures and range queries; recursion/DP; graphs/trees; math/strings/geometry; reduction/composition/construction.
2. At least six require two or more mastered rungs. At least three contain a plausible but **invalid** technique choice. At least two require a **witness or construction**, not just a value.
3. Statements you have already seen are ineligible. Declare recognition before working; the task is replaced without penalty.
4. No tags, technique labels, hints, recovery, reference implementations, or external solution material may contribute to a pass.
5. A task passes only if you record the model, constraints, and brute baseline; select **and defend** the technique; **reject the nearest plausible alternative**; produce cold Java that passes hidden tests; give a valid correctness and bounds argument; and supply adversarial tests.
6. **Pass at 10 of 12 or better**, with at least one success in every domain, at least five successful multi-rung compositions, and clean reconstruction of three randomly selected passed solutions.
7. On failure: trace each failure to its prerequisite gate, repair, and reassess with an entirely new frozen batch. Never replace failed tasks after seeing results.

Record for each: prompt identifier, unfamiliarity declaration, initial model, selected and rejected techniques, implementation hash, judge result, proof and bounds result, assistance count.

This is a certification instrument, not a practice quota. It has **no elapsed-time criterion**. Passing means broad mixed transfer across the v1.3 core under this rubric — interview speed is a separate Benchmark result.

---

## Appendix A — Java Reference

*(Convenience only. Rule 10: implement the machinery before you use the library.)*

```java
// Maps and sets
Map<K,V> map = new HashMap<>();
map.getOrDefault(key, def); map.merge(key, 1, Integer::sum);
Set<T> set = new HashSet<>();

// Ordered structures — predecessor/successor, unavailable from hashing
TreeMap<K,V> tm = new TreeMap<>();
tm.floorKey(k); tm.ceilingKey(k); tm.lowerKey(k); tm.higherKey(k); tm.firstKey(); tm.lastKey();

// Deque as stack AND queue
Deque<T> dq = new ArrayDeque<>();
dq.push(x); dq.pop(); dq.peek();              // stack
dq.offerLast(x); dq.pollFirst(); dq.peekFirst(); dq.peekLast();  // queue / monotonic deque

// Heap
PriorityQueue<Integer> minHeap = new PriorityQueue<>();
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

// COMPARATORS: never subtract — it overflows and silently inverts the order.
// WRONG: (a, b) -> a[0] - b[0]          // Integer.MAX_VALUE - (-1) wraps negative
// RIGHT:
PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
Comparator<int[]> byFirstThenSecond =
    Comparator.<int[]>comparingInt(a -> a[0]).thenComparingInt(a -> a[1]);

// Boxed equality: == compares references outside the -128..127 cache.
// WRONG: boxedA != boxedB      RIGHT: !boxedA.equals(boxedB)

// Numeric safety
long sum = 0;                       // accumulate in long, not int
int mid = lo + (hi - lo) / 2;       // never (lo + hi) / 2
double avg = (a + (long) b) / 2.0;  // widen before adding
static final int MOD = 1_000_000_007;

// Recursion depth: default stack ~10^4 frames. Deep recursion → explicit stack (F12).
```

## Appendix B — Constraint Index

The entry point. Read the constraints first, land on a rung, then open the ladder. *(This replaces the old keyword cheat sheet; it keys on constraints, not on problem phrasing, because keying on phrasing is what builds a recognition list.)*

| Constraint / signal | Budget implied | Land on |
|---|---|---|
| n ≤ 20 | exponential OK | F57, F80, F124 |
| n ≤ 100 | O(n³) | F94, F79 |
| n ≤ 2,000 | O(n²) | F76, F78, F72 |
| n ≤ 2·10⁵ | O(n log n) | F13, F22, F29, F33, F92 |
| n ≤ 10⁶ | O(n) or O(n log log n) | F16, F25, F110 |
| n ≤ 10¹⁸ | O(log n) | F23, F109, F112 |
| "count the ways", answer huge | modular counting | F109, F111 |
| "minimum/maximum X such that…" | monotone predicate | F23, F24 |
| range queries, static | precompute | F17, F53 |
| range queries + updates | dynamic structure | F50, F51, F52 |
| "output any valid X" | construction, not search | F125b |
| contiguous subarray/substring | window or prefix | F28, F29, F17 |
| subarray sum with negatives | prefix + hash (window fails) | F17, F08 |
| next/previous greater, spans | monotonic stack | F33 |
| window extremum | monotonic deque | F34 |
| shortest path, unweighted | BFS | F85, F90 |
| shortest path, weights {0,1} | 0–1 BFS | F91 |
| shortest path, nonnegative | Dijkstra | F92 |
| shortest path, negative or ≤K edges | Bellman–Ford | F93 |
| dependencies / ordering | topological | F88, F89 |
| connectivity, incremental | DSU | F49 |
| "problem says nothing about graphs" | model it as one | F84, F86 |
| unfamiliar and nothing fits | reduce it | F125, F05a |

## Appendix C — Template Library

Reference implementations, each tagged with its destination rung. **These are proof artifacts, not curriculum** — a rung is passed by deriving and implementing from a blank file (gates 4 and 8), never by copying from here. Consult only after your own attempt, or during sanctioned solution study (Rule 5).

Every defect found in the v1.2 audit is corrected below and marked `[FIXED v1.3]`.

### Library 1 — ARRAYS & HASHING

---

#### 1.1 Array — Contains Duplicate (HashSet)

> **Rung:** F08 · evidence exercise

**Use when:** Check for duplicates, track seen elements

```java
public boolean containsDuplicate(int[] nums) {
    Set<Integer> seen = new HashSet<>();

    for (int num : nums) {
        if (seen.contains(num)) {
            return true;
        }
        seen.add(num);
    }

    return false;
}
```

**Invariant:** `seen` contains all elements we've encountered so far.

**Common bugs:**

- Checking `seen.add()` return value instead of explicit contains (less readable)
- Using ArrayList instead of HashSet (O(n) vs O(1) lookup)

---

#### 1.2 Array — Two Sum (HashMap Index Lookup)

> **Rung:** F08 · evidence exercise

**Use when:** Find pair that satisfies condition, need to return indices

```java
public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>(); // value -> index

    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];

        if (map.containsKey(complement)) {
            return new int[]{map.get(complement), i};
        }

        map.put(nums[i], i);
    }

    return new int[]{-1, -1}; // not found
}
```

**Invariant:** Map stores value→index for all elements before current index.

**Common bugs:**

- Putting current element in map BEFORE checking (would find same element twice)
- Forgetting to store index vs value

---

#### 1.3 Array — Frequency Count (HashMap)

> **Rung:** F07 + F08 · evidence exercise

**Use when:** Count occurrences, find most/least frequent, anagram problems

```java
public Map<Character, Integer> frequencyCount(String s) {
    Map<Character, Integer> freq = new HashMap<>();

    for (char c : s.toCharArray()) {
        freq.put(c, freq.getOrDefault(c, 0) + 1);
    }

    return freq;
}

// Alternative: using array for lowercase letters only
public int[] frequencyCountArray(String s) {
    int[] freq = new int[26];

    for (char c : s.toCharArray()) {
        freq[c - 'a']++;
    }

    return freq;
}
```

**Invariant:** freq[c] = number of times c appears in processed portion.

**Common bugs:**

- Forgetting `getOrDefault` (NullPointerException)
- Using wrong array size (26 for lowercase, 128 for ASCII)
- Off-by-one in `c - 'a'` conversion

---

#### 1.4 Array — Group By Key (HashMap with List)

> **Rung:** F08 + F10 · evidence exercise

**Use when:** Group anagrams, group by category

```java
public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();

    for (String s : strs) {
        // Create key (sorted string for anagrams)
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String key = new String(chars);

        // Add to group
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(s);
    }

    return new ArrayList<>(map.values());
}
```

**Invariant:** All strings in map.get(key) share the same key.

**Common bugs:**

- Forgetting to initialize new ArrayList for new keys
- Modifying key after using it (for mutable keys)

---

#### 1.5 Array — Product Except Self (Prefix/Suffix)

> **Rung:** F16 · evidence exercise

**Use when:** Calculate something for each element based on rest of array

```java
public int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int[] result = new int[n];

    // First pass: prefix products (left to right)
    result[0] = 1;
    for (int i = 1; i < n; i++) {
        result[i] = result[i - 1] * nums[i - 1];
    }

    // Second pass: multiply by suffix products (right to left)
    int suffix = 1;
    for (int i = n - 1; i >= 0; i--) {
        result[i] *= suffix;
        suffix *= nums[i];
    }

    return result;
}
```

**Invariant:** After first pass, result[i] = product of all elements to the left. After second pass, result[i] = product of all elements except nums[i].

**Common bugs:**

- Off-by-one in index calculations
- Forgetting to initialize result[0] = 1

---

#### 1.6 Array — Encode/Decode Strings

> **Rung:** F39 · evidence exercise

**Use when:** Serialize list of strings, handle delimiters

```java
public String encode(List<String> strs) {
    StringBuilder sb = new StringBuilder();
    for (String s : strs) {
        sb.append(s.length()).append('#').append(s);
    }
    return sb.toString();
}

public List<String> decode(String str) {
    List<String> result = new ArrayList<>();
    int i = 0;

    while (i < str.length()) {
        // Find the '#' delimiter
        int j = i;
        while (str.charAt(j) != '#') {
            j++;
        }

        // Parse length and extract string
        int length = Integer.parseInt(str.substring(i, j));
        String s = str.substring(j + 1, j + 1 + length);
        result.add(s);

        i = j + 1 + length;
    }

    return result;
}
```

**Invariant:** Each encoded string is prefixed with its length, so we always know where it ends.

**Common bugs:**

- Not handling empty strings
- Off-by-one in substring indices

---

#### 1.7 Array — Longest Consecutive Sequence (HashSet)

> **Rung:** F08 · evidence exercise

**Use when:** Find longest consecutive sequence, O(n) required

```java
public int longestConsecutive(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int num : nums) {
        set.add(num);
    }

    int longest = 0;

    for (int num : set) {
        // Only start counting if this is the START of a sequence
        if (!set.contains(num - 1)) {
            int length = 1;
            int current = num;

            while (set.contains(current + 1)) {
                current++;
                length++;
            }

            longest = Math.max(longest, length);
        }
    }

    return longest;
}
```

**Invariant:** We only start counting from sequence starts (elements with no predecessor), so each sequence is counted exactly once.

**Common bugs:**

- Not checking `!set.contains(num - 1)` (makes it O(n²))
- Using nums array instead of set in inner loop


### Library 2 — TWO POINTERS

---

#### 2.1 Two Pointers — Opposite Ends (Sorted Array)

> **Rung:** F26 · evidence exercise

**Use when:** Sorted array, find pair with target sum, container problems

```java
public int[] twoPointerOpposite(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;

    while (left < right) {
        int sum = nums[left] + nums[right];

        if (sum == target) {
            return new int[]{left, right};
        } else if (sum < target) {
            left++;
        } else {
            right--;
        }
    }

    return new int[]{-1, -1};
}
```

**Invariant:** Answer, if exists, is always within [left, right]. Each iteration shrinks the range without skipping the answer.

**Common bugs:**

- Using `<=` instead of `<` (causes infinite loop or double-counting)
- Moving wrong pointer

---

#### 2.2 Two Pointers — 3Sum (Skip Duplicates)

> **Rung:** F27 · evidence exercise

**Use when:** Find triplets, must avoid duplicate results

```java
public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(nums);

    for (int i = 0; i < nums.length - 2; i++) {
        // Skip duplicate first elements
        if (i > 0 && nums[i] == nums[i - 1]) {
            continue;
        }

        int left = i + 1;
        int right = nums.length - 1;
        int target = -nums[i];

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                // Skip duplicates
                while (left < right && nums[left] == nums[left + 1]) left++;
                while (left < right && nums[right] == nums[right - 1]) right--;

                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }

    return result;
}
```

**Invariant:** After sorting, we fix one element and use two pointers for the rest. Duplicate skipping ensures unique triplets.

**Common bugs:**

- Not sorting first
- Duplicate skipping logic wrong (checking wrong indices)
- Forgetting to move both pointers after finding a match

---

#### 2.3 Two Pointers — Container With Most Water

> **Rung:** F26 + F35 · evidence exercise

**Use when:** Maximize area/product with two boundaries

```java
public int maxArea(int[] height) {
    int left = 0;
    int right = height.length - 1;
    int maxArea = 0;

    while (left < right) {
        int width = right - left;
        int h = Math.min(height[left], height[right]);
        int area = width * h;
        maxArea = Math.max(maxArea, area);

        // Move the shorter side (only way to potentially increase area)
        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }

    return maxArea;
}
```

**Invariant:** Moving the shorter side is the only way to potentially increase area, since width is decreasing.

**Common bugs:**

- Moving the wrong pointer
- Forgetting to use Math.min for height

---

#### 2.4 Two Pointers — Same Direction (Fast/Slow)

> **Rung:** F25 · evidence exercise

**Use when:** Remove duplicates, partition array

```java
public int removeDuplicates(int[] nums) {
    if (nums.length == 0) return 0;

    int slow = 0;

    for (int fast = 1; fast < nums.length; fast++) {
        if (nums[fast] != nums[slow]) {
            slow++;
            nums[slow] = nums[fast];
        }
    }

    return slow + 1; // length, not index
}
```

**Invariant:** [0, slow] contains unique elements. fast scans ahead.

**Common bugs:**

- Off-by-one on return value (slow vs slow+1)
- Starting fast at 0 instead of 1

---

#### 2.5 Two Pointers — Trapping Rain Water

> **Rung:** F16 + F26 · evidence exercise

**Use when:** Calculate trapped water/area between bars

```java
public int trap(int[] height) {
    if (height.length == 0) return 0;

    int left = 0;
    int right = height.length - 1;
    int leftMax = 0;
    int rightMax = 0;
    int water = 0;

    while (left < right) {
        if (height[left] < height[right]) {
            if (height[left] >= leftMax) {
                leftMax = height[left];
            } else {
                water += leftMax - height[left];
            }
            left++;
        } else {
            if (height[right] >= rightMax) {
                rightMax = height[right];
            } else {
                water += rightMax - height[right];
            }
            right--;
        }
    }

    return water;
}
```

**Invariant:** Water at position depends on min(leftMax, rightMax). We process the smaller side because we know the other side has a taller bar.

**Common bugs:**

- Logic for when to add water vs update max
- Processing wrong side


### Library 3 — SLIDING WINDOW

---

#### 3.1 Sliding Window — Fixed Size

> **Rung:** F28 · evidence exercise

**Use when:** Maximum sum of k elements, any fixed-width window

```java
public int maxSumFixedWindow(int[] nums, int k) {
    if (nums == null || nums.length < k) return 0; // [FIXED v1.3] guard k > n
    // Build initial window
    int windowSum = 0;
    for (int i = 0; i < k; i++) {
        windowSum += nums[i];
    }
    int maxSum = windowSum;

    // Slide window
    for (int i = k; i < nums.length; i++) {
        windowSum += nums[i] - nums[i - k]; // add new, remove old
        maxSum = Math.max(maxSum, windowSum);
    }

    return maxSum;
}
```

**Invariant:** Window always contains exactly k elements.

**Common bugs:**

- Starting second loop at 0 instead of k
- Using `i - k + 1` when you mean `i - k`

---

#### 3.2 Sliding Window — Variable Size (Minimum)

> **Rung:** F29 · evidence exercise

**Use when:** Minimum subarray with condition

```java
public int minSubArrayLen(int target, int[] nums) {
    int left = 0;
    int sum = 0;
    int minLen = Integer.MAX_VALUE;

    for (int right = 0; right < nums.length; right++) {
        // Expand: add right element
        sum += nums[right];

        // Shrink: while window is valid, try to minimize
        while (sum >= target) {
            minLen = Math.min(minLen, right - left + 1);
            sum -= nums[left];
            left++;
        }
    }

    return minLen == Integer.MAX_VALUE ? 0 : minLen;
}
```

**Invariant:** When sum >= target, window is valid. We shrink to find minimum.

**Common bugs:**

- Updating result at wrong time
- Wrong shrink condition (> vs >=)
- Forgetting `right - left + 1` for window size

---

#### 3.3 Sliding Window — Variable Size (Maximum)

> **Rung:** F29 + F30 · evidence exercise

**Use when:** Longest substring without repeating characters

```java
public int lengthOfLongestSubstring(String s) {
    Map<Character, Integer> window = new HashMap<>();
    int left = 0;
    int maxLen = 0;

    for (int right = 0; right < s.length(); right++) {
        char c = s.charAt(right);
        window.put(c, window.getOrDefault(c, 0) + 1);

        // Shrink while window is invalid (has duplicates)
        while (window.get(c) > 1) {
            char leftChar = s.charAt(left);
            window.put(leftChar, window.get(leftChar) - 1);
            left++;
        }

        // Window is now valid, update max
        maxLen = Math.max(maxLen, right - left + 1);
    }

    return maxLen;
}
```

**Invariant:** Window [left, right] contains no duplicates when we update maxLen.

**Common bugs:**

- Forgetting `getOrDefault`
- Using `remove()` instead of decrementing
- Updating max inside while loop (invalid window)

---

#### 3.4 Sliding Window — Character Replacement

> **Rung:** F29 · evidence exercise

**Use when:** Longest repeating character replacement with k changes

```java
public int characterReplacement(String s, int k) {
    int[] count = new int[26];
    int left = 0;
    int maxFreq = 0;
    int maxLen = 0;

    for (int right = 0; right < s.length(); right++) {
        count[s.charAt(right) - 'A']++;
        maxFreq = Math.max(maxFreq, count[s.charAt(right) - 'A']);

        // Window size - maxFreq = characters to replace
        // If > k, shrink window
        while ((right - left + 1) - maxFreq > k) {
            count[s.charAt(left) - 'A']--;
            left++;
        }

        maxLen = Math.max(maxLen, right - left + 1);
    }

    return maxLen;
}
```

**Invariant:** windowSize - maxFreq <= k means we can make all chars same with <= k replacements.

**Common bugs:**

- Not updating maxFreq correctly
- Wrong window validity condition

---

#### 3.5 Sliding Window — Minimum Window Substring

> **Rung:** F30 · evidence exercise

**Use when:** Find smallest window containing all characters

```java
public String minWindow(String s, String t) {
    if (t.length() > s.length()) return "";

    Map<Character, Integer> need = new HashMap<>();
    Map<Character, Integer> window = new HashMap<>();

    for (char c : t.toCharArray()) {
        need.put(c, need.getOrDefault(c, 0) + 1);
    }

    int left = 0;
    int have = 0;
    int required = need.size();
    int[] result = {-1, 0, 0}; // length, left, right

    for (int right = 0; right < s.length(); right++) {
        char c = s.charAt(right);
        window.put(c, window.getOrDefault(c, 0) + 1);

        if (need.containsKey(c) && window.get(c).equals(need.get(c))) {
            have++;
        }

        // Shrink while valid
        while (have == required) {
            // Update result
            if (result[0] == -1 || right - left + 1 < result[0]) {
                result[0] = right - left + 1;
                result[1] = left;
                result[2] = right;
            }

            // Shrink from left
            char leftChar = s.charAt(left);
            window.put(leftChar, window.get(leftChar) - 1);
            if (need.containsKey(leftChar) && window.get(leftChar) < need.get(leftChar)) {
                have--;
            }
            left++;
        }
    }

    return result[0] == -1 ? "" : s.substring(result[1], result[2] + 1);
}
```

**Invariant:** `have` tracks how many unique characters meet their required count.

**Common bugs:**

- Using `==` instead of `.equals()` for Integer comparison
- Decrementing have at wrong time
- Off-by-one in substring

---

#### 3.6 Sliding Window — Permutation in String

> **Rung:** F28 + F30 · evidence exercise

**Use when:** Check if any permutation of pattern exists in string

```java
public boolean checkInclusion(String s1, String s2) {
    if (s1.length() > s2.length()) return false;

    int[] s1Count = new int[26];
    int[] windowCount = new int[26];

    for (char c : s1.toCharArray()) {
        s1Count[c - 'a']++;
    }

    int left = 0;

    for (int right = 0; right < s2.length(); right++) {
        windowCount[s2.charAt(right) - 'a']++;

        // Shrink if window too large
        if (right - left + 1 > s1.length()) {
            windowCount[s2.charAt(left) - 'a']--;
            left++;
        }

        // Check if window matches
        if (Arrays.equals(s1Count, windowCount)) {
            return true;
        }
    }

    return false;
}
```

**Invariant:** Window is always size <= s1.length(). When sizes match and counts match, we found a permutation.

**Common bugs:**

- Not handling window size correctly
- Expensive array comparison (can optimize with matches counter)


### Library 4 — STACK

---

#### 4.1 Stack — Valid Parentheses

> **Rung:** F32 · evidence exercise

**Use when:** Matching brackets, valid expressions

```java
public boolean isValid(String s) {
    Deque<Character> stack = new ArrayDeque<>();
    Map<Character, Character> pairs = Map.of(
        ')', '(',
        ']', '[',
        '}', '{'
    );

    for (char c : s.toCharArray()) {
        if (pairs.containsKey(c)) {
            // Closing bracket
            // [FIXED v1.3] != compares Character REFERENCES; worked only via the -128..127 cache
            if (stack.isEmpty() || !stack.pop().equals(pairs.get(c))) {
                return false;
            }
        } else {
            // Opening bracket
            stack.push(c);
        }
    }

    return stack.isEmpty();
}
```

**Invariant:** Stack contains unmatched opening brackets. Valid if empty at end.

**Common bugs:**

- Not checking `stack.isEmpty()` before pop
- Forgetting to check stack is empty at end

---

#### 4.2 Stack — Monotonic Stack (Next Greater Element)

> **Rung:** F33 · evidence exercise

**Use when:** Next greater/smaller element, daily temperatures

```java
public int[] nextGreaterElement(int[] nums) {
    int n = nums.length;
    int[] result = new int[n];
    Arrays.fill(result, -1);

    Deque<Integer> stack = new ArrayDeque<>(); // stores indices

    for (int i = 0; i < n; i++) {
        while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
            int idx = stack.pop();
            result[idx] = nums[i];
        }
        stack.push(i);
    }

    return result;
}
```

**Invariant:** Stack maintains indices of elements waiting for their "next greater." Stack values are in decreasing order.

**Common bugs:**

- Storing values instead of indices
- Wrong comparison direction (< vs >)
- Forgetting to push current index

---

#### 4.3 Stack — Evaluate Reverse Polish Notation

> **Rung:** F32 · evidence exercise

**Use when:** Evaluate postfix expressions

```java
public int evalRPN(String[] tokens) {
    Deque<Integer> stack = new ArrayDeque<>();

    for (String token : tokens) {
        if (isOperator(token)) {
            int b = stack.pop(); // second operand (popped first)
            int a = stack.pop(); // first operand
            int result = calculate(a, b, token);
            stack.push(result);
        } else {
            stack.push(Integer.parseInt(token));
        }
    }

    return stack.pop();
}

private boolean isOperator(String s) {
    return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
}

private int calculate(int a, int b, String op) {
    switch (op) {
        case "+": return a + b;
        case "-": return a - b;
        case "*": return a * b;
        case "/": return a / b;
        default: throw new IllegalArgumentException();
    }
}
```

**Invariant:** Stack contains operands. When we see operator, pop two, calculate, push result.

**Common bugs:**

- Wrong order of operands (b is popped before a)
- Integer division truncation (intended for this problem)

---

#### 4.4 Stack — Daily Temperatures

> **Rung:** F33 · evidence exercise

**Use when:** Find days until warmer temperature

```java
public int[] dailyTemperatures(int[] temperatures) {
    int n = temperatures.length;
    int[] result = new int[n];
    Deque<Integer> stack = new ArrayDeque<>();

    for (int i = 0; i < n; i++) {
        while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
            int idx = stack.pop();
            result[idx] = i - idx; // days difference
        }
        stack.push(i);
    }

    return result;
}
```

**Invariant:** Same as next greater element, but result is index difference, not value.

**Common bugs:**

- Returning value instead of index difference
- Not initializing result to 0 (default for int[])

---

#### 4.5 Stack — Largest Rectangle in Histogram

> **Rung:** F33 · evidence exercise

**Use when:** Find largest rectangle in bar chart

```java
public int largestRectangleArea(int[] heights) {
    Deque<Integer> stack = new ArrayDeque<>();
    int maxArea = 0;
    int n = heights.length;

    for (int i = 0; i <= n; i++) {
        int h = (i == n) ? 0 : heights[i];

        while (!stack.isEmpty() && heights[stack.peek()] > h) {
            int height = heights[stack.pop()];
            int width = stack.isEmpty() ? i : i - stack.peek() - 1;
            maxArea = Math.max(maxArea, height * width);
        }

        stack.push(i);
    }

    return maxArea;
}
```

**Invariant:** Stack maintains indices in increasing height order. When we see shorter bar, we know the extent of previous bars.

**Common bugs:**

- Not handling the final "flush" (i == n with h = 0)
- Width calculation when stack is empty


### Library 5 — BINARY SEARCH

---

#### 5.1 Binary Search — Standard (Find Target)

> **Rung:** F21 · evidence exercise

**Use when:** Find exact target in sorted array

```java
public int binarySearch(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    return -1;
}
```

**Invariant:** Target, if exists, is always in [left, right].

**Common bugs:**

- Using `(left + right) / 2` (integer overflow)
- Using `<` instead of `<=`
- Forgetting `+1` or `-1`

---

#### 5.2 Binary Search — Left Bound (First Occurrence)

> **Rung:** F22 · evidence exercise

**Use when:** Find first position of target, insertion point

```java
public int binarySearchLeft(int[] nums, int target) {
    int left = 0;
    int right = nums.length; // NOTE: not nums.length - 1

    while (left < right) { // NOTE: not <=
        int mid = left + (right - left) / 2;

        if (nums[mid] < target) {
            left = mid + 1;
        } else {
            right = mid; // NOTE: not mid - 1
        }
    }

    return left;
}
```

**Invariant:** All elements in [0, left) are < target.

**Common bugs:**

- Mixing templates
- Wrong initial right value
- Using `<=` instead of `<`

---

#### 5.3 Binary Search — Right Bound (Last Occurrence)

> **Rung:** F22 · evidence exercise

**Use when:** Find last position of target

```java
public int binarySearchRight(int[] nums, int target) {
    int left = 0;
    int right = nums.length;

    while (left < right) {
        int mid = left + (right - left) / 2;

        if (nums[mid] <= target) { // NOTE: <=
            left = mid + 1;
        } else {
            right = mid;
        }
    }

    return left - 1; // NOTE: -1
}
```

**Common bugs:**

- Forgetting `-1` at end
- Using `<` instead of `<=`

---

#### 5.4 Binary Search — Search in Rotated Sorted Array

> **Rung:** F23 · evidence exercise

**Use when:** Array is sorted but rotated

```java
public int searchRotated(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (nums[mid] == target) {
            return mid;
        }

        // Determine which half is sorted
        if (nums[left] <= nums[mid]) {
            // Left half is sorted
            if (nums[left] <= target && target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        } else {
            // Right half is sorted
            if (nums[mid] < target && target <= nums[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }

    return -1;
}
```

**Invariant:** One half is always sorted. Check if target is in sorted half.

**Common bugs:**

- Boundary conditions (`<=` vs `<`)
- Determining which half is sorted

---

#### 5.5 Binary Search — Find Minimum in Rotated Array

> **Rung:** F23 · evidence exercise

**Use when:** Find pivot point in rotated array

```java
public int findMin(int[] nums) {
    int left = 0;
    int right = nums.length - 1;

    while (left < right) {
        int mid = left + (right - left) / 2;

        if (nums[mid] > nums[right]) {
            // Minimum is in right half
            left = mid + 1;
        } else {
            // Minimum is in left half (including mid)
            right = mid;
        }
    }

    return nums[left];
}
```

**Invariant:** Minimum is always in [left, right].

**Common bugs:**

- Comparing with nums[left] instead of nums[right]
- Using `<=` which can cause infinite loop

---

#### 5.6 Binary Search — On Answer (Koko Eating Bananas)

> **Rung:** F24 · evidence exercise

**Use when:** Find minimum/maximum value that satisfies condition

```java
public int minEatingSpeed(int[] piles, int h) {
    int left = 1;
    int right = Arrays.stream(piles).max().getAsInt();

    while (left < right) {
        int mid = left + (right - left) / 2;

        if (canFinish(piles, mid, h)) {
            right = mid; // Try smaller speed
        } else {
            left = mid + 1;
        }
    }

    return left;
}

private boolean canFinish(int[] piles, int speed, int h) {
    long hours = 0; // [FIXED v1.3] int overflows: 10^4 piles x 10^9 at speed 2500 = 4e9 hours
    for (int pile : piles) {
        hours += (pile + speed - 1) / speed; // Ceiling division
    }
    return hours <= h;
}
```

**Invariant:** Binary search on the answer space. Find minimum speed that works.

**Common bugs:**

- Wrong search space bounds
- Ceiling division formula: `(a + b - 1) / b`


### Library 6 — LINKED LIST

---

#### 6.1 Linked List — Reverse

> **Rung:** F40 · evidence exercise

**Use when:** Reverse entire list or portion

```java
public ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;

    while (curr != null) {
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }

    return prev;
}
```

**Invariant:** `prev` points to reversed portion, `curr` to unreversed.

**Common bugs:**

- Losing reference to next
- Returning curr instead of prev

---

#### 6.2 Linked List — Fast/Slow Pointers (Cycle Detection)

> **Rung:** F41 · evidence exercise

**Use when:** Detect cycle, find middle

```java
public boolean hasCycle(ListNode head) {
    if (head == null || head.next == null) return false;

    ListNode slow = head;
    ListNode fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;

        if (slow == fast) {
            return true;
        }
    }

    return false;
}

// Find middle (for odd length, returns exact middle; for even, returns second middle)
public ListNode findMiddle(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }

    return slow;
}
```

**Invariant:** Fast moves 2x speed of slow. If cycle exists, they will meet.

**Common bugs:**

- Null checks on fast and fast.next
- Off-by-one in middle calculation

---

#### 6.3 Linked List — Merge Two Sorted Lists

> **Rung:** F42 · evidence exercise

**Use when:** Merge sorted lists

```java
public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(0);
    ListNode curr = dummy;

    while (l1 != null && l2 != null) {
        if (l1.val <= l2.val) {
            curr.next = l1;
            l1 = l1.next;
        } else {
            curr.next = l2;
            l2 = l2.next;
        }
        curr = curr.next;
    }

    // Attach remaining
    curr.next = (l1 != null) ? l1 : l2;

    return dummy.next;
}
```

**Invariant:** dummy.next points to merged list head. curr is always the tail.

**Common bugs:**

- Forgetting to attach remaining list
- Not using dummy node

---

#### 6.4 Linked List — Remove Nth Node From End

> **Rung:** F40 · evidence exercise

**Use when:** Remove from end without knowing length

```java
public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;

    ListNode fast = dummy;
    ListNode slow = dummy;

    // Move fast n+1 steps ahead
    for (int i = 0; i <= n; i++) {
        fast = fast.next;
    }

    // Move both until fast reaches end
    while (fast != null) {
        fast = fast.next;
        slow = slow.next;
    }

    // Skip the nth node
    slow.next = slow.next.next;

    return dummy.next;
}
```

**Invariant:** When fast reaches end, slow is at the node before the one to remove.

**Common bugs:**

- Off-by-one in initial fast movement
- Not using dummy node (edge case: remove head)

---

#### 6.5 Linked List — Reorder List

> **Rung:** F42 · evidence exercise

**Use when:** Reorder L0→Ln→L1→Ln-1→...

```java
public void reorderList(ListNode head) {
    if (head == null || head.next == null) return;

    // 1. Find middle
    ListNode slow = head;
    ListNode fast = head;
    while (fast.next != null && fast.next.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }

    // 2. Reverse second half
    ListNode second = reverse(slow.next);
    slow.next = null; // Cut the list

    // 3. Merge alternating
    ListNode first = head;
    while (second != null) {
        ListNode temp1 = first.next;
        ListNode temp2 = second.next;

        first.next = second;
        second.next = temp1;

        first = temp1;
        second = temp2;
    }
}

private ListNode reverse(ListNode head) {
    ListNode prev = null;
    while (head != null) {
        ListNode next = head.next;
        head.next = prev;
        prev = head;
        head = next;
    }
    return prev;
}
```

**Invariant:** Find middle, reverse second half, interleave.

**Common bugs:**

- Not cutting the list after finding middle
- Merge logic with wrong pointers

---

#### 6.6 Linked List — LRU Cache

> **Rung:** F43 · evidence exercise

**Use when:** Implement LRU cache with O(1) operations

```java
class LRUCache {
    private Map<Integer, Node> map;
    private int capacity;
    private Node head, tail; // Dummy nodes

    class Node {
        int key, val;
        Node prev, next;
        Node(int k, int v) { key = k; val = v; }
    }

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.head = new Node(0, 0);
        this.tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (!map.containsKey(key)) return -1;

        Node node = map.get(key);
        remove(node);
        insertAtHead(node);
        return node.val;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.val = value;
            remove(node);
            insertAtHead(node);
        } else {
            if (map.size() == capacity) {
                map.remove(tail.prev.key);
                remove(tail.prev);
            }
            Node node = new Node(key, value);
            map.put(key, node);
            insertAtHead(node);
        }
    }

    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insertAtHead(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }
}
```

**Invariant:** HashMap for O(1) lookup. Doubly linked list for O(1) removal and insertion. Most recent at head.

**Common bugs:**

- Pointer manipulation order in remove/insert
- Forgetting to remove from map when evicting


### Library 7 — TREES

---

#### 7.1 Tree — DFS Recursive (Preorder/Inorder/Postorder)

> **Rung:** F60 · evidence exercise

**Use when:** Tree traversal, path problems

```java
// Preorder: root, left, right
public void preorder(TreeNode root, List<Integer> result) {
    if (root == null) return;
    result.add(root.val);        // Process
    preorder(root.left, result); // Left
    preorder(root.right, result);// Right
}

// Inorder: left, root, right (gives sorted order for BST)
public void inorder(TreeNode root, List<Integer> result) {
    if (root == null) return;
    inorder(root.left, result);
    result.add(root.val);
    inorder(root.right, result);
}

// Postorder: left, right, root
public void postorder(TreeNode root, List<Integer> result) {
    if (root == null) return;
    postorder(root.left, result);
    postorder(root.right, result);
    result.add(root.val);
}
```

**Invariant:** Each node visited exactly once in specific order.

---

#### 7.2 Tree — BFS Level Order

> **Rung:** F61 · evidence exercise

**Use when:** Level-by-level traversal, minimum depth

```java
public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) return result;

    Queue<TreeNode> queue = new ArrayDeque<>();
    queue.offer(root);

    while (!queue.isEmpty()) {
        int size = queue.size();
        List<Integer> level = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            TreeNode node = queue.poll();
            level.add(node.val);

            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }

        result.add(level);
    }

    return result;
}
```

**Invariant:** Process all nodes at current level before moving to next.

**Common bugs:**

- Not capturing size before loop
- Adding null nodes to queue

---

#### 7.3 Tree — Maximum Depth

> **Rung:** F63 · evidence exercise

**Use when:** Find height/depth

```java
public int maxDepth(TreeNode root) {
    if (root == null) return 0;

    int left = maxDepth(root.left);
    int right = maxDepth(root.right);

    return Math.max(left, right) + 1;
}
```

**Invariant:** Depth of tree = 1 + max(depth of left, depth of right).

---

#### 7.4 Tree — Same Tree / Symmetric

> **Rung:** F60 · evidence exercise

**Use when:** Compare tree structures

```java
public boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null && q == null) return true;
    if (p == null || q == null) return false;
    if (p.val != q.val) return false;

    return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
}

public boolean isSymmetric(TreeNode root) {
    if (root == null) return true;
    return isMirror(root.left, root.right);
}

private boolean isMirror(TreeNode t1, TreeNode t2) {
    if (t1 == null && t2 == null) return true;
    if (t1 == null || t2 == null) return false;
    return t1.val == t2.val
        && isMirror(t1.left, t2.right)
        && isMirror(t1.right, t2.left);
}
```

---

#### 7.5 Tree — Invert Binary Tree

> **Rung:** F60 · evidence exercise

**Use when:** Mirror a tree

```java
public TreeNode invertTree(TreeNode root) {
    if (root == null) return null;

    TreeNode left = invertTree(root.left);
    TreeNode right = invertTree(root.right);

    root.left = right;
    root.right = left;

    return root;
}
```

---

#### 7.6 Tree — Validate BST

> **Rung:** F62 · evidence exercise

**Use when:** Check if valid BST

```java
public boolean isValidBST(TreeNode root) {
    return validate(root, null, null);
}

private boolean validate(TreeNode node, Integer min, Integer max) {
    if (node == null) return true;

    if (min != null && node.val <= min) return false;
    if (max != null && node.val >= max) return false;

    return validate(node.left, min, node.val)
        && validate(node.right, node.val, max);
}
```

**Invariant:** Every node must be within (min, max) range. Range narrows as we go down.

**Common bugs:**

- Using >= instead of > (BST has no duplicates in strict definition)
- Not passing updated bounds

---

#### 7.7 Tree — Lowest Common Ancestor

> **Rung:** F65 · evidence exercise

**Use when:** Find LCA of two nodes

```java
public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null || root == p || root == q) {
        return root;
    }

    TreeNode left = lowestCommonAncestor(root.left, p, q);
    TreeNode right = lowestCommonAncestor(root.right, p, q);

    if (left != null && right != null) {
        return root; // p and q are in different subtrees
    }

    return left != null ? left : right;
}
```

**Invariant:** If both left and right return non-null, current node is LCA.

---

#### 7.8 Tree — Construct from Preorder/Inorder

> **Rung:** F64 · evidence exercise

**Use when:** Build tree from traversals

```java
private int preorderIdx;
private Map<Integer, Integer> inorderMap;

public TreeNode buildTree(int[] preorder, int[] inorder) {
    preorderIdx = 0;
    inorderMap = new HashMap<>();

    for (int i = 0; i < inorder.length; i++) {
        inorderMap.put(inorder[i], i);
    }

    return build(preorder, 0, inorder.length - 1);
}

private TreeNode build(int[] preorder, int left, int right) {
    if (left > right) return null;

    int rootVal = preorder[preorderIdx++];
    TreeNode root = new TreeNode(rootVal);

    int mid = inorderMap.get(rootVal);

    root.left = build(preorder, left, mid - 1);
    root.right = build(preorder, mid + 1, right);

    return root;
}
```

**Invariant:** Preorder gives root, inorder tells us left/right subtree boundaries.

---

#### 7.9 Tree — Kth Smallest in BST

> **Rung:** F62 · evidence exercise

**Use when:** Find kth element in BST

```java
public int kthSmallest(TreeNode root, int k) {
    Deque<TreeNode> stack = new ArrayDeque<>();
    TreeNode curr = root;
    int count = 0;

    while (curr != null || !stack.isEmpty()) {
        while (curr != null) {
            stack.push(curr);
            curr = curr.left;
        }

        curr = stack.pop();
        count++;

        if (count == k) {
            return curr.val;
        }

        curr = curr.right;
    }

    return -1;
}
```

**Invariant:** Inorder traversal of BST gives sorted order. Stop at kth element.

---

#### 7.10 Tree — Serialize/Deserialize

> **Rung:** F64 · evidence exercise

**Use when:** Convert tree to/from string

```java
public String serialize(TreeNode root) {
    StringBuilder sb = new StringBuilder();
    serializeHelper(root, sb);
    return sb.toString();
}

private void serializeHelper(TreeNode node, StringBuilder sb) {
    if (node == null) {
        sb.append("null,");
        return;
    }
    sb.append(node.val).append(",");
    serializeHelper(node.left, sb);
    serializeHelper(node.right, sb);
}

public TreeNode deserialize(String data) {
    Queue<String> queue = new LinkedList<>(Arrays.asList(data.split(",")));
    return deserializeHelper(queue);
}

private TreeNode deserializeHelper(Queue<String> queue) {
    String val = queue.poll();
    if (val.equals("null")) return null;

    TreeNode node = new TreeNode(Integer.parseInt(val));
    node.left = deserializeHelper(queue);
    node.right = deserializeHelper(queue);
    return node;
}
```


### Library 8 — HEAP / PRIORITY QUEUE

---

#### 8.1 Heap — Basic Operations

> **Rung:** F44 · evidence exercise

**Use when:** Need quick access to min/max element

```java
// Min-heap (default)
PriorityQueue<Integer> minHeap = new PriorityQueue<>();

// Max-heap
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

// Custom comparator
PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0])); // [FIXED v1.3]

// Operations
minHeap.offer(x);    // Add: O(log n)
minHeap.poll();      // Remove min: O(log n)
minHeap.peek();      // Get min: O(1)
minHeap.size();
minHeap.isEmpty();
```

---

#### 8.2 Heap — Kth Largest Element

> **Rung:** F45 · evidence exercise

**Use when:** Find kth largest/smallest

```java
public int findKthLargest(int[] nums, int k) {
    // Min-heap of size k
    PriorityQueue<Integer> heap = new PriorityQueue<>();

    for (int num : nums) {
        heap.offer(num);
        if (heap.size() > k) {
            heap.poll();
        }
    }

    return heap.peek();
}
```

**Invariant:** Keep only k elements. Min-heap ensures smallest of k is on top. That's the kth largest overall.

---

#### 8.3 Heap — Top K Frequent Elements

> **Rung:** F07 + F45 · evidence exercise

**Use when:** Find k most frequent

```java
public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> freq = new HashMap<>();
    for (int num : nums) {
        freq.put(num, freq.getOrDefault(num, 0) + 1);
    }

    PriorityQueue<Integer> heap = new PriorityQueue<>(
        (a, b) -> Integer.compare(freq.get(a), freq.get(b)) // [FIXED v1.3]
    );

    for (int num : freq.keySet()) {
        heap.offer(num);
        if (heap.size() > k) {
            heap.poll();
        }
    }

    int[] result = new int[k];
    for (int i = 0; i < k; i++) {
        result[i] = heap.poll();
    }
    return result;
}
```

---

#### 8.4 Heap — Merge K Sorted Lists

> **Rung:** F46 · evidence exercise

**Use when:** Merge multiple sorted sequences

```java
public ListNode mergeKLists(ListNode[] lists) {
    PriorityQueue<ListNode> heap = new PriorityQueue<>(
        (a, b) -> Integer.compare(a.val, b.val) // [FIXED v1.3]
    );

    // Add first node of each list
    for (ListNode node : lists) {
        if (node != null) {
            heap.offer(node);
        }
    }

    ListNode dummy = new ListNode(0);
    ListNode curr = dummy;

    while (!heap.isEmpty()) {
        ListNode node = heap.poll();
        curr.next = node;
        curr = curr.next;

        if (node.next != null) {
            heap.offer(node.next);
        }
    }

    return dummy.next;
}
```

**Invariant:** Heap always contains the current smallest unprocessed node from each list.

---

#### 8.5 Heap — Find Median from Data Stream

> **Rung:** F47 · evidence exercise

**Use when:** Running median

```java
class MedianFinder {
    private PriorityQueue<Integer> maxHeap; // Lower half
    private PriorityQueue<Integer> minHeap; // Upper half

    public MedianFinder() {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {
        maxHeap.offer(num);
        minHeap.offer(maxHeap.poll());

        if (minHeap.size() > maxHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
    }

    public double findMedian() {
        if (maxHeap.size() > minHeap.size()) {
            return maxHeap.peek();
        }
        return ((long) maxHeap.peek() + minHeap.peek()) / 2.0; // [FIXED v1.3] widen before adding
    }
}
```

**Invariant:** maxHeap contains smaller half, minHeap contains larger half. Sizes differ by at most 1.


### Library 9 — BACKTRACKING

---

#### 9.1 Backtracking — Subsets

> **Rung:** F57 + F80 · evidence exercise

**Use when:** Generate all subsets

```java
public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    backtrack(nums, 0, new ArrayList<>(), result);
    return result;
}

private void backtrack(int[] nums, int start, List<Integer> current,
                       List<List<Integer>> result) {
    result.add(new ArrayList<>(current));

    for (int i = start; i < nums.length; i++) {
        current.add(nums[i]);
        backtrack(nums, i + 1, current, result);
        current.remove(current.size() - 1);
    }
}
```

**Invariant:** `start` prevents revisiting earlier elements. Every subset is generated exactly once.

---

#### 9.2 Backtracking — Permutations

> **Rung:** F57 · evidence exercise

**Use when:** Generate all orderings

```java
public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    boolean[] used = new boolean[nums.length];
    backtrack(nums, used, new ArrayList<>(), result);
    return result;
}

private void backtrack(int[] nums, boolean[] used, List<Integer> current,
                       List<List<Integer>> result) {
    if (current.size() == nums.length) {
        result.add(new ArrayList<>(current));
        return;
    }

    for (int i = 0; i < nums.length; i++) {
        if (used[i]) continue;

        used[i] = true;
        current.add(nums[i]);
        backtrack(nums, used, current, result);
        current.remove(current.size() - 1);
        used[i] = false;
    }
}
```

**Key difference from subsets:** No `start`, uses `used[]` array. Loop always from 0.

---

#### 9.3 Backtracking — Combination Sum

> **Rung:** F57 + F58 + F74 · evidence exercise

**Use when:** Find combinations that sum to target (can reuse)

```java
public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> result = new ArrayList<>();
    backtrack(candidates, target, 0, new ArrayList<>(), result);
    return result;
}

private void backtrack(int[] candidates, int remaining, int start,
                       List<Integer> current, List<List<Integer>> result) {
    if (remaining == 0) {
        result.add(new ArrayList<>(current));
        return;
    }
    if (remaining < 0) return;

    for (int i = start; i < candidates.length; i++) {
        current.add(candidates[i]);
        backtrack(candidates, remaining - candidates[i], i, current, result); // i, not i+1
        current.remove(current.size() - 1);
    }
}
```

---

#### 9.4 Backtracking — Word Search

> **Rung:** F59 · evidence exercise

**Use when:** Find word in grid

```java
public boolean exist(char[][] board, String word) {
    int rows = board.length;
    int cols = board[0].length;

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            if (backtrack(board, word, i, j, 0)) {
                return true;
            }
        }
    }
    return false;
}

private boolean backtrack(char[][] board, String word, int row, int col, int idx) {
    if (idx == word.length()) return true;

    if (row < 0 || row >= board.length || col < 0 || col >= board[0].length) {
        return false;
    }
    if (board[row][col] != word.charAt(idx)) return false;

    char temp = board[row][col];
    board[row][col] = '#'; // Mark visited

    boolean found = backtrack(board, word, row + 1, col, idx + 1)
                 || backtrack(board, word, row - 1, col, idx + 1)
                 || backtrack(board, word, row, col + 1, idx + 1)
                 || backtrack(board, word, row, col - 1, idx + 1);

    board[row][col] = temp; // Restore
    return found;
}
```


### Library 10 — TRIES

---

#### 10.1 Trie — Implementation

> **Rung:** F116 · evidence exercise

**Use when:** Prefix matching, autocomplete

```java
class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isWord = false;
}

class Trie {
    private TrieNode root = new TrieNode();

    public void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int idx = c - 'a';
            if (node.children[idx] == null) {
                node.children[idx] = new TrieNode();
            }
            node = node.children[idx];
        }
        node.isWord = true;
    }

    public boolean search(String word) {
        TrieNode node = find(word);
        return node != null && node.isWord;
    }

    public boolean startsWith(String prefix) {
        return find(prefix) != null;
    }

    private TrieNode find(String s) {
        TrieNode node = root;
        for (char c : s.toCharArray()) {
            int idx = c - 'a';
            if (node.children[idx] == null) return null;
            node = node.children[idx];
        }
        return node;
    }
}
```

---

#### 10.2 Trie — Word Search II

> **Rung:** F59 + F116 · evidence exercise

**Use when:** Find multiple words in grid

```java
// [FIXED v1.3] v1.2 did not compile: TrieNode had no `word` field and buildTrie was undefined.
class TrieNode {
    TrieNode[] children = new TrieNode[26];
    String word = null;            // terminal marker AND payload
}

private TrieNode buildTrie(String[] words) {
    TrieNode root = new TrieNode();
    for (String w : words) {
        TrieNode node = root;
        for (char c : w.toCharArray()) {
            int idx = c - 'a';
            if (node.children[idx] == null) node.children[idx] = new TrieNode();
            node = node.children[idx];
        }
        node.word = w;
    }
    return root;
}

public List<String> findWords(char[][] board, String[] words) {
    TrieNode root = buildTrie(words);
    List<String> result = new ArrayList<>();

    for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < board[0].length; j++) {
            dfs(board, i, j, root, result);
        }
    }

    return result;
}

private void dfs(char[][] board, int i, int j, TrieNode node, List<String> result) {
    if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) return;

    char c = board[i][j];
    if (c == '#' || node.children[c - 'a'] == null) return;

    node = node.children[c - 'a'];
    if (node.word != null) {
        result.add(node.word);
        node.word = null; // Avoid duplicates
    }

    board[i][j] = '#';
    dfs(board, i + 1, j, node, result);
    dfs(board, i - 1, j, node, result);
    dfs(board, i, j + 1, node, result);
    dfs(board, i, j - 1, node, result);
    board[i][j] = c;
}
```


### Library 11 — GRAPHS

---

#### 11.1 Graph — BFS (Level Order)

> **Rung:** F85 · evidence exercise

**Use when:** Shortest path (unweighted), level-by-level

```java
public void bfs(int start, List<List<Integer>> graph) {
    Queue<Integer> queue = new ArrayDeque<>();
    boolean[] visited = new boolean[graph.size()];

    queue.offer(start);
    visited[start] = true;

    while (!queue.isEmpty()) {
        int curr = queue.poll();

        for (int neighbor : graph.get(curr)) {
            if (!visited[neighbor]) {
                visited[neighbor] = true;
                queue.offer(neighbor);
            }
        }
    }
}
```

---

#### 11.2 Graph — DFS (Recursive)

> **Rung:** F85 · evidence exercise

**Use when:** Path finding, connected components

```java
public void dfs(int node, boolean[] visited, List<List<Integer>> graph) {
    if (visited[node]) return;
    visited[node] = true;

    for (int neighbor : graph.get(node)) {
        dfs(neighbor, visited, graph);
    }
}
```

---

#### 11.3 Graph — Number of Islands (Grid DFS)

> **Rung:** F86 + F87 · evidence exercise

**Use when:** Count connected components in grid

```java
public int numIslands(char[][] grid) {
    int count = 0;

    for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid[0].length; j++) {
            if (grid[i][j] == '1') {
                dfs(grid, i, j);
                count++;
            }
        }
    }

    return count;
}

private void dfs(char[][] grid, int i, int j) {
    if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) return;
    if (grid[i][j] != '1') return;

    grid[i][j] = '0';

    dfs(grid, i + 1, j);
    dfs(grid, i - 1, j);
    dfs(grid, i, j + 1);
    dfs(grid, i, j - 1);
}
```

---

#### 11.4 Graph — Clone Graph

> **Rung:** F84 + F85 · evidence exercise

**Use when:** Deep copy graph

```java
public Node cloneGraph(Node node) {
    if (node == null) return null;

    Map<Node, Node> map = new HashMap<>();
    return clone(node, map);
}

private Node clone(Node node, Map<Node, Node> map) {
    if (map.containsKey(node)) {
        return map.get(node);
    }

    Node copy = new Node(node.val);
    map.put(node, copy);

    for (Node neighbor : node.neighbors) {
        copy.neighbors.add(clone(neighbor, map));
    }

    return copy;
}
```

---

#### 11.5 Graph — Course Schedule (Cycle Detection)

> **Rung:** F88 · evidence exercise

**Use when:** Detect cycle in directed graph

```java
public boolean canFinish(int numCourses, int[][] prerequisites) {
    List<List<Integer>> graph = new ArrayList<>();
    for (int i = 0; i < numCourses; i++) {
        graph.add(new ArrayList<>());
    }

    for (int[] pre : prerequisites) {
        graph.get(pre[1]).add(pre[0]);
    }

    int[] state = new int[numCourses]; // 0=unvisited, 1=visiting, 2=visited

    for (int i = 0; i < numCourses; i++) {
        if (hasCycle(graph, i, state)) {
            return false;
        }
    }

    return true;
}

private boolean hasCycle(List<List<Integer>> graph, int node, int[] state) {
    if (state[node] == 1) return true;  // Cycle detected
    if (state[node] == 2) return false; // Already processed

    state[node] = 1;

    for (int neighbor : graph.get(node)) {
        if (hasCycle(graph, neighbor, state)) {
            return true;
        }
    }

    state[node] = 2;
    return false;
}
```

---

#### 11.6 Graph — Topological Sort (Kahn's Algorithm)

> **Rung:** F88 · evidence exercise

**Use when:** Order dependencies

```java
public int[] topologicalSort(int n, int[][] edges) {
    List<List<Integer>> graph = new ArrayList<>();
    int[] indegree = new int[n];

    for (int i = 0; i < n; i++) graph.add(new ArrayList<>());

    for (int[] edge : edges) {
        graph.get(edge[1]).add(edge[0]);
        indegree[edge[0]]++;
    }

    Queue<Integer> queue = new ArrayDeque<>();
    for (int i = 0; i < n; i++) {
        if (indegree[i] == 0) queue.offer(i);
    }

    int[] result = new int[n];
    int idx = 0;

    while (!queue.isEmpty()) {
        int node = queue.poll();
        result[idx++] = node;

        for (int neighbor : graph.get(node)) {
            indegree[neighbor]--;
            if (indegree[neighbor] == 0) {
                queue.offer(neighbor);
            }
        }
    }

    return idx == n ? result : new int[0]; // Empty if cycle exists
}
```

---

#### 11.7 Graph — Pacific Atlantic Water Flow

> **Rung:** F90 · evidence exercise

**Use when:** Multiple source BFS/DFS

```java
public List<List<Integer>> pacificAtlantic(int[][] heights) {
    int m = heights.length, n = heights[0].length;
    boolean[][] pacific = new boolean[m][n];
    boolean[][] atlantic = new boolean[m][n];

    // DFS from edges
    for (int i = 0; i < m; i++) {
        dfs(heights, pacific, i, 0);
        dfs(heights, atlantic, i, n - 1);
    }
    for (int j = 0; j < n; j++) {
        dfs(heights, pacific, 0, j);
        dfs(heights, atlantic, m - 1, j);
    }

    List<List<Integer>> result = new ArrayList<>();
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (pacific[i][j] && atlantic[i][j]) {
                result.add(Arrays.asList(i, j));
            }
        }
    }
    return result;
}

private void dfs(int[][] heights, boolean[][] visited, int i, int j) {
    visited[i][j] = true;
    int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};

    for (int[] d : dirs) {
        int ni = i + d[0], nj = j + d[1];
        if (ni >= 0 && ni < heights.length && nj >= 0 && nj < heights[0].length
            && !visited[ni][nj] && heights[ni][nj] >= heights[i][j]) {
            dfs(heights, visited, ni, nj);
        }
    }
}
```


### Library 12 — ADVANCED GRAPHS

---

#### 12.1 Union-Find (Disjoint Set)

> **Rung:** F49 + F96 · evidence exercise

**Use when:** Connected components, cycle detection

```java
class UnionFind {
    private int[] parent;
    private int[] rank;

    public UnionFind(int n) {
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]); // Path compression
        }
        return parent[x];
    }

    public boolean union(int x, int y) {
        int px = find(x), py = find(y);
        if (px == py) return false;

        if (rank[px] < rank[py]) {
            parent[px] = py;
        } else if (rank[px] > rank[py]) {
            parent[py] = px;
        } else {
            parent[py] = px;
            rank[px]++;
        }
        return true;
    }
}
```

---

#### 12.2 Dijkstra's Algorithm

> **Rung:** F92 · evidence exercise

**Use when:** Shortest path with weighted edges

```java
// [FIXED v1.3] CONTRACT: nonnegative edge weights ONLY. Negative edges or a bounded
// edge count ("at most K stops") require Bellman-Ford (F93) or (node, edgesUsed) state (F95).
public int[] dijkstra(int n, List<int[]>[] graph, int start) {
    int[] dist = new int[n];
    Arrays.fill(dist, Integer.MAX_VALUE);
    dist[start] = 0;

    // Min-heap: [distance, node]
    PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0])); // [FIXED v1.3]
    pq.offer(new int[]{0, start});

    while (!pq.isEmpty()) {
        int[] curr = pq.poll();
        int d = curr[0], node = curr[1];

        if (d > dist[node]) continue; // Skip outdated entry

        for (int[] edge : graph[node]) {
            int neighbor = edge[0], weight = edge[1];
            int newDist = dist[node] + weight;

            if (newDist < dist[neighbor]) {
                dist[neighbor] = newDist;
                pq.offer(new int[]{newDist, neighbor});
            }
        }
    }

    return dist;
}
```


### Library 13 — 1-D DYNAMIC PROGRAMMING

---

#### 13.1 DP — Climbing Stairs (Fibonacci)

> **Rung:** F71 · evidence exercise

**Use when:** Number of ways to reach end

```java
public int climbStairs(int n) {
    if (n <= 2) return n;

    int prev2 = 1, prev1 = 2;

    for (int i = 3; i <= n; i++) {
        int curr = prev1 + prev2;
        prev2 = prev1;
        prev1 = curr;
    }

    return prev1;
}
```

---

#### 13.2 DP — House Robber

> **Rung:** F71 · evidence exercise

**Use when:** Maximum value with constraints

```java
public int rob(int[] nums) {
    if (nums.length == 0) return 0;
    if (nums.length == 1) return nums[0];

    int prev2 = nums[0];
    int prev1 = Math.max(nums[0], nums[1]);

    for (int i = 2; i < nums.length; i++) {
        int curr = Math.max(prev1, prev2 + nums[i]);
        prev2 = prev1;
        prev1 = curr;
    }

    return prev1;
}
```

---

#### 13.3 DP — Coin Change

> **Rung:** F74 · evidence exercise

**Use when:** Minimum coins for amount

```java
public int coinChange(int[] coins, int amount) {
    int[] dp = new int[amount + 1];
    Arrays.fill(dp, amount + 1);
    dp[0] = 0;

    for (int i = 1; i <= amount; i++) {
        for (int coin : coins) {
            if (coin <= i) {
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }
    }

    return dp[amount] > amount ? -1 : dp[amount];
}
```

---

#### 13.4 DP — Longest Increasing Subsequence

> **Rung:** F76 + F77 · evidence exercise

**Use when:** Find LIS length

```java
public int lengthOfLIS(int[] nums) {
    int[] dp = new int[nums.length];
    Arrays.fill(dp, 1);
    int maxLen = 1;

    for (int i = 1; i < nums.length; i++) {
        for (int j = 0; j < i; j++) {
            if (nums[j] < nums[i]) {
                dp[i] = Math.max(dp[i], dp[j] + 1);
            }
        }
        maxLen = Math.max(maxLen, dp[i]);
    }

    return maxLen;
}
```

---

#### 13.5 DP — Word Break

> **Rung:** F78 · evidence exercise

**Use when:** Can string be segmented

```java
public boolean wordBreak(String s, List<String> wordDict) {
    Set<String> words = new HashSet<>(wordDict);
    boolean[] dp = new boolean[s.length() + 1];
    dp[0] = true;

    for (int i = 1; i <= s.length(); i++) {
        for (int j = 0; j < i; j++) {
            if (dp[j] && words.contains(s.substring(j, i))) {
                dp[i] = true;
                break;
            }
        }
    }

    return dp[s.length()];
}
```

---

#### 13.6 DP — Decode Ways

> **Rung:** F71 + F78 · evidence exercise

**Use when:** Count valid decodings

```java
public int numDecodings(String s) {
    if (s.charAt(0) == '0') return 0;

    int n = s.length();
    int prev2 = 1, prev1 = 1;

    for (int i = 1; i < n; i++) {
        int curr = 0;

        // Single digit
        if (s.charAt(i) != '0') {
            curr += prev1;
        }

        // Two digits
        int twoDigit = Integer.parseInt(s.substring(i - 1, i + 1));
        if (twoDigit >= 10 && twoDigit <= 26) {
            curr += prev2;
        }

        prev2 = prev1;
        prev1 = curr;
    }

    return prev1;
}
```


### Library 14 — 2-D DYNAMIC PROGRAMMING

---

#### 14.1 DP — Unique Paths

> **Rung:** F72 · evidence exercise

**Use when:** Count paths in grid

```java
public int uniquePaths(int m, int n) {
    int[][] dp = new int[m][n];

    for (int i = 0; i < m; i++) dp[i][0] = 1;
    for (int j = 0; j < n; j++) dp[0][j] = 1;

    for (int i = 1; i < m; i++) {
        for (int j = 1; j < n; j++) {
            dp[i][j] = dp[i-1][j] + dp[i][j-1];
        }
    }

    return dp[m-1][n-1];
}
```

---

#### 14.2 DP — Longest Common Subsequence

> **Rung:** F78 · evidence exercise

**Use when:** Find LCS of two strings

```java
public int longestCommonSubsequence(String text1, String text2) {
    int m = text1.length(), n = text2.length();
    int[][] dp = new int[m + 1][n + 1];

    for (int i = 1; i <= m; i++) {
        for (int j = 1; j <= n; j++) {
            if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                dp[i][j] = dp[i-1][j-1] + 1;
            } else {
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
    }

    return dp[m][n];
}
```

---

#### 14.3 DP — Edit Distance

> **Rung:** F78 · evidence exercise

**Use when:** Minimum operations to convert strings

```java
public int minDistance(String word1, String word2) {
    int m = word1.length(), n = word2.length();
    int[][] dp = new int[m + 1][n + 1];

    for (int i = 0; i <= m; i++) dp[i][0] = i;
    for (int j = 0; j <= n; j++) dp[0][j] = j;

    for (int i = 1; i <= m; i++) {
        for (int j = 1; j <= n; j++) {
            if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                dp[i][j] = dp[i-1][j-1];
            } else {
                dp[i][j] = 1 + Math.min(dp[i-1][j-1],  // Replace
                               Math.min(dp[i-1][j],    // Delete
                                       dp[i][j-1]));   // Insert
            }
        }
    }

    return dp[m][n];
}
```


### Library 15 — GREEDY

---

#### 15.1 Greedy — Jump Game

> **Rung:** F82 · evidence exercise

**Use when:** Can reach end

```java
public boolean canJump(int[] nums) {
    int maxReach = 0;

    for (int i = 0; i < nums.length; i++) {
        if (i > maxReach) return false;
        maxReach = Math.max(maxReach, i + nums[i]);
    }

    return true;
}
```

---

#### 15.2 Greedy — Jump Game II

> **Rung:** F82 · evidence exercise

**Use when:** Minimum jumps to reach end

```java
public int jump(int[] nums) {
    int jumps = 0;
    int currentEnd = 0;
    int farthest = 0;

    for (int i = 0; i < nums.length - 1; i++) {
        farthest = Math.max(farthest, i + nums[i]);

        if (i == currentEnd) {
            jumps++;
            currentEnd = farthest;
        }
    }

    return jumps;
}
```

---

#### 15.3 Greedy — Gas Station

> **Rung:** F82 · evidence exercise

**Use when:** Can complete circuit

```java
public int canCompleteCircuit(int[] gas, int[] cost) {
    int totalTank = 0;
    int currTank = 0;
    int start = 0;

    for (int i = 0; i < gas.length; i++) {
        totalTank += gas[i] - cost[i];
        currTank += gas[i] - cost[i];

        if (currTank < 0) {
            start = i + 1;
            currTank = 0;
        }
    }

    return totalTank >= 0 ? start : -1;
}
```


### Library 16 — INTERVALS

---

#### 16.1 Intervals — Merge

> **Rung:** F36 · evidence exercise

**Use when:** Merge overlapping intervals

```java
public int[][] merge(int[][] intervals) {
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0])); // [FIXED v1.3]

    List<int[]> result = new ArrayList<>();
    int[] current = intervals[0];

    for (int i = 1; i < intervals.length; i++) {
        if (intervals[i][0] <= current[1]) {
            current[1] = Math.max(current[1], intervals[i][1]);
        } else {
            result.add(current);
            current = intervals[i];
        }
    }
    result.add(current);

    return result.toArray(new int[result.size()][]);
}
```

---

#### 16.2 Intervals — Insert

> **Rung:** F36 · evidence exercise

**Use when:** Insert and merge new interval

```java
public int[][] insert(int[][] intervals, int[] newInterval) {
    List<int[]> result = new ArrayList<>();
    int i = 0;

    // Add all intervals before newInterval
    while (i < intervals.length && intervals[i][1] < newInterval[0]) {
        result.add(intervals[i++]);
    }

    // Merge overlapping intervals
    while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
        newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
        newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
        i++;
    }
    result.add(newInterval);

    // Add remaining intervals
    while (i < intervals.length) {
        result.add(intervals[i++]);
    }

    return result.toArray(new int[result.size()][]);
}
```

---

#### 16.3 Intervals — Non-overlapping (Remove Min)

> **Rung:** F35 + F36 · evidence exercise

**Use when:** Maximum non-overlapping intervals

```java
public int eraseOverlapIntervals(int[][] intervals) {
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1])); // Sort by end time [FIXED v1.3]

    int count = 0;
    int end = Integer.MIN_VALUE;

    for (int[] interval : intervals) {
        if (interval[0] >= end) {
            end = interval[1];
        } else {
            count++;
        }
    }

    return count;
}
```

---

#### 16.4 Intervals — Meeting Rooms II

> **Rung:** F37 · evidence exercise

**Use when:** Minimum rooms needed

```java
public int minMeetingRooms(int[][] intervals) {
    int[] starts = new int[intervals.length];
    int[] ends = new int[intervals.length];

    for (int i = 0; i < intervals.length; i++) {
        starts[i] = intervals[i][0];
        ends[i] = intervals[i][1];
    }

    Arrays.sort(starts);
    Arrays.sort(ends);

    int rooms = 0, endPtr = 0;

    for (int start : starts) {
        if (start < ends[endPtr]) {
            rooms++;
        } else {
            endPtr++;
        }
    }

    return rooms;
}
```


### Library 17 — MATH & GEOMETRY

---

#### 17.1 Math — Rotate Image

> **Rung:** F38 · evidence exercise

**Use when:** Rotate matrix 90 degrees

```java
public void rotate(int[][] matrix) {
    int n = matrix.length;

    // Transpose
    for (int i = 0; i < n; i++) {
        for (int j = i; j < n; j++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
    }

    // Reverse each row
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n / 2; j++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[i][n - 1 - j];
            matrix[i][n - 1 - j] = temp;
        }
    }
}
```

---

#### 17.2 Math — Spiral Matrix

> **Rung:** F38 · evidence exercise

**Use when:** Traverse matrix in spiral order

```java
public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> result = new ArrayList<>();
    if (matrix.length == 0) return result;

    int top = 0, bottom = matrix.length - 1;
    int left = 0, right = matrix[0].length - 1;

    while (top <= bottom && left <= right) {
        // Right
        for (int j = left; j <= right; j++) result.add(matrix[top][j]);
        top++;

        // Down
        for (int i = top; i <= bottom; i++) result.add(matrix[i][right]);
        right--;

        // Left
        if (top <= bottom) {
            for (int j = right; j >= left; j--) result.add(matrix[bottom][j]);
            bottom--;
        }

        // Up
        if (left <= right) {
            for (int i = bottom; i >= top; i--) result.add(matrix[i][left]);
            left++;
        }
    }

    return result;
}
```

---

#### 17.3 Math — Set Matrix Zeroes

> **Rung:** F38 · evidence exercise

**Use when:** Zero out rows/cols

```java
public void setZeroes(int[][] matrix) {
    int m = matrix.length, n = matrix[0].length;
    boolean firstRowZero = false, firstColZero = false;

    // Check first row/col
    for (int j = 0; j < n; j++) if (matrix[0][j] == 0) firstRowZero = true;
    for (int i = 0; i < m; i++) if (matrix[i][0] == 0) firstColZero = true;

    // Use first row/col as markers
    for (int i = 1; i < m; i++) {
        for (int j = 1; j < n; j++) {
            if (matrix[i][j] == 0) {
                matrix[i][0] = 0;
                matrix[0][j] = 0;
            }
        }
    }

    // Zero out based on markers
    for (int i = 1; i < m; i++) {
        for (int j = 1; j < n; j++) {
            if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                matrix[i][j] = 0;
            }
        }
    }

    // Handle first row/col
    if (firstRowZero) for (int j = 0; j < n; j++) matrix[0][j] = 0;
    if (firstColZero) for (int i = 0; i < m; i++) matrix[i][0] = 0;
}
```


### Library 18 — BIT MANIPULATION

---

#### 18.1 Bit — Single Number

> **Rung:** F09 · evidence exercise

**Use when:** Find element appearing once

```java
public int singleNumber(int[] nums) {
    int result = 0;
    for (int num : nums) {
        result ^= num;
    }
    return result;
}
```

**Why XOR:** a ^ a = 0, a ^ 0 = a. Pairs cancel out.

---

#### 18.2 Bit — Number of 1 Bits

> **Rung:** F09 · evidence exercise

**Use when:** Count set bits

```java
public int hammingWeight(int n) {
    int count = 0;
    while (n != 0) {
        count += n & 1;
        n >>>= 1; // Unsigned right shift
    }
    return count;
}

// Alternative: n & (n-1) removes lowest set bit
public int hammingWeight2(int n) {
    int count = 0;
    while (n != 0) {
        n &= (n - 1);
        count++;
    }
    return count;
}
```

---

#### 18.3 Bit — Counting Bits

> **Rung:** F09 + F71 · evidence exercise

**Use when:** Count bits for all numbers 0 to n

```java
public int[] countBits(int n) {
    int[] dp = new int[n + 1];

    for (int i = 1; i <= n; i++) {
        dp[i] = dp[i >> 1] + (i & 1);
    }

    return dp;
}
```

**Why:** dp[i] = dp[i/2] + last bit.

---

#### 18.4 Bit — Reverse Bits

> **Rung:** F09 · evidence exercise

**Use when:** Reverse bit order

```java
public int reverseBits(int n) {
    int result = 0;

    for (int i = 0; i < 32; i++) {
        result <<= 1;
        result |= (n & 1);
        n >>>= 1;
    }

    return result;
}
```

---

#### 18.5 Bit — Missing Number

> **Rung:** F09 · evidence exercise

**Use when:** Find missing number in [0, n]

```java
public int missingNumber(int[] nums) {
    int xor = nums.length;

    for (int i = 0; i < nums.length; i++) {
        xor ^= i ^ nums[i];
    }

    return xor;
}
```

---

#### 18.6 Bit — Sum of Two Integers (No + operator)

> **Rung:** F09 · evidence exercise

**Use when:** Add without arithmetic operators

```java
public int getSum(int a, int b) {
    while (b != 0) {
        int carry = (a & b) << 1;
        a = a ^ b;
        b = carry;
    }
    return a;
}
```

---

_Constitution v1.3 — technique-first ladder. 139 rungs (F00–F126 core, X01–X12 frontier). No calendar, no clock, no deadline._
_Built by adversarial convergence between Claude (Fable) and Codex, each auditing blind before merging._
