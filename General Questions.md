### 1. Introduce yourself and could you please explain your last project.
_My name is Mark Huang. I am a full stack .Net developer for several years. While I was working, I obtained several Microsoft certificates like MCSD: App Builder, MCSA: Web Application and MCSA: SQL 2016 Database Development. I have experience in both .Net Framework and .Net Core. In front-end, I used MVC5 and AngularJS/5. For back-end, mostly used Web API 2 with ADO.Net or Entity Framework as Data Access Layer and SQL Server as Database._

_For my last project, it was in Firstrust to build a web app called Mortgage web centre, which provide support to internal employees during all phases of deal life cycle like loan origination, servicing and distribution. It has lots of functions, the part I was working on is a service monitoring portal which used to monitor support status includes how many employee searched in which category and how many bugs they've reported. For the status monitor, I used D3.js as a data visualization tool to create charts using data passed from backend._
### 2. Explain your whole architecture of your last project along with technologies
_The Presentation Layer used Angular 5, HTML, CSS and Bootstrap as front-end. Used ASP.Net Web API 2 as Business Layer and Entity Framework as Data Access Layer._
### 3. What is your experience with testing? Especially, unit testing and what tools/frameworks did you use to do unit testing, and what is your code coverage?
_I have used xUnit test in Visual Studio, Postman and Fiddler._
### 4. What is dependency injection, what are the advantages of dependency injection. What IOC's did you use?
_Dependency Injection is a design pattern that takes away the responsibility of creating dependencies from a class thus resulting in a loosely coupled system. Mostly used IOC is Ninject with Constuctor Injection._ IOC: Ninject, Unity, Autofac  
[Click here for details](https://www.c-sharpcorner.com/UploadFile/cda5ba/dependency-injection-di-and-inversion-of-control-ioc/)
### 5. Explain SOLID principles.
_S: Single Responsibility Principle; O: Open/Closed Principle; L: Liskov Substitution Principle; I: Interface Segregation Principle; D: Dependency Inversion_  
_Single Responsibility Principle: A class should have only one factory which can reduce the side effect may cause by changing in the future_  
_Open/Closed Principle: Entities should be open for extension but close for modification_  
_Liskov Substitution Principle: Objects in a program should be able to be replaced by subtype without alternating the correctness of program_  
_Interface Segregation Principle: Many client-specified interfaces is better than one general interface_  
_Dependency Inversion: One should depend on "abstractions" instead of "concretions"_  
### 6. Explain to me the security measures your would take for your application both Front-end and Back-end
  ### a) Explain authentication and authorization mechanisms in your project.
  _Create new authentication filter and use authorize attribute in controllers. Authentication filters can be Role based authentication, JWT or use LDAP authentication_
  ### b) How would you prevent SQL injection, cross-site scripting, CSRF(Cross site request forgery) attacks?
  _Prevent SQL Injection: Use Entity framework will prevent SQL Injections automatically or use parameterized queries/Stored Procedures in ADO.Net._  
  _Cross-site scripting: Enable ASP.Net Request validation._  
  _CSRF: Inside a HTML form tag, use @Html.AntiForgeryToken() to prevent CSRF._
  ### c) How did you store your passwords in your DB. (What security measures did you take to store passwords in your database?)
  _In order to save the password in Database, instead of saving plain text password, save hashed value and salt in database. Later on, when user submits login request, use the same hash algorithm with the same salt to hash the password and compare the hashed value._
### 7. Explain to me the steps that you would take to imporove the performance of your application (Front-end and Back-end)
_Front-end: 1. Clean up HTML, place script reference at the bottom of the page; 2. Reduce External HTTP Request including unnecessary images/JavaScripts/CSS; 3. Minify CSS; 4. Enable prefetching, like rel="prefetch", rel="dns-prefetch", rel="prerender" within website's html. For example: <link rel="prefetch" href=""/>_
### 8.If you were created a new  web site today, what technology you will choose, why?
_I would choose Angular 6 as front-end and .Net Core Web API as Business Layer, EntityFrameworkCore as Data Access Layer and SQL Server as backend. Angular 6 uses typescript and it's SPA. Angular 6 also has CLI to automatically generate template to modify. .Net Core is because it's open source and some servers are using Linux. Mostly, .Net core can be hosted in Docker. Entity Framework can easily access data in SQL Server and prevent SQL Injection._
### 9. Do you have any exposure to .Net core?
_Yes, I have used .Net Core MVC and Web API with Entity Framework Core._
### 10. What source controls have you used in your work experience with projects?
_Mostly used Git and the time I used TFS is the company was migrating from TFS to Git._
### 11. Do you have experience in deploying the project(IIS Deployment)?
_Yes, I used Visual Studio to deploy published package into IIS. In the server end, installed the Web Dev package and IIS can generate the publish configuration to use in Visual Studio._
### 12. Do you have experience with continuous integration (CI), Continuous Delivery(CD)?
_Yes, I have a personal Gitlab website that used gitlab CI to deploy things into Docker server._
### 13. What kind of a project management experience do you have in your projects(Waterfall and Agile)?
_Majorly Agile experience but I don't really have a preference on what kind of management environment I am going to work on._
### 14. Explain your Agile process & How long are your sprints?
_1. Get user stories; 2. Meet with other members; 3. Design; 4. Code and test; 5. Deploy; And repeat._
### 15. Explain all the different environments(development, QA.Testing, UAT, Production/Live)
_Not sure about what the question want to know._
### 16. How is your interaction with QA & BA?
_BA is a short for Business analyst and they are the people speak with the business and design the process that solve business problems which often results in software that developers code. QA represent Quality Assurance and works with software that has already been built, and they write test cases and communicate test results so that any problems can be fixed before publish._
### 17. What were your roles and responsibilities in your latest project?
_My role is full stack developer and I've participated in front-end, back-end and database design process._
### 18. What is your experiencce with code review?
_Not really_
### 19. How do you keep yourself updated with new technologies?
_From news and Google usually shows me some new feed according to what I search in Google._
### 20. What was the most challenging thing in your project?
__
### 21. What are the steps you take if you have a high priority production bug (i.e. users cannot login etc)
_I will communicate with other teams to check infrustructure status. If all infrustures shows available and start to run QA tests to see what is the problem and this problem shouldn't happen if QA test case covers all scenarios. If I am the one who's responsible for the bug, I will start working on it and solve the bug as soon as possible. Once bug solved, add the solution into service manual which can help service team to quickly identify the bug and fix_