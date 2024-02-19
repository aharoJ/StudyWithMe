

# 189 Rotate Array

Given `nums = [1, 2, 3, 4, 5, 6]` and `k = 2`. The `nums.length` is `6`.

Here's how the auxiliary array `array` would be updated at each iteration:

1. **Iteration 0:**
   - `i = 0`
   - `(i + k) % nums.length = (0 + 2) % 6 = 2`
   - `array[2] = nums[0] = 1`
   - Resulting `array`: `[_, _, 1, _, _, _]`

2. **Iteration 1:**
   - `i = 1`
   - `(i + k) % nums.length = (1 + 2) % 6 = 3`
   - `array[3] = nums[1] = 2`
   - Resulting `array`: `[_, _, 1, 2, _, _]`

3. **Iteration 2:**
   - `i = 2`
   - `(i + k) % nums.length = (2 + 2) % 6 = 4`
   - `array[4] = nums[2] = 3`
   - Resulting `array`: `[_, _, 1, 2, 3, _]`

4. **Iteration 3:**
   - `i = 3`
   - `(i + k) % nums.length = (3 + 2) % 6 = 5`
   - `array[5] = nums[3] = 4`
   - Resulting `array`: `[_, _, 1, 2, 3, 4]`

5. **Iteration 4:**
   - `i = 4`
   - `(i + k) % nums.length = (4 + 2) % 6 = 0` (Here we wrap around to the beginning of the array)
   - `array[0] = nums[4] = 5`
   - Resulting `array`: `[5, _, 1, 2, 3, 4]`

6. **Iteration 5:**
   - `i = 5`
   - `(i + k) % nums.length = (5 + 2) % 6 = 1`
   - `array[1] = nums[5] = 6`
   - Resulting `array`: `[5, 6, 1, 2, 3, 4]`

After these iterations, the auxiliary `array` now holds the correctly rotated values, and the elements have been shifted `k` positions to the right relative to their original positions in `nums`.


# Blah