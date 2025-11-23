/
/
leetcode 175. Combine Two Tables

SELECT p.firstName, p.lastName, c.city, c.state
FROM Person p
    LEFT JOIN Address a ON p.personId = a.personId;