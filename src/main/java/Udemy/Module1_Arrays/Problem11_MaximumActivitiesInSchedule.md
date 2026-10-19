# Maximum Activities in a Schedule

**Difficulty:** Medium

## Problem Statement

Given a schedule represented by a two-dimensional integer array `schedule`, where each activity is represented as `[startTime, endTime]`, determine the maximum number of non-overlapping activities that can be performed.

A person can participate in an activity only if it does not overlap with any previously selected activity. An activity can start at the exact time the previous activity ends.

Return the maximum number of activities that can be selected without overlapping.

## Expected Time Complexity

- **Time:** \(O(n \log n)\), where \(n\) is the number of activities, due to sorting.
- **Space:** Depends on the sorting implementation; the algorithm uses \(O(1)\) additional space for its selection logic, excluding sorting overhead.

## Function Signature

```java
public static int maximumActivitiesInSchedule(int[][] schedule)
```

## Parameters

- `schedule`: A two-dimensional integer array where `schedule[i][0]` represents the start time and `schedule[i][1]` represents the end time of activity `i`.

## Return Value

An integer representing the maximum number of non-overlapping activities that can be performed.

## Examples

### Example 1

**Input**
```text
schedule = [[7, 9], [0, 10], [4, 5], [8, 9], [4, 10], [5, 7]]
```

**Output**
```text
3
```

**Explanation:** The maximum number of non-overlapping activities is `3`. One valid selection is:

- `[4, 5]`
- `[5, 7]`
- `[7, 9]`

Each activity starts at or after the previous activity ends.

### Example 2

**Input**
```text
schedule = [[1, 3], [2, 4], [3, 5], [0, 7], [5, 8]]
```

**Output**
```text
3
```

**Explanation:** One optimal selection is `[1, 3]`, `[3, 5]`, and `[5, 8]`, giving a total of `3` activities.

### Example 3

**Input**
```text
schedule = [[1, 2], [3, 4], [5, 6], [7, 8]]
```

**Output**
```text
4
```

**Explanation:** All four activities can be selected because none overlap.

### Example 4

**Input**
```text
schedule = [[1, 5], [2, 6], [3, 7], [4, 8]]
```

**Output**
```text
1
```

**Explanation:** Every activity overlaps with every other activity, so only one can be selected.

### Example 5

**Input**
```text
schedule = []
```

**Output**
```text
0
```

**Explanation:** No activities are available to select.

## Constraints

- \(0 \leq \text{schedule.length} \leq 10^5\)
- Each activity is represented as `[startTime, endTime]`.
- \(0 \leq \text{startTime} \leq \text{endTime}\).
- Activities are allowed to start at the exact time another selected activity ends.
- The goal is to maximize the number of selected non-overlapping activities.

## Approach

Use a **greedy algorithm**:

1. Sort activities by end time in ascending order. If two activities have the same end time, sort them by start time.
2. Select the first activity and record its end time.
3. Iterate through the remaining activities, selecting an activity whenever its start time is greater than or equal to the end time of the previously selected activity.
4. Return the total number of selected activities.