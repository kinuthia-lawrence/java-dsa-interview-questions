# Patterns

- we print row by row.
- We start printing from the top row to the bottom row. left to right.
- On gaps we print spaces.
- We print patterns using nested loops.
- you can start a loop from 0 to <n or from 1 to <=n.
- For nested loops, the outer loop is for rows and the inner loop is for columns.
- For each row, we print the required number of columns, then we print a new line.
- For each row, we determine the number of columns to print based on the pattern.
- For each row, we determine the number of spaces to print based on the pattern.

## for a program to print a a square of size n

```
    for (int i = 0; i < n; i++) { // for each row
    for (int j = 0; j < n; j++) { // for each column
        System.out.print("*"); // print star
    }
    System.out.println(); // print new line
}
```
- when printing other patterns, using the main square pattern, use if conditions to determine when to print star and when to print space.
- For triangle patterns, all other patterns are made from increasing or decreasing triangles combined together(one printing space and the other printing a character).

## Basics on indexs

- First Row: i = 0
- Last Row: i = n-1
- First Column: j = 0
- Last Column: j = n-1
- Middle Row: i = n/2
- Middle Column: j = n/2
- First Diagonal: i == j
- Second Diagonal: i + j == n-1
- Upper Half: i < n/2
- Lower Half: i > n/2
- Left Half: j < n/2
- Right Half: j > n/2
- Upper Left Quarter: i < n/2 && j < n/2
- Upper Right Quarter: i < n/2 && j > n/2
- Lower Left Quarter: i > n/2 && j < n/2
- Lower Right Quarter: i > n/2 && j > n/2
- Border: i == 0 || i == n-1 || j == 0 || j == n-1
- Inner: i > 0 && i < n-1 && j > 0 && j < n-1
- Even Rows: i % 2 == 0
- Odd Rows: i % 2 != 0
- Even Columns: j % 2 == 0
- Odd Columns: j % 2 != 0
- Upper Triangle: i < j
- Lower Triangle: i > j
- Right Triangle: j > n-1-i
- Left Triangle: j < n-1-i
- Center: i == n/2 && j == n/2 (for odd n)
- Cross: i == n/2 || j == n/2 (for odd n)
- X: i == j || i + j == n-1 (for odd n)
- Diamond: |i - n/2| + |j - n/2| <= n/2 (for odd n)
- Hollow Square: Border && Inner
- Hollow Rectangle: Border && Inner
- Hollow Triangle: Border && Inner
- Hollow Diamond: Border && Inner
- Filled Square: !Inner
- Filled Rectangle: !Inner