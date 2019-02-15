## .Net Developer – SQL Server

#### What steps would you take to optimize a stored procedure?
_Read Query Execution plan and looking for missing indexes or table scan. SQL Profiler to track execution time._  

#### What is a clustered index normally used for?
_Clustered indexes sort and store the data rows in the table or view based on their key values. It normally used for speeding up SELECT queries._

#### What is the difference between a table variable and a temp table?
_Scope difference: Table variable only last in the current batch. Temp table will last longer and be access again by the creator._

_Temporary tables acts like regular tables that you can query data via select query._
_Syntax: create table # Cars. Can also create index. Apply DDL._
_Table variables preceded by @, can’t have non-clustered index, can have clustered index_

#### What is the difference between a DELETE and TRUNCATE table statement?
_DELETE is DML and TRUNCATE is DDL. DELETE removes records based on WHERE clause and TRUNCATE will remove all records and reset Identity._

#### What is the difference between a clustered and a non-clustered index?
_Clustered index will change table structure and non-clustered index doesn’t change table structure. Non-clustered index defines a logical order that does not match the physical order on disk._
_Clustered index, data is stored in physically order_

#### What is a sub query, what is it used for, and in what type of statements can you use it in?
_Sub query is a query nested inside another query. It is used to return data that will be used in the main query. You can use SELECT INSERT UPDATE and DELETE inside the subquery._

#### What are the leading causes for performance bottlenecks of database applications?
_Traffic, I/O usage…_

#### Which is the default type of index created in SQL Server, clustered or noncleared?
_Clustered. A Clustered Index will be automatically created according to the primary key._