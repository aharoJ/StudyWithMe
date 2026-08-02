# DSA Interview Constitution — LeetCode Combat Standard

> **Version:** 1.2
> **Author:** aharoJ
> **Last Updated:** January 2025
> **Purpose:** Paste this at the start of any LLM conversation about DSA prep. Every rule is non-negotiable. This document governs all interview preparation until you pass.
> **Structure:** Follows NeetCode 150 roadmap exactly.

---

## The Commitment

Before reading further, sign this. Not metaphorically. Actually write your name.

By adopting this constitution, I commit to:

1. **Following this protocol exactly for 8-10 weeks** — no modifications, no "improvements"
2. **No excuses, no shortcuts, no "I'll skip today"** — consistency beats intensity
3. **Documenting every failure in my error log** — unnamed bugs repeat forever
4. **Not advancing until checkpoints pass** — depth over breadth
5. **Trusting the process when it feels stupid** — typing templates 5x feels dumb, but it works

**SIGNED:** \***\*\*\*\*\*\*\***\_\***\*\*\*\*\*\*\***
**DATE:** \***\*\*\*\*\*\*\***\_\***\*\*\*\*\*\*\***
**END DATE (8 weeks out):** \***\*\*\*\*\*\*\***\_\***\*\*\*\*\*\*\***

---

## Article I — Philosophy

You are not learning algorithms. You already know them. You are building **implementation fluency** — the ability to translate pattern recognition into working code under time pressure.

### The Three Laws

1. **Muscle memory over understanding.** If you can't type it without thinking, you don't know it.
2. **Repetition over volume.** 20 problems done 5 times each beats 100 problems done once.
3. **Templates over creativity.** Interviews reward reliable execution, not elegant solutions.

### The Interview Reality Check

You have **45 minutes**. Subtract:

- 5 min: Read problem, clarify edge cases
- 5 min: Explain approach to interviewer
- 5 min: Test and debug
- **Remaining: 30 minutes to write working code**

If you can't write a sliding window from memory in under 3 minutes, you will fail. This constitution exists to fix that.

### The Architect's Trap

Your brain is wired for system design: abstractions, contracts, boundaries, scalability.

LeetCode requires the opposite: **imperative, line-by-line, mechanical code execution.**

You must learn to switch modes. When you see a LeetCode problem, you are not an architect. You are a construction worker with a hammer and a stopwatch.

---

## Article II — Current State Assessment

| Property         | Value                                                    |
| ---------------- | -------------------------------------------------------- |
| Target Companies | FAANG-tier (Google, Amazon, TikTok, Roblox, etc.)        |
| Interview Stage  | Consistently reaching on-sites, failing DSA rounds       |
| Core Problem     | Pattern recognition: ✅ Strong / Implementation: ❌ Weak |
| Time Available   | 2-3 hours/day                                            |
| Language         | Java (non-negotiable — matches production experience)    |
| Timeline         | 8-10 weeks to interview-ready                            |

### Diagnostic Markers

You exhibit classic "architect's implementation gap":

| Symptom                        | Evidence                               |
| ------------------------------ | -------------------------------------- |
| Know the pattern instantly     | "This is clearly sliding window"       |
| Freeze at keyboard             | 3-second delay before typing starts    |
| Code doesn't compile first try | Syntax errors, wrong method names      |
| Off-by-one errors              | Window size calculations, loop bounds  |
| Timeout on debugging           | Can't trace logic without running code |

### Root Cause

Your fingers don't know the patterns. Your brain does. There's a translation layer that adds latency and introduces errors. We're removing that layer.

---

## Article III — Hard Rules

Violating any of these resets your progress. No exceptions.

### Rule 1: No IDE Autocomplete During Practice

```
❌ BANNED: IntelliJ, VS Code with Java extensions, any autocomplete
✅ REQUIRED: LeetCode editor, plain text file, or Vim without LSP
```

**Why:** Interviews don't have autocomplete. If you can't remember `ArrayDeque` vs `LinkedList` vs `ArrayList`, you will freeze. Learn the APIs cold.

### Rule 2: No Running Code for First 15 Minutes

```
❌ BANNED: Click "Run" before 15 minutes elapsed
✅ REQUIRED: Write complete solution, trace manually, THEN run
```

**Why:** Running code is a crutch. You use it to avoid thinking.

### Rule 3: Templates Must Be Typed AND Vocalized

```
❌ BANNED: Reading template code and "understanding" it
❌ BANNED: Silent typing
✅ REQUIRED: Type template while saying each line out loud
```

**Why:** Vocalizing engages a third memory pathway. Your architect brain learns through explanation.

### Rule 4: Immediate Redo After Every Problem

```
❌ BANNED: Solving a problem once and moving on
✅ REQUIRED: Delete solution, rewrite from scratch immediately
```

**Why:** The first solve is comprehension. The redo is learning.

### Rule 5: Same Pattern Until Automatic

```
❌ BANNED: Switching patterns before current pattern is automatic
✅ REQUIRED: Stay on one pattern until you can solve 3 problems without hesitation
```

### Rule 6: Error Log Every Single Day

```
❌ BANNED: Finishing a session without writing down what broke
✅ REQUIRED: 2-line minimum error log entry per session
```

