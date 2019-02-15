### 1. What is an ORM? What are the advantages of Entity Framework over ADO.net
_ORM is a technique that lets you query and manipulate data from a database using an object-oriented paradigm. Entity Framework can use LINQ to select data from each Entities and automatically parses into objects in c#. ADO.Net need to write query manually and parse result manually._
### 2. Disadvantages of EF and how would you improve the performances of EF?
_EF may cause performance problems especially with lazy loading. Use SQL profiler to keep tracking on LINQ generated query and see whether there are bad query generated._
### 3. What are the different approaches you can use in EF and which approach did you use & why?
_Code first or Database First. I personally prefer using code first since it is easier to be used automatically generates migration files. If there is already a database created for the project, and performance is strictly enforced, use database first approach._
### 4. Do you have experience with any other ORMs? (NHibernate or Dapper etc.)
### 5. Explain the steps of code first approach.
_1. Create Entity classes with parameters; 2. Create Context class with DbSet and two override functions OnConfiguring and OnModelCreating, which will be used to configure connection and entity relationships with fluent api._
### 6. What is the difference between lazy loading and eager loading. What is N+1 problem. Which one did you use in your projects?
_Lazy loading will automatically load an entity or collection from database the first time that property is accessed. Eager loading needs specify which property to load using .Include()_
### 7. What will Entity Framework return IQueryable or IEnumerable?
_IQueryable is the interface that allows LINQ-to-SQL to work. IQueryable will temporary save the LINQ state without retrieving records and waiting for future use. IEnumerable will fetch records from database and save in memory. For example, .ToList() will return IEnumerable_
### 8. How do you disable lazy loading in Entity Framework and what is the use of virtual keyword?
```c#
context.Configuration.LazyLoadingEnabled = false;
```
_In .Net Core, lazy loading is disabled by default. Virtual keyword is used in entity framework for lazy loading to work. If you don't mark property as virtual, lazy loading will not work with it._