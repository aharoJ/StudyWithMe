



# Youtube

- [GOLD](https://www.youtube.com/watch?v=ZUt8L8cbbBI)

- https://www.youtube.com/watch?v=Ks1pw1X22y4





# Reddit
I generally agree that if you are going to skip a topic, bit manipulation is a good candidate to skip.

That being said, I recently came across this [LeetCode post](https://leetcode.com/discuss/study-guide/1767248) that illuminated the topic for me in a unique way. What I found especially powerful was how to think about bit manipulations as a way to express set operations in certain cases where the element you want to look up in your "set" lies in a known range, e.g., 0-n.

This is a table of the set operations and their equivalent bit manipulations:

```py
| Description  | Code                 | Example                  | Note                                        |
|--------------|----------------------|--------------------------|---------------------------------------------|
| union        | `a | b`              | `1010 | 0110 == 1110`    |                                             |
| difference   | `a & ~b`             | `1010 & ~0110 == 1000`   |                                             |
| intersection | `a & b`              | `1010 & 0110 == 0010`    |                                             |
| add          | `a |= 1 << idx`      | `1010 | (1 << 2) == 1110`| idx 2 is 0-indexed from the right, e.g., 3210|
| discard      | `a &= ~(1 << idx)`   | `1010 & ~(1 << 3) == 0010`| idx 3 is 0-indexed from the right, e.g., 3210 |
| contains?    | `bool(a & (1 << idx))`| `1010 & (1 << 3) == True`| idx 3 is 0-indexed from the right, e.g., 3210 |
```

For example, it can be used in "Find the Duplicate Number." Compare the below logically equivalent solutions:

**Set Solution:**

```python
class Solution:
  def findDuplicate(self, nums: List[int]) -> int:
    cache = set()
    for num in nums:
      if num in cache:
        return num
      cache.add(num)
```

**Bit Solution:**

```python
class Solution:
  def findDuplicate(self, nums: List[int]) -> int:
    cache = 0
    for num in nums:
      bit = 1 << (num - 1)
      if cache & bit:
        return num
      cache |= bit
```

The set solution requires O(n) space whereas the bit solution uses constant space.



