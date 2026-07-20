/*=========================================================
      SQL PRACTICE DATABASE (MULTIPLE TABLES)
   Covers:
   - SELECT
   - WHERE
   - ORDER BY
   - GROUP BY
   - HAVING
   - INNER JOIN
   - LEFT JOIN
   - RIGHT JOIN (if DB supports)
   - SELF JOIN
   - SUBQUERY
   - AGGREGATE FUNCTIONS
   - DISTINCT
   - LIKE
   - IN
   - BETWEEN
   - LIMIT

   Paste and run in SQLite / MySQL / PostgreSQL
=========================================================*/


/*==============================
    DROP TABLES (OPTIONAL)
==============================*/

DROP TABLE IF EXISTS BOOKINGS;
DROP TABLE IF EXISTS PAYMENTS;
DROP TABLE IF EXISTS EMPLOYEES;
DROP TABLE IF EXISTS MOVIES;
DROP TABLE IF EXISTS CUSTOMERS;


/*==============================
       CREATE TABLES
==============================*/

CREATE TABLE CUSTOMERS (
    CUSTOMER_ID INT PRIMARY KEY,
    CUSTOMER_NAME VARCHAR(100),
    CITY VARCHAR(100),
    AGE INT,
    EMAIL VARCHAR(100)
);

CREATE TABLE MOVIES (
    MOVIE_ID INT PRIMARY KEY,
    MOVIE_NAME VARCHAR(100),
    GENRE VARCHAR(50),
    LANGUAGE VARCHAR(50),
    TICKET_PRICE DECIMAL(10,2)
);

CREATE TABLE BOOKINGS (
    BOOKING_ID INT PRIMARY KEY,
    CUSTOMER_ID INT,
    MOVIE_ID INT,
    BOOKING_DATE DATE,
    NUMBER_OF_TICKETS INT,
    FOREIGN KEY (CUSTOMER_ID)
    REFERENCES CUSTOMERS(CUSTOMER_ID),
    FOREIGN KEY (MOVIE_ID)
    REFERENCES MOVIES(MOVIE_ID)
);

CREATE TABLE PAYMENTS (
    PAYMENT_ID INT PRIMARY KEY,
    BOOKING_ID INT,
    PAYMENT_MODE VARCHAR(50),
    AMOUNT DECIMAL(10,2),
    PAYMENT_DATE DATE,
    FOREIGN KEY (BOOKING_ID)
    REFERENCES BOOKINGS(BOOKING_ID)
);

CREATE TABLE EMPLOYEES (
    EMP_ID INT PRIMARY KEY,
    EMP_NAME VARCHAR(100),
    DEPARTMENT VARCHAR(50),
    SALARY INT,
    MANAGER_ID INT
);



/*==============================
         INSERT DATA
==============================*/

INSERT INTO CUSTOMERS VALUES
(1,'Vishok','New York',20,'vishok@gmail.com'),
(2,'Ram','Chicago',25,'ram@gmail.com'),
(3,'Arun','Los Angeles',22,'arun@gmail.com'),
(4,'Priya','New York',24,'priya@gmail.com'),
(5,'David','Boston',30,'david@gmail.com'),
(6,'Sam','Chicago',27,'sam@gmail.com'),
(7,'John','Miami',21,'john@gmail.com'),
(8,'Riya','New York',23,'riya@gmail.com');



INSERT INTO MOVIES VALUES
(101,'Avengers','Action','English',250),
(102,'Inception','Sci-Fi','English',300),
(103,'Leo','Action','Tamil',180),
(104,'Interstellar','Sci-Fi','English',320),
(105,'Jailer','Action','Tamil',220),
(106,'Titanic','Romance','English',200);



