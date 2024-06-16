
Memento pattern.

GoF definition - without violating encapsulating, the memento pattern captures and externalizes an object's internal
state so that the object can be restored to this state later.

As per the dictionary, the word memento is used as a reminder of past events. Following the object-oriented way, you
can also track(or save) the states of an object. So, whenever you want to restore to its previous state, you can 
consider using this pattern.
In this pattern, you commonly see three participants called memento, originator, and caretaker(often used as a client).
The workflow can be summarized as follows: the originator object has an internal state, and a client can set a state
in it. To save the current internal state of the originator, a client (or caretaker) request a memento from it. A client
can also pass a memento (which it holds) back to the originator to restore a previous state. Following the proper approach,
these saving and restoring operations do not violate encapsulation.

Suggestions from the GoF:
- you see the three important players(memento, originator, and caretaker) in this design implementation.
- a memento is an object that stores an internal state of another object. We call this "another object" as the memento's
originator. It means the originator has an internal state which is our concern.
- the originator initializes the memento with the current state. Ideally, the originator that produces the memento can
access its internal state.
- only the originator can store and retrieve necessary information from the memento. This memento is "opaque" to
other objects.
- a caretaker class is a container of mementos. This class is used for the memento's safekeeping, but it never operates
or examines the content of the memento. A caretaker can take the memento from the originator.
- a caretaker first ask the originator for the memento object. Then it can set a new state to it. Next, if it wants,
it can save the memento. To reset the originator's state, it passes back the memento object to the originator.
- the originator uses the memento to restore its internal state.
- the caretaker sees a narrow interface to the memento. It can only pass the memento to other objects. The originator,
in contrast, sees a wide interface, one that lets it access all the date necessary to restore itself to its previous
state. Ideally, only the originator that produces the memento is permitted to access the memento's internal state.

Advantages:
- you can always discard the unwanted changes and restore them to an intended or stable state.
- you do not compromise encapsulation associated with a key objects that are participating in this model.
- you can maintain a high cohesion
- it provides an easy recovery technique.

Disadvantages:
- having more mementos requires more storage. They also put an additional burden on a caretaker.
- the previous point increases maintenance cost.
- you cannot ignore the time it takes to save these states, which can decrease the overall performance of the application.


In java, you can prefer using serialization/deserialization techniques instead of directly implementing the memento. It
has its pros and cons, you can combine each technique in your application.

To support undo operations you can use the command pattern. GoF says that these patterns are related. Commands can use
mementos to maintain state of undoable operations. So it primarily depends on how you want to handle the situation.
Suppose you want to adding 25 to an Integer. After this you want to undo the addition operation. 50 + 25 = 75, so to 
go back you do, 75 - 25 = 50. In this type of operation, you don't need to store the previous state.
But consider the situation where you want to store the state of your objects before the operation. In this case you use 
the memento. For example: in the paint application, you can avoid the cost of doing some painting operations by string 
the list of objects before doing the commands.