GoF definition - it separates the constraction of a complex object from its representation so that the same constraction pracesses can create different 
representations.

Advantages of using this pattern:
- using a builder you create an objects step by step, and promote encapsulation by hiding the details of the complex constraction process
- the same constraction process can produce different objects
- by changing the type of builder, you change the internal type of object

When to use a builder pattern:
- if you need a complex object that involves a various steps of constraction pracess, and at the same time
object need to be immutable
