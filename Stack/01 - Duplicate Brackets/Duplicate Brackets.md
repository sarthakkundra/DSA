# Duplicate Brackets

## Question
Given a string of a mathematical expression you have to tell wherther there are unnecessary brackets or not. Unnecessary brackets mean which on removing won't hamper the solution of the expression.

### Input
A string

### Output
True if the expression is valid.
False if the expression is invalid

### Constraints
Assume that the expression is balanced i.e. number of opening brackets are equal to number of closing brackets.

### Example Inputs
((a + b) + ((c + d)) 
(a + b) + ((c + d))

### Example Outputs
false
true


## Solution
**Data Structure** = Stack
1. keep on pushing all the characters in the string in the stack until you encounter a closing bracket.
2. On encountering a closing bracket keep on popping from the stack until you encounter the corresponding closing bracket. On encountering, pop it and repeat steps 1 and 2.
3. In the end if the Stack is empty that means the expression had no duplicate brackets and vice versa.


