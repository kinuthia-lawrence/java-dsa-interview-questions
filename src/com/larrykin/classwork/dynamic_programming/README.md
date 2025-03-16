# Dynamic Programming

- *[Dynamic Programming(DP)](https://www.geeksforgeeks.org/dynamic-programming/)*  is a powerful technique used in CS and Mathematics to solve problem by breaking them down into simpler sub-problems and storing the results of these sub-problems 
  to avoid redundant computations. It's particularly 
  useful for optimization problems where you want to find the best soln. among many possible ones.
### Key concepts
1. **Overlapping Subproblems**: Problem that can be broken down into smaller, similar problems. ex Calculating Fibonacci numbers involves calculating the same numbers multiple times.
2. **Optimal Substructure**: Optimal soln. to the Problem can be solved by combining optimal solutions to subproblems. ex Shortest path in a graph can be calculated by combining the shortest paths of smaller segments.
> The Idea is to simply store the results of subproblems so that we do not have to re-compute them when needed later. This optimiation typically reduces time complexities from exponential to polynomial.

