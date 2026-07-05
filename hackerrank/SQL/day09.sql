1.Query the names of all the Japanese cities in the CITY table. The COUNTRYCODE for Japan is JPN.
The CITY table is described as follows:

SELECT name FROM CITY WHERE COUNTRYCODE = 'JPN';

2.Query a list of CITY and STATE from the STATION table.
The STATION table is described as follows:

select city, state from station;


3. Query a list of CITY names from STATION for cities that have an even ID number. Print the results in any order, but exclude duplicates from the answer.
/*
Enter your query here.
*/
select distinct city from station where id % 2 = 0;


4.