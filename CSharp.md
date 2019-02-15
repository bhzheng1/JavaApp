### 1. What is garbage collector? What are the different generations in garbage collectors?
_Everytime user create an object using c#, the C# CLR allocates memory in heap memory. However, memory is not unlimited and CLR uses garbage collector to clean some used space in order to left space for newly created objects._  
_There are three generations of garbage collection. 0, 1, and 2. 0 is short-lived objects; After GC collect the generation 0, and all objects survived from garbage collection in generation 0 will be promoted onto the next higher generation, generation 1. Same thing, the object survived from garbage collection in generation 1 will be promoted onto generation 2._
### 2. What are the difference between value type and reference type variables? What is boxing and unboxing in reference type variable?
_A data type is value type if it saves it's value within its own memory allocation._  
_Reference type means it saves the value in a memory and the reference type saves the memory address of the value._  
_Boxing is converting a value type to the type object or to any interface type implemented by this value type._  
_Unboxing is converting a reference type to the value type or the type implements the interface._
### 3. What is IDisposable interface and does it depend on garbage collector?
_IDisposable is an interface that contains a single method Dispose(). The purpose of using IDisposable is to release unmanaged resources like streams, db connections and other resources._  
_Yes, IDisposable depends on the garbage collector since inside the Dispose method, it calls the GC.finalize(this)_
[Click here for more details](https://www.c-sharpcorner.com/UploadFile/b08196/idisposable-interface-in-C-Sharp/)
### 4. What is the difference between a generic and non-generic collection. Ex List and ArrayList
_Generic list can make sure all object in the collection have the same type. However, in non-generic collection the object inside collection can be different types. Additionally, the memory usage of ArrayList is way bigger than generic types. In the non-generic collection, the value type is boxed when added into the collection and unbox the variable when the code needs to access the value._
### 5. Why do you think we need an abstract class, why do you need an interface? Give few examples, where you have used abstract classes and interfaces in your project
_The general idea of using abstract class and interface are basically the same, those are used by other class to implement from. However, interface can't contain properties or method bodies. If there are some common functions do exactly the same thing, interface will not really be useful. On the other hand, abstract class can save more time for developers. Interface is more like a contract, and can be initialized. However, abstract class cannot be initialized._
### 6. What are extension methods and give me examples of built in extension methods. Have you created an extension method in your project? If yes, how with examples?
_Extension method enable you to "add" method to existing types without creatinga new derived type. built in extension methods like split(), array.OrderBy()..._  
_In order to create an extension method. Use this as a function parameter and another parameter._
```c#
public static void MethodA(this IMyInterface myInterface, int i)
{
    Console.WriteLine("Extension.MethodA(this IMyInterface myInterface, int i)");
}
```
### 7. What are lambda expressions, where have you used lambda expressions
_Lambda expression is an anonymous function that you can use to create delegates or expression tree types. Used lambda expressions with delegate type and inside LINQ_
### 8. Tell what is LINQ? And give me scenarios where you have used LINQ in your projects?
_LINQ is a Language Integrated Query and usually used in EntityFramework._
### 9. Can you explain the OOPS concepts with examples from your project.
_OOP Concept: Inheritance, Encapsulation, Abstraction, Polymorphism_  
_Inheritance: One class can be inherited by the other. It helps to reuse the code and establish a relationship between different class. For example class A, class B extends A, class C extends A_  
_Encapsulation: Encapsulation is a mechanism where you bind your data and code together as a single unit. It also means to hide your data in order to make it safe from any modification. Using private properties with another public property link with the private property._  
_Abstraction: to present the essential feature without representing the backgroud details. Abstraction lets you focus on what the object does instead of how it does it._  
_Polymorphism: Polymorphism allows you define one interface or method and have multiple implementations._
### 10. Write LINQ, GroupBy, Join, left join and Where conditions?
```c#
Entity.GroupBy(p => PersonId, p => p.Cars, (key, g) => new { PersonId = key, Cars = g.ToList() });

Entity.Join(foobar, p => PrimaryKey, f => ForeignKey, (p, f) => { new { PrimaryKey = p, ForeignKey = f} });

Foos.GroupJoin(Bars, f => f.Id, b => b.Id, (f, b) => new { Foo = f, Bar = b.SingleOrDefault() });

Foos.Where(o => o.Id = 1);

```  
### 11. First, FirstOrDefault, Single, SingleOrDefault in LINQ
_First: will return the first specific element from a collection of elements if one or more than one match found for that element. If no element found will throw an exception._  
_FirstOrDefault: like First but default value will be thrown if no value found._  
_Single: can only match for 1 and exactly 1 record. If 0 or >1 records match the condition, exception will throw._
_SingleOrDefault: can only match for 0 or 1 record as result. If more than 1 match found, exception will throw._
### 12. What is the purpose of the 'using' statement in C#.
_In using statement, the class type has to implement IDisposable. During the using block, the initialized object can be accessed and will be disposed after the using block executed._
### 13. Difference between readonly and const
_Readonly: Must have set value by the time constructor exists. This is evaluated when instance is created._  
_Static Readonly: Are evaluated when code execution hits class reference. Must have an evaluated value by the time the static constructor is done._  
_Const: Static by default, can be declared within functions, are copied into every assembly that uses them. Every Assembly gets a local copy of values._
### 14. What are generics and tell me scenarios where you have generics in your projects (project as in your resume)
_Generics allows user to define classes with one or more parameters. Generics will check whether the object has the correct type. Basically all projects used generics since most of the projects I worked with used Entity Framework with Repository Design._
### 15. Anonymous types and methods
_Anonymous types are object or var with custom defined structor inside function without defining a class. Anonymous method are usually saying using delegate and lambda expression to create an anonymous method._
### 16. Differed Execution and immediate execution in LINQ?
_By default LINQ uses deferred execution. Differed Execution means the query is not executed at the point its got decleared. Immediate execution means the query got executed at the point of declearation. Differed execution operator: Select, SelectMany, Where, ... Immediate execution: Min(), Max(), Count()... like aggregate functions._
### 17. What is difference between IEnumeriable and IQueryable
_IQueryable inherited from IEnumeriable. In LINQ, IQueryable object will not execute the LINQ statement and IEnumeriable will execute the statement and save the result in object._
### 18. Explain async and await keywords in c#. Give me scenarios where you have used in your projects?
_Async and await are used to multi threading and tasks. Async usually used when defining a function to make it be executed in another thread. Await means wait until another thread to finish and keep processing current thread. For example, in Entity Framework, used await Context.SaveChangesAsync() or have Web API functions defined as Async and return Task<ActionResult>_