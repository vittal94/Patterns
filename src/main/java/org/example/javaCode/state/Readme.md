
State pattern

GoF definition - it allows an object to alter its behavior when its internal state changes. The object will appear to
change its class.

It states than an object can change what it does and this depends on its current state.
Suppose you are dealing with large-scaling application where the codebase is rapidly growing. As a result, the situation
becomes complex, and you may need to introduce lots of "if-else" blocks/switch statement to guard the various conditions.
The state pattern fits in such a context. In allows your objects to behave differently based on their current state and
you can define state-specific behaviors with different classes.
   In this pattern, start thinking in terms of possible states of your application and segregate the code accordingly.
Ideally, each state is independent of the other states. You keep track of these states, and your code respond as per the
behavior of the current state. For example, suppose you are watching the program on your TV. If you press the "mute button"
on the TV's control panel, you will notice a state change in your TV. But you won't notice any change if the TV is already
in a "switched-off" mode.
    The basic idea is if your code can track  current state of the application, you can centralize the task, segregate
your code, and respond accordingly. This is why in this chapter you'll see the state-specific behaviors in separate
classes.

The GoF mentions four important points about this pattern:
- "context" delegates state-specific requests to the current ConcreteState object.
- a context can pass yourself as an argument to the state object handling the request. This lets the state object access
the context of necessary.
- "context" is primary interface for clients. Client can configure a context with State objects. Once a context is 
configured, it's clients don't have to deal with state object directly.
- either the Context or ConcreteState subclass can decide which state succeeds another and under what circumstances.

Advantages:
- you have already seen that you can add new states and extend a state behavior's easily. Also, state behavior can
be extended without any hassle. Notice that in this example, you can add a new state and new behavior for a TV class
without changing this class.
- It reduces the use of "if-else statements".

Disadvantages:
- the state pattern are also known as a "Objects for states". So you can assume that more states need more code and
obvious side effect is difficult maintenance.
- more states mean more classes. It tells you to put more effort into testing the code.
- the state transitions are not always straightforward. If there is various possibilities, overall implementation can
be complex.
- it is not always easy to predict all possible state at the beginning.