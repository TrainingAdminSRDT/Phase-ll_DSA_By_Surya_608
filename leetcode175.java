// LeetCode 175. Combine Two Tables
// Difficulty: Easy
// Link: https://leetcode.com/problems/combine-two-tables/
// Note: This is a SQL problem.

// SQL Solution:
// SELECT p.firstName, p.lastName, a.city, a.state
// FROM Person p
// LEFT JOIN Address a ON p.personId = a.personId;
