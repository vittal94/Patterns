
GoF definition - it composes objects into tree structures to represent part-whole hierarchies.
The composite pattern lets clients treat individual objects and compositions of objects uniformly.
In object-oriented programming, a composite is a object with a composition with one or more similar objects,
where each of these objects has similar functionality. So the usage of this pattern is common in a tree-structured data.

Advantages of using this pattern:
- in tree-like structure, you can treat both the composite objects (branch nodes) and individual objects(leaf nodes) uniformly
- its common to implement a part whole hierarchy using this design pattern.
- you can easily add new component to the architecture or delete an existing component from the architecture.

Disadvantages:
- if you maintain the ordering of child nodes, you need to take a special care.
- if you are dealing with immutable objects, you can not simply delete them.
- if you continue adding new nodes, maintenance can become difficult over time. Sometimes you may want to deal with
a composite that has special components. This kind of constraint may cause additional development costs because 
you may need to provide a dynamic checking mechanism to support the concept.