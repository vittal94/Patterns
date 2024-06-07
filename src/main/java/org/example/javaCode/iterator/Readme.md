
Iterator Pattern.

GoF definition -  it provides a way to access the elements of an aggregated object sequentially without exposing
the underlying representation.

Iterators are generally used to traverse the container(or a collection of objects) to access its elements without knowing
how the data are stored internally. It is very useful when you need to traverse different kinds of collection objects
in standard and uniform way.
This pattern is frequently used to traverse the nodes of a tree-like data structures. So, in many examples, you may
notice the use of the iterator pattern with the composite pattern.
The role of an iterator is not limited to traversing. This role can vary to support different requirements. For example,
you can filter elements in a various way.
Client cannot see the actual traversal mechanism. A client program only uses the iterator methods that are public in
nature.