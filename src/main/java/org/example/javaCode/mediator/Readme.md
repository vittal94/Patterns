
Mediator pattern

GoF definition -  it defines an object that encapsulates how a set of objects interact. The mediator pattern promotes 
loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction
independently.

A mediator is an intermediary through whom different objects talk to each other. It takes responsibility for controlling
and coordinating the interactions of a specific group of objects that cannot refer to each other explicitly.
As a result, you can reduce the number of direct interconnections and promote loose coupling among them in your application.

Advantages:
- you can produce the complexity of objects communicating in a system.
- the pattern promotes loose coupling so objects can be reused.
- the pattern reduces the number of subclasses in the system.
- you replace a many-to-many relationship with one-to-many relationship, so the code is much easier to read and understand.
And as an obvious effect of this, maintenance become easier.
- you can provide a centralized control with this pattern.
- in short, it is always a good aim to remove the tight coupling from your code, and the mediator pattern scores high
in this context.

Disadvantages:
- in some cases, implementing the proper encapsulation becomes tricky, and the mediator object's architecture become
complex.
- sometimes maintaining a complex mediator becomes a big concern.