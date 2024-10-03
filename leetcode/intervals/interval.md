### 1. **No Overlap (Disjoint Intervals)**:

This is when two intervals are completely separate from each other.

```java
/**
 * L1.........R1
 *                 L2........R2
 * No overlap, so intervals stay separate.
 */
```

- **Condition**: `R1 < L2`
- These intervals don't overlap, so they remain separate.

---

### 2. **Complete Overlap**:

One interval is completely contained within the other.

```java
/**
 * L1.....................R1
 *       L2.......R2
 * Interval [L2, R2] is completely within [L1, R1]
 */
```

- **Condition**: `L1 <= L2` and `R1 >= R2`
- In this case, you only keep `[L1, R1]` because it contains `[L2, R2]`.

---

### 3. **Partial Overlap (Merging Intervals)**:

This is the classic overlap scenario where the end of the first interval overlaps with the start of the second interval.

```java
/**
 * L1.........R1
 *        L2............R2
 * Intervals overlap, merge them into [L1, max(R1, R2)].
 */
```

- **Condition**: `R1 >= L2`
- You merge the two intervals into `[L1, max(R1, R2)]`.

---

### 4. **Touching Intervals**:

In some problems, intervals that touch each other (where one ends exactly when the other begins) might be treated as non-overlapping or overlapping, depending on the problem requirements.

```java
/**
 * L1.........R1
 *            L2........R2
 * These intervals touch but don't overlap.
 */
```

- **Condition**: `R1 == L2`
- Whether or not you merge them depends on the problem's rules. Some problems treat touching intervals as overlapping, while others don't.

---

### 5. **Multiple Merges**:

You can have a scenario where multiple intervals overlap, and they all get merged into one larger interval.

```java
/**
 * L1...........R1
 *        L2..........R2
 *               L3..........R3
 * Merge all three into [L1, max(R1, R2, R3)].
 */
```

- **Condition**: The chain of intervals overlaps, so you merge all of them.

---

### 6. **Gap Between Intervals**:

If two intervals have a gap between them, they won’t be merged.

```java
/**
 * L1.........R1
 *                     L2........R2
 * No overlap, so they stay as separate intervals.
 */
```

- **Condition**: `R1 < L2`
- This scenario is similar to the "No Overlap" case, but emphasizes the gap between them.

---

### 7. **Multiple Intervals with Different Conditions**:

Sometimes, you may encounter a set of intervals where you have to handle multiple scenarios (some intervals merge, others don't).

```java
/**
 * L1.........R1
 *         L2...........R2
 *                       L3.......R3
 * Merge first two intervals, but L3 and R3 stay separate.
 */
```

- **Step 1**: Merge `[L1, R1]` and `[L2, R2]`.
- **Step 2**: Check if `[L3, R3]` can be merged with the result.

---
