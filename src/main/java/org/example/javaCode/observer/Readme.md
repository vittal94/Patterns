
Observer pattern.

GoF definition  - it defines one-to-many dependency between objects so that one object changes state, all its dependents
are notified and updated automatically.

In this pattern, there are two types of objects. One is an observer and other is the subject. Observer - is an object
that need to be informed when interesting stuff happens in another object. The object about whom an observer is
interested is called a subject.
Normally many observers observe a particular subject. Since the observer are interested in the changes in the subject,
they register themselves to get the notification from the subject. When they loose interest in the subject, they simple
unregistered from the subject. Sometimes this model is referred to as a Publisher-Subscriber(Pub-Sub) model.
The whole idea can be summarized as follows: using this pattern, an object(subject) can send notifications to multiple
observers at the same time. Observers can decide how to respond to these notifications.

Advantages:
- subjects and their registered users(observers) make up a loosely coupled system. They do not need to know each other
explicitly. Typically, a subject does not care how the observers react to the notification event.
- you do not need to make changes in the subject when you add or remove the observer from its notification list.
- you can add or remove observers at runtime independently.

Disadvantages:
- undoubtedly, memory leak is the greatest concern when you handle events in Java. It also referred to as the "lapsed
listeners problem". In simple words, consider a  case when an observer registers with the subject to get event notification
but forgets to unregister the same. It causes some live references to stay in a computer memory. The garbage collector
does not collect them and as a result, you see the impact of memory leaks.
- the order of notification is not dependable.
- as a number of observers increases, each update operation becomes costly.