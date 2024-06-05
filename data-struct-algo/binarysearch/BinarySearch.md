3 Parts of a Successful Binary Search

Binary Search is generally composed of 3 main sections:

# Pre-processing - Sort if collection is unsorted.

# Binary Search - Using a loop or recursion to divide search space in half after each comparison.

# Post-processing - Determine viable candidates in the remaining space.


# Template #1:
Template #1 is the most basic and elementary form of Binary Search. It is the standard Binary Search Template that most high schools or universities use when they first teach students computer science. Template #1 is used to search for an element or condition which can be determined by accessing a single index in the array.


```java
int binarySearch(int[] nums, int target){
  if(nums == null || nums.length == 0)
    return -1;

  int left = 0, right = nums.length - 1;
  while(left <= right){
    // Prevent (left + right) overflow
    int mid = left + (right - left) / 2;
    if(nums[mid] == target){ return mid; }

    if(target> nums[mid]) {
        left = mid + 1; 
    } else { 
        right = mid - 1; 
    }
  }

  // End Condition: left > right
  return -1;
}
```


## Key Attributes
- Most basic and elementary form of Binary Search
- Search Condition can be determined without comparing to the element's neighbors (or use specific elements around it)
- No post-processing required because at each step, you are checking to see if the element has been found. If you reach the end, then you know the element is not found
 

## Distinguishing Syntax
- Initial Condition: **left = 0, right = length-1**
- Termination: **left > right**
- Searching Left: **right = mid-1**
- Searching Right: **left = mid+1**


## Problem I
Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 

Example 1:

Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.

---
Example 2:
Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
 

Constraints:
0 <= x <= 231 - 1

```java
class Solution {
    public int mySqrt(int x) {  
        if (x<2){
            return x;
        }
        long left= 1;
        long right= x/2;
        while (left<=right)
        {
            long mid= left + (right-left) / 2;
            long square= mid * mid;
            if (x < square){
                right= mid-1;
            } else if (x>square){
                left= mid+1;
            } else {
                return (int)mid;
            }
        }
        return (int)right;
    }
}
```

## Problem II
We are playing the Guess Game. The game is as follows:

I pick a number from 1 to n. You have to guess which number I picked.

Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.

You call a pre-defined **API int guess(int num),** which returns three possible results:

-1: Your guess is higher than the number I picked (i.e. num > pick).
1: Your guess is lower than the number I picked (i.e. num < pick).
0: your guess is equal to the number I picked (i.e. num == pick).
Return the number that I picked.

 

Example 1:
Input: n = 10, pick = 6
Output: 6

---
Example 2:
Input: n = 1, pick = 1
Output: 1

---
Example 3:
Input: n = 2, pick = 1
Output: 1
 

Constraints:

1 <= n <= 231 - 1
1 <= pick <= n
## Problem III

```java
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int L= 0; int R= n;
        while (L<= R)
        {
            int mid= L+(R-L)/2;
            int guess= guess(mid);
            if (guess==0) return mid;
            if (guess<0){
                R= mid-1;
            } else {
                L= mid+1;
            }
        }
        return -1;
    }
}
```
