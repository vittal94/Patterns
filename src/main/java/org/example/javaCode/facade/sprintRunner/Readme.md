Facade pattern.
GoF definition - it provides unified interface to a set of interfaces in a subsystem. A facade pattern defines a higher-level interface that makes the 
subsystem easier to use.

This pattern is a great promoter of loose coupling. Using this pattern, you emphasize the abstraction and hide the complex details by exposing a simple
interface.
Consider a simple case. Let's say a application has multiple classes and consists of multiple methods. A client can make a product using a combination 
of methods from these classes, but they need to remember which classes to pick and which method to use with a calling sequence of these constructs.
In can be OK for a developer, but makes a client's life difficult. It also challenging if there are lots of variations among these products.
To overcome this, you can use the Facade pattern. This pattern provides the client a user-friendly, simple interface  to use, so that all the inner 
complexities(like which method to invoke and what should be the calling sequence or series of steps to follow) are hidden. As a result, a client can simply
concentrate on the final outcome.
In short, facades provide you with an entry point to access varios methods across different calsses in a structured manner. If you enforce a rule that does not
allow you access to individual methods directly, and instead you access them through your facade only, then the facade is called an opaque facade; otherwise,
it is transparent facade.

 Advantages:
 - if your system consists of many subsystems, managing those subsystems become tough, and cient will fing it difficult to communicate separately with
   each of these subsystems. In case like this, facade pattern are handy. Instead of presenting complex subsystems, you present one simplified interface to
   clients. This approach also supports weak coupling by separating the client code from the subsystems.
- it reduces the number of objects that a client needs to access.

Disadvantages:
- subsystem are connected to the facade layer. So, you need take care of an additional layer of coding.
- when the internal structure of subsystem changes, you need to incorporate the changes in th facade layer also.
- developers need to learn anout this new layer, whereas some of them are aware of how to use the subsystems/APIs efficiently.







  













