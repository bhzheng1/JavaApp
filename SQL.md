### 1. Explain about your database design, were you involved in designing your database? What should you concern when designing database and tables?
_In database design, normalization forms should be considered while creating database. Meanwhile, considering De-normalization is also a good practice to reduce query complexity._
### 2. Can you explain about Normalization, especially 3NF and how its helpful? Tell me scenarios where De-Normalization is useful?
_Normalization is used to remove redundant records from table and make database tables in a good structure. De-Normalization means adding some redundant data into the table to decrease query complexity and improve query performance._
### ?3. When you opt stored procedure and when you opt function? Differences between them?
_When stored procedure takes long time to execute, we should take a look into execution plan looking for full table scan and see whether there is a missing index problem._
### 4. Differences between truncate and delete?
_Delete removes records according to where clause. Truncate removes entire table records and reset identity._
### 5. How you handling transactions? Can you explain ACID properties?
_Using Begin transaction and commit transaction with isolation levels. ACID property are “Atomicity”: Each transaction is treated as a single “unit”, which complete 100% or fails; “Consistency”: Transactions can only bring database from one state to another state; “Isolation”: Ensures transactions are executed sequentially; “Durability”: Once transaction finished and committed, the result remain inside database even if the transaction caused system failure._
### 6. What are the indexes and what are the advantages and disadvantages (explain both clustered and non-clustered)?
_Advantages: Speed up data retrieving process; Disadvantages: Slow down Insert, Update, and Delete process and use extra spaces to save index. Clustered database changes table physical structure on disk using B-Tree structure. Non-clustered doesn’t change physical structure of tables but create a reference table._
### 7. Explain Primary Key, Foreign Key and Unique Key with differences?
_Primary key cannot contain duplicated records and NULL, each table can only have one primary key, SQL server will create a default cluster index according to primary key; Unique key cannot contain duplicated but can contain one NULL record; Foreign key is used on table that points to another table’s primary key. The key must present on the primary key table._
### 8. Triggers in SQL Server?
_Triggers can be DLL or DML triggers. Triggers fires at specific command execution or after. AS/For/Instead of_
### 9. Differences between table and view?
_Table contains data in disk and view only has logic. View is a virtual table, user can also update records in view but not recommended._
### 10. What are all the benefits of CTE?
_CTE can only contain logic and only exists in current SQL batch. Using CTE to replace subqueries may improve query readability._
### 11. Explain something about temp table? Explain the process destruction of temp tables?
_There are two types of temp tables. Create temp table using single ‘#’ will create a temp table in temp database and it will be accessible by the creator until the creator log out or manually drop the table using query or IDE. ‘##’ temp tables can be accessed by anyone until everyone logout or manually drop by the creator through query or IDE._
### 12. Explain all the joins?
_INNER JOIN select overlapped parts from two tables according to defined relationship(s). CROSS JOIN will return every possible combination between two tables. FULL JOIN will join ALL records according to relationship(s), if the relationship doesn’t found, use NULL and keep record from one table._
### 13. What is the difference between Union and Union all?
_Union will combine two tables without duplicates. Union all will combine all rows include duplicates_
### 14. What is a group by clause?
_Group by clause is used to combine different rows according to one or more columns._
### 15. Have you used @@Error and @@Rowcount?
_@@Error will be used in try catch block and return integer of error id, @@rowcount will return an integer represent how many rows are affected by the last statement._
### 16. How would you perform pagination with Stored Procedures(SQL Statements)?
_Use OFFSET FETCH NEXT ONLY to skip records and fetch specific amount of records_
### 17. Explain all the steps for Performance Tuning of a query?
_Monitor Query execution plan and looking for full table scan or hash joins. Use Tuning advisor to add missing indexes._
