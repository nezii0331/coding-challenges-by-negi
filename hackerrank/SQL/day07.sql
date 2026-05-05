
Query the list of CITY names starting with vowels (i.e., a, e, i, o, or u) from STATION. Your result cannot contain duplicates.

Input Format

The STATION table is described as follows:

/*
Enter your query here.
*/

-- method one
select distinct
    city
from station
where
    city regexp '^[aeiou]'
order by city asc;

-- method two
SELECT DISTINCT
    CITY
FROM STATION
WHERE
    LEFT(LOWER(city), 1) IN ('a', 'e', 'i', 'o', 'u');