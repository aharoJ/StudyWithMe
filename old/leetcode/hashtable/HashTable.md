# 645

Given the input array `[1,2,2,4]` and using the provided code to identify the duplicate and missing numbers, we can illustrate how the `map` would be populated and then how the iteration would identify both `dup` and `missing`:

### Code Execution:

- **Populating the Map:**
  - For `n = 1`: `map.put(1, 1)` because `1` appears once.
  - For `n = 2`: First occurrence, `map.put(2, 1)`.
  - For `n = 2`: Second occurrence, `map.put(2, 2)` because `2` now appears twice.
  - For `n = 4`: `map.put(4, 1)` because `4` appears once.

After populating, the map looks like this:

```
Key: 1, Val: 1
Key: 2, Val: 2
Key: 4, Val: 1
```

- **Identifying `dup` and `missing`:**
  - Iterate from `i = 1` to `i = 4` (`nums.length = 4`).
    - At `i = 1`, `map.containsKey(1)` is `true` and `map.get(1)` is `1`. No action taken.
    - At `i = 2`, `map.containsKey(2)` is `true` and `map.get(2)` is `2`. Thus, `dup = 2`.
    - At `i = 3`, `map.containsKey(3)` is `false`, indicating `3` is missing. So, `missing = 3`.
    - At `i = 4`, `map.containsKey(4)` is `true` and `map.get(4)` is `1`. No action taken.

### Output:

Based on the provided logic, the output for the input array `[1,2,2,4]` would be:

- `dup = 2`
- `missing = 3`

Thus, the function `findErrorNums` returns `[2, 3]` as the array containing the duplicate and the missing number, respectively.

# TwoSum

No, let's clarify:

In the "Two Sum" problem solution using a `HashMap`, the **KEY** is the actual number from the array, and the **VAL** is the index of that number in the array.

Here's the correct explanation using the example input `[3, 1, 4, 2]` with a target sum of `6`:

1. **First Iteration (Index = 0, Number = 3):**

   - The complement to check is `6 - 3 = 3`.
   - `map` does not contain the complement as a key.
   - The map is updated to `{3: 0}` (Key: Actual number `3`, Val: Its index `0`).

2. **Second Iteration (Index = 1, Number = 1):**

   - The complement to check is `6 - 1 = 5`.
   - `map` does not contain the complement as a key.
   - The map is updated to `{3: 0, 1: 1}` (Key: Actual number `1`, Val: Its index `1`).

3. **Third Iteration (Index = 2, Number = 4):**

   - The complement to check is `6 - 4 = 2`.
   - `map` does not contain the complement as a key.
   - The map is updated to `{3: 0, 1: 1, 4: 2}` (Key: Actual number `4`, Val: Its index `2`).

4. **Fourth Iteration (Index = 3, Number = 2):**
   - The complement to check is `6 - 2 = 4`.
   - `map` **does** contain the complement `4` as a key.
   - We found a match, the function would return `[2, 3]` as the solution since `nums[2] + nums[3] = 4 + 2 = 6`.

The map entries at each iteration would look like this:

After first iteration:

```
Key: 3, Val: 0
```

After second iteration:

```
Key: 3, Val: 0
Key: 1, Val: 1
```

After third iteration:

```
Key: 3, Val: 0
Key: 1, Val: 1
Key: 4, Val: 2
```

The solution is found during the fourth iteration because the complement of the current number (`2`) is found in the map. The `HashMap` contains the actual numbers from the array as keys, and their indices as values. When we find that the map contains a key equal to the complement we're looking for, we return an array consisting of the value (index) associated with that key from the map and the current index from the loop.

#