### Rule 7: Java Only

```
❌ BANNED: Python, JavaScript, or any other language
✅ REQUIRED: Java for all problems, all practice, all mocks
```

### Rule 8: Time Boxes Are Sacred

```
❌ BANNED: Spending 2 hours on one problem
✅ REQUIRED: 25 min attempt → recovery protocol → solution study
```

---

## Article IV — Pattern Templates (NeetCode 150 Order)

These are organized to match NeetCode 150 exactly. Master them in this order.

---

# CATEGORY 1: ARRAYS & HASHING

---

### 1.1 Array — Contains Duplicate (HashSet)

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

### 1.2 Array — Two Sum (HashMap Index Lookup)

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

### 1.3 Array — Frequency Count (HashMap)

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

### 1.4 Array — Group By Key (HashMap with List)

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

### 1.5 Array — Product Except Self (Prefix/Suffix)

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

### 1.6 Array — Encode/Decode Strings

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

### 1.7 Array — Longest Consecutive Sequence (HashSet)

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

### 📅 CATEGORY 1 — DAILY BREAKDOWN

| Day | Template (5x typing)                           | LeetCode Problems                                | Focus                            |
| --- | ---------------------------------------------- | ------------------------------------------------ | -------------------------------- |
| Mon | 1.1 HashSet                                    | LC 217 Contains Duplicate, LC 242 Valid Anagram  | HashSet for O(1) lookup          |
| Tue | 1.2 Two Sum HashMap                            | LC 1 Two Sum, LC 219 Contains Duplicate II       | value→index mapping              |
| Wed | 1.3 Frequency Count                            | LC 49 Group Anagrams, LC 347 Top K Frequent      | getOrDefault pattern             |
| Thu | 1.4 Group By Key + 1.5 Prefix/Suffix (3x each) | LC 238 Product Except Self, LC 271 Encode/Decode | HashMap with List, prefix/suffix |
| Fri | 1.6 + 1.7 (3x each)                            | LC 128 Longest Consecutive Sequence              | Sequence start detection         |
| Sat | **REVIEW**: All templates 1x each              | Redo hardest problem from each day               | Consolidation                    |

---

# CATEGORY 2: TWO POINTERS

---

### 2.1 Two Pointers — Opposite Ends (Sorted Array)

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

### 2.2 Two Pointers — 3Sum (Skip Duplicates)

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

### 2.3 Two Pointers — Container With Most Water

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

### 2.4 Two Pointers — Same Direction (Fast/Slow)

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

### 2.5 Two Pointers — Trapping Rain Water

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

### 📅 CATEGORY 2 — DAILY BREAKDOWN

| Day | Template (5x typing)              | LeetCode Problems                           | Focus                             |
| --- | --------------------------------- | ------------------------------------------- | --------------------------------- |
| Mon | 2.1 Opposite Ends                 | LC 167 Two Sum II, LC 125 Valid Palindrome  | left < right loop                 |
| Tue | 2.2 3Sum                          | LC 15 3Sum                                  | Duplicate skipping                |
| Wed | 2.3 Container                     | LC 11 Container With Most Water             | Move shorter side                 |
| Thu | 2.4 Fast/Slow                     | LC 26 Remove Duplicates, LC 283 Move Zeroes | Slow/fast pointers same direction |
| Fri | 2.5 Trapping Rain Water           | LC 42 Trapping Rain Water                   | leftMax/rightMax tracking         |
| Sat | **REVIEW**: All templates 1x each | Redo hardest from each day                  | Consolidation                     |

---

# CATEGORY 3: SLIDING WINDOW

---

### 3.1 Sliding Window — Fixed Size

**Use when:** Maximum sum of k elements, any fixed-width window