INSERT INTO BOOKINGS VALUES
(1001,1,101,'2025-01-10',2),
(1002,2,102,'2025-01-11',3),
(1003,3,103,'2025-01-12',4),
(1004,1,104,'2025-01-15',1),
(1005,4,101,'2025-01-18',5),
(1006,5,106,'2025-01-20',2),
(1007,6,103,'2025-01-22',3),
(1008,8,105,'2025-01-25',2),
(1009,2,101,'2025-01-28',1),
(1010,7,102,'2025-01-30',4);



INSERT INTO PAYMENTS VALUES
(1,1001,'UPI',500,'2025-01-10'),
(2,1002,'Card',900,'2025-01-11'),
(3,1003,'Cash',720,'2025-01-12'),
(4,1004,'UPI',320,'2025-01-15'),
(5,1005,'Card',1250,'2025-01-18'),
(6,1006,'Cash',400,'2025-01-20'),
(7,1007,'UPI',540,'2025-01-22'),
(8,1008,'Card',440,'2025-01-25'),
(9,1009,'Cash',250,'2025-01-28'),
(10,1010,'UPI',1200,'2025-01-30');



INSERT INTO EMPLOYEES VALUES
(1,'John','HR',50000,NULL),
(2,'David','IT',70000,1),
(3,'Sarah','IT',65000,2),
(4,'Mike','Finance',60000,1),
(5,'Emma','Finance',55000,4),
(6,'Chris','IT',75000,2),
(7,'Sophia','HR',52000,1);



/*==================================================
                PRACTICE QUESTIONS
==================================================*/


/*--------------------------------------------------
1. Display all customer details
--------------------------------------------------*/



-- select * from customers;



/*--------------------------------------------------
2. Display only customer name and city
--------------------------------------------------*/



--select CUSTOMER_NAME,city from customers;



/*--------------------------------------------------
3. Find customers from New York
--------------------------------------------------*/


--select CUSTOMER_NAME from customers where city ='New York';



/*--------------------------------------------------
4. Find customers age greater than 23
--------------------------------------------------*/



--select CUSTOMER_NAME from customers where age>23;



/*--------------------------------------------------
5. Find customers age between 20 and 25
--------------------------------------------------*/


--select CUSTOMER_NAME from customers where age between 20 and 25;



/*--------------------------------------------------
6. Show unique cities
--------------------------------------------------*/



--select DISTINCT city from customers;



/*--------------------------------------------------
7. Find customers whose name starts with 'R'
--------------------------------------------------*/


--select CUSTOMER_NAME from customers where CUSTOMER_NAME like 'R%';


/*--------------------------------------------------
8. Sort customers by age descending
--------------------------------------------------*/


--select CUSTOMER_NAME from customers order by age ;


/*--------------------------------------------------
9. Display first 5 customers
--------------------------------------------------*/


--select CUSTOMER_NAME from customers limit 5;


/*--------------------------------------------------
10. Count total customers
--------------------------------------------------*/


--select count(CUSTOMER_NAME) from customers;


/*--------------------------------------------------
11. Find maximum ticket price
--------------------------------------------------*/


--select max(NUMBER_OF_TICKETS) from bookings;


/*--------------------------------------------------
12. Find minimum salary
--------------------------------------------------*/


--select min(salary) from employees;


/*--------------------------------------------------
13. Find average customer age
--------------------------------------------------*/


--select avg(age) from customers GROUP by CUSTOMER_NAME;

--select avg(age) from customers;


/*--------------------------------------------------
14. Find total payment amount
--------------------------------------------------*/


select 


/*--------------------------------------------------
15. Count customers city-wise
(GROUP BY)
--------------------------------------------------*/


/*--------------------------------------------------
16. Show cities having more than 1 customer
(HAVING)
--------------------------------------------------*/


/*--------------------------------------------------
17. INNER JOIN
Show customer name with booking date
--------------------------------------------------*/


/*--------------------------------------------------
18. INNER JOIN
Show customer name, movie name,
booking date
--------------------------------------------------*/


/*--------------------------------------------------
19. INNER JOIN
Show booking id, customer name,
movie name, ticket count
--------------------------------------------------*/


