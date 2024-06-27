
Strategy pattern.

GoF definition - it defines a family of algorithms, encapsulates each one, and makes them interchangeable. The strategy
pattern lets the algorithm vary independently from the clients that use it.

A client can select the algorithm from a set of algorithms dynamically at runtime. This pattern also provides a simple
way to use the selected algorithm.
You know that objects can have states and behaviours. And some of these behaviours may vary among the objects of a class.
This pattern focuses on changing behaviours that can be associated with an object at a specific time.
In this example, you will see a Vehicle class. Once a Vehicle instance is created, you can add a set of behaviours to
this object. Inside the client code, you can replace the current behavior with a new behavior, too. Most interestingly,
you will see that since the behavior can be changed, the vehicle class does not define the behavior; it simply delegates
the task to a particular object referenced by the vehicle.

Advantages:
- this design pattern makes your classes independent of algorithms. Here a class delegates the algorithm to the 
strategy object(that encapsulates the algorithm) dynamically at runtime. So the choice of algorithms is not bound at
compile time.
- it's easier to maintain your codebase.
- it's easily extendable.


Disadvantages:
- the addition of a context classes causes more objects to exist in your application.
- user of the application must be aware of different strategies; otherwise the output will surprise them.