```java
public int maxSumFixedWindow(int[] nums, int k) {
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

### 3.2 Sliding Window — Variable Size (Minimum)

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

### 3.3 Sliding Window — Variable Size (Maximum)

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

### 3.4 Sliding Window — Character Replacement

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

### 3.5 Sliding Window — Minimum Window Substring

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

### 3.6 Sliding Window — Permutation in String

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

### 📅 CATEGORY 3 — DAILY BREAKDOWN

| Day | Template (5x typing)              | LeetCode Problems                                           | Focus                       |
| --- | --------------------------------- | ----------------------------------------------------------- | --------------------------- |
| Mon | 3.1 Fixed Size                    | LC 643 Max Average Subarray I, LC 567 Permutation in String | Build initial window, slide |
| Tue | 3.2 Variable Min                  | LC 209 Min Size Subarray Sum                                | Shrink while valid          |
| Wed | 3.3 Variable Max                  | LC 3 Longest Substring Without Repeating                    | Shrink while invalid        |
| Thu | 3.4 Character Replacement         | LC 424 Longest Repeating Character Replacement              | maxFreq tracking            |
| Fri | 3.5 Min Window Substring          | LC 76 Minimum Window Substring                              | have/required pattern       |
| Sat | **REVIEW**: All templates 1x each | Redo hardest from each day                                  | Consolidation               |

---

# CATEGORY 4: STACK

---

### 4.1 Stack — Valid Parentheses

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
            if (stack.isEmpty() || stack.pop() != pairs.get(c)) {
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

### 4.2 Stack — Monotonic Stack (Next Greater Element)

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

### 4.3 Stack — Evaluate Reverse Polish Notation

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

### 4.4 Stack — Daily Temperatures

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

### 4.5 Stack — Largest Rectangle in Histogram

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

### 📅 CATEGORY 4 — DAILY BREAKDOWN

| Day | Template (5x typing)              | LeetCode Problems                       | Focus                       |
| --- | --------------------------------- | --------------------------------------- | --------------------------- |
| Mon | 4.1 Valid Parentheses             | LC 20 Valid Parentheses                 | Stack for matching          |
| Tue | 4.2 Monotonic Stack               | LC 496 Next Greater Element I           | Store indices, not values   |
| Wed | 4.3 RPN                           | LC 150 Evaluate Reverse Polish Notation | Operand order (b before a)  |
| Thu | 4.4 Daily Temperatures            | LC 739 Daily Temperatures               | Index difference, not value |
| Fri | 4.5 Largest Rectangle             | LC 84 Largest Rectangle in Histogram    | Final flush with h=0        |
| Sat | **REVIEW**: All templates 1x each | Redo hardest from each day              | Consolidation               |

---

# CATEGORY 5: BINARY SEARCH

---

### 5.1 Binary Search — Standard (Find Target)

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

### 5.2 Binary Search — Left Bound (First Occurrence)

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

### 5.3 Binary Search — Right Bound (Last Occurrence)

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

### 5.4 Binary Search — Search in Rotated Sorted Array

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

### 5.5 Binary Search — Find Minimum in Rotated Array

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

### 5.6 Binary Search — On Answer (Koko Eating Bananas)

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
    int hours = 0;
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

### 📅 CATEGORY 5 — DAILY BREAKDOWN

| Day | Template (5x typing)                       | LeetCode Problems                    | Focus                             |
| --- | ------------------------------------------ | ------------------------------------ | --------------------------------- |
| Mon | 5.1 Standard                               | LC 704 Binary Search                 | left <= right, mid +/- 1          |
| Tue | 5.2 Left Bound + 5.3 Right Bound (3x each) | LC 34 Find First and Last Position   | left < right, different templates |
| Wed | 5.4 Rotated Array                          | LC 33 Search in Rotated Sorted Array | Which half is sorted              |
| Thu | 5.5 Find Min Rotated                       | LC 153 Find Minimum in Rotated Array | Compare with nums[right]          |
| Fri | 5.6 Binary Search on Answer                | LC 875 Koko Eating Bananas           | Ceiling division formula          |
| Sat | **REVIEW**: All templates 1x each          | Redo hardest from each day           | Consolidation                     |

---

# CATEGORY 6: LINKED LIST

---

### 6.1 Linked List — Reverse

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

### 6.2 Linked List — Fast/Slow Pointers (Cycle Detection)

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

### 6.3 Linked List — Merge Two Sorted Lists

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

### 6.4 Linked List — Remove Nth Node From End

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

### 6.5 Linked List — Reorder List

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

### 6.6 Linked List — LRU Cache

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

### 📅 CATEGORY 6 — DAILY BREAKDOWN

| Day | Template (5x typing)                   | LeetCode Problems                              | Focus                        |
| --- | -------------------------------------- | ---------------------------------------------- | ---------------------------- |
| Mon | 6.1 Reverse                            | LC 206 Reverse Linked List                     | prev/curr/next dance         |
| Tue | 6.2 Fast/Slow                          | LC 141 Linked List Cycle, LC 142 Cycle II      | Null checks on fast          |
| Wed | 6.3 Merge Two Lists                    | LC 21 Merge Two Sorted Lists                   | Dummy node pattern           |
| Thu | 6.4 Remove Nth + 6.5 Reorder (3x each) | LC 19 Remove Nth From End, LC 143 Reorder List | n+1 steps, cut the list      |
| Fri | 6.6 LRU Cache                          | LC 146 LRU Cache                               | Doubly linked list + HashMap |
| Sat | **REVIEW**: All templates 1x each      | Redo hardest from each day                     | Consolidation                |

---

# CATEGORY 7: TREES

---

### 7.1 Tree — DFS Recursive (Preorder/Inorder/Postorder)

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

### 7.2 Tree — BFS Level Order

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

### 7.3 Tree — Maximum Depth

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

### 7.4 Tree — Same Tree / Symmetric

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

### 7.5 Tree — Invert Binary Tree

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

### 7.6 Tree — Validate BST

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

### 7.7 Tree — Lowest Common Ancestor

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

### 7.8 Tree — Construct from Preorder/Inorder

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

### 7.9 Tree — Kth Smallest in BST

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

### 7.10 Tree — Serialize/Deserialize

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

### 📅 CATEGORY 7 — DAILY BREAKDOWN

| Day | Template (5x typing)                          | LeetCode Problems                                                     | Focus                    |
| --- | --------------------------------------------- | --------------------------------------------------------------------- | ------------------------ |
| Mon | 7.1 DFS Traversals + 7.3 Max Depth            | LC 104 Maximum Depth, LC 226 Invert Binary Tree                       | Base case: root == null  |
| Tue | 7.2 BFS Level Order                           | LC 102 Level Order Traversal, LC 199 Right Side View                  | Capture size before loop |
| Wed | 7.4 Same Tree + 7.5 Invert + 7.6 Validate BST | LC 100 Same Tree, LC 98 Validate BST                                  | Range narrowing          |
| Thu | 7.7 LCA + 7.8 Construct                       | LC 236 Lowest Common Ancestor, LC 105 Construct from Preorder/Inorder | inorderMap               |
| Fri | 7.9 Kth Smallest + 7.10 Serialize             | LC 230 Kth Smallest in BST, LC 297 Serialize/Deserialize              | Iterative inorder        |
| Sat | **REVIEW**: All templates 1x each             | Redo hardest from each day                                            | Consolidation            |

---

# CATEGORY 8: HEAP / PRIORITY QUEUE

---

### 8.1 Heap — Basic Operations

**Use when:** Need quick access to min/max element

```java
// Min-heap (default)
PriorityQueue<Integer> minHeap = new PriorityQueue<>();

