# Valid Palindrome

**Difficulty:** Easy

Given a string `s`, determine whether it is a palindrome. Return `true` if `s` reads the same forward and backward, otherwise return `false`.

Solve the problem using recursion.

**Expected Time Complexity:** `O(n)`

## Function Signature

```java
boolean checkPalindrome(String s)
```

## Parameters

- `s` — a string.

## Returns

- `true` if `s` is a palindrome.
- `false` otherwise.

## Constraints

```text
0 <= s.length() <= 10^5
s consists of English letters.
```

## Examples

### Example 1

**Input**
```text
s = "aba"
```

**Output**
```text
true
```

**Explanation**

The string reads the same from left to right and right to left.

---

### Example 2

**Input**
```text
s = "abba"
```

**Output**
```text
true
```

**Explanation**

The string is identical when reversed.

---

### Example 3

**Input**
```text
s = "abc"
```

**Output**
```text
false
```

**Explanation**

The reverse of `"abc"` is `"cba"`, which is different from the original string.

---

### Example 4

**Input**
```text
s = ""
```

**Output**
```text
true
```

**Explanation**

An empty string is considered a palindrome.