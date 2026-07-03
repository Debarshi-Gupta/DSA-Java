# Generate All Subsets

**Difficulty:** Medium

Given a string `s` consisting of distinct characters, return all possible subsets of its characters.

The subsets may be returned in any order. The empty subset should also be included.

Solve the problem using recursion.

**Expected Time Complexity:** `O(n × 2ⁿ)`

## Function Signature

```java
List<String> findSubsets(String s)
```

## Parameters

- `s` — a string consisting of distinct characters.

## Returns

- A list containing all possible subsets of `s`.

## Constraints

```text
0 <= s.length() <= 20
s consists of distinct English letters.
```

## Examples

### Example 1

**Input**
```text
s = "abc"
```

**Output**
```text
["abc", "ab", "ac", "a", "bc", "b", "c", ""]
```

**Explanation**

Each character can either be included or excluded, resulting in `2³ = 8` subsets.

---

### Example 2

**Input**
```text
s = "ab"
```

**Output**
```text
["ab", "a", "b", ""]
```

**Explanation**

There are `2² = 4` possible subsets.

---

### Example 3

**Input**
```text
s = "a"
```

**Output**
```text
["a", ""]
```

**Explanation**

The string has two subsets: the string itself and the empty subset.

---

### Example 4

**Input**
```text
s = ""
```

**Output**
```text
[""]
```

**Explanation**

The empty string has exactly one subset: the empty subset.