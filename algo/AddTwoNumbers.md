# Add Two Numbers

```text
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order 
and each of their nodes contain a single digit. Add the two numbers and return
it as a linked list.
```
from [Leetcode](https://leetcode.com/problems/add-two-numbers/)

## Example

```
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
```

## Bruteforce Solution

Process
1. Turn the two list nodes into a string
2. Convert string into a number
3. Add the two numbers
4. Transform result from step 3 into a string
5. Reverse the resulting string
6. Iterate through the string from step 5 and add it to a list node

### Time Complexity

```text
- Iterates both nodes in at the same time until longest is completed (length n)
- Transformations are constant
- Iterating the final result (length m)
```

<p align="center"><img src="https://latex.codecogs.com/gif.latex?O(n&plus;m)" title="O(n+m)" /></p>


## Optimized

- Iterate through each list node
- At each iteration, add the values from each list node
    - If the value equals or exceeds 10, carry 1 over for the next iteration
 
### Time Complexity
```text
- Iterates both nodes in at the same time until longest is completed (length n)
```

<p align="center"><img src="https://latex.codecogs.com/gif.latex?O(n)" title="O(n)" /></p>


## Code

| Language |
| :---     |
| [Python](../src/py/core/leetcode/add_two_numbers.py)|
| [Javascript](../src/js/core/leetcode/addTwoNumbers.js)
| [Java](../src/java/core/leetcode/AddTwoNumbers.java) |
