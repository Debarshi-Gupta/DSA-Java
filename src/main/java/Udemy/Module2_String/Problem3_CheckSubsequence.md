# Check Subsequence

**Difficulty:** Easy

## Problem Statement

Given two strings `s` and `key`, determine whether `key` is a subsequence of `s`.

A string `key` is a subsequence of `s` if its characters appear in the same relative order in `s`, but they do not need to be contiguous.

Return `true` if `key` is a subsequence of `s`; otherwise, return `false`.

## Expected Time Complexity

- **Time:** \(O(n)\), where \(n\) is the length of `s`.
- **Space:** \(O(1)\) auxiliary space.

## Function Signature

```java
public static boolean checkSubsequence(String s, String key)
```

## Parameters

- `s`: The source string to search.
- `key`: The string to check as a subsequence of `s`.

## Return Value

A boolean value:
- `true` if `key` is a subsequence of `s`.
- `false` otherwise.

## Examples

### Example 1

**Input**
```text
s = "Hello World"
key = "eld"
```

**Output**
```text
true
```

**Explanation:** The characters `e`, `l`, and `d` appear in `s` in the same relative order, even though they are not contiguous.

### Example 2

**Input**
```text
s = "abcde"
key = "ace"
```

**Output**
```text
true
```

**Explanation:** The characters `a`, `c`, and `e` appear in the same relative order in `s`.

### Example 3

**Input**
```text
s = "abc"
key = "acb"
```

**Output**
```text
false
```

**Explanation:** Although all three characters occur in `s`, the order of `c` and `b` in `key` does not match their order in `s`.

### Example 4

**Input**
```text
s = "hello"
key = "world"
```

**Output**
```text
false
```

**Explanation:** The characters required to form `key` do not all appear in `s` in the required order.

### Example 5

**Input**
```text
s = "aabbcc"
key = "abc"
```

**Output**
```text
true
```

**Explanation:** One occurrence each of `a`, `b`, and `c` can be selected in the required order.

## Constraints

- `s` and `key` contain case-sensitive characters.
- \(0 \leq \text{s.length} \leq 10^5\)
- \(1 \leq \text{key.length} \leq 10^5\)
- The characters in `key` must appear in the same relative order as in `s`.
- The selected characters do not need to be contiguous.