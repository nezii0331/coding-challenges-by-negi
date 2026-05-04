Query the two cities in STATION with the shortest and longest CITY names, as well as their respective lengths (i.e.: number of characters in the name). If there is more than one smallest or largest city, choose the one that comes first when ordered alphabetically.
The STATION table is described as follows:

/*
Enter your query here.
*/

/*
Enter your query here and follow these instructions:
1. Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
2. The AS keyword causes errors, so follow this convention: "Select t.Field From table1 t" instead of "select t.Field From table1 AS t"
3. Type your code immediately after comment. Don't leave any blank line.
*/

-- SELECT * FROM STATION;

-- SO I GO WITH THIS TO LIMIT THE SMALLEST FIRST?
-- SELECT MIN(CITY), LAT_N FROM STATION LIMIT 2 ORDER BY CITY ASC;

-- METHOD ONE
-- SELECT CITY, LENGTH(CITY) FROM STATION ORDER BY LENGTH(CITY) ASC, CITY ASC LIMIT 1
-- UNION ALL
-- SELECT CITY, LENGTH(CITY) FROM STATION ORDER BY LENGTH(CITY) DESC, CITY ASC LIMIT 1;

(
    SELECT CITY, LENGTH(CITY)
    FROM STATION
    ORDER BY LENGTH(CITY) ASC, CITY ASC
    LIMIT 1
)
UNION ALL
(
    SELECT CITY, LENGTH(CITY)
    FROM STATION
    ORDER BY LENGTH(CITY) DESC, CITY ASC
    LIMIT 1
);

-- METHOD TWO
-- (SELECT CITY, LENGTH(CITY)
--  FROM STATION
--  ORDER BY LENGTH(CITY) ASC, CITY ASC
--  LIMIT 1)
-- UNION ALL
-- (SELECT CITY, LENGTH(CITY)
--  FROM STATION
--  ORDER BY LENGTH(CITY) DESC, CITY ASC
--  LIMIT 1);

-- METHOD THREE
--  SELECT CITY, len
-- FROM (
--     SELECT CITY,
--            LENGTH(CITY) AS len,
--            ROW_NUMBER() OVER(ORDER BY LENGTH(CITY) ASC, CITY ASC) AS shortest_rank,
--            ROW_NUMBER() OVER(ORDER BY LENGTH(CITY) DESC, CITY ASC) AS longest_rank
--     FROM STATION
-- ) AS RankedCities
-- WHERE shortest_rank = 1 OR longest_rank = 1;