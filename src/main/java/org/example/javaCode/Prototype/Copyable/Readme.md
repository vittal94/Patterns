
Prototype pattern.

GoF definition  - it specifies the kinds of objects to create using a prototypical instance and creates new objects
by copying this prototype.

This pattern provides an alternative methods fot instantiating new objects by copying or cloning an instance of an existing
object. Thus, you can avoid an expense of creating a new instance using this concept. Why it is important? There is a
various reasons. Here are some examples:
- you may need some resources to make an instance, but these resources may not be easily available to you.
- the construction of a new instance form scratch is time-consuming operation.

The core idea of this pattern is to create an object that is base on another object. This existing object acts like
a template for a new object.
Generally the code of this pattern consist of an abstract class or interface that plays a role of an abstract prototype.
This abstract prototype contains a cloning method that is implemented by the concrete prototype. A client can create 
a new object by asking a prototype to clone itself.

Advantages:
- you do not want to modify the existing object and experiment on it.
- you can include or discard the product at runtime.
- in some context, you can create new instances at a cheaper cost.
- you can focus on the key activities rather than focusing on complicated instance creation processes. For example,
once you ignore the complex object creation processes, you can simply start with cloning or copying objects and 
implementing the remaining parts.
- you want to examine a proposed behaviour and its impact before you fully implement it in your application.

Disadvantages:
- each subclass needs to implement the coning or copying mechanism
- implementing the cloning mechanism can be challenging if the objects under consideration do not support copying
or if there are circular references. For example, in Java, a class with clone() method needs to implement a Cloneable
marker interface; otherwise, it will throw a CloneNotSupportedException.
- in this example, you use super.clone(). This clone() method performs a shallow copy, not a deep copy. If you need
a deep copy for your application, that can be expensive.