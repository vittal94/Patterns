
GoF definition - it decouples an abstraction from its implementation so that the two can vary independently.

This pattern is also known as the Handle/Body pattern. Using it, you decouple an implementation class from an 
abstract class by providing a bridge between them. This bridge interface makes the functionality of concrete classes
independent from the interface implementer classes. You can alter different kind of classes structurally without
affecting each other.

Advantages:
- implementations are not bound to abstraction.
- the abstraction and implementation can grow independently.
- concrete classes are independent if the interface implementer classes. In other words, changes in one of them do not
- affect the other.

Disadvantages:
- the overall structure is complex.
- you do not directly invoke the method. Instead, the abstraction layer delegates the work to the implementation layer.
So thus a slight performance impact.