GoF definition - it provides an interface for creating families of related or dependent objects without specifying
their concrete classes.

An abstract factory is often referred to as a factory of factories. In this pattern, you provide a way to encapsulate
a group of individual factories that have a common theme. In this process, you do not instantiate a class directly; 
instead, you instantiate a concrete factory and thereafter create a products using the factory.

When to use abstract factory pattern:
- the client is independent of how we create and compose the objects in the system
- the system consist of multiple families of objects, and these families are designed to be used together
- we need a run-time value to construct a particular dependency