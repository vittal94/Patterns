
Proxy pattern is used for controlling access to object.

GoF definition - it provides a surrogate or placeholder for another object to control access to it.

There is a situation when we want to restrict direct communication between an intended object and outside world. There 
are various reasons for this. For example, you may be promoting an additional securities, you need to improve the 
response time, you have some resource constrain, or the final product is still in the development state.
Proxies can be of different types, but fundamentally they substitute (or placeholders) for an original objects. 
As a result, when a client interact with an proxy object, it appears that it is directly talking to the actual object.
So, using this pattern, you may want to use a class that can perform as an interface to the original one.

There is several kinds of proxy:

-virtual proxy - is when we want a simplified version of complex or heavy object.
In this case, we may represent it with a skeleton object which loads the original object on demand,
also called as lazy initialization.

-remote proxy - when the original object is present in different address space, and we want to represent it locally.
We can create a proxy which does all the necessary boilerplate stuff like creating and maintaining the connection,
encoding, decoding, etc.., while the client accesses it as it was present in their local address space.

-protection proxy - when we want to add the layer of security to the original underlying object to provide controlled
access based on access rights of client

-smart reference - this proxy can perform additional housekeeping when an object is accessed by client. A typical 
operation may include  counting the number of references to an object at the particular moment in a time.

Disadvantages:
- the overall response time can be an issue because you are not directly talking to the actual object.
- you need to maintain the additional layer for the proxies.
- a proxy can hide the actual responses from objects. For example, consider the case when a proxy method modifies
the original exception thrown by the method. Debugging and fixing such method is not easy.