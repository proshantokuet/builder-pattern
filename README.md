# builder-pattern

## What is builder pattern
The builder pattern is an alternative way to construct complex objects step by step.

##Where We Require Builder Pattern
if we want to create an immutable object then builder pattern help you over multiple constructor/ telescoping constructor problem.

## Advantage of builder pattern
1. Too Many arguments to pass from client program to the Factory class that can be error prone because most of the time, the type of arguments are same and from client side its hard to maintain the order of the argument.

2. Some of the parameters might be optional but in Factory pattern, we are forced to send all the parameters and optional parameters need to send as NULL.

3. If the object is heavy and its creation is complex, then all that complexity will be part of Factory classes that is confusing.

## Builder Design Pattern Steps
1. First of all you need to create a static nested class and then copy all the arguments from the outer class to the Builder class. We should follow the naming convention and if the class name is Computer then builder class should be named as ComputerBuilder.

2. Builder class should have a public constructor with all the required attributes as parameters.

3. Builder class should have methods to set the optional parameters and it should return the same Builder object after setting the optional attribute.

4. The final step is to provide a build() method in the builder class that will return the Object needed by client program. For this we need to have a private constructor in the Class with Builder class as argument.
