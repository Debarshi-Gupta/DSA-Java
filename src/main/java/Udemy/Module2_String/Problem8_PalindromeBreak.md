# Palindrome Break

**Difficulty:** Medium

## Problem Statement

Given a palindrome string `s` consisting of lowercase English letters, change **exactly one character** to another lowercase English letter so that the resulting string is no longer a palindrome.

Return the **lexicographically smallest** string that can be obtained while satisfying this condition.

If the string has length `1`, return an empty string because changing its only character cannot produce a non-palindrome.

## Expected Time Complexity

- **Time:** \(O(n^2)\) for the provided implementation, where \(n\) is the length of the string, because it constructs and compares multiple candidate strings using substring operations.
- **Space:** \(O(n)\) auxiliary space at a time for the candidate strings and the result.

**Optimization note:** This problem can be solved in \(O(n)\) time by replacing the first non-`'a'` character in the first half with `'a'`. If all characters in the first half are `'a'`, replace the last character with `'b'`.

## Function Signature

```java
public static String palindromeBreak(String s)
```

## Parameters

- `s`: A palindrome string containing lowercase English letters.

## Return Value

The lexicographically smallest string obtainable by changing exactly one character such that the resulting string is not a palindrome. Return an empty string if the input length is `1`.

## Examples

### Example 1

**Input**
```text
s = "abccba"
```

**Output**
```text
"aaccba"
```

**Explanation:** Changing the second character from `'b'` to `'a'` produces `"aaccba"`. This is not a palindrome and is lexicographically smaller than the other valid candidates.

### Example 2

**Input**
```text
s = "a"
```

**Output**
```text
""
```

**Explanation:** A single-character string cannot be made into a non-palindrome by changing exactly one character, so an empty string is returned.

### Example 3

**Input**
```text
s = "aa"
```

**Output**
```text
"ab"
```

**Explanation:** Changing the second character from `'a'` to `'b'` produces `"ab"`, which is not a palindrome and is lexicographically smaller than `"ba"`.

### Example 4

**Input**
```text
s = "aba"
```

**Output**
```text
"abb"
```

**Explanation:** Changing the last character from `'a'` to `'b'` produces `"abb"`, the lexicographically smallest valid result.

## Constraints

- \(1 \leq s.length() \leq 10^3\)
- `s` consists only of lowercase English letters.
- The input string is guaranteed to be a palindrome.
- Exactly one character must be changed unless the string length is `1`.
- The resulting string must not be a palindrome.