// Max-heap
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

// Custom comparator
PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);

// Operations
minHeap.offer(x);    // Add: O(log n)
minHeap.poll();      // Remove min: O(log n)
minHeap.peek();      // Get min: O(1)
minHeap.size();
minHeap.isEmpty();
```

---

### 8.2 Heap — Kth Largest Element

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

### 8.3 Heap — Top K Frequent Elements

**Use when:** Find k most frequent

```java
public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> freq = new HashMap<>();
    for (int num : nums) {
        freq.put(num, freq.getOrDefault(num, 0) + 1);
    }

    PriorityQueue<Integer> heap = new PriorityQueue<>(
        (a, b) -> freq.get(a) - freq.get(b)
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

### 8.4 Heap — Merge K Sorted Lists

**Use when:** Merge multiple sorted sequences

```java
public ListNode mergeKLists(ListNode[] lists) {
    PriorityQueue<ListNode> heap = new PriorityQueue<>(
        (a, b) -> a.val - b.val
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

### 8.5 Heap — Find Median from Data Stream

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
        return (maxHeap.peek() + minHeap.peek()) / 2.0;
    }
}
```

**Invariant:** maxHeap contains smaller half, minHeap contains larger half. Sizes differ by at most 1.

### 📅 CATEGORY 8 — DAILY BREAKDOWN

| Day | Template (5x typing)              | LeetCode Problems                   | Focus                |
| --- | --------------------------------- | ----------------------------------- | -------------------- |
| Mon | 8.1 Basic Ops + 8.2 Kth Largest   | LC 215 Kth Largest Element          | Min-heap of size k   |
| Tue | 8.3 Top K Frequent                | LC 347 Top K Frequent Elements      | Frequency map + heap |
| Wed | 8.4 Merge K Lists                 | LC 23 Merge K Sorted Lists          | Poll and add next    |
| Thu | 8.5 Median Finder                 | LC 295 Find Median from Data Stream | Two heaps balanced   |
| Fri | Review all heap patterns          | LC 973 K Closest Points to Origin   | Custom comparator    |
| Sat | **REVIEW**: All templates 1x each | Redo hardest from each day          | Consolidation        |

---

# CATEGORY 9: BACKTRACKING

---

### 9.1 Backtracking — Subsets

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

### 9.2 Backtracking — Permutations

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

### 9.3 Backtracking — Combination Sum

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

### 9.4 Backtracking — Word Search

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

### 📅 CATEGORY 9 — DAILY BREAKDOWN

| Day | Template (5x typing)              | LeetCode Problems                               | Focus                            |
| --- | --------------------------------- | ----------------------------------------------- | -------------------------------- |
| Mon | 9.1 Subsets                       | LC 78 Subsets                                   | start parameter, add before loop |
| Tue | 9.2 Permutations                  | LC 46 Permutations                              | used[] array, loop from 0        |
| Wed | 9.3 Combination Sum               | LC 39 Combination Sum, LC 40 Combination Sum II | i vs i+1 for reuse               |
| Thu | 9.4 Word Search                   | LC 79 Word Search                               | Mark visited with '#'            |
| Fri | Mixed backtracking                | LC 131 Palindrome Partitioning                  | Combining patterns               |
| Sat | **REVIEW**: All templates 1x each | Redo hardest from each day                      | Consolidation                    |

---

# CATEGORY 10: TRIES

---

### 10.1 Trie — Implementation

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

### 10.2 Trie — Word Search II

**Use when:** Find multiple words in grid

```java
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

### 📅 CATEGORY 10 — DAILY BREAKDOWN

| Day | Template (5x typing)              | LeetCode Problems                           | Focus                    |
| --- | --------------------------------- | ------------------------------------------- | ------------------------ |
| Mon | 10.1 Trie Implementation          | LC 208 Implement Trie                       | insert/search/startsWith |
| Tue | 10.1 Trie (continued)             | LC 211 Design Add and Search Words          | Wildcard with '.'        |
| Wed | 10.2 Word Search II               | LC 212 Word Search II                       | Trie + DFS grid          |
| Thu | Review Trie patterns              | Practice combining Trie with other patterns | Integration              |
| Fri | Mixed Trie problems               | Any remaining Trie problems                 | Consolidation            |
| Sat | **REVIEW**: All templates 1x each | Redo hardest from each day                  | Consolidation            |

---

# CATEGORY 11: GRAPHS

---

### 11.1 Graph — BFS (Level Order)

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

### 11.2 Graph — DFS (Recursive)

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

### 11.3 Graph — Number of Islands (Grid DFS)

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

### 11.4 Graph — Clone Graph

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

### 11.5 Graph — Course Schedule (Cycle Detection)

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

### 11.6 Graph — Topological Sort (Kahn's Algorithm)

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

### 11.7 Graph — Pacific Atlantic Water Flow

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

### 📅 CATEGORY 11 — DAILY BREAKDOWN

| Day | Template (5x typing)              | LeetCode Problems                  | Focus                |
| --- | --------------------------------- | ---------------------------------- | -------------------- |
| Mon | 11.1 BFS + 11.2 DFS               | LC 200 Number of Islands           | Grid DFS basics      |
| Tue | 11.3 Grid DFS + 11.4 Clone Graph  | LC 133 Clone Graph                 | Map for cloning      |
| Wed | 11.5 Cycle Detection              | LC 207 Course Schedule             | state[] array: 0/1/2 |
| Thu | 11.6 Topological Sort             | LC 210 Course Schedule II          | Indegree + BFS       |
| Fri | 11.7 Pacific Atlantic             | LC 417 Pacific Atlantic Water Flow | Multi-source DFS     |
| Sat | **REVIEW**: All templates 1x each | Redo hardest from each day         | Consolidation        |

---

# CATEGORY 12: ADVANCED GRAPHS

---

### 12.1 Union-Find (Disjoint Set)

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

### 12.2 Dijkstra's Algorithm

**Use when:** Shortest path with weighted edges

```java
public int[] dijkstra(int n, List<int[]>[] graph, int start) {
    int[] dist = new int[n];
    Arrays.fill(dist, Integer.MAX_VALUE);
    dist[start] = 0;

    // Min-heap: [distance, node]
    PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
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

### 📅 CATEGORY 12 — DAILY BREAKDOWN

| Day | Template (5x typing)              | LeetCode Problems                                    | Focus                   |
| --- | --------------------------------- | ---------------------------------------------------- | ----------------------- |
| Mon | 12.1 Union-Find                   | LC 323 Number of Connected Components                | Path compression        |
| Tue | 12.1 Union-Find (continued)       | LC 261 Graph Valid Tree, LC 684 Redundant Connection | Cycle detection with UF |
| Wed | 12.2 Dijkstra                     | LC 743 Network Delay Time                            | Skip outdated entries   |
| Thu | 12.2 Dijkstra (continued)         | LC 787 Cheapest Flights Within K Stops               | Modified Dijkstra       |
| Fri | Mixed advanced graphs             | Review and practice                                  | Integration             |
| Sat | **REVIEW**: All templates 1x each | Redo hardest from each day                           | Consolidation           |

---

# CATEGORY 13: 1-D DYNAMIC PROGRAMMING

---

### 13.1 DP — Climbing Stairs (Fibonacci)

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

### 13.2 DP — House Robber

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

### 13.3 DP — Coin Change

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

### 13.4 DP — Longest Increasing Subsequence

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

### 13.5 DP — Word Break

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

### 13.6 DP — Decode Ways

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

### 📅 CATEGORY 13 — DAILY BREAKDOWN

| Day | Template (5x typing)                     | LeetCode Problems                          | Focus               |
| --- | ---------------------------------------- | ------------------------------------------ | ------------------- |
| Mon | 13.1 Climbing Stairs + 13.2 House Robber | LC 70 Climbing Stairs, LC 198 House Robber | prev1/prev2 pattern |
| Tue | 13.3 Coin Change                         | LC 322 Coin Change                         | Fill with amount+1  |
| Wed | 13.4 LIS                                 | LC 300 Longest Increasing Subsequence      | O(n²) solution      |
| Thu | 13.5 Word Break                          | LC 139 Word Break                          | dp[j] && substring  |
| Fri | 13.6 Decode Ways                         | LC 91 Decode Ways                          | Single vs two digit |
| Sat | **REVIEW**: All templates 1x each        | Redo hardest from each day                 | Consolidation       |

---

# CATEGORY 14: 2-D DYNAMIC PROGRAMMING

---

### 14.1 DP — Unique Paths

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

### 14.2 DP — Longest Common Subsequence

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

### 14.3 DP — Edit Distance

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

### 📅 CATEGORY 14 — DAILY BREAKDOWN

| Day | Template (5x typing)              | LeetCode Problems                         | Focus                 |
| --- | --------------------------------- | ----------------------------------------- | --------------------- |
| Mon | 14.1 Unique Paths                 | LC 62 Unique Paths, LC 63 Unique Paths II | Initialize edges to 1 |
| Tue | 14.2 LCS                          | LC 1143 Longest Common Subsequence        | dp[i-1][j-1] + 1      |
| Wed | 14.3 Edit Distance                | LC 72 Edit Distance                       | Three operations      |
| Thu | 2D DP Review                      | LC 516 Longest Palindromic Subsequence    | Combining patterns    |
| Fri | Mixed 2D DP                       | LC 97 Interleaving String                 | Integration           |
| Sat | **REVIEW**: All templates 1x each | Redo hardest from each day                | Consolidation         |

---

# CATEGORY 15: GREEDY

---

### 15.1 Greedy — Jump Game

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

### 15.2 Greedy — Jump Game II

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

### 15.3 Greedy — Gas Station

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

### 📅 CATEGORY 15 — DAILY BREAKDOWN

| Day | Template (5x typing)              | LeetCode Problems               | Focus               |
| --- | --------------------------------- | ------------------------------- | ------------------- |
| Mon | 15.1 Jump Game                    | LC 55 Jump Game                 | maxReach tracking   |
| Tue | 15.2 Jump Game II                 | LC 45 Jump Game II              | currentEnd/farthest |
| Wed | 15.3 Gas Station                  | LC 134 Gas Station              | totalTank/currTank  |
| Thu | Mixed Greedy                      | LC 763 Partition Labels         | Combining patterns  |
| Fri | Mixed Greedy                      | LC 678 Valid Parenthesis String | Range tracking      |
| Sat | **REVIEW**: All templates 1x each | Redo hardest from each day      | Consolidation       |

---

# CATEGORY 16: INTERVALS

---

### 16.1 Intervals — Merge

**Use when:** Merge overlapping intervals

```java
public int[][] merge(int[][] intervals) {
    Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

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

### 16.2 Intervals — Insert

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

### 16.3 Intervals — Non-overlapping (Remove Min)

**Use when:** Maximum non-overlapping intervals

```java
public int eraseOverlapIntervals(int[][] intervals) {
    Arrays.sort(intervals, (a, b) -> a[1] - b[1]); // Sort by end time

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

### 16.4 Intervals — Meeting Rooms II

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

### 📅 CATEGORY 16 — DAILY BREAKDOWN

| Day | Template (5x typing)              | LeetCode Problems                             | Focus                     |
| --- | --------------------------------- | --------------------------------------------- | ------------------------- |
| Mon | 16.1 Merge Intervals              | LC 56 Merge Intervals                         | Sort by start, extend end |
| Tue | 16.2 Insert Interval              | LC 57 Insert Interval                         | Three phases              |
| Wed | 16.3 Non-overlapping              | LC 435 Non-overlapping Intervals              | Sort by end time          |
| Thu | 16.4 Meeting Rooms                | LC 252 Meeting Rooms, LC 253 Meeting Rooms II | Separate start/end arrays |
| Fri | Mixed Intervals                   | LC 986 Interval List Intersections            | Two pointer on intervals  |
| Sat | **REVIEW**: All templates 1x each | Redo hardest from each day                    | Consolidation             |

---

# CATEGORY 17: MATH & GEOMETRY

---

### 17.1 Math — Rotate Image

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

### 17.2 Math — Spiral Matrix

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

### 17.3 Math — Set Matrix Zeroes

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

### 📅 CATEGORY 17 — DAILY BREAKDOWN

| Day | Template (5x typing)              | LeetCode Problems                       | Focus                        |
| --- | --------------------------------- | --------------------------------------- | ---------------------------- |
| Mon | 17.1 Rotate Image                 | LC 48 Rotate Image                      | Transpose + reverse          |
| Tue | 17.2 Spiral Matrix                | LC 54 Spiral Matrix                     | top/bottom/left/right        |
| Wed | 17.3 Set Matrix Zeroes            | LC 73 Set Matrix Zeroes                 | Use first row/col as markers |
| Thu | Mixed Math                        | LC 43 Multiply Strings, LC 50 Pow(x, n) | String math, fast exponent   |
| Fri | Mixed Geometry                    | LC 149 Max Points on a Line             | Slope calculation            |
| Sat | **REVIEW**: All templates 1x each | Redo hardest from each day              | Consolidation                |

---

# CATEGORY 18: BIT MANIPULATION

---

### 18.1 Bit — Single Number

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

### 18.2 Bit — Number of 1 Bits

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

### 18.3 Bit — Counting Bits

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

### 18.4 Bit — Reverse Bits

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

### 18.5 Bit — Missing Number

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

### 18.6 Bit — Sum of Two Integers (No + operator)

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

### 📅 CATEGORY 18 — DAILY BREAKDOWN

| Day | Template (5x typing)                       | LeetCode Problems                             | Focus             |
| --- | ------------------------------------------ | --------------------------------------------- | ----------------- |
| Mon | 18.1 Single Number                         | LC 136 Single Number                          | XOR properties    |
| Tue | 18.2 Number of 1 Bits + 18.3 Counting Bits | LC 191 Number of 1 Bits, LC 338 Counting Bits | n & (n-1) trick   |
| Wed | 18.4 Reverse Bits                          | LC 190 Reverse Bits                           | Bit by bit        |
| Thu | 18.5 Missing Number                        | LC 268 Missing Number                         | XOR with indices  |
| Fri | 18.6 Sum of Two Integers                   | LC 371 Sum of Two Integers                    | Carry propagation |
| Sat | **REVIEW**: All templates 1x each          | Redo hardest from each day                    | Consolidation     |

---

## Article V — Daily Protocol

This is the exact structure for every practice session.

### Phase 1 Sessions (Weeks 1-3): Template Building

**Duration:** 90 minutes minimum

| Block          | Time   | Activity                           |
| -------------- | ------ | ---------------------------------- |
| Template Drill | 15 min | Type today's template 5x, vocalize |
| Problem 1      | 25 min | Attempt (no hints until 25 min)    |
| Immediate Redo | 10 min | Delete. Rewrite from scratch.      |
| Problem 2      | 25 min | Same pattern                       |
| Immediate Redo | 10 min | Delete. Rewrite.                   |
| Error Log      | 5 min  | Document what broke                |

### Phase 2 Sessions (Weeks 4-6): Pattern Mastery

**Duration:** 2 hours

| Block           | Time   | Activity                           |
| --------------- | ------ | ---------------------------------- |
| Template Warmup | 10 min | Type current pattern template once |
| Problem 1       | 25 min | Attempt                            |
| Immediate Redo  | 10 min | Delete. Rewrite.                   |
| Problem 2       | 25 min | Same pattern                       |
| Immediate Redo  | 10 min | Delete. Rewrite.                   |
| Problem 3       | 25 min | Harder variation                   |
| Error Log       | 5 min  | Document patterns                  |

### Phase 3 Sessions (Weeks 7-10): Interview Simulation

**Duration:** 2.5 hours

| Block              | Time   | Activity                 |
| ------------------ | ------ | ------------------------ |
| Mixed Problem 1    | 45 min | Full simulation          |
| Immediate Redo     | 15 min | Delete. Rewrite cleaner. |
| Mixed Problem 2    | 45 min | Different pattern        |
| Immediate Redo     | 15 min | Delete. Rewrite.         |
| Error Log + Review | 15 min | Weekly patterns          |

---

## Article VI — KPI Tracking

| Metric                  | Week 1   | Week 4   | Week 8   |
| ----------------------- | -------- | -------- | -------- |
| Template typing         | < 90 sec | < 60 sec | < 45 sec |
| Redo time (Medium)      | < 20 min | < 15 min | < 12 min |
| Syntax errors/problem   | Any      | < 3      | < 1      |
| First-run acceptance    | 10%      | 40%      | 70%      |
| Medium solve in ≤25 min | 30%      | 60%      | 80%      |

---

## Article VII — Recovery Protocols

### When Stuck (> 25 min)

1. Stop coding
2. Write invariant in plain English
3. Write pseudocode as comments
4. Look at ONE hint (approach only)
5. Implement yourself

### When Burned Out

1. 24-hour mandatory break
2. Physical activity
3. Day 1 back: 30 min only
4. Day 2: 60 min
5. Day 3: Normal

---

## Article VIII — Weekly Curriculum (NeetCode 150 Order)

### Week 1: Arrays & Hashing

| Day | Focus                  | Problems             |
| --- | ---------------------- | -------------------- |
| Mon | HashSet/HashMap basics | LC 217, LC 242, LC 1 |
| Tue | Frequency counting     | LC 49, LC 347        |
| Wed | Array manipulation     | LC 238, LC 128       |
| Thu | Encoding/Decoding      | LC 271               |
| Fri | Review + Redo          | Redo all from memory |

### Week 2: Two Pointers + Sliding Window

| Day | Focus                   | Problems            |
| --- | ----------------------- | ------------------- |
| Mon | Two pointers opposite   | LC 167, LC 15       |
| Tue | Two pointers same       | LC 11, LC 42        |
| Wed | Fixed sliding window    | LC 643, LC 567      |
| Thu | Variable sliding window | LC 3, LC 424, LC 76 |
| Fri | Review + Redo           | All patterns        |

### Week 3: Stack + Binary Search

| Day | Focus                   | Problems       |
| --- | ----------------------- | -------------- |
| Mon | Valid parentheses, RPN  | LC 20, LC 150  |
| Tue | Monotonic stack         | LC 739, LC 84  |
| Wed | Binary search standard  | LC 704, LC 33  |
| Thu | Binary search on answer | LC 875, LC 153 |
| Fri | Review + Redo           | All patterns   |

### Week 4: Linked List

| Day | Focus              | Problems       |
| --- | ------------------ | -------------- |
| Mon | Reverse, merge     | LC 206, LC 21  |
| Tue | Fast/slow pointers | LC 141, LC 142 |
| Wed | Remove, reorder    | LC 19, LC 143  |
| Thu | LRU Cache          | LC 146         |
| Fri | Review + Redo      | All patterns   |

### Week 5: Trees

| Day | Focus           | Problems               |
| --- | --------------- | ---------------------- |
| Mon | DFS basics      | LC 104, LC 226, LC 100 |
| Tue | BFS level order | LC 102, LC 199         |
| Wed | BST operations  | LC 98, LC 230          |
| Thu | LCA, construct  | LC 236, LC 105         |
| Fri | Review + Redo   | All patterns           |

### Week 6: Heap + Backtracking

| Day | Focus                        | Problems       |
| --- | ---------------------------- | -------------- |
| Mon | Heap basics                  | LC 215, LC 347 |
| Tue | Merge K, median              | LC 23, LC 295  |
| Wed | Subsets, permutations        | LC 78, LC 46   |
| Thu | Combination sum, word search | LC 39, LC 79   |
| Fri | Review + Redo                | All patterns   |

### Week 7: Graphs + Tries

| Day | Focus               | Problems       |
| --- | ------------------- | -------------- |
| Mon | BFS/DFS graphs      | LC 200, LC 133 |
| Tue | Course schedule     | LC 207, LC 210 |
| Wed | Union-Find          | LC 323, LC 261 |
| Thu | Trie implementation | LC 208, LC 211 |
| Fri | Review + Redo       | All patterns   |

### Week 8: Dynamic Programming

| Day | Focus           | Problems              |
| --- | --------------- | --------------------- |
| Mon | 1D DP basics    | LC 70, LC 198, LC 322 |
| Tue | 1D DP continued | LC 300, LC 139        |
| Wed | 2D DP           | LC 62, LC 1143        |
| Thu | Edit distance   | LC 72                 |
| Fri | Review + Redo   | All patterns          |

### Weeks 9-10: Mixed + Greedy + Intervals + Math + Bits

| Day     | Focus                                            |
| ------- | ------------------------------------------------ |
| Mon     | Greedy (LC 55, LC 45) + Intervals (LC 56, LC 57) |
| Tue     | More intervals (LC 435, LC 253)                  |
| Wed     | Math/Matrix (LC 48, LC 54, LC 73)                |
| Thu     | Bit manipulation (LC 136, LC 191, LC 338)        |
| Fri-Sun | Mock interviews, random mediums                  |

---

## Appendix A — Java Quick Reference

```java
// HashMap
Map<K, V> map = new HashMap<>();
map.put(key, value);
map.get(key);
map.getOrDefault(key, defaultValue);
map.containsKey(key);
map.keySet();
map.values();
map.entrySet();

// HashSet
Set<T> set = new HashSet<>();
set.add(x);
set.contains(x);
set.remove(x);

// ArrayList
List<T> list = new ArrayList<>();
list.add(x);
list.get(i);
list.set(i, x);
list.remove(list.size() - 1);

// Queue (BFS)
Queue<T> queue = new ArrayDeque<>();
queue.offer(x);
queue.poll();
queue.peek();
queue.isEmpty();

// Stack (DFS)
Deque<T> stack = new ArrayDeque<>();
stack.push(x);
stack.pop();
stack.peek();
stack.isEmpty();

// PriorityQueue (Heap)
PriorityQueue<Integer> minHeap = new PriorityQueue<>();
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
pq.offer(x);
pq.poll();
pq.peek();

// Arrays
Arrays.sort(arr);
Arrays.sort(arr, (a, b) -> a[0] - b[0]);
Arrays.fill(arr, value);
Arrays.equals(arr1, arr2);

// String
s.length();
s.charAt(i);
s.substring(start, end);
s.toCharArray();
s.split(",");

// StringBuilder
StringBuilder sb = new StringBuilder();
sb.append(x);
sb.toString();
sb.deleteCharAt(sb.length() - 1);

// Math
Math.max(a, b);
Math.min(a, b);
Math.abs(x);
Integer.MAX_VALUE;
Integer.MIN_VALUE;

// Bit operations
a & b;   // AND
a | b;   // OR
a ^ b;   // XOR
~a;      // NOT
a << 1;  // Left shift (multiply by 2)
a >> 1;  // Right shift (divide by 2)
a >>> 1; // Unsigned right shift
n & (n - 1); // Remove lowest set bit
```

---

## Appendix B — Pattern Recognition Cheat Sheet

| Keywords                                | Pattern                 |
| --------------------------------------- | ----------------------- |
| "contains duplicate", "seen before"     | HashSet                 |
| "frequency", "count", "anagram"         | HashMap                 |
| "sorted array", "pair sum"              | Two Pointers            |
| "subarray", "substring", "window"       | Sliding Window          |
| "matching brackets", "valid expression" | Stack                   |
| "next greater/smaller"                  | Monotonic Stack         |
| "sorted", "find position"               | Binary Search           |
| "minimize maximum", "maximize minimum"  | Binary Search on Answer |
| "reverse list", "cycle"                 | Linked List             |
| "tree traversal", "depth"               | DFS/BFS                 |
| "kth largest/smallest"                  | Heap                    |
| "all subsets/permutations"              | Backtracking            |
| "prefix matching"                       | Trie                    |
| "shortest path unweighted"              | BFS                     |
| "connected components"                  | DFS/Union-Find          |
| "course schedule", "dependencies"       | Topological Sort        |
| "shortest path weighted"                | Dijkstra                |
| "maximum/minimum value", "count ways"   | DP                      |
| "can reach end"                         | Greedy                  |
| "overlapping intervals"                 | Sort + Merge            |
| "rotate/spiral matrix"                  | Math/Geometry           |
| "single number", "XOR"                  | Bit Manipulation        |

---

_End of Constitution v1.2_

_Structure: NeetCode 150 roadmap_
_Templates: 75+ covering all 18 categories_
_Execute relentlessly._
