
Decorator pattern.
DoF definition - it attaches additional responsibilities to an object dynamically. Decorators provide a flexible
alternative to subclassing for extending functionality.

An alternative to inheritance is composition. It is quite common in programming and often gives you a better payoff.
Wrapper or  a decorator is like a topping that surrounds an object. The enclosing object is often called a decorator,
which conforms tho the interface of the component that it decorates. In programming, you often use a wrapper to add 
functionalities dynamically. This is a powerful technique because you can add or discard a wrapper as per you need,
and it does not hamper the functionalities of the original object.
So you need to work on a piece of code and add new features. Someone coded it before and you can not change the existing
code. This scenario is common in the software industries when you need to enhance a feature to attract new customers,
but you cannot alter the existing workflow of the software to support the existing customers. You understand that in 
this case, since you  were not a part of the team that wrote the first version of the software, you do not have exclusive
control from the beginning. Wrappers are useful in similar situations. As said before, in this case, you can add new 
functionality on top of the existing functionality to support new customers. In fact, by using different types of wrappers
you can support different types of customers

Advantages of using this pattern:
- the existing structure is untouched, so you do not introduce bugs in that part of the code.
- new functionalities can be added to an existing object easily.
- you can not only add a behavior to an interface, but you can alter the behavior too.
- you do not need to predict/implement all the supported functionalities at once. You can develop incrementally.
For example, you can add decorator objects ont by one to support your needs

