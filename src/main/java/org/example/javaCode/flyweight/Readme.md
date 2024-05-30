
Flyweight pattern.

GoF definition - it uses sharing to support large number of fine-grained objects efficiently.

Sometimes you need to handle lots of objects that are very similar(but not the same). But the constraint is that you 
cannot create all of them to lessen resource and memory usage. The flyweight pattern  is made to handle these scenarios.
So how do you do this? To understand this, let's quickly revisit the fundamentals of object-oriented programming. 
A class is a template or blueprint, and an object is  an instance of it. An object can have states and behaviors.
For example, in the game of football, you can say that Ronaldo or Beckham are objects  from the Footballer class.
They have states like "playing state" or "non-playing state". In the playing state, they can show different skills
(or behaviors) - they can run, they can kick, they can pass the ball, and so forth. To begin with object-oriented 
programming, you can ask the following questions: 
- what are the possible state of my objects?
- what are different functions(behaviors) they can perform in those states?

Once you get the answers to those questions you can proceed. Here youre job to identify the following:
- what are the states of my objects?
- which part of these states can be changed?

You break the states into two parts called intrinsic(which does not very) and extrinsic(which can very). If you make 
objects with intrinsic states, you can share them. For the extrinsic part, the user needs to pass into information.
So, whenever you need to have an object, you can get the object with the intrinsic state and then you can configure 
the object on a fly by passing the extrinsic state. This technique reduces unnecessary object creations and memory
usage.

A flyweight is a shared object that can be used in multiple contexts simultaneously. The flyweight acts as an independent
object in each context - it's indistinguishable from an instance of the object that's not shared. Flyweight cannot
make assumptions about a context in which they operate. The key concept here is a distinction between intrinsic and 
extrinsic states. The intrinsic state is stored in the flyweight; it consist of information that's independent of the 
flyweight's context, thereby making it sharable. The extrinsic state depends on and varies with the flyweight's context
and therefore can't be shared. Client object are responsible for passing extrinsic state to the flyweight when it needs it.

Advantages:
- you can reduce the memory consumption of heavy objects that can be controlled identically.
- you can reduce the total number of unique objects in the system.
- you can maintain centralized states of many "virtual" objects.

Disadvantages:
- in this pattern you need to spend some time configuring these flyweights. This configuration time can impact the overall
performance.
- to create flyweights, you extract a common template class from existing objects. This additional layer of programming
can be tricky adn sometimes hard to debug and maintain.