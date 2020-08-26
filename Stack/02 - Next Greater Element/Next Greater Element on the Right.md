# Next Greater Element on the Right

## Question
Given an array of integers you have to tell the next element on the right side which is greater than the current element for all the elements of the array.

### Input 
 1. Size of the array
 2. Elements of the array
 
### Output
The greater element or -1.

## Constraints
Time complexity = O(n)

### Example Input
[2,5,9,3,1,12,6,8,7]

### Example Output
Next greater element is -1
Next greater element is -1
Next greater element is 8
Next greater element is -1
Next greater element is 12
Next greater element is 12
Next greater element is 12
Next greater element is 9
Next greater element is 5


## Solution
**Data Structure** = Stack
1. Push the last element of the array to the stack.
2. Start a loop from the end of the array (We'll start pushing into the stack from the end because we have to find the greater element on the **right**)
3. If the stack is not empty and the element on top is smaller or equal to arr[i] keep on popping. (while loop)
4. If the stack is empty then next greater element is -1 otherwise it's the top element.
5. Push arr[i] to the stack.