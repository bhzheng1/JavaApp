## Entity Framework

#### What is the DbContext used for in Entity Framework and what is a DbSet? 
_DbContext is used to write and execute queries, materialize query results as entity objects, track changes that are made to those objects, persist object changes back on the database, and Bind objects in memory to UI controls. The DbSet class represent an entity set that can be used for CRUD operations._

#### Let’s say you have a Database with a DBContext reference to your database table employees and an initialized variable for the DBContext named db. Can you tell me how you would implement the LINQ code to get a List variable with all employees with a salary greater than 50000?
_Db.employees.Where(x => x.salary > 50000).ToLish();_

#### What is Change Tracking in Entity Framework, how can you disable it and when would you need to?
_ntity framework can track changes made to entities and their relations, so the correct updates are made on the database when the SaveChanges or SaveChangesAsync method of context is called. Add AsNoTracking() to queries. Or set context.ChangeTracker.QueryTrackingBehavior = QueryTrackingBehavior.NoTracking._
