# Subarrays of an Array

## Question
Given an array print all the subarrays of it.

### Input
An array.

### Output
Each subarray in a line.

### Constraints
    NA

### Example Input
 (i) [1,2,3]
(ii) [a, b, c]
### Example Outputs
(i)
1
    1 2
    1 2 3
    2
    2 3
    3
(ii) 
a
    a b
    a b c
    b
    b c
    c

## Solution
**Data Structure** = None (basic loops)
1. One outer loop for deciding the initial digit like subarray of 1's / a's then all subarrays of 2's / b's.
2. Inner loop for printing the specific range.
3. Printing on the range so initially from 1 till 1 / a till a then 1 till 2 / a till b then 1 till 3 / a till 3 and so on.


