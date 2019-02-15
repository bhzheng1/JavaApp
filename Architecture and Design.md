### 1. Tell me what all the design patterns are you know.
_Singleton, Factory, Dependency Injection, Repository, Abstract Facotory_
### 2. What is dependency injection. Advantages and Disadvantages. Your use of dependency in your project. What IOC did you use in your project?
_Dependency Injection is a design pattern that takes away the responsibility of creating dependencies from a class thus resulting in a loosely coupled system. Mostly used IOC is Constuctor Injection._  
[Click here for details](https://www.c-sharpcorner.com/UploadFile/cda5ba/dependency-injection-di-and-inversion-of-control-ioc/)
### 3. Explain the whole architecture of your project including your technologies you have used.
_I have been working with .Net framework for a long time and most of my projects are based on Web API 2 using Entity framework with SQL server as backend. Use MVC 5 and Angular for front-end. As for design patterns, Factory method was used a lot in the projects._
### 4. Explain the design patterns you have used in your project
  ### a) Singleton
  _A singleton is a class which only allows a single instance of itself to be created, and usually gives simple access to that instance. Most commonly, singleton don't allow any parameters to be specified when creating the instance._
  ### b) Factory
  _A factory creates objects. With this pattern, we develop an abstraction that isolates the logic for determining which type of class to create._  
  [Click here for details](https://www.dotnetperls.com/factory)
  ### c) Dependency Injection
  _Dependency injection is a technique where one object supports another object. There are 3 types of injections: Constructor Injection; Method Injection; Setter Injection. Constructor injection is use interface as input parameter to create an object. Method injection is use interface as method input parameter; Setter Injection usually creates a interface variable and have a switch statement to create object according to conditions._
  ### d) Repository
  _Basically repository design hides the detail about how data is being fetched/persisted from/to the database._  
  [Click here for details](http://web.archive.org/web/20150404154203/https://www.remondo.net/repository-pattern-example-csharp/)
  ### e) Abstract Factory
  _Abstract Factory is like factory of factories. For example, create multiple interfaces and several classes implement created interfaces. Then create a abstract factory and several abstract methods to return properties. Then create one factory implements the abstract factory and override abstract methods to return desired output. Finally, create a producor to return desired abstruct factory._
