# Balanced Brackets Algorithm in Java

This repository contains an algorithm to verify if `()`, `[]`, and `{}` are balanced in a given expression using stacks.

## Problem

Given an expression string `exp`, write a program to evaluate if the pairs and the order of `()`, `[]`, and `{}` are correct.

## Solution

### Use of Stacks:

1. **Stack the opening characters.**
2. When a closing character is identified:
    - Unstack it and verify if it matches the most recent opening character.
    - The last opened character must be the first to be closed.
3. In the end, the stack must be empty for the expression to be validated.