/*--------------------------------------------------
20. INNER JOIN (3 TABLES)
Show customer name, movie name,
payment mode, amount
--------------------------------------------------*/


/*--------------------------------------------------
21. INNER JOIN
Find customers who booked Avengers
--------------------------------------------------*/


/*--------------------------------------------------
22. INNER JOIN + WHERE
Find customers from New York
who booked a movie
--------------------------------------------------*/


/*--------------------------------------------------
23. LEFT JOIN
Show all customers and bookings
(even customers without booking)
--------------------------------------------------*/


/*--------------------------------------------------
24. LEFT JOIN
Show all movies and bookings
--------------------------------------------------*/


/*--------------------------------------------------
25. SELF JOIN
Show employee name and manager name
--------------------------------------------------*/


/*--------------------------------------------------
26. SELF JOIN
Show employees working under David
--------------------------------------------------*/


/*--------------------------------------------------
27. SELF JOIN
Find manager and employee department
--------------------------------------------------*/


/*--------------------------------------------------
28. GROUP BY
Find total tickets booked by each customer
--------------------------------------------------*/


/*--------------------------------------------------
29. GROUP BY
Find total revenue generated by each movie
--------------------------------------------------*/


/*--------------------------------------------------
30. HAVING
Find movies generating revenue > 1000
--------------------------------------------------*/


/*--------------------------------------------------
31. SUBQUERY
Find customer(s) older than average age
--------------------------------------------------*/


/*--------------------------------------------------
32. SUBQUERY
Find movie with highest ticket price
--------------------------------------------------*/


/*--------------------------------------------------
33. SUBQUERY
Find employees earning more than
average salary
--------------------------------------------------*/


/*--------------------------------------------------
34. IN OPERATOR
Find customers from Chicago or Miami
--------------------------------------------------*/


/*--------------------------------------------------
35. BETWEEN
Find employees salary between
50000 and 70000
--------------------------------------------------*/


/*--------------------------------------------------
36. LIKE
Find movie names ending with 'r'
--------------------------------------------------*/


/*--------------------------------------------------
37. ORDER BY + LIMIT
Top 3 highest paid employees
--------------------------------------------------*/


/*--------------------------------------------------
38. JOIN + GROUP BY
Count bookings for each movie
--------------------------------------------------*/


/*--------------------------------------------------
39. JOIN + HAVING
Find movies booked more than 1 time
--------------------------------------------------*/


/*--------------------------------------------------
40. ADVANCED JOIN
Show customer name, movie name,
tickets booked, payment amount
--------------------------------------------------*/


/*--------------------------------------------------
41. ADVANCED
Find customer who spent maximum money
--------------------------------------------------*/


/*--------------------------------------------------
42. ADVANCED
Find city generating highest booking count
--------------------------------------------------*/


/*--------------------------------------------------
43. ADVANCED
Find movie booked by maximum customers
--------------------------------------------------*/


/*--------------------------------------------------
44. ADVANCED SELF JOIN
Find employees and their manager salary
--------------------------------------------------*/


/*--------------------------------------------------
45. ADVANCED
Find customer who booked more than
average number of tickets
--------------------------------------------------*/


/*--------------------------------------------------
46. PRACTICE INNER JOIN
Find all Tamil movie bookings
--------------------------------------------------*/


/*--------------------------------------------------
47. PRACTICE INNER JOIN
Find all English movie customers
--------------------------------------------------*/


/*--------------------------------------------------
48. PRACTICE INNER JOIN
Find payment done via UPI
with customer name
--------------------------------------------------*/


/*--------------------------------------------------
49. PRACTICE GROUP BY
Find average payment mode amount
--------------------------------------------------*/


/*--------------------------------------------------
50. MASTER QUESTION (INTERVIEW LEVEL)

Display:

Customer Name
Movie Name
Booking Date
Number Of Tickets
Payment Mode
Amount

Only for customers from New York
Sort by amount descending
--------------------------------------------------*/