
Visitor pattern.

GoF definition - it represent an operation to be performed on the elements of the object structure. The visitor pattern
lets you define a new operation without changing the classes of the elements on which it operates.

This pattern can be used in many different scenarios. Using this pattern, you often add new operations to an object
without modifying the class definition. To achieve this, you separate an algorithm from the object structure. This may
sound surprising to you, but it is one of the key usages of this pattern.
You can think of the object structure as a container. It can be helpful to think of it like a tree structure where 
different objects(nodes) are arranges together to form a tree. A visitor object traverses each node in the tree and 
captures its state. Once the visitor captures the state, you can call the visitor-specific method.

If you deal with only one element, there is no need to create an object structure.

To understand this pattern lets consider a simple scenario. Suppose you have a tree structure where each node in the 
tree has methods that work differently. But your customer want you to add more methods or update these methods (the top
management of an organization changes the "promotion criteria" or the "appraisal process" frequently). You can accept
this customer request as a one-off, but if your client passes a similar request multiple times and very often, will
it be possible for you to introduce methods like this in each possible case, particularly when the overall code structure
is very big and complex? Also, in a tree structure, if it is a branch node, can you imagine the impact of these changes
across other nodes?
So, you may think of some way to handle your fickle-minded customers. The visitor pattern can help you in a situation
like this. 

When to use this pattern:
- you need to add new operations to a set of objects without changing their corresponding classes. This is a primary aim
when implementing this pattern. When the operations change very often, this approach can be your savior.
- if you need to change a logic of various operations, you can simply do it through a visitor implementation.

Disadvantages:
- you can break the power of encapsulation using visitors.
- if you need to add new concrete classes to an existing architecture frequently, the visitor hierarchy becomes difficult
to maintain
