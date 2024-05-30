
Command Pattern
GoF definition - it encapsulates a request as an object, thereby letting you parameterize clients with
different requests, queue or log requests, and support undoable operations.

Using this pattern, you encapsulate a method invocation process. Here an object can invoke an operation through some
crystalized method, and it does not worry about how to perform the intended operation. This patter is often used in 
multithreaded environment.

In general, four terms are important here: invoker, client, command, and receiver
- the command object consist of the action(s) that a receiver will perform
-  a command object can invoke a method of a receiver in a way that is specific to that receiver's class. The receiver
then starts processing the job
-  a command object is separately passed to the invoker object to invoke the command. The invoker object contains 
those crystallized methods through which a client can perform a job without worrying about how the actual job is 
performed by target receiver.
- the client object holds the invoker object and the command objects. The client must decide which commands to
execute it passes the appropriate command to the invoker object.

The advantages:
- this pattern decouples the sender and receiver objects. In other words, it helps you decouple an object making a request
from an object that receive the request and performs the intended action. Notice that invoker can work with a receiver
without directly knowing about it. In addition, a client also does not know how the invoker fulfils its needs.
- an invoker can handle different types of objects that performs different types of work.
- you can create macro commands. These are sequences of multiple commands and can be invoke together. You can create 
a class that had a constructor that accepts a list of commands. And in its method execute(), can invoke execute()
of these commands sequentially using a loop.
- new command can be added without affecting an existing system.
- most importantly, you can support undo or redo operations.
- it should be noted that once you created a command object, it does not mean that the computation starts immediately.
You can schedule it for later or place in queue and execute later.

Disadvantages:
- to support more commands, you need to create more classes.So maintenance can be difficult
- handling errors or making decision about what to do with return values when an erroneous situation occurs become
tricky. A client may want to know about them. But since you decouple the caller from the target receiver, this kind 
of situation is difficult to handle. The challenge becomes significant in multithreaded environment where an invoker
can run on a different threads.