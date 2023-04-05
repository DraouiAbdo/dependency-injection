# dependency-injection

In order to have an application that is easy to add additional features to while ensuring backward compatibility, this application should 
be respecting **the OCP design principle** which states that **"Software entities (classes, modules, functions, etc.)  should be open for extension,
but closed for modification"**.

Classes of this application should be **loosely coupled** to each other, in other words, **each class should depend on 
interfaces of the other classes not the classes themselves**. and that is the essence stated in **the Dependency Inversion Priciple**.

In this case, any additional feature can be added in a form of new class(es) which will implement the interface of the class(old feature) 
it can replace dynamically(in run time).

If a given class depends on an interface of a group of classes, dependency of this class and one of the implemntation of that interface should be **injected**. 


**Dependency Injection** can be achived **via a setter or via a constructo**r and since this operation represents a technical aspect of the application. It should
be **delegated to a framework**, as part of **the Inversion Of Control design pattern**.

If we use Java, dependency injection can be done by Spring Framework using either **XML** file or using **Spring Annotations**.

In this project, In order to deeply understand dependency injection, we demonstrated how can we perform dependency injection statically, dynamically and finally
using spring framework. for each method we inject via a setter and via a constructor.

