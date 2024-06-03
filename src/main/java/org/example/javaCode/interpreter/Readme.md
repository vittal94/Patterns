
Interpreter pattern.

GoF definition - given a language, it defines a representation for its grammar along with an interpreter that uses a 
representation to interpret sentences in the language.

This pattern plays the role of the translator, and it's often used to evaluate sentences in a language. So, you first
need to define a grammar to represent the language. Then the interpreter deals with that grammar. This pattern works best
if the grammar is simple.
Each class int this patter represents a rule int that language, and it should have a method to interpret an expression.
So, to handle a greater number of rules, you create a greater number of classes, and this is why a interpreter pattern
is seldom used to handle  very complex grammar.

Terms of this patter:
- abstract expression: Typically an interface with an interpret method. You need to pass a context object to this 
method.
- terminal expression: It is used for terminal expressions. A terminal expression does not need other expressions to 
interpret. They are basically a leaf nodes in the data structure.
- non-terminal expression: It is used for non-terminal expressions. It's also termed as AlternationExpression, Repitition
Expression, or SequencedExpression. They are like composites that can contain both terminal and non-terminal expressions.
When you call a interpret method on this, you basically call interpret on all of this children. For example, consider 
a simple arithmetic expression such as 5-3. This is a non-terminal expression where 5 and 3 are the terminal expressions
with values 5 and 3, respectively. The minus operator with the operands(the terminal expression) form a non-terminal
expression.
- context: It holds a global information that the interpreter needs.
- client: It calls the interpreter() method. It can optionally build the syntax tree based on the rules of the language.


Advantages:
- you are very much involved in the process of how to define a grammar for your language and how to represent and interprent
those sentences. You can change and extend the grammar also
- you have full freedom over how to interpret those expressions.

Disadvantages:
- maintain

- 