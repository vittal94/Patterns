It defines an interface for creating an object, but lets subclasses decide which class to instantiate.
The factory method pattern lets a class defer instantiation to subclasses.

Advantages of using factory method:
-you separate the code that varies from the code that does not vary.
-the code is not tightly coupled, so you can add new classes at any time in the system without modifying the existing
architecture. In other words you have followed the Open/Closed principle.
-the client can use a factory method without knowing how the actual type of object is created.