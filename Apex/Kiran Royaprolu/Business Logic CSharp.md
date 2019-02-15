## Middle Tier – Business Logic (C#)

#### Three criteria for a language to be considered Object Oriented?
_Encapsulation, Inheritance, Abstraction_

#### What is the difference between an interface and an abstract class?
_Interface is a kind of contract and it cannot have method bodies. You can have method bodies inside an abstract class._

#### What is the dependency injection, design pattern, good for?
_Those are good for decoupling the usage of an object from its creation, which can improve the reusability of code. Pass in Iservice instead of Service1 and service2 to the contructer_

#### What is the difference between Method Overriding and Method Overloading?
_Overriding is a run-time concept and overloading is a compile-time concept_
_Overriding has the same method signature_
_Overloading has the same name, however with different parameters._

#### Let's say you had a table called Customers and another table called Distributors, and they shared a common City. Walk me through the syntax of joining the two tables using LINQ and having the customer name and the distributor name being the result set? Bonus points if you can do it using LAMBDA.
_Customers.Join(Distributors, x => x.CityID, y => y.CityID, (x, y) => new {x. Customer, y.Distributer}).ToList();_

#### Why would you use Generics in C#? 
_Generics allows you to write code.use library method. During compile time, compiler will check for type safety._

#### What is Boxing and Unboxing in C#? 
_Boxing is to convert a value type to the type object or any interface type implemented by this value type. Unboxing is to convert object or interface type to value type._

_Boxing is to store values types in the garbage collected heap. Implicit conversion of a value type to type object. Create an object on the stack reference to the heap._
_Unboxing is explicit conversion from object to value type._

#### What is one example of a reference type? 
_String is a reference type which point to a memory address and the value of the variable is saved in that memory._

#### There are two kinds of types in C#: value types and reference types. What is the difference between the two?
_Value types saves the value directly and reference types save value in the memory and assign the memory address._
_Value type holds data in its own memory allocation on the stack_
_Reference type has pointer to another memory location which holds the real data_

#### How many classes can you inherit from in .Net? 
_.Net can only inherit from a single class._

#### What is an interface and what is it used for?
_Interface is a kind of contract between classes.
_
#### What are the key words Private, Protected, Public? Are there any other access modifiers? 
_Access modifiers are used to limit the accessibility of the class. Private can only be accessed by the current class. Protected can also be access by inherited classes. Public can be accessed by the same assembly or any assembly referencing it._

#### What is a delegate? 
_Delegate is a type that represents references to methods with a particular parameter list and return type._
#### What is Serialization, and what does it mean to mark a class a Serializable? What are the 2 forms native to .NET?
_Serialization is used to export application data into a file. A class usually used to serialize into json or xml format._

#### Have you worked with System.reflection namespace before; What is one thing you can use reflection for?
_System.reflection can be used for defining assembly related attributes. Like assembly version_
_Reflection is used to retrieve metadata on types at runtime._
_Using system.reflection, get ‘Type’ object, Type type = typeof(class A)_

#### Describe the singleton pattern? When might you use the singleton pattern? What other design patterns are you familiar with? Describe them
_Singleton pattern means a class which only allows a single instance of itself to be created, and usually gives simple access to that instance. Used when logging, one DB connection shared by multiple objects._
_Factory design pattern is a creational pattern that uses factory method to deal with the problem of creating objects without having to specify the exact class of the object that will be created. Circle, rectangle, triangle implementing shape interface, WE create a factory to create these three object instead of create them itself_
