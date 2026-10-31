# Minimum Window Substring

**Difficulty:** Hard

## Problem Statement

Given two strings `s` and `target`, find the **shortest contiguous substring of `s` that contains every character in `target`, including the required number of occurrences of each character**.

The substring may contain additional characters that are not present in `target`.

If multiple substrings have the same minimum length, return the one that appears earliest in `s`. If no valid substring exists, return an empty string.

Use the sliding window technique and frequency maps to efficiently track the characters required and present in the current window.

## Expected Time Complexity

- **Time:** \(O(n + m)\), where \(n\) is the length of `s` and \(m\) is the length of `target`. Each character enters and leaves the sliding window at most once.
- **Space:** \(O(C)\), where \(C\) is the number of distinct characters across `s` and `target`. In the worst case, this is \(O(n + m)\).

## Function Signature

```java
public static String stringWindow(String s, String target)
```

## Parameters

- `s`: The string in which to search for the minimum window.
- `target`: The string containing the characters that must be present in the window.

## Return Value

The shortest substring of `s` containing all characters from `target`, including their required frequencies. Return an empty string if no valid substring exists.

## Examples

### Example 1

**Input**
```text
s = "hello"
target = "leo"
```

**Output**
```text
"ello"
```

**Explanation:** The substring `"ello"` contains `l`, `e`, and `o`. No shorter substring contains all three required characters.

### Example 2

**Input**
```text
s = "ghetughyehtvtiehg"
target = "hvh"
```

**Output**
```text
"hyehtv"
```

**Explanation:** The substring `"hyehtv"` contains two occurrences of `h` and one occurrence of `v`. It is the shortest substring satisfying the required character frequencies.

### Example 3

**Input**
```text
s = "olleh"
target = "leo"
```

**Output**
```text
"olle"
```

**Explanation:** The substring `"olle"` contains `l`, `e`, and `o`. The extra occurrence of `l` is allowed because the window may contain more occurrences than required.

### Example 4

**Input**
```text
s = "ADOBECODEBANC"
target = "ABC"
```

**Output**
```text
"BANC"
```

**Explanation:** The substring `"BANC"` contains all three required characters and is the shortest valid window.

### Example 5

**Input**
```text
s = "a"
target = "aa"
```

**Output**
```text
""
```

**Explanation:** The input contains only one occurrence of `a`, while the target requires two. Therefore, no valid window exists.

### Example 6

**Input**
```text
s = "aaab"
target = "ab"
```

**Output**
```text
"ab"
```

**Explanation:** The final two characters form the shortest substring containing both `a` and `b`.

## Constraints

- \(1 \leq s.length() \leq 10^5\)
- \(1 \leq target.length() \leq 10^5\)
- Both strings contain characters supported by Java's `char` type.
- Character frequencies in `target` must be satisfied; matching only the distinct characters is insufficient.
- The returned substring must be contiguous.
- If multiple minimum-length windows exist, return the earliest one.