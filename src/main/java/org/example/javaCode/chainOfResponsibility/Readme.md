
Chain of responsibility pattern.
GoF definition - it avoids coupling the sender of the request to its receiver by giving more than one object 
a chance to handle the request. In chains the receiving objects and passes the request along the chain until 
an abject handles it.

In this pattern, you form a chain of objects where you pass the responsibility of a task from one object to another and 
so forth until an object accepts the responsibility of completing the task. Each object in the chain can handle a 
particular kind of request. If an object cannot handle the request fully, it passes the request to the next object in
the chain. This process may continue until the end of the chain. This kind of request-handling mechanism gives you the
flexibility to add a new processing object(handler) or shuffle their order in the chain.

Advantages of using this pattern:
- you have more than one object to handle the request. If a handler cannot handle the whole request, it can forward
the responsibility to next handler in the chain
- the nodes of chain can be added or removed dynamically.
- a handler does not need to know how the next handler in the chain will handle the request

Disadvantages of using this pattern:
- there is no guarantee that the request will be handled because you may reach the end of the chain but not found any 
explicit receiver to handle the request
- debugging will become tricky with this kind of design.
- if there are many handlers, you need to be careful about placing them in the proper order to improve overall response
time.