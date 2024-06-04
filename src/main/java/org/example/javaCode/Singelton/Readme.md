
Singleton pattern.

GoF definition - it ensures that a class have only a one instance and provides a global point of access to it.

 Let's assume you have a class called A and you need to create an object of it. You simply use the following line of 
 code: A obA = new A();
 But let's look at it closely. If you keep using the new keyword ten more times, you'll have ten more objects. But in
 real world scenario, unnecessary object creation is a big concern(particularly when constructor call are truly 
 expensive), so you need to restrict this. In a situation like this, the singleton patter comes into the picture.
 In restrict the use of the new like this and ensures that you do not have more than one instance of the class.
 
In short, this patter says that particular class should have only one instance. You can create an instance of it is not
available; otherwise, you should use an existing instance to serve your need. Following this approach, you can avoid 
creating new objects.

When use a singleton pattern:
- to work with centralized systems(database)
- to maintain a common log file.
- to maintain a thread pool in multithreaded environment.
- to implement a cashing mechanism of device drivers and so forth