# Digital Clock

**Difficulty:** Easy

## Problem Statement

Given a non-negative integer `time` representing a duration in seconds, convert it into a string formatted as `MM:SS`, where `MM` represents the total number of minutes and `SS` represents the remaining seconds.

Both the minutes and seconds must contain at least two digits, with a leading zero added when the value is less than `10`.

The minutes represent the **total elapsed minutes**, so they may exceed `59`.

Return the formatted time string.

## Expected Time Complexity

- **Time:** \(O(1)\)
- **Space:** \(O(1)\)

## Function Signature

```java
public static String digitalClock(int time)
```

## Parameters

- `time`: A non-negative integer representing the duration in seconds.

## Return Value

A string formatted as `MM:SS`, representing the given duration in minutes and seconds.

## Examples

### Example 1

**Input**
```text
time = 1180
```

**Output**
```text
"19:40"
```

**Explanation:** `1180` seconds equals `19` minutes and `40` seconds.

### Example 2

**Input**
```text
time = 65
```

**Output**
```text
"01:05"
```

**Explanation:** `65` seconds equals `1` minute and `5` seconds. Leading zeros are added to both fields where necessary.

### Example 3

**Input**
```text
time = 600
```

**Output**
```text
"10:00"
```

**Explanation:** `600` seconds equals `10` minutes and `0` seconds.

### Example 4

**Input**
```text
time = 9
```

**Output**
```text
"00:09"
```

**Explanation:** The duration is less than one minute, so the minutes are `00` and the seconds are `09`.

### Example 5

**Input**
```text
time = 3600
```

**Output**
```text
"60:00"
```

**Explanation:** `3600` seconds equals `60` minutes and `0` seconds. The minutes are not reset to `00` because the output represents total elapsed minutes, not hours and minutes.

## Constraints

- \(0 \leq \text{time} \leq 2^{31}-1\)
- The input represents a duration in seconds.
- The output must use the format `MM:SS`.
- Both fields must contain at least two digits.
- The seconds field must range from `00` to `59`.
- The minutes field may exceed `59`.