



-- INSERT INTO students VALUES
-- (101,'Aarav','Sharma','Male',18,'CSE',1,'A','Chennai',89,8.91,95.50),
-- (102,'Diya','Patel','Female',19,'IT',2,'B','Coimbatore',76,7.80,90.20),
-- (103,'Vikram','Singh','Male',20,'ECE',3,'A','Madurai',92,9.20,97.30),
-- (104,'Ananya','Reddy','Female',21,'EEE',4,'C','Salem',85,8.60,91.40),
-- (105,'Rahul','Kumar','Male',18,'CSE',1,'B','Trichy',68,7.10,82.50),
-- (106,'Sneha','Iyer','Female',19,'AI',2,'A','Karur',95,9.70,98.80),
-- (107,'Karthik','Raj','Male',20,'CASE',3,'C','Erode',81,8.10,88.60),
-- (108,'Meera','Nair','Female',21,'MECH',4,'A','Tiruppur',73,7.50,84.30),
-- (109,'Arjun','Das','Male',22,'CIVIL',4,'B','Chennai',66,6.90,79.80),
-- (110,'Priya','Mohan','Female',18,'CASE',1,'A','Karur',91,9.10,96.10),
-- (111,'Rohan','Verma','Male',19,'IT',2,'C','Namakkal',78,7.90,89.00),
-- (112,'Ishita','Gupta','Female',20,'CSE',3,'B','Dindigul',87,8.70,93.60),
-- (113,'Sanjay','Rao','Male',21,'ECE',4,'A','Vellore',58,6.20,76.40),
-- (114,'Pooja','Joshi','Female',18,'AI',1,'B','Karur',84,8.40,90.90),
-- (115,'Harish','Menon','Male',19,'CASE',2,'A','Chennai',79,8.00,87.10),
-- (116,'Nisha','Khan','Female',20,'EEE',3,'C','Madurai',88,8.90,95.00),
-- (117,'Aditya','Roy','Male',21,'IT',4,'B','Salem',62,6.80,80.20),
-- (118,'Keerthi','S','Female',22,'CSE',4,'A','Coimbatore',94,9.60,99.10),
-- (119,'Varun','Pillai','Male',18,'MECH',1,'C','Karur',71,7.30,85.50),
-- (120,'Lavanya','R','Female',19,'CASE',2,'B','Erode',86,8.80,92.40),
-- (121,'Surya','Narayan','Male',20,'AI',3,'A','Chennai',83,8.40,91.80),
-- (122,'Divya','Lakshmi','Female',21,'ECE',4,'B','Trichy',90,9.00,96.70),
-- (123,'Ajay','Babu','Male',22,'CASE',4,'A','Karur',64,6.70,78.60),
-- (124,'Bhavya','Krishna','Female',18,'IT',1,'C','Namakkal',80,8.20,89.30),
-- (125,'Manoj','S','Male',19,'CSE',2,'A','Coimbatore',77,7.70,88.10),
-- (126,'Kavya','Raman','Female',20,'AI',3,'B','Salem',93,9.40,98.20),
-- (127,'Pranav','V','Male',21,'EEE',4,'A','Karur',69,7.00,83.70),
-- (128,'Aishwarya','P','Female',18,'CASE',1,'B','Madurai',82,8.30,90.40),
-- (129,'Naveen','K','Male',19,'ECE',2,'C','Tiruppur',75,7.60,86.90),
-- (130,'Shreya','D','Female',20,'CSE',3,'A','Chennai',97,9.90,99.50);


-- INSERT INTO courses VALUES
-- (201,101,'Database Management Systems','Dr. Kumar',1,'A',4),
-- (202,102,'Operating Systems','Dr. Priya',3,'B+',4),
-- (203,103,'Computer Networks','Dr. Raj',5,'A+',3),
-- (204,104,'Power Systems','Dr. Meena',7,'A',4),
-- (205,105,'Java Programming','Dr. Arun',1,'B',3),
-- (206,106,'Machine Learning','Dr. Kavitha',3,'A+',4),
-- (207,107,'Cyber Security','Dr. Suresh',5,'A',3),
-- (208,108,'Thermodynamics','Dr. Naveen',7,'B+',4),
-- (209,110,'Data Structures','Dr. Kumar',1,'A',4),
-- (210,111,'Python Programming','Dr. Priya',3,'B',3),
-- (211,112,'DBMS','Dr. Raj',5,'A',4),
-- (212,114,'Artificial Intelligence','Dr. Kavitha',1,'A',4),
-- (213,115,'Cloud Computing','Dr. Arun',3,'A',3),
-- (214,118,'Software Engineering','Dr. Meena',7,'A+',4),
-- (215,120,'Web Development','Dr. Suresh',3,'A',3),
-- (216,121,'Deep Learning','Dr. Kavitha',5,'B+',4),
-- (217,122,'Embedded Systems','Dr. Raj',7,'A',4),
-- (218,124,'Linux Administration','Dr. Kumar',1,'B+',3),
-- (219,126,'Data Mining','Dr. Priya',5,'A+',4),
-- (220,130,'Compiler Design','Dr. Arun',5,'A+',4);




--=======================================================================

-- CREATE TABLE students (
--     student_id INT PRIMARY KEY,
--     first_name VARCHAR(30),
--     last_name VARCHAR(30),
--     gender VARCHAR(10),
--     age INT,
--     department VARCHAR(30),
--     year INT,
--     section CHAR(1),
--     city VARCHAR(30),
--     marks INT,
--     cgpa DECIMAL(3,2),
--     attendance DECIMAL(5,2)
-- );


-- CREATE TABLE courses (
--     course_id INT PRIMARY KEY,
--     student_id INT,
--     course_name VARCHAR(50),
--     faculty_name VARCHAR(50),
--     semester INT,
--     grade CHAR(2),
--     credits INT,
--     FOREIGN KEY (student_id) REFERENCES students(student_id)
-- );


















--==========================================================================

                  --Self Join
                  
--============================================================================










--===========================================================================

                     --Left Join

--===========================================================================

select s.first_name , c.faculty_name from courses c left join students s on s.student_id=c.student_id 
where c.semester>3; 



--============================================================================

                  --Inner Join

--============================================================================



-- select s.first_name, c.course_name from courses c inner join students s on c.student_id=s.student_id 
-- where age>15;




-- ===========================================================

               -- Aggregate Function

--============================================================

-- SELECT max(marks) FROM students;

-- SELECT min(marks) FROM students;

-- SELECT avg(marks) FROM students;

-- SELECT sum(marks) FROM students;

-- SELECT count(marks) FROM students;

-- SELECT count(*) FROM students;


--=============================================================

                -- Group by AND Having  

--=============================================================


-- SELECT gender, avg(marks)
--            FROM students
--                  group by gender 
--                      having marks >70;


-- SELECT gender, count(student_id)
--                FROM students
--                      group by gender 
--                               having marks >70;

-- SELECT gender, avg(marks)
--            FROM students
--                  group by gender 
--                      having marks >70;


-- SELECT gender, count(student_id)
--                FROM students
--                      group by gender 
--                               having marks >70;


--=============================================================
                  
                  -- If Condition 

--=============================================================


-- select student_id,
--      case
--          when marks >80 
--             and first_name not like 'M%'
--          then marks
--           else 0
--            end  as internal 
--            from  students

--  order by student_id;



--=============================================================























--============================================

-- sqlite3 mydatabase.db < hello.sql

--============================================