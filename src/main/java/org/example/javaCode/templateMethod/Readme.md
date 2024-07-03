
Template method pattern.

GoF definition - it defines the skeleton of an algorithm in an operation, deferring some steps to subclasses. The
template method pattern lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.

Using this pattern, you begin with the minimum or essential structure of an algorithm. Then you defer some responsibilities
to the subclasses. As a result, the derived class can redefine some steps of an algorithm without changing the flow of
an algorithm.
Simply put, this design pattern is useful when you implement a multistep algorithm but allow customization through
subclasses. Here you keep the outline of the algorithm in a separate method referred to as a template method. The
container class of this template method is often referred to as the template class.
It is important to note that some amount of implementation may not vary across the subclasses. As a result, you may see
some default implementations in the template class. Only the specific details are implemented in a subclass. So, using
this approach, you write a minimum amount of code in a subclass.

Advantages:
- you can control the flow of the algorithm. Clients cannot change this.
- common operations are in a centralized location. For example, in a abstract class, the subclasses can redefine onle
the varying parts so that you can avoid redundant code.

Disadvantages:
- the client code cannot direct the sequence of steps. If you want that type of functionality, use the Builder pattern.
- a subclass can override the method defined in a parent class (in other words, hiding the original definition in the
parent class), which can go against the Liskov Substitution Principle.
- having more subclasses means more scattered code and difficult maintenance.