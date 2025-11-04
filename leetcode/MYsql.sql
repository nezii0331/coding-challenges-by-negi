-- leetcode 196. Delete Duplicate Emails

DELETE FROM Person                 -- delete data from the Person table
WHERE id NOT IN (                  -- condition: delete rows whose id is NOT in the list below
    SELECT id                      -- this list is created by the subquery below
    FROM (
        SELECT MIN(id) AS id       -- select the smallest id for each email
        FROM Person
        GROUP BY email             -- group rows by email so duplicates can be compared
    ) AS temp                      -- give the subquery a temporary name (alias)
);
