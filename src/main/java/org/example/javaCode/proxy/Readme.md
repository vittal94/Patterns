
Proxy pattern is used for controlling access to object.

There is several kinds of proxy:

-virtual proxy - is when we want a simplified version of complex or heavy object.
In this case, we may represent it with a skeleton object which loads the original object on demand,
also called as lazy initialization.

-remote proxy - when the original object is present in different address space, and we want to represent it locally.
We can create a proxy which does all the necessary boilerplate stuff like creating and maintaining the connection,
encoding, decoding, etc.., while the client accesses it as it was present in their local address space.

-protection proxy - when we want to add the layer of security to the original underlying object to provide controlled
access based on access rights